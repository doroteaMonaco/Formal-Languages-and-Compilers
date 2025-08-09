import java_cup.runtime.*;
%%

%class scanner
%unicode
%cup
%line
%column

%{
    private Symbol symbol(int type){
        System.out.println("TOKEN: " + sym.terminalNames[type]); // Stampa il nome del token
        return new Symbol(type, yyline, yycolumn); // Stampa il nome del token
    }
%}

comment = "/*"[^*]*"*/"
nl = \r|\n|\r\n
ws = [ \t]
variable = [A-Z_][A-Za-z0-9_]*
atom = [a-z][A-Za-z0-9_]* | ("+"|"-")?[0-9]+("."[0-9]+(e("+"|"-")[0-9]+)?)?

%%

"("     {return symbol(sym.TA);}
")"     {return symbol(sym.TC);}
","     {return symbol(sym.V);}
"."     {return symbol(sym.P);}
":-"    {return symbol(sym.R);}
"?-"    {return symbol(sym.I);}
{atom}  {return symbol(sym.ATOM);}
{variable} {return symbol(sym.VARIABLE);}

{comment} {;}
{ws} {;}
{nl} {;}

.       {System.err.println("Carattere non valido: " + yytext());}