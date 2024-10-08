import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileWriter;
import java.io.IOException;

public class PrettyPrint extends ccBaseListener {
    private StringBuilder htmlOutput;
    private String hardwareName;

    public PrettyPrint() {
        htmlOutput = new StringBuilder();
        htmlOutput.append("<!DOCTYPE html>\n<html><head><title>TITLEOFTHEPAGE</title>\n")
                .append("<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>\n")
                .append("<script type=\"text/javascript\" id=\"MathJax-script\" async\n")
                .append("src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\">\n")
                .append("</script></head><body>\n");
    }

    @Override
    public void enterHardwareSection(ccParser.HardwareSectionContext ctx) {
        hardwareName = ctx.IDENTIFIER().getText();
        htmlOutput.append("<h1>").append(hardwareName).append("</h1>\n");
    }

    @Override
    public void enterInputsSection(ccParser.InputsSectionContext ctx) {
        htmlOutput.append("<h2>Inputs</h2>\n");
        for (TerminalNode input : ctx.IDENTIFIER()) {
            htmlOutput.append(input.getText()).append("<br>\n");
        }
    }

    @Override
    public void enterOutputsSection(ccParser.OutputsSectionContext ctx) {
        htmlOutput.append("<h2>Outputs</h2>\n");
        for (TerminalNode output : ctx.IDENTIFIER()) {
            htmlOutput.append(output.getText()).append("<br>\n");
        }
    }

    @Override
    public void enterLatchesSection(ccParser.LatchesSectionContext ctx) {
        htmlOutput.append("<h2>Latches</h2>\n");
        for (TerminalNode latch : ctx.IDENTIFIER()) {
            htmlOutput.append(latch.getText()).append("<br>\n");
        }
    }

    @Override
    public void enterUpdatesSection(ccParser.UpdatesSectionContext ctx) {
        htmlOutput.append("<h2>Updates</h2>\n");
        for (ccParser.UpdatesExpContext exp : ctx.updatesExp()) {
            String outputSignal = exp.getChild(0).getText();
            String expression = convertExpressionToLatex(exp);
            htmlOutput.append(outputSignal).append("&larr;")
                    .append("\\(").append(expression).append("\\)").append("<br>\n");
        }
    }

    @Override
    public void enterSiminputsSection(ccParser.SiminputsSectionContext ctx) {
        htmlOutput.append("<h2>Simulation Inputs</h2>\n");
        for (ccParser.SiminputExpContext exp : ctx.siminputExp()) {
            String signal = exp.IDENTIFIER().getText();
            String value = exp.NUMBER().getText();
            htmlOutput.append("<b>").append(signal).append("</b>: ").append(value).append("<br>\n");
        }
    }

    @Override
    public void enterFunctionDef(ccParser.FunctionDefContext ctx) {
        htmlOutput.append("<h2>Definitions</h2>\n");
        String functionName = ctx.getChild(0).getText();
        StringBuilder params = new StringBuilder();
        for (TerminalNode param : ctx.IDENTIFIER()) {
            if (params.length() > 0) {
                params.append(",");
            }
            params.append("\\mathrm{").append(param.getText()).append("}");
        }
        String expression = convertExpressionToLatex(ctx.updatesExp(0));
        htmlOutput.append("\\(\\mathit{").append(functionName).append("}(")
                .append(params).append(")=").append(expression).append("\\)").append("<br>\n");
    }

    private String convertExpressionToLatex(ccParser.UpdatesExpContext ctx) {
        // Here, you would convert your expression to LaTeX format.
        // For this example, simply return the expression as is.
        // You need to add your logic for converting to LaTeX (e.g., replace *, +, / with LaTeX symbols)
        return ctx.getText(); // Modify this line to include your conversion logic
    }

    public void writeToFile(String filename) throws IOException {
        htmlOutput.append("</body></html>");
        FileWriter writer = new FileWriter(filename);
        writer.write(htmlOutput.toString());
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        // Load your input file here
        CharStream input = CharStreams.fromFileName("prog.txt"); // Update with your input file name
        ccLexer lexer = new ccLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ccParser parser = new ccParser(tokens);

        ParseTree tree = parser.start(); // Start parsing
        PrettyPrint prettyPrinter = new PrettyPrint();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(prettyPrinter, tree); // Walk the tree with the listener
        prettyPrinter.writeToFile("output.html"); // Write output to HTML
    }
}