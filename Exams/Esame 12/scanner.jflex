import java_cup.runtime.*;

%%

%class Scanner
%unicode
%cup
%line
%column

nl = \r|\n|\r\n
ws = [ \t]
comment = "<++"~"++>"|"//".*
sep = "++++"("++")*

binary = 1[0-1]1|100|1[0-1][0-1][0-1]|1[0-1][0-1][0-1][0-1]|1[0-1][0-1][0-1][0-1][0-1]|1[0-1][0-1][0-1][0-1][0-1][0-1]
odd = ("-")(12[1-3]|1[0-1][13579]|[1-9][13579]|[13579])
|([13579]|[1-9][13579]|[1-9][0-9][13579]|1[0-9][0-9][13579]|2[0-4][0-9][13579]|25[0-5][13579]|256[135])
word = ("i")("j")?|("j")("i")?
tok1 = (("!"{binary})|("?"{odd}({word})?))";"

date = 2025"/"06"/"(1[6-9]|2[0-9]|30)
|2025"/"07"/"(0[1-9]|[1-2][0-9]|3[0-1])
|2025"/"08"/"(0[1-9]|[1-2][0-9]|3[0-1])
|2025"/"09"/"(0[1-9]|[1-2][0-9]|30)
|2025"/"10"/"(0[1-9]|[1-2][0-9]|3[0-1])
|2025"/"11"/"(0[1-9]|[1-2][0-9]|30)
|2025"/"12"/"(0[1-9]|[1-2][0-9]|3[0-1])
|2026"/"01"/"(0[1-9]|[1-2][0-9]|3[0-1])
|2026"/"02"/"(0[1-9]|[1-2][0-4])
hour = ":"05":"(1[8-9]|[2-5][0-9])
|":"0[6-9]":"([0-5][0-9])
|":"10":"([0-3][0-9])
|":"10":"(4[0-7])
tok2 = "$"{date}({hour})?";"

obj = "obj"
name = "name"
end = "end"
and = "AND"
or = "OR"
not = "NOT"
eq = "-eq"
neq = "-neq"
true = "IS_TRUE"
print = "print"
false = "IS_FALSE"

int = 0 | [1-9][0-9]*
string = \"~\"

%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
"?" {return new Symbol(sym.DOM);}
"-?" {return new Symbol(sym.MINDOM);}
"(" {return new Symbol(sym.TA);}
")" {return new Symbol(sym.TC);}
"." {return new Symbol(sym.P);}

{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}

{obj} {return new Symbol(sym.OBJ);}
{name} {return new Symbol(sym.NAME);}
{end} {return new Symbol(sym.END);}
{and} {return new Symbol(sym.AND);}
{or} {return new Symbol(sym.OR);}
{not} {return new Symbol(sym.NOT);}
{eq} {return new Symbol(sym.EQ);}
{neq} {return new Symbol(sym.NEQ);}
{true} {return new Symbol(sym.TRUE);}
{print} {return new Symbol(sym.PRINT);}
{false} {return new Symbol(sym.FALSE);}

{sep} {return new Symbol(sym.SEP);}

{int} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}

. {System.err.println("Unrecognized character: " + yytext());}