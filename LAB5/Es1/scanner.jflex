import java_cup.runtime.*;
import java.io.*;

%%

%unicode
%line
%class Scanner
%column
%cup

%{
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, line, column, value);
    }
    private Symbol symbol(int type) {
        return new Symbol(type, line, column);
    }
%}

nl = \n|\r|\n\r
ws = \t
scalar_variable = [a-z]
vector_variable = [A-Z]
float = ("+"|"-")?[0-9]*\.[0-9][0-9]
integer = ("+"|"-")?[0-9]+
exp_integer = {integer}(E|e){integer}
exp_float = {float}(E|e){integer}
double = {float}|{integer}|{exp_integer}|{exp_float}

%%

{scalar_variable} { return new Symbol(sym.SCAVAR, yyline, yycolumn, new Character(yycharat(0))); }
{vector_variable} { return new Symbol(sym.VECVAR, yyline, yycolumn, new Character(yycharat(0))); }
{double} { return new Symbol(sym.SCALAR, yyline, yycolumn, new Double(yytext())); }

"+" { return new Symbol(sym.PLUS, yyline, yycolumn); }
"-" { return new Symbol(sym.MINUS, yyline, yycolumn); }
"*" { return new Symbol(sym.MUL, yyline, yycolumn); }
"/" { return new Symbol(sym.DIV, yyline, yycolumn); }
"=" { return new Symbol(sym.EQ, yyline, yycolumn); }
"." { return new Symbol(sym.MULVEC, yyline, yycolumn); }
";" { return new Symbol(sym.SEMICOLON, yyline, yycolumn); }
"^" { return new Symbol(sym.EXP, yyline, yycolumn); }
"?" { return new Symbol(sym.END, yyline, yycolumn); }
"," { return new Symbol(sym.CM, yyline, yycolumn); }
"[" { return new Symbol(sym.QA, yyline, yycolumn); }
"]" { return new Symbol(sym.QC, yyline, yycolumn); }

{ws}|" "|{nl} {;}