%{
#include<stdio.h>
#include "test5.tab.h"
#include<string.h>
%}

%%type<sval>
public {return PUBLIC;}
static {return STATIC;}
void {return VOID;}
main {return MAIN;}
"(" {return LPAREN;}
")" {return RPAREN;}
"{" {return LCPAREN;}
"}" {return RCPAREN;}
\[ {return LSPAREN;}
\] {return RSPAREN;}
[1-9][0-9]*|0 {yylval.sval = malloc((strlen(yytext)+1)*sizeof(char));
     yylval.sval = strdup(yytext);
     return Integer;
    }
System\.out\.println {return SYSTEM;}
; {return SEMICOLON;}
extends {return EXTENDS;}
class {return CLASS;}
, {return COMMA;}
return {return RETURN;}
int {return INT;}
boolean {return BOOLEAN;}
= {return EQUALTO;}
if {return IF;}
else {return ELSE;}
while {return WHILE;}
"&" {return AND;}
\< {return LESS;}
\+ {return PLUS;}
- {return MINUS;}
\* {return MULTIPLY;}
"/" {return DIVIDE;}
\. {return DOT;}
\.length {return LENGTH;}
! {return NOT;}
new {return NEW;}
false {return FALSE;}
true {return TRUE;}
this {return THIS;}
#define {return DEFINE;}
String {return STRING;}
[a-zA-Z][a-zA-Z0-9_]* {yylval.sval = malloc((strlen(yytext)+1)*sizeof(char));
    yylval.sval = strdup(yytext);
    //printf("%s\n", yylval.sval);
    return Identifier;
    }
[ \t\n] ;
\/\/.*\n ;
<<EOF>> return E_O_F;
. {return ANY;}
