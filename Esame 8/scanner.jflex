import java_cup.runtime.*;

%%

%class Scanner
%unicode
%cup
%line
%column

nl = \r|\n|\r\n
ws = [ \t]
comment = "{++"~"++}"
sep = "$$$"

word = [A-Z]{6}([A-Z][A-Z])*
wordx = ["xx""yy""zz"]
octal = ("-")12[0-7]
|("-")1[0-1][0-7]
|("-")[1-7][0-7]
|("-")[1-7]
|[0-7]
|[1-7][0-7]
|[1-2][0-7][0-7]
|3[0-1][0-7]
|32[0-3]
tok1 = ("?"{word}{octal}(({wordx}{4}){wordx}*)?)";"

email = (([a-zA-Z0-9_\.])+"@"([a-zA-Z])+"."([a-zA-Z])+)("/")?
tok2 = ({email}{2}
|{email}{12}
|{email}{15})";"

tok3 = "tk3"";"

cmp = "CMP"
true = "T"
false = "F"
with = "WITH"
print = "print"
and = "AND"
or = "OR"
not = "NOT"
fzand = "fz_and"

variable = [a-zA-Z0-9]+
string = \"~\"

%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
"=" {return new Symbol(sym.EQ);}
"[" {return new Symbol(sym.QA);}
"]" {return new Symbol(sym.QC);}
"(" {return new Symbol(sym.TA);}
")" {return new Symbol(sym.TC);}

{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}
{tok3} {return new Symbol(sym.TOK3);}

{cmp} {return new Symbol(sym.CMP);}
{true} {return new Symbol(sym.T);}
{false} {return new Symbol(sym.F);}
{with} {return new Symbol(sym.WITH);}
{print} {return new Symbol(sym.PRINT);}
{and} {return new Symbol(sym.AND);}
{or} {return new Symbol(sym.OR);}
{not} {return new Symbol(sym.NOT);}
{fzand} {return new Symbol(sym.FZ);}
{sep} {return new Symbol(sym.SEP);}


{variable} {return new Symbol(sym.VAR, new String(yytext()));}
{string} {return new Symbol(sym.STR, new String(yytext()));}


. {System.err.println("Unrecognized character: " + yytext());}