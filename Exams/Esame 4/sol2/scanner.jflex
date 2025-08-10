import java_cup.runtime.*;

%%

%class Scanner
%unicode
%cup
%line
%column

nl = \r|\n|\r\n
ws = [ \t]
comment = "(*"~"*)"
sep = "####"

hour = 03":"51":"(4[7-9]|5[0-9])
|03":"5[2-9]":"([0-5][0-9])
|0[4-9]":"[0-5][0-9]":"[0-5][0-9]
|1[0-9]":"[0-5][0-9]":"[0-5][0-9]
|2[0-2]":"[0-5][0-9]":"[0-5][0-9]
|23":"[0-3][0-9]":"[0-5][0-9]
|23":"4[0-4]":"[0-5][0-9]
|23":"45":"[0-2][0-9]
|23":"45":"3[0-4]
word = ("aa"|"ab"|"ba"|"bb")
tok1 = "X-"{hour}({word}{5}({word}{word})*)?";"

binary = (1[0-1][0-1]|1[0-1][0-1][0-1]|1[0-1][0-1][0-1][0-1]|1[0-1][0-1][0-1][0-1][0-1]|1[0-1][0-1][0-1][0-1][0-1][0-1])("-")?
tok2 = "Y-"({binary}{4})";"


eurokg = "euro/kg"
euro = "euro"
kg = "kg"



realNumber = ("+"|"-")?([1-9][0-9]*"."[0-9]*) | ("."[0-9]+) | (0"."[0-9]*)
int = 0 | [1-9][0-9]*
string = \"~\"

%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
":" {return new Symbol(sym.DP);}
"{" {return new Symbol(sym.GA);}
"}" {return new Symbol(sym.GC);}

{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}


{eurokg} {return new Symbol(sym.EUROKG);}
{euro} {return new Symbol(sym.EURO);}
{kg} {return new Symbol(sym.KG);}

{sep} {return new Symbol(sym.SEP);}

{realNumber} {return new Symbol(sym.DOUBLE, Double.parseDouble(yytext()));}
{int} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}


. {System.err.println("Unrecognized character: " + yytext());}