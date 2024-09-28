grammar Expr;
// Lexer rules
IDENTIFIER: [a-zA-Z]+;
NUMBER: [0-1]+;
PLUS: '+';
STAR: '*';
SLASH: '/';
EQUAL: '=';
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;

// Parser rules
expression
  : '(' expression ')'
  | expression PLUS expression
  | expression STAR expression
  | SLASH expression
  | IDENTIFIER
  ;
update
  : IDENTIFIER EQUAL expression
  ;

hardwareSpec
  : 'hardware:' IDENTIFIER
    'inputs:' identifierList
    'outputs:' identifierList
    'latches:' identifierList
    (definition)*
    'updates:' (update)*
    'siminputs:' (siminput)*
  ;

identifierList
  : IDENTIFIER+
  ;

definition
  : 'def:' IDENTIFIER '(' identifierList ')' EQUAL expression
  ;

siminput
  : IDENTIFIER EQUAL NUMBER
  ;
