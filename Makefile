##This makefile is stolen from week 1 and will probably not work until we author a cc.txt file

antlrjar = antlr-4.13.2-complete.jar

###### FOR LINUX AND MAC -- comment the following line if you use Windows:
classpath = '$(antlrjar):.'


antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = ccListener.java ccBaseListener.java ccParser.java ccLexer.java

all:	
	make grun

ccLexer.java:	Expr.g4
	$(antlr4) Expr.g4

ccLexer.class:	ccLexer.java
	javac -cp $(classpath) $(GENERATED)

grun:	ccLexer.class cc.txt
	$(grun) cc start -gui -tokens prog.txt 
