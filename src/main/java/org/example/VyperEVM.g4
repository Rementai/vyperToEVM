grammar VyperEVM;

// Lexer rules
WS : [ \t\r\n]+ -> skip;

LINE_COMMENT : '#' ~[\r\n]* -> skip;

BLOCK_COMMENT : '/*' .*? '*/' -> skip;

NUMBER : [0-9]+ ('.' [0-9]+)?;

STRING : '"' (ESC | ~["\\])* '"';

BOOL : 'True' | 'False';

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

LPAREN : '(';

RPAREN : ')';

LBRACE : '{';

RBRACE : '}';

LBRACK : '[';

RBRACK : ']';

COMMA : ',';

COLON : ':';

SEMICOLON : ';';

DOT : '.';

ASSIGN : '=';

PLUS : '+';

MINUS : '-';

MUL : '*';

DIV : '/';

MOD : '%';

POW : '**';

AND : 'and';

OR : 'or';

NOT : 'not';

EQ : '==';

NEQ : '!=';

LTE : '<=';

GTE : '>=';

NEWLINE : '\r'? '\n';

INDENT : [ \t]+;

DEDENT : [ \t]* '\r'? '\n' -> popMode;

ESC : '\\' .;

// Parser rules
program : statement+ EOF;

statement : simpleStatement
          | compoundStatement
          | functionDefinition
          ;

simpleStatement : expression SEMICOLON;

compoundStatement : ifStatement
                  | whileStatement
                  ;

ifStatement : 'if' expression COLON NEWLINE INDENT statement+ DEDENT (elseStatement)?;

elseStatement : 'else' COLON NEWLINE INDENT statement+ DEDENT;

whileStatement : 'while' expression COLON NEWLINE INDENT statement+ DEDENT;

expression : expression (PLUS | MINUS | MUL | DIV | MOD | POW | EQ | NEQ | LTE | GTE) expression
           | NOT expression
           | expression AND expression
           | expression OR expression
           | LPAREN expression RPAREN
           | atomicExpression
           ;

atomicExpression : NUMBER
                 | STRING
                 | BOOL
                 | IDENTIFIER
                 ;

functionDefinition : '@' IDENTIFIER parameters '->' IDENTIFIER COLON NEWLINE INDENT statement+ DEDENT;

parameters : LPAREN (parameter (COMMA parameter)*)? RPAREN;

parameter : IDENTIFIER (COLON IDENTIFIER)?;