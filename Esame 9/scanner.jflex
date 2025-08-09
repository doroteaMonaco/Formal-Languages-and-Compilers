import java_cup.runtime.*;

%%

%class Scanner
%unicode
%cup
%line
%column

nl = \r|\n|\r\n
ws = [ \t]
comment = "(*-"~"-*)"
sep = "$$$$"("$$")*

word = (("%*")|("*%")|("%%")){6, 17}
hex = ([0-9A-Fa-f]{2}|[0-9A-Fa-f]{3}|[0-9A-Fa-f]{6})("+")?
tok1 = ({word}({hex}{3}|{hex}{6}))";"

date = 2022"/"11"/"(1[5-9]|2[0-9]|30)
|2022"/"12"/"(0[1-9]|1[0-2])
|2022"/"12"/"(1[4-9]|2[0-9]|3[0-1])
|2023"/"01"/"(0[1-9]|1[0-9]|2[0-9]|3[0-1])
|2023"/"02"/"(0[1-9]|1[0-3])
|2023"/"02"/"(1[0-5]|2[0-8])
|2023"/"03"/"(0[1-9]|1[0-9]|2[0-9]|30)
binary = 1[0-1]11|1[0-1][0-1][0-1][0-1]|10[0-1][0-1][0-1]|101[0-1][0-1]|1011[0-1]|10111
tok2 = (({date}("$"|"+"|"%"){date}("$"|"+"|"%"){date})("-"{binary})?)";"

eurokg = "EURO/kg"
kg = "kg"

string = \"~\"
realNumber = ("+"|"-")?([1-9][0-9]*"."[0-9]*) | ("."[0-9]+) | (0"."[0-9]*)
unsignedint = 0 | [1-9][0-9]*

%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
"." {return new Symbol(sym.P);}
":" {return new Symbol(sym.DP);}
"[" {return new Symbol(sym.QA);}
"]" {return new Symbol(sym.QC);}


{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}

{eurokg} {return new Symbol(sym.EUROKG);}
{kg} {return new Symbol(sym.KG);}

{sep} {return new Symbol(sym.SEP);}

{realNumber} {return new Symbol(sym.DOUBLE, Double.parseDouble(yytext()));}
{unsignedint} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}


. {System.err.println("Unrecognized character: " + yytext());}