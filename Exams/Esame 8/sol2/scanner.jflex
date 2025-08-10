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
octal = ("-")(12[0-8]|1[0-1][0-8]|[1-8][0-8]|[1-8])
|([0-8]|[1-8][0-8]|[1-2][0-8][0-8]|3[0-1][0-8]|32[0-3])
comb = ("xx"|"yy"|"zz")
tok1 = "?"{word}{octal}({comb}{4}({comb})*)?";"

email = ([0-9a-zA-Z_]+"."[0-9a-zA-Z_]+"@"[a-zA-Z0-9]+"."("net"|"org"|"com"|"it"))("!"|"/")?
tok2 = ({email}{2}|{email}{12}|{email}{15})";"

tok3 = "tk3"";"

cmp = "CMP"
true = "T"
false = "F"
with = "WITH"
print = "print"
and = "AND"
or = "OR"
not = "NOT"
fz = "fz_and"

var = [0-9a-zA-Z_]+
string = \"~\"

%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
"=" {return new Symbol(sym.EQ);}
"(" {return new Symbol(sym.TA);}
")" {return new Symbol(sym.TC);}
"[" {return new Symbol(sym.QA);}
"]" {return new Symbol(sym.QC);}

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
{fz} {return new Symbol(sym.FZ);}

{sep} {return new Symbol(sym.SEP);}

{string} {return new Symbol(sym.STR, new String(yytext()));}
{var} {return new Symbol(sym.VAR, new String(yytext()));}

. {System.err.println("Unrecognized character: " + yytext());}