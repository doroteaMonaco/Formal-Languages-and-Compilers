import java_cup.runtime.*;

%%

%class Scanner
%unicode
%cup
%line
%column

//PATTERN -> REGEX UTILI
nl = \r|\n|\r\n
ws = [ \t]
comment = "/-"~"-/"
sep = "##"

symbols = ("**"{2}|"**"{3})*("???")*
numbers = ("-")3[0-5]
|("-")[1-2][0-9]
|("-")[1-9]
|[0-9]
|[1-9][0-9]
|[1-2][0-9][0-9]
|3[0-2][0-9]
|33[0-3]
tok1 = ("%%%%%"("%%")*)|{symbols}({numbers})?";"

date = (2015"/"12"/"([1-2][0-9]|3[0-1])
|2016"/"01"/"(0[1-9]|[1-2][0-9]|3[0-1])
|2016"/"02"/"(0[1-9]|[1-2][0-9])
|2016"/"03"/"(0[1-9]|1[0-3]))("-"|"+")?
tok2 = {date}*";"

binary = 1[0-1]1|110|1[0-1][0-1][0-1]|1[0-1][0-1][0-1][0-1]|10[0-1][0-1][0-1][0-1]|101[0-1][0-1][0-1]|101000
tok3 = "$"{binary}";"

km = "km"
kmh = "km/h"
compute = "COMPUTE"
to = "TO"
time = "TIME"
expense = "EXPENSE"
extra = "EXTRA"
eurokm = "euro/km"
disc = "DISC"
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
"-" {return new Symbol(sym.MINUS);}
":" {return new Symbol(sym.DP);}
"%" {return new Symbol(sym.PERC);}
"->" {return new Symbol(sym.ARROW);}

{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}
{tok3} {return new Symbol(sym.TOK3);}
{km} {return new Symbol(sym.KM);}
{compute} {return new Symbol(sym.COMPUTE);}
{to} {return new Symbol(sym.TO);}
{time} {return new Symbol(sym.TIME);}
{expense} {return new Symbol(sym.EXPENSE);}
{extra} {return new Symbol(sym.EXTRA);}
{euro} {return new Symbol(sym.EURO);}
{eurokm} {return new Symbol(sym.EUROKM);}
{kmh} {return new Symbol(sym.KMH);}
{sep} {return new Symbol(sym.SEP);}

{realNumber} {return new Symbol(sym.DOUBLE, Double.parseDouble(yytext()));}
{int} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}

. {System.err.println("Unrecognized character: " + yytext());}