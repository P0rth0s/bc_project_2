/*
-----------------------------------
bc emulator grammar
------------------------------------
by: Harry Deffebach
6448-5421


------------------------------------
Run Commands
------------------------------------
antlr4 bc.g4
javac bc*.java
grun bc exprList -tree input.txt

 */

grammar Bc;

s: exprList <EOF>;

exprList: topExpr ( END_EXPR topExpr)* END_EXPR? ;

topExpr :
    boolean_expr 
    | adv_expr
    ;

adv_expr:
    expr #retexpr
    | assignment_expr #assignment
    | 'if[' boolean_expr '] then ' adv_expr ('elif[' boolean_expr '] then ' adv_expr)* ('else' adv_expr)? #ifLoop
    | 'while[' boolean_expr '] do' adv_expr+ 'done' #whileLoop
    | 'for[' (assignment_expr ';')? boolean_expr ';' expr ']' adv_expr+ #forLoop
;

boolean_expr returns [int b]:
    el=expr op='||' er=expr #boolean
    | el=expr op='&&' er=expr #boolean
    | op='!'el=expr #boolean
    | expr op='<' expr #boolean
    | expr op='>' expr #boolean
    | expr op='==' expr #boolean
    | expr op='!=' expr #boolean
    ;

expr:
    //base types
    FLOAT #flt
    | id=ID #idval
    | '(' el=expr ')' #parenthesis
    | '++' id=ID #increment
    | id=ID '++' #increment
    | '--' id=ID #decrement
    | id=ID '--' #decrement
    | '-'el=expr #negate
    | el=expr op='^' er=expr #pow
    | el=expr op='*' er=expr #mult
    | el=expr op='/' er=expr #div
    | el=expr op='%' er=expr #mod
    | expr op='+' expr #add
    | el=expr op='-' er=expr #sub
    //ID<op>=expr
    | id=ID op='^=' er=expr #powSet
    | id=ID op='*=' er=expr #multSet
    | id=ID op='/=' er=expr #divSet
    | id=ID op='%=' er=expr #modSet
    | id=ID op='+=' er=expr #addSet
    | id=ID op='-=' er=expr #subSet
    //special expression
    | 'read()'  #read
    | 'sqrt(' el=expr ')' #sqrt
    //Math functions
    | op='s(' el=expr ')' #sin
    | op='c(' el=expr ')' #cos
    | op='l(' el=expr ')' #log
    | op='e(' el=expr ')' #e
    //function
    | id=ID '(' FLOAT? (','FLOAT)* ')' #function
    ;

assignment_expr:
    id=ID '=' er=expr #defineVar
    | 'define' id=ID '(' ID? (',' ID)* ')' adv_expr* 'return' expr #defineFunc
    ;

//basic declerations
FLOAT: [0-9]+('.'[0-9]+)?;

ID: [a-z][_a-z0-9]*;

OP : [*/%+-];

END_EXPR: [;\n]
    | COMMENT2;

WS : [ \t\r]+ -> skip ;

COMMENT : '/*' .*? '*/' -> skip;
COMMENT2 : '#' .*? '\n' -> skip;

OR : '||';
AND: '&&';
NOT: '!';
EQ: '==';
LT: '<';
GT: '>';
NE: '!=';
