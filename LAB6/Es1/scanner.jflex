import java_cup.runtime.*;

%%

%class Scanner
%unicode
%cup
%line
%column

%{  private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

nl = \r|\n|\r\n
ws = [ \t]+
id = [a-zA-Z_][a-zA-Z0-9_]*
integer = ([1-9][0-9]*|0)
double = (([0-9]+\.[0-9]*)|([0-9]*\.[0-9]+))(e|E("+"|"-")?[0-9]+)?

%%

"(" {return symbol(sym.RO);}
")" {return symbol(sym.RC);}
"{"  {return symbol(sym.BO);}
"}"  {return symbol(sym.BC);}
"=" {return symbol(sym.EQ);}
"+" {return symbol(sym.PLUS);}
"-" {return symbol(sym.MINUS);}
"*" {return symbol(sym.STAR);}
"/" {return symbol(sym.DIV);}
"<" {return symbol(sym.MIN);}
">" {return symbol(sym.MAJ);}
"<=" {return symbol(sym.MINEQ);}
">=" {return symbol(sym.MAJEQ);}
"=<" {return symbol(sym.EQMIN);}
"=>" {return symbol(sym.EQMAJ);}
"&" {return symbol(sym.AND);}
"|" {return symbol(sym.OR);}
"!" {return symbol(sym.NOT);}
"[" {return symbol(sym.SO);}
"]" {return symbol(sym.SC);}

"int" {return symbol(sym.INT_TYPE);}
"double" {return symbol(sym.DOUBLE_TYPE);}

print {return symbol(sym.PRINT);}
if {return symbol(sym.IF);}
else {return symbol(sym.ELSE);}
while {return symbol(sym.WHILE);}
; {return symbol(sym.S);}
, {return symbol(sym.CM);}

{id} {return symbol(sym.ID, yytext());}
{integer} {return symbol(sym.INT, new Integer(yytext()));}
{double} {return symbol(sym.DOUBLE, new Double(yytext()));}

"/*" ˜ "*/" { /* ignore comments */ }
{ws} { /* ignore whitespace */ }
{nl} { /* ignore new lines */ }
. {System.err.println("SCANNER ERROR: " + yytext());}