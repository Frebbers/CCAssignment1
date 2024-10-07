##This makefile is stolen from week 1 and will probably not work until we author a Expr.txt file

antlrjar = antlr-4.13.2-complete.jar

###### FOR LINUX AND MAC -- comment the following line if you use Windows:
classpath = '$(antlrjar):.'


antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = ExprListener.java ExprBaseListener.java ExprParser.java ExprLexer.java

all:	
	make grun

ExprLexer.java:	Expr.g4
	$(antlr4) Expr.g4

ExprLexer.class:	ExprLexer.java
	javac -cp $(classpath) $(GENERATED)

grun:	ExprLexer.class Expr.txt
	$(grun) Expr start -gui -tokens prog.txt 
