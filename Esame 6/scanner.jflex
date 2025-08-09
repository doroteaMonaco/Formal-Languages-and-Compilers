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
comment = "[[--"~"--]]"
sep = "===="

date = (0[4-9]|[1-2][0-9]|3[0-1])"/"July"/"2022
|(0[1-9]|[1-2][0-9]|3[0-1])"/"August"/"2022
|(0[1-9]|[1-2][1-9]|30)"/"September"/"2022
|(0[1-9]|[1-2][1-9]|3[0-1])"/"October"/"2022
|(0[1-9]|[1-2][1-9]|30)"/"November"/"2022
|(0[1-9]|[1-2][1-9]|3[0-1])"/"December"/"2022
|(0[1-9]|1[0-5])"/"January"/"2023
tok1 = "D-"{date}("-"{date})?";"

word = (("XX")|("YY")|("ZZ")){4,15}
tok2 = ("R-"{word}("????"("??")*)?)";"

hex = (2[a-fA-F]|[3-9a-fA-F][0-9a-fA-F]|[1-9aA][0-9a-fA-F][0-9a-fA-F]|[bB][0-9a-bA-B][0-9a-fA-F]|[bB][cC][0-3])("+"|"/"|"*")?
tok3 = "N-"({hex}{5}({hex}{hex})*)";"

true = "TRUE"
false = "FALSE"
if = "IF"
fi = "FI"
or = "OR"
and = "AND"
print = "PRINT"
do = "DO"
done = "DONE"

variable = [a-z]+
string = \"~\"

%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
"=" {return new Symbol(sym.EQ);}
"&" {return new Symbol(sym.AND);}
"|" {return new Symbol(sym.OR);}
"!" {return new Symbol(sym.NOT);}
"(" {return new Symbol(sym.TA);}
")" {return new Symbol(sym.TC);}

{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}
{tok3} {return new Symbol(sym.TOK3);}

{and} {return new Symbol(sym.ANDS);}
{or} {return new Symbol(sym.ORS);}
{true} {return new Symbol(sym.T);}
{false} {return new Symbol(sym.F);}
{if} {return new Symbol(sym.IF);}
{fi} {return new Symbol(sym.FI);}
{print} {return new Symbol(sym.PRINT);}
{do} {return new Symbol(sym.DO);}
{done} {return new Symbol(sym.DONE);}
{sep} {return new Symbol(sym.SEP);}

{variable} {return new Symbol(sym.VAR, new String(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}

. {System.err.println("Unrecognized character: " + yytext());}