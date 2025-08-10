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

hex = ("-")(2[0-7]|1[0-9A-Fa-f]|[1-9A-Fa-f])
|[0-9A-Fa-f]
|[1-9A-Fa-f][0-9A-Fa-f]
|[1-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f]
|1[0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f]
|2[0-4][0-9A-Fa-f][0-9A-Fa-f]
|25[0-5][0-9A-Fa-f]
|256[0-9A-Ca-c]
word = [a-zA-Z]{5}([a-zA-Z][a-zA-Z])*
wxyz = "X"("Y"("YY")*)("ZZ"("ZZ")*)"X"
tok1 = {hex}"_"{word}"_"("SOS"|{wxyz})?";"

hour = 09":"21":"(1[2-9]|[2-5][0-9])
|09":"(2[2-9]|[3-5][0-9])":"(0[0-9]|[1-5][0-9])
|(1[0-6])":"([0-5][0-9])":"(0[1-9]|[1-5][0-9])
|17":"([0-3][0-9])":"(0[0-9]|[1-5][0-9])
|17":"(4[0-2])":"(0[0-9]|[1-5][0-9])
|17":"43":"([0-2][0-9])
|17":"43":"(3[0-4])
|09":"2[1-9]
|09":"[3-5][0-9]
|(1[0-6])":"([0-5][0-9])
|17":"([0-3][0-9])
|17":"(4[0-3])
|09":"2[1-9]("am"|"pm")
|09":"[3-5][0-9]("am"|"pm")
|(1[0-6])":"([0-5][0-9])("am"|"pm")
|17":"([0-3][0-9])("am"|"pm")
|17":"(4[0-3])("am"|"pm")
tok2 = {hour}";"

binary = 1*01*01*|1*01*01*01*01*
wxo = ("X"("OX")*)|("O"("XO")*)
tok3 = ("$$"{binary}|"&&"{wxo})";"

km = "km"
compute = "COMPUTE"
to = "TO"
time = "TIME"
kmh = "km/h"
expense = "EXPENSE"
eurokm = "euro/km"
disc = "DISC"
euro = "euro"
extra = "EXTRA"

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
{kmh} {return new Symbol(sym.KMH);}
{expense} {return new Symbol(sym.EXPENSE);}
{eurokm} {return new Symbol(sym.EUROKM);}
{disc} {return new Symbol(sym.DISC);}
{euro} {return new Symbol(sym.EURO);}
{extra} {return new Symbol(sym.EXTRA);}

{sep} {return new Symbol(sym.SEP);}

{realNumber} {return new Symbol(sym.DOUBLE, Double.parseDouble(yytext()));}
{int} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}

. {System.err.println("Unrecognized character: " + yytext());}