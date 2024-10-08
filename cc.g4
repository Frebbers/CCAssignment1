grammar cc;

// Lexer rules

IDENTIFIER: [a-zA-Z_]+[a-zA-Z_0-9’]*;
NUMBER: [0-9]+;
AND: '*';
OR: '+';
NOT: '/';
EQUALS: '=';
COLON: ':';
TYPES: 'hardware' COLON | 'inputs' COLON | 'outputs' COLON | 'latches' COLON | 'updates' COLON | 'siminputs' COLON;
COMMENT: ('//' ~[\n]* | '/*' .*? '*/') -> skip;
WHITESPACE: [ \n\t\r]+ -> skip;

// Parser rules

start: (assignment | updates | siminputs | COMMENT)* EOF;

assignment: TYPES IDENTIFIER;
updates: 'updates' COLON (updatesExp)+;
siminputs:  'siminputs' COLON (siminputExp)+;

siminputExp: IDENTIFIER EQUALS NUMBER;
updatesExp: IDENTIFIER EQUALS updatesExp
            | NOT IDENTIFIER
            | updatesExp AND updatesExp
            | updatesExp OR updatesExp
            | IDENTIFIER;