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
comment = "+--"~"--+"
sep = "===="

hour = 0[8-9]":"[0-5][0-9]
|[1-6][0-9]":"[0-5][0-9]
|17:[0-2][0-9]
|17:3[0-5]
date = (0[3-9]|[1-2][0-9]|30)"/"09"/"2021
|(0[1-9]|[1-2][0-9]|3[0-1])"/"10"/"2021
|(0[1-9]|[1-2][0-9]|30)"/"11"/"2021
|(0[1-9]|[1-2][0-9]|3[0-1])"/"12"/"2021
|(0[1-9]|[1-2][0-9]|3[0-1])"/"01"/"2022
|(0[1-9]|1[0-9]|2[0-8])"/"02"/"2022
|(0[1-5])"/"03"/"2022
tok1 = ("I_"{date}(":"{hour})?)";"

hex = (3[b-fB-F]|[4-9a-fA-F][0-9a-fA-F]|[1-9][0-9a-fA-F][0-9a-fA-F]|[aA][0-9a-dA-D][0-9a-fA-F]|[aA][eE][0-3])("+"|"-"|"*")?
tok2 = ("J_"({hex}{6}({hex}{hex})*))";"

word = [a-z]{5}([a-z][a-z])*
binary = (("00")|("01")|("10")|("11")){3}((("00")|("01")|("10")|("11")))*
tok3 = ("K_"{word}({binary})?)";"


init = "INIT"
height = "HEIGHT"
speed = "SPEED"
sum = "SUM"
mul = "MUL"
cond = "COND"
update = "UPDATE"
done = "DONE"

int = 0 | [1-9][0-9]*

%%

{comment} {;}
{ws} {;}
{nl} {;}

";" {return new Symbol(sym.PV);}
"," {return new Symbol(sym.V);}
"=" {return new Symbol(sym.EQ);}
"[" {return new Symbol(sym.QA);}
"]" {return new Symbol(sym.QC);}
">" {return new Symbol(sym.MAX);}

{tok1} {return new Symbol(sym.TOK1);}
{tok2} {return new Symbol(sym.TOK2);}
{tok3} {return new Symbol(sym.TOK3);}

{init} {return new Symbol(sym.IN);}
{height} {return new Symbol(sym.H);}
{speed} {return new Symbol(sym.S);}
{sum} {return new Symbol(sym.SUM);}
{mul} {return new Symbol(sym.MUL);}
{cond} {return new Symbol(sym.COND);}
{update} {return new Symbol(sym.UPDATE);}
{done} {return new Symbol(sym.DONE);}
{sep} {return new Symbol(sym.SEP);}

{int} {return new Symbol(sym.INT, Integer.parseInt(yytext()));}

. {System.err.println("Unrecognized character: " + yytext());}