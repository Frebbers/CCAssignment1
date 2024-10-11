##This makefile is stolen from week 1 and will probably not work until we author a Expr.txt file

antlrjar = antlr-4.13.2-complete.jar

###### FOR LINUX AND MAC -- comment the following line if you use Windows:
classpath = '$(antlrjar):.'


antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = ccListener.java ccBaseListener.java ccParser.java ccLexer.java

1a = 01a-hello-world.txt
1b = 01b-hello-world-withdef.hw
02 = 02-trafiklys-minimal.hw
03 = 03-trafiklys.hw
04 = 04-von-Neumann.hw

all:	
	make grun

ccLexer.java:	cc.g4
	$(antlr4) cc.g4

ccLexer.class:	ccLexer.java
	javac -cp $(classpath) $(GENERATED)

grun:	ccLexer.class prog.txt
	$(grun) cc start -gui -tokens prog.txt 
