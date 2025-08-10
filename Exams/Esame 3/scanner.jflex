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
comment = "(++"~"++)"
sep = "$$"

hex = ("-")5[acAC]
|("-")[1-4][02468aceACE]
|("-")[2468aceACE]
|[02468aceACE]
|[1-9a-eA-E][02468aceACE]
|[1-9][0-9a-eA-E][02468aceACE]
|[aA][0-9abAB][0246]
word = ["a""b""c"]{7}(["a""b""c"]["a""b""c"])*
tok1 = ({word}"#"({hex})?)";"

hour = 0[7-9]":"(1[3-9]|[2-5][0-9])":"(2[4-9]|[3-5][0-9]|[0-5][0-9])
|[1-6][0-9]":"([0-5][0-9])":"([0-5][0-9])
|17":"([0-2][0-9])":"([0-5][0-9])
|17":"(3[0-6])":"([0-5][0-9])
|17":"(37)":"([0-3][0-9])
|17":"(37)":"(4[0-3])
binary = 1[0-1]1|100|1[0-1][0-1][0-1]|11[0-1][0-1][0-1]|110[0-1][0-1]|1101[0-1]|11010
tok2 = ({hour}":"{binary})";"

variable = [a-z]
print = "print"
compare = "compare"
end = "end"
with = "with"
int = 0 | [1-9][0-9]*

%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"{" {return new Symbol(sym.GA);}
"}" {return new Symbol(sym.GC);}
"(" {return new Symbol(sym.TA);}
")" {return new Symbol(sym.TC);}
"+" {return new Symbol(sym.PLUS);}
"-" {return new Symbol(sym.MINUS);}
"*" {return new Symbol(sym.STAR);}
"/" {return new Symbol(sym.DIVIDE);}
"=" {return new Symbol(sym.EQ);}

{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}
{print} {return new Symbol(sym.PRINT);}
{compare} {return new Symbol(sym.COMPARE);}
{with} {return new Symbol(sym.WITH);}
{end} {return new Symbol(sym.END);}
{sep} {return new Symbol(sym.SEP);}


{int} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{variable} {return new Symbol(sym.VAR, new String(yytext()));}
. {System.err.println("Unrecognized character: " + yytext());}