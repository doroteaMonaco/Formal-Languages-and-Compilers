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

hex = ("-")2[0-7]
|("-")1[0-9a-fA-F]
|("-")[1-9a-fA-F]
|[0-9a-fA-F]
|[0-9a-fA-F][0-9a-fA-F]
|[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]
|1[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]
|2[0-5][0-6][0-9a-cA-C]
word = [a-zA-Z]{5}([a-zA-Z]{2})*
tok1 = {hex}"_"{word}"_"("SOS"|"X"("Y"("YY")*)("ZZ"("ZZ")*)"X")?";"

hour = (09":"21":"(1[2-9]|[2-5][0-9])
|09":"(2[2-9])":"([0-5][0-9])
|09":"([3-5][0-9])":"([0-5][0-9])
|1[0-6]":"([0-5][0-9])":"([0-5][0-9])
|17":"[0-3][0-9]":"([0-5][0-9])
|17":"4[0-2]":"([0-5][0-9])
|17":"43":"([0-2][0-9])
|17":"43":"(3[0-4]))
|(09":"2[1-9]
|09":"([3-5][0-9])
|1[0-6]":"([0-5][0-9])
|17":"([0-3][0-9])
|17":"4[0-3])("am"|"pm")?
tok2 = {hour}";"

binary = [0-1]+
w = ("XO"("X")?)|("OX"("O")?)
tok3 = ("$$"{binary})|("&&"{w})";"

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
{disc} {return new Symbol(sym.DISC);}
{kmh} {return new Symbol(sym.KMH);}
{sep} {return new Symbol(sym.SEP);}

{realNumber} {return new Symbol(sym.DOUBLE, Double.parseDouble(yytext()));}
{int} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}

. {System.err.println("Unrecognized character: " + yytext());}