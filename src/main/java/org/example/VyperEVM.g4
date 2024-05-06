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

// Parser rules
program : statement+;

statement : simpleStatement
          | compoundStatement
          ;

simpleStatement : expression SEMICOLON;

compoundStatement : ifStatement
                  | whileStatement
                  // Add other compound statements as needed
                  ;

ifStatement : 'if' expression ':' NEWLINE INDENT statement+ DEDENT ('else' ':' NEWLINE INDENT statement+ DEDENT)?;

whileStatement : 'while' expression ':' NEWLINE INDENT statement+ DEDENT;

expression : atomicExpression (PLUS atomicExpression | MINUS atomicExpression | MUL atomicExpression | DIV atomicExpression | MOD atomicExpression | POW atomicExpression)
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

AND : 'and';

OR : 'or';

NOT : 'not';

NEWLINE : '\r'? '\n';

INDENT : '    ';

DEDENT : [ \t]* '\r'? '\n';

ESC : '\\' .;
