import java_cup.runtime.*;

%%

%class Scanner
%unicode
%cup
%line
%column

nl = \r|\n|\r\n
ws = [ \t]
sep = "*****"

hour = 08":"31":"(1[2-9]|[2-5][0-9])
|08":"(3[2-9]|[4-5][0-9])":"([0-5][0-9])
|09":"([0-5][0-9])":"([0-5][0-9])
|(1[0-9])":"([0-5][0-9])":"([0-5][0-9])
|(2[0-2])":"([0-5][0-9])":"([0-5][0-9])
|23":"([0-1][0-9]|20)":"([0-5][0-9])
|23":"(21)":"(0[0-9]|10)
|08":"(3[1-9]|[4-5][0-9])
|09":"[0-5][0-9]
|(1[0-9]|20)":"[0-5][0-9]
|2[0-2]":"([0-1][0-9]|2[0-1])
|23":"([0-1][0-9]|2[0-1])
tok1 = {hour}({hour})*";"

even = ("-")(13[02468]|1[4-9][02468]|[1-9][02468])
|([02468]|[1-9][02468]|[1-7][0-9][02468]|8[0-1][02468]|82[024])
word = (("X")|("Y")){3}((("X")|("Y"))(("X")|("Y")))*
code = ({word})?{even}
tok2 = {code}{code}";"

alph = [a-zA-Z]{3}([a-zA-Z]{2})*
numbers = (1[2-9]|[2-9][0-9]|1[0-2][0-9]|13[0-2])
user = {alph}"."{numbers}"."{numbers}

auction = "Auction"
min = "min"
euro = "euro"

strs = "dollari"|"euro"|"sterline"
realNumber = ("+"|"-")?([1-9][0-9]*"."[0-9]*) | ("."[0-9]+) | (0"."[0-9]*)
int = 0 | [1-9][0-9]*
string = \"~\"

%%

{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
":" {return new Symbol(sym.DP);}
"->" {return new Symbol(sym.ARROW);}

{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}

{auction} {return new Symbol(sym.AUC);}
{min} {return new Symbol(sym.MIN);}
{strs} {return new Symbol(sym.STRINGS);}

{sep} {return new Symbol(sym.SEP);}

{realNumber} {return new Symbol(sym.DOUBLE, Double.parseDouble(yytext()));}
{int} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}
{user} {return new Symbol(sym.USER, new String(yytext()));}
. {System.err.println("Unrecognized character: " + yytext());}