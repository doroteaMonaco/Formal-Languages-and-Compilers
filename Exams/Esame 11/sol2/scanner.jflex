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
sep = "**"

hex = 27[A-Fa-f]|2[8-9a-fA-F][0-9a-fA-F]|[3-9A-Fa-f][0-9a-fA-F][0-9a-fA-F]|1[0-1][0-9a-fA-F][0-9a-fA-F]|12[0-9aA][0-9a-fA-F]|12[bB][0-3]
alph = [a-zA-Z]
word = "Y"("X"("XX")*)"Y"
tok1 = {hex}"*"({alph}{5}({alph}{alph})*)"-"("****"{4}("**")*|{word})?";"

ip = (0|[1-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(".")?
date = (0[5-9]|[1-2][0-9]|3[0-1])"/"10"/"2023
|(0[1-9]|[1-2][0-9]|30)"/"11"/"2023
|(0[1-9]|[1-2][0-9]|3[0-1])"/"12"/"2023
|(0[1-9]|[1-2][0-9]|3[0-1])"/"01"/"2024
|(0[1-9]|[1-2][0-9])"/"02"/"2024
|(0[1-3])"/"03"/"2024
tok2 = {ip}+"-"{date}";"

number = ([0-9]{4}|[0-9]{6})("-"|"+")?
tok3 = ({number}{3}|{number}{5})";"

euro = "euro"

realNumber = ("+"|"-")?([1-9][0-9]*"."[0-9]*) | ("."[0-9]+) | (0"."[0-9]*)
int = 0 | [1-9][0-9]*
string = \"~\"

%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
"%" {return new Symbol(sym.PERC);}
"-" {return new Symbol(sym.MINUS);}

{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}
{tok3} {return new Symbol(sym.TOK3);}

{euro} {return new Symbol(sym.EURO);}

{sep} {return new Symbol(sym.SEP);}

{realNumber} {return new Symbol(sym.DOUBLE, Double.parseDouble(yytext()));}
{int} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}

. {System.err.println("Unrecognized character: " + yytext());}