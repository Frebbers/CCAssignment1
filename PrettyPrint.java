import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileWriter;
import java.io.IOException;

public class PrettyPrint extends ccBaseListener {
    private StringBuilder htmlOutput;
    private String hardwareName;

    public PrettyPrint() {
        htmlOutput = new StringBuilder();
        // Initial part of the HTML
        htmlOutput.append("<!DOCTYPE html>\n<html><head>\n")
                // We will add the title dynamically later when we get the hardware name
                .append("<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>\n")
                .append("<script type=\"text/javascript\" id=\"MathJax-script\" async\n")
                .append("src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\">\n")
                .append("</script>\n</head><body>\n");
    }

    @Override
    public void enterHardwareSection(ccParser.HardwareSectionContext ctx) {
        hardwareName = ctx.IDENTIFIER().getText();
        // Insert the title with the hardware name
        htmlOutput.insert(htmlOutput.indexOf("</head>"), "<title>" + hardwareName + "</title>\n");
        // Add a header for the hardware section in the body
        htmlOutput.append("<h1>").append(hardwareName).append("</h1>\n");
    }

    @Override
    public void enterInputsSection(ccParser.InputsSectionContext ctx) {
        htmlOutput.append("<h2>Inputs</h2>\n");
        for (TerminalNode input : ctx.IDENTIFIER()) {
            htmlOutput.append(input.getText()).append("<br>\n");  // Plain text, no LaTeX
        }
    }

    @Override
    public void enterOutputsSection(ccParser.OutputsSectionContext ctx) {
        htmlOutput.append("<h2>Outputs</h2>\n");
        for (TerminalNode output : ctx.IDENTIFIER()) {
            htmlOutput.append(output.getText()).append("<br>\n");  // Plain text, no LaTeX
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
            String outputSignal = exp.getChild(0).getText();  // Get the output signal
            String expression = convertExpressionToLatex(exp);  // Convert the expression to LaTeX

            // Output in the form of: outputSignal ← \( expression \)
            htmlOutput.append(outputSignal).append("&larr;")
                    .append("\\(").append(expression).append("\\)")
                    .append("<br>\n");
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
        String functionName = ctx.IDENTIFIER(0).getText();  // Function name, e.g., "nor"

        // Extract parameters and format them as plain text (not wrapped in \mathrm{}).
        StringBuilder params = new StringBuilder();
        for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
            if (params.length() > 0) {
                params.append(", ");
            }
            params.append(ctx.IDENTIFIER(i).getText());
        }

        // Convert the function body expression to LaTeX
        String expression = convertExpressionToLatex(ctx.updatesExp(0));

        // Output the function definition in the form of: \(\mathit{nor}(a,b)=(expression)\)
        htmlOutput.append("\\(\\mathit{").append(functionName).append("}(")
                .append(params).append(")=").append(expression).append("\\)<br>\n");
    }

    private String convertExpressionToLatex(ccParser.UpdatesExpContext ctx) {
        String expression = ctx.getText();

        // Replace logical operators with LaTeX equivalents
        expression = expression.replace("AND", "\\wedge");    // Logical AND
        expression = expression.replace("OR", "\\vee");       // Logical OR
        expression = expression.replace("NOT", "\\neg");      // Logical NOT

        // Replace apostrophe (if any) in signal names with a LaTeX-friendly version
        expression = expression.replace("’", "'");

        // Ensure signal names are enclosed in \mathrm{}
        expression = expression.replaceAll("\\b([a-zA-Z_']+)\\b", "\\\\mathrm{$1}");

        // Surround function names with \mathit{} for italic formatting
        //expression = expression.replaceAll("(?<=\\b)nor(?=\\()", "\\\\mathit{nor}");

        // Surround the entire expression with parentheses
        return "(" + expression + ")";
    }

    public void writeToFile(String filename) throws IOException {
        htmlOutput.append("</body></html>");
        FileWriter writer = new FileWriter(filename);
        writer.write(htmlOutput.toString());
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        // Load your input file here
        CharStream input = CharStreams.fromFileName("prog.txt");
        ccLexer lexer = new ccLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ccParser parser = new ccParser(tokens);

        ParseTree tree = parser.start();
        PrettyPrint prettyPrinter = new PrettyPrint();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(prettyPrinter, tree);
        prettyPrinter.writeToFile("output.html");
    }
}
