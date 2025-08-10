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
comment = ("(((-"~"-)))")|("---".*)
sep = "%%%%"("%%")*

binary = 1*01*01*|1*01*01*01*01*01*
word = (("+*")*("+")?)|(("*+")*("*")?)
tok1 = "A_"({binary}|{word})";"

number = (("-")3[0-2]
|("-")2[0-9]
|("-")1[0-9]
|("-")[0-9]
|[0-9]
|[1-9][0-9]
|[1-9][0-9][0-9]
|1[0-1][0-9][0-9]
|12[0-3][0-9]
|124[0-6])("+"|"*"|"$")?
tok2 = ("B_"{number})";"

st = "START"
battery = "BATTERY"
kwh = "kWh"
fuel = "FUEL"
liters = "liters"
plus = "PLUS"
star = "STAR"
max = "MAX"
mod = "MOD"
use = "USE"
do = "DO"
done = "DONE"
km = "km"
unitkm = "units/km"


realNumber = ("+"|"-")?([1-9][0-9]*"."[0-9]*) | ("."[0-9]+) | (0"."[0-9]*)


%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
"=" {return new Symbol(sym.EQ);}
"-" {return new Symbol(sym.MINUS);}
"(" {return new Symbol(sym.TA);}
")" {return new Symbol(sym.TC);}

{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}

{st} {return new Symbol(sym.ST);}
{battery} {return new Symbol(sym.BATTERY);}
{kwh} {return new Symbol(sym.KWH);}
{fuel} {return new Symbol(sym.FUEL);}
{liters} {return new Symbol(sym.LITERS);}
{plus} {return new Symbol(sym.PLUS);}
{star} {return new Symbol(sym.STAR);}
{max} {return new Symbol(sym.MAX);}
{mod} {return new Symbol(sym.MOD);}
{use} {return new Symbol(sym.USE);}
{do} {return new Symbol(sym.DO);}
{done} {return new Symbol(sym.DONE);}
{km} {return new Symbol(sym.KM);}
{unitkm} {return new Symbol(sym.UNITKM);}
{sep} {return new Symbol(sym.SEP);}

{realNumber} {return new Symbol(sym.DOUBLE, new Double(yytext()));}

. {System.err.println("Unrecognized character: " + yytext());}