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
comment = "//".*
sep = "####"("##")*

odd = ("-")3[135]
|("-")[1-2][13579]
|("-")[13579]
|[13579]
|[1-9][13579]
|[1-2][0-9][13579]
|3[0-2][13579]
|33[13]
word = (("**")|("???"))
tok1 = (("%%%%%"("%%")*)|{word}{2}|{word}{3})({odd})";"

date = 2015"/"12"/"(1[2-9]|2[0-9]|3[0-1])
|2016"/"01"/"(0[1-4])
|2016"/"01"/"(0[6-9]|[1-2][0-9]|3[0-1])
|2016"/"02"/"(0[1-9]|[1-2][0-9])
|2016"/"03"/"(0[1-9]|1[0-3])
tok2 = ({date}("-"|"+"){date})";"

binary = 1[0-1]1|100|1[0-1][0-1][0-1]|1[0-1][0-1][0-1][0-1]|1[0-1][0-1][0-1][0-1][0-1]|10[0-1][0-1][0-1][0-1]|101[0-1][0-1][0-1]|1010[0-1][0-1]|10100[0-1]|101000
tok3 = "$"{binary}";"

ms = "m/s"
print = "PRINT_MIN_MAX"
part = "PART"
m = "m"

int = 0 | [1-9][0-9]*
string = \"~\"

%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
"|" {return new Symbol(sym.BAR);}
":" {return new Symbol(sym.DP);}
"->" {return new Symbol(sym.ARROW);}
"=" {return new Symbol(sym.EQ);}
"(" {return new Symbol(sym.TA);}
")" {return new Symbol(sym.TC);}
"{" {return new Symbol(sym.GA);}
"}" {return new Symbol(sym.GC);}


{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}
{tok3} {return new Symbol(sym.TOK3);}

{ms} {return new Symbol(sym.MS);}
{print} {return new Symbol(sym.PRINT);}
{part} {return new Symbol(sym.PART);}
{m} {return new Symbol(sym.M);}

{sep} {return new Symbol(sym.SEP);}

{int} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}

. {System.err.println("Unrecognized character: " + yytext());}