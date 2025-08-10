import java_cup.runtime.*;

%%

%class scanner
%unicode
%line
%column
%cup

nl = \n|\r|\r\n
ws = [ \t]+
type = [a-z]+
attribute = [a-zA-Z]+
int = [0-9]+
value = "*"|"+"|"/"|"-"
name_type = [a-zA-Z]+({ws}+[a-zA-Z]+)*
comment = \/\/.*{nl}


%%

"(" {return new Symbol(sym.TA);}
")" {return new Symbol(sym.TC);}
":" {return new Symbol(sym.DP);}
"," {return new Symbol(sym.V);}
"->" {return new Symbol(sym.ARROW);}
"=" {return new Symbol(sym.EQ);}
";" {return new Symbol(sym.PV);}
"." {return new Symbol(sym.P);}

{type} {return new Symbol(sym.TYPE, new String(yytext()));}
{attribute} {return new Symbol(sym.ATTRIBUTE, new String(yytext()));}
{name_type} {return new Symbol(sym.NAME, new String(yytext()));}
{comment} {; /* ignore comments */}
{int} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{value} {return new Symbol(sym.VALUE, new String(yytext()));}

{ws} {;}
{nl} {;}
. {System.out.println("TOKEN ERROR: " + yytext());}