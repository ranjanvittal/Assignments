
%{
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define CHAR_SIZE sizeof(char)
%}
%union{
        char* sval;
}

%token  PUBLIC
%token  STATIC
%token  VOID
%token  MAIN
%token  LPAREN
%token  RPAREN
%token  LCPAREN
%token  RCPAREN
%token  LSPAREN
%token  RSPAREN
%token<sval>  Integer
%token<sval>  Identifier
%token  SYSTEM
%token  SEMICOLON
%token  EXTENDS
%token  CLASS
%token  COMMA
%token  RETURN
%token  INT
%token  BOOLEAN
%token  EQUALTO
%token  IF
%token  ELSE
%token  WHILE
%token  AND
%token  LESS
%token  PLUS
%token  MINUS
%token  MULTIPLY
%token  DIVIDE
%token  DOT
%token  LENGTH
%token  NOT
%token  NEW
%token  FALSE
%token  TRUE
%token  THIS
%token  DEFINE
%token  STRING
%token  ANY

%type<sval> Program
%type<sval> MainClass
%type<sval> TypeDeclarations
%type<sval> TypeDeclaration
%type<sval> Declarations
%type<sval> Declaration
%type<sval> Type
%type<sval> Expression
%type<sval> Op
%type<sval> PrimaryExpression

%start goal

%%
goal                :   Program {printf("%s\n", $1);exit(0);};

Program             :   MainClass TypeDeclarations
                        {
                            $$ = malloc((strlen($1) + strlen($2) + 2)*CHAR_SIZE);
                            sprintf($$, "%s\n%s", $1, $2);
                            free($1);
                            free($2);
                        }

MainClass           :   CLASS Identifier LCPAREN PUBLIC STATIC VOID
                        MAIN LPAREN STRING LSPAREN RSPAREN Identifier RPAREN LCPAREN SYSTEM LPAREN Expression RPAREN SEMICOLON RCPAREN RCPAREN
                        {
                            char s[200];
                            sprintf(s, "class %s {\npublic static void main(String[] %s){\n System.out.println(%s);\n}}", $2, $12, $17);
                            $$ = strdup(s);
                            free($2);
                            free($12);
                            free($17);
                        };

TypeDeclarations :   TypeDeclaration TypeDeclarations
                        {
                            $$ = malloc((strlen($1) + strlen($2) + 2)*CHAR_SIZE);
                            sprintf($$, "%s\n%s", $1, $2);
                        }
                        |
                        {
                            $$ = strdup("\0");
                        }

TypeDeclaration     :   CLASS Identifier EXTENDS Identifier LCPAREN
                        Declarations MethodDeclarations
                        RCPAREN
                        {
                            $$ = malloc((strlen($2) + strlen($4) + strlen($6) + strlen($7) + 20)*CHAR_SIZE);
                            sprintf($$, "class %s extends %s{\n%s%s}", $2, $4, $6, $7);
                        }
                        |
                        CLASS Identifier LCPAREN Declarations
                        MethodDeclarations
                        RCPAREN
                        {
                            $$ = malloc((strlen($2) + strlen($4) + strlen($5) + 10)*CHAR_SIZE);
                            sprintf($$, "class %s{\n%s%s}", $2, $4, $5);
                        }

Declarations     :   Declaration Declarations
                    {
                        $$ = malloc((strlen($1) + strlen($2) + 2)*CHAR_SIZE);
                        sprintf($$, "%s\n%s", $1, $2);
                        free($1);
                        free($2);
                    }
                    |   {$$ = strdup("\0");}

Declaration         :   Type Identifier SEMICOLON
                        {
                            $$ = malloc((strlen($1) + strlen($2) + 3)*CHAR_SIZE);
                            sprintf($$, "%s %s;", $1, $2);
                            free($1);
                            free($2);
                        }

MethodDeclarations  :   MethodDeclaration MethodDeclarations
                        {
                            $$ = malloc((strlen($1) + strlen($2) + 2)*CHAR_SIZE);
                            sprintf($$, "%s\n%s", $1, $2);
                            free($1);
                            free($2);
                        }
                        |   {$$ = strdup("\0");}

MethodDeclaration   :   PUBLIC Type Identifier LPAREN Arguments RPAREN LCPAREN
                        Declarations  Statements RETURN
                        Expression SEMICOLON RCPAREN
                        {
                            $$ = malloc((strlen($2) + strlen($3) + strlen($5) + strlen($8) + strlen($9) + strlen($11) + 28)*CHAR_SIZE);
                            sprintf($$ "public %s %s(%s){\n%s%sreturn %s;\n}", $2, $3, $5, $8, $9, $11);
                            free($2);
                            free($3);
                            free($5);
                            free($8);
                            free($9);
                            free($11);
                        }
Arguments           :   Identifier CommaIdentifiers
                        {
                            $$ = malloc((strlen($1) + strlen($2) + 1)*CHAR_SIZE);
                            sprintf($$, "%s%s", $1, $2);
                            free($1);
                            free($2);
                        }
                        |   Identifier
                        {
                            $$ = $1;
                        }
                        |
                        {
                            $$ = strdup("\0");
                        }

CommaIdentifiers    :   CommaIdentifier CommaIdentifiers
                        {
                            $$ = malloc((strlen($1) + strlen($2) + 1)*CHAR_SIZE);
                            sprintf($$, "%s%s", $1, $2);
                            free($1);
                            free($2);
                        }
                        | {$$ = strdup("\0");}

CommaIdentifier     :   COMMA Identifier
                        {
                            $$ = malloc((strlen($2)+2)*CHAR_SIZE);
                            sprintf($$, ", %s", $2);
                            free($2);
                        }

Statement           :   LCPAREN Statements RCPAREN
                        {
                            $$ = malloc((strlen($2) + 3)*CHAR_SIZE);
                            sprintf($$, "{%s}", $2);
                            free($2);
                        }
                        |    SYSTEM LPAREN Expression RPAREN SEMICOLON
                        {
                            $$ = malloc((strlen($3) + 24)*CHAR_SIZE);
                            sprintf($$, "System.out.println(%s);", $3);
                            free($3);
                        }
                        |   Identifier EQUALTO Expression SEMICOLON
                        {
                            $$ = malloc((strlen($1) + strlen($3) + 5)*CHAR_SIZE);
                            sprintf($$, "%s = %s;", $1, $3);
                            free($1);
                            free($3);
                        }
                        |   Identifier LSPAREN Expression RSPAREN EQUALTO Expression SEMICOLON
                        {
                            $$ = malloc((strlen($1) + strlen($3) + strlen($6) + 10)*CHAR_SIZE);
                            sprintf($$, "%s[%s] = %s;", $1, $3, $6);
                            free($1);
                            free($3);
                            free($6);
                        }
                        |   IF LPAREN Expression RPAREN Statement ELSE Statement
                        {
                            $$ = malloc((strlen($3) + strlen($5) + strlen($7) + 12)*CHAR_SIZE);
                            sprintf("if(%s)\n%s\nelse\n%s", $3, $5, $7);
                            free($3);
                            free($5);
                            free($7);
                        }
                        |   IF LPAREN Expression RPAREN Statement
                        {
                            $$ = malloc((strlen($3) + strlen($5) + 8)*CHAR_SIZE);
                            sprintf($$, "if(%s)\n%s", $3, $5);
                            free($3);
                            free($5);
                        }
                        |   while LPAREN Expression RPAREN Statement
                        {
                            $$ = malloc((strlen($3) + strlen($5) + 10)*CHAR_SIZE);
                            sprintf($$, "while(%s)\n%s", $3, $5);
                            free($3);
                            free($5);
                        }
                        |   Identifier LPAREN Expressions RPAREN SEMICOLON
                         {
                            $$ = malloc((strlen($1) + strlen($3) + 5)*CHAR_SIZE);
                            sprintf($$, "%s(%s);", $1, $3);
                            free($1);
                            free($3);
                        };

Expressions         :   Expression CommaExpressions
                        {
                            $$ = malloc((strlen($1) + strlen($2) + 3)*CHAR_SIZE);
                            sprintf($$, "%s%s", $1, $2);
                            free($1);
                            free($2);
                        }
                        |   Expression
                        {
                            $$ = $1;
                        }
                        |
                        {
                            $$ = strdup("\0");
                        }

CommaExpressions    :   CommaExpression CommaExpressions
                        {
                            $$ = malloc((strlen($1) + strlen($2) + 1)*CHAR_SIZE);
                            sprintf($$, "%s%s", $1, $2);
                            free($1);
                            free($2);
                        }
                        |
                        {
                            $$ = strdup("\0");
                        }

CommaExpression     :   COMMA Expression
                        {
                            $$ = malloc((strlen($2)+2)*CHAR_SIZE);
                            sprintf($$, ", %s", $2);
                            free($2);
                        }

Type                :   INT LSPAREN RSPAREN  {$$ = strdup("int[]");}
                        |    BOOLEAN {$$ = strdup("boolean");}
                        |    INT {$$ = strdup("int");}
                        |    Identifier {$$ = $1;};

Expression          :   PrimaryExpression Op PrimaryExpression
                        {
                            $$ = malloc((strlen($1) + strlen($2) + strlen($3) + 1)*CHAR_SIZE);
                            sprintf($$, "%s%s%s", $1, $2, $3);
                            free($1);
                            free($2);
                            free($3);
                        }
                        |   PrimaryExpression LSPAREN PrimaryExpression RSPAREN
                        {
                            $$ = malloc((strlen($1) + strlen($3) + 3)*CHAR_SIZE);
                            sprintf($$, "%s[%s]", $1, $3);
                            free($1);
                            free($3);
                        }
                        |   PrimaryExpression LENGTH
                        {
                            $$ = malloc((strlen($1) + 8)*CHAR_SIZE);
                            sprintf($$, "%s.length", $1);
                            free($1);
                        }
                        |   PrimaryExpression DOT Identifier LPAREN Expressions RPAREN
                        {
                            $$ = malloc((strlen($1) + strlen($3) + strlen($5) + 7)*CHAR_SIZE);
                            sprintf($$, "%s.%s(%s)", $1, $3, $5);
                            free($1);
                            free($3);
                            free($5);
                        }
                        |   Identifier LPAREN Expressions RPAREN
                        {
                            $$ = malloc((strlen($1) + strlen($3) + 5)*CHAR_SIZE);
                            sprintf($$, "%s(%s)", $1, $3);
                            free($1);
                            free($3);
                        }
                        |   PrimaryExpression
                        {
                            $$ = $1;
                        };

Op                  :   LESS  {$$ = strdup("<");}
                        |   PLUS  {$$ = strdup("+");}
                        |   MINUS  {$$ = strdup("-");}
                        |   MULTIPLY  {$$ = strdup("*");}
                        |   DIVIDE  {$$ = strdup("/");};

PrimaryExpression   :   Integer {$$ = $1;}
                        |   TRUE {$$ = strdup("true");}
                        |   FALSE {$$ = strdup("false");}
                        |   Identifier {$$ = $1}
                        |   THIS {$$ = strdup("this");}
                        |   NEW INT LSPAREN Expression RSPAREN
                        {
                            $$ = malloc((strlen($4)+22)*CHAR_SIZE);
                            sprintf($$, "new int[%s]", $4);
                            free($4);
                        }
                        |   NEW Identifier LPAREN RPAREN
                        {
                            $$ = malloc((strlen($2) + 7)*CHAR_SIZE);
                            sprintf($$, "new %s()", $2);
                            free($2);
                        }
                        |   NOT Expression
                        {
                            $$ = malloc((strlen($2)+2)*CHAR_SIZE);
                            sprintf($$, "!%s", $2);
                            free($2);
                        }
                        |   LPAREN Expression RPAREN
                        {
                            $$ = malloc((strlen($2)+3)*CHAR_SIZE);
                            sprintf($$, "(%s)", $2);
                            free($2);
                        };

%%

int yyerror(char * s){
    printf("%s \n",s);
}

int main(){
    yyparse();
}
