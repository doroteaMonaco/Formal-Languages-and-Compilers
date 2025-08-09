import java_cup.runtime.*;

%%

%class Scanner
%unicode
%cup
%line
%column

nl = \r|\n|\r\n
ws = [ \t]
comment = "{{"~"}}"|"//".*
sep = "***"

hex = 27[A-Fa-f]
|2[8-9A-Fa-f][0-9A-Fa-f]
|[3-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f]
|1[0-1][0-9A-Fa-f][0-9A-Fa-f]
|12[0-9aA][0-9A-Fa-f]
|12[Bb][0-3]
chars = [a-zA-Z]{5}([a-zA-Z][a-zA-Z])*
tok1 = {hex}"*"{chars}"-"("****"("**")*|"Y"("X"("XX")*)"Y")?";"

ip = (0|[1-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"."(0|[1-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"."(0|[1-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"."(0|[1-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])
date = (0[5-9]|1[0-9]|2[0-9]|30)"/"10"/"2023
|(0[1-9]|[1-2][0-9]|30)"/"11"/"2023
|(0[1-9]|[1-2][0-9]|3[0-1])"/"12"/"2023
|(0[1-9]|[1-2][0-9]|3[0-1])"/"01"/"2024
|(0[1-9]|[1-9][0-9])"/"02"/"2024
|(0[1-3])"/"03"/"2024
tok2 = {ip}"-"{date}";"

numbers = ([0-9]{4}|[0-9]{6})("-"|"+")?
tok3 = ({numbers}{3}|{numbers}{5})";"

euro = "euro"

string = \"~\"
unsignedint = 0 | [1-9][0-9]*
realNumber = ("+"|"-")?([1-9][0-9]*"."[0-9]*) | ("."[0-9]+) | (0"."[0-9]*)
%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
"-" {return new Symbol(sym.MINUS);}
"%" {return new Symbol(sym.PERC);}


{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}
{tok3} {return new Symbol(sym.TOK3);}


{euro} {return new Symbol(sym.EURO);}

{sep} {return new Symbol(sym.SEP);}

{unsignedint} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}
{realNumber} {return new Symbol(sym.DOUBLE, Double.parseDouble(yytext()));}


. {System.err.println("Unrecognized character: " + yytext());}