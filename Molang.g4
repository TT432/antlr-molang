grammar Molang;

@header { package io.github.tt432.molang; }

exprSet
    : expr (SIEM expr)* SIEM?
    ;

expr
    : S_OPERATOR expr                   # neExpr
    | expr op=(MUL | DIV) expr          # mulOrDiv
    | expr op=(ADD | SUB) expr          # addOrSub
    | expr COMPARISON_OPERATOR expr     # comparisonOperator
    | expr EQUALS_OPERATOR expr         # equalsOperator
    | expr AND_OPERATOR expr            # andOperator
    | expr OR_OPERATOR expr             # orOperator
    | expr BCO expr                     # binaryConditionalOperator
    | expr BCO expr TCO0 expr           # ternaryConditionalOperator
    | signedAtom                        # singleSignedAtom
    | RETURN expr                       # returnOperator
    ;

funcParam
    : expr
    | string
    ;

signedAtom
    : ADD atom
    | SUB atom
    | atom
    ;

atom
    : function
    | variable
    | CONSTANT
    | scientific
    | LPAREN expr RPAREN
    ;

scientific
    : SCIENTIFIC_NUMBER
    ;

function
    : funcname LPAREN (funcParam (COMMA funcParam)*)? RPAREN
    ;

variable
    : ID ('.' ID)*
    ;

funcname
    : ID ('.' ID)*
    ;

string
    : STRING
    ;

fragment NUMBER
    : '0'..'9'+ ('.' '0'..'9'+ )?
    ;

COMPARISON_OPERATOR
    : '<'
    | '<='
    | '>='
    | '>'
    ;

EQUALS_OPERATOR
    : '=='
    | '!='
    ;

AND_OPERATOR
    : '&&'
    ;

OR_OPERATOR
    : '||'
    ;

BCO
    : '?'
    ;

TCO0
    : ':'
    ;

S_OPERATOR
    : '!'
    ;

RETURN
    : 'return'
    ;

CONSTANT
    : 'E'
    ;

SCIENTIFIC_NUMBER
    : NUMBER ((E1 | E2) (ADD | SUB)? NUMBER)?
    ;

STRING
    : DQUOT .*? DQUOT
    | QUOT  .*? QUOT
    ;

LPAREN
    : '('
    ;
RPAREN
    : ')'
    ;

DQUOT
    : '"'
    ;
QUOT
    : '\''
    ;

E1
    : 'E'
    ;
E2
    : 'e'
    ;

ID
    : [a-zA-Z_-]+
    ;
WS
    : [ \t\r\n]+ -> skip
    ;

ADD
    : '+'
    ;
SUB
    : '-'
    ;
MUL
    : '*'
    ;
DIV
    : '/'
    ;

COMMA
    : ','
    ;

SIEM
    : ';'
    ;