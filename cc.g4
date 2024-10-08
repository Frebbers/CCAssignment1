grammar cc;

// Lexer rules
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9']*;
NUMBER: [0-9]+;
AND: '*';
OR: '+';
NOT: '/';
EQUALS: '=';
COLON: ':';
COMMA: ',';
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';
TYPES: 'hardware' | 'inputs' | 'outputs' | 'latches' | 'updates' | 'siminputs' | 'def';
COMMENT: ('//' ~[\n]* | '/*' .*? '*/') -> skip; // Comment rules
WHITESPACE: [ \n\t\r]+ -> skip; // Whitespace

// Parser rules
start: (section)* EOF; // Start rule to accept multiple sections

section: hardwareSection
       | inputsSection
       | outputsSection
       | latchesSection
       | updatesSection
       | siminputsSection
       | functionDef; // New rule for function definitions

hardwareSection: 'hardware' COLON IDENTIFIER SEMICOLON? (COMMENT)?;
inputsSection: 'inputs' COLON IDENTIFIER (IDENTIFIER)* SEMICOLON? (COMMENT)?;
outputsSection: 'outputs' COLON IDENTIFIER (IDENTIFIER)* SEMICOLON? (COMMENT)?;
latchesSection: 'latches' COLON IDENTIFIER (IDENTIFIER)* SEMICOLON? (COMMENT)?;
updatesSection: 'updates' COLON (updatesExp SEMICOLON?)+ (COMMENT)?;
siminputsSection: 'siminputs' COLON (siminputExp SEMICOLON?)+ (COMMENT)?;
functionDef: 'def' COLON IDENTIFIER LPAREN (IDENTIFIER (COMMA IDENTIFIER)*)? RPAREN EQUALS updatesExp* (COMMENT)?;

// Expression rules
siminputExp: IDENTIFIER EQUALS NUMBER;
updatesExp: updatesExp AND updatesExp
    | updatesExp OR updatesExp
    | NOT updatesExp
    | IDENTIFIER EQUALS updatesExp
    | IDENTIFIER
    | LPAREN updatesExp RPAREN
    | IDENTIFIER LPAREN (IDENTIFIER (COMMA IDENTIFIER)*)? RPAREN
    | NOT IDENTIFIER
    ;

