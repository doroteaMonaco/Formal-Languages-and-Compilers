import java_cup.runtime.*;

%%

%class Scanner
%unicode
%cup
%line
%column

nl = \r|\n|\r\n
ws = [ \t]
comment = "<*"~"*>"
sep = "$$$"("$$")*

even = ("-")(1[02468]|[2468])
|([02468]|[1-9][02468]|1[0-9][02468]|2[0-7][02468]|28[0246])
tok1 = "!!!!"("!!")*({even}|"?????"("??")*)";"

date = (0[2-9]|[1-2][0-9]|3[0-1])"/"07"/"2023
|(0[1-9]|[1-2][0-9]|3[0-1])"/"08"/"2023
|(0[1-9]|[1-2][0-9]|30)"/"09"/"2023
|(0[1-6])"/"10"/"2023
|2023"/"07"/"(0[2-9]|[1-2][0-9]|3[0-1])
|2023"/"08"/"(0[1-9]|[1-2][0-9]|3[0-1])
|2023"/"09"/"(0[1-9]|[1-2][0-9]|30)
|2023"/"10"/"(0[1-6])
tok2 = {date}";"

hour = 07":"(3[7-9]|[4-5][0-9])
|0[8-9]":"([0-5][0-9])
|1[0-9]":"([0-5][0-9])
|2[0-1]":"([0-5][0-9])
|22":"([0-2][0-9]|3[0-7])
|07":"37":"(19|[2-5][0-9])
|07":"(3[8-9]|[4-5][0-9])":"([0-5][0-9])
|0[8-9]":"([0-5][0-9])":"([0-5][0-9])
|(1[0-9]|2[0-1])":"([0-5][0-9])":"([0-5][0-9])
|22":"[0-2][0-9]":"([0-5][0-9])
|22":"3[0-8]":"([0-5][0-9])
|22":"39":"([0-1][0-9]|2[0-3])
tok3 = {hour}";"

house = "house"
st = "start"
end = "end"
if = "if"
then = "then"
fi = "fi"
and = "and"
or = "or"
not = "not"
print = "print"

int = 0 | [1-9][0-9]*
string = \"~\"

%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
"==" {return new Symbol(sym.DEQ);}
"." {return new Symbol(sym.P);}
"(" {return new Symbol(sym.TA);}
")" {return new Symbol(sym.TC);}

{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}
{tok3} {return new Symbol(sym.TOK3);}

{house} {return new Symbol(sym.HOUSE);}
{st} {return new Symbol(sym.ST);}
{end} {return new Symbol(sym.END);}
{if} {return new Symbol(sym.IF);}
{then} {return new Symbol(sym.THEN);}
{fi} {return new Symbol(sym.FI);}
{and} {return new Symbol(sym.AND);}
{or} {return new Symbol(sym.OR);}
{not} {return new Symbol(sym.NOT);}
{print} {return new Symbol(sym.PRINT);}

{sep} {return new Symbol(sym.SEP);}

{int} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}

. {System.err.println("Unrecognized character: " + yytext());}