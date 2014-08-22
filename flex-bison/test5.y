
%{
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdarg.h>
#define CHAR_SIZE sizeof(char)
#define MAX_DEFINITIONS 100
#define MAX_LENGTH 500
#define MAX_ARGUMENTS 100

int no_of_macro_statements = 0;
int no_of_macro_expressions = 0;

char* make_string(char* format_string, int num, ...)
{
    va_list arguments;
    va_start(arguments, num);
    int length = strlen(format_string) + 1;
    int i;
    for(i = 0;i < num; i++)
        length += strlen(va_arg(arguments, char*));
    char* k =  malloc(length*CHAR_SIZE);
    va_end(arguments);
    va_start(arguments, num);
    vsprintf(k, format_string, arguments);
    va_end(arguments);
    va_start(arguments, num);
    for(i = 0;i < num; i++)
        free(va_arg(arguments, char*));
    va_end(arguments);
    return k;
}

struct Macro{
    char* key;
    char* value;
    int number_of_parameters;
} expressions[MAX_DEFINITIONS], statements[MAX_DEFINITIONS];

int condition_for_identifier(char a){
    return (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a >= '0' && a <= '9') || (a == '_');
}

int condition_for_start(char a){
    return (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z');
}

int check_if_macro_present(struct Macro macros[], char* identifier, int number){
    for(int i = 0; i < number ; i ++)
        if(strcmp(macros[i].key, identifier) == 0)
            return 0;
    return 1;
}

struct Macro* get_macro(struct Macro macros[], char* identifier, int number){
    for(int i = 0; i < number ; i ++){
        if(strcmp(macros[i].key, identifier) == 0)
            return &macros[i];
    }
    printf("syntax error\n");
    exit(0);
}

void make_up_value(struct Macro* macro, char** parameters,int number_of_parameters, char* partial_value){
    int i = 0;
    int j = 0;
    char value[MAX_LENGTH];
    char a[MAX_LENGTH];
    char f[10];
    strcpy(value, "\0");
    int length = strlen(partial_value);
    while(i < length){
        int k = 0;
        if(condition_for_start(partial_value[i])){
            a[k++] = partial_value[i++];
            while(i < length && condition_for_identifier(partial_value[i])){
                a[k++] = partial_value[i++];
            }
        }
        a[k] = '\0';
        j = 0;
        int flag = 0;
        if(a[0] != '\0'){
            while(j < number_of_parameters){
                char* parameter = parameters[j];
                if(strcmp(a, parameter) == 0){
                    sprintf(f, "$%d ", j);
                    strcat(value, f);
                    flag = 1;
                    break;
                }
                j++;
            }
            if(flag == 0)
                strcat(value, a);
        }
        else{
            int len = strlen(value);
            value[len] = partial_value[i];
            value[len+1] = '\0';
            i++;
        }
    }
    char* value1 = strdup(value);
    macro->value = value1;
}

int make_up_parameters(char** p, char* parameters){
    char a[100];
    int i=0,k;
    int l = 0;
    while(i < strlen(parameters)){
        k = 0;
        while(parameters[i] != '\0' && parameters[i] != ','){
            a[k++] = parameters[i];
            i++;
        }
        if(parameters[i]==',')i++;
        a[k] = '\0';
        p[l++] = strdup(a);
    }
    return l;
}

void routine_for_macros(struct Macro* macro, char* identifier, char* parameters, char* partial_value){
    int i = 0;

    char* p[MAX_ARGUMENTS];

    macro->key = identifier;

    int l = make_up_parameters(p, parameters);

    macro->number_of_parameters = l;

    make_up_value(macro, p, l, partial_value);

    for(i=0; i < l; i++){
        free(p[i]);
    }
    free(parameters);
    free(partial_value);
}

char* routine_for_calls(struct Macro* macro, char* arguments){
    char* final_return;
    char*p [MAX_ARGUMENTS];
    int l = make_up_parameters(p, arguments);
    char* value = macro->value;
    char sub_value[MAX_LENGTH];
    sub_value[0] = '\0';
    int length = strlen(value);
    int i = 0;
    if(l != macro->number_of_parameters){
        return strdup("\0");
    }
    while(i < length){
        if(value[i] == '$'){
            i++;
            int k = 0;
            while('0' <= value[i] && value[i] <= '9'){
                k = k*10 + value[i++] - '0';
            }
            strcat(sub_value, p[k]);
            i++;
        }
        else
        {
            int len = strlen(sub_value);
            sub_value[len] = value[i++];
            sub_value[len+1] = '\0';
        }
    }

    return strdup(sub_value);
}

%}
%union{
    char* sval;
}



%type<sval> Program
%type<sval> MainClass
%type<sval> TypeDeclarations
%type<sval> TypeDeclaration
%type<sval> Declarations
%type<sval> Declaration
%type<sval> MethodDeclarations
%type<sval> MethodDeclaration
%type<sval> Parameters
%type<sval> CommaParameters
%type<sval> Statement
%type<sval> Statements
%type<sval> Arguments
%type<sval> CommaExpressions
%type<sval> CommaExpression
%type<sval> Type
%type<sval> Expression
%type<sval> Op
%type<sval> PrimaryExpression
%type<sval> DefineParameters
%type<sval> CommaIdentifiers

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
%token E_O_F
%token  ANY


%start goal

%%
goal                :   Program E_O_F {printf("%s\n", $1);exit(0);};

Program             :   MacroDefinitions MainClass TypeDeclarations
                        {
                            $$ = make_string("%s\n%s", 2, $2, $3);
                        };

MainClass           :   CLASS Identifier LCPAREN PUBLIC STATIC VOID
                        MAIN LPAREN STRING LSPAREN RSPAREN Identifier RPAREN LCPAREN SYSTEM LPAREN Expression RPAREN SEMICOLON RCPAREN RCPAREN
                        {
                            $$ = make_string("class %s {\npublic static void main(String[] %s) {\n System.out.println(%s);\n}}", 3, $2, $12, $17);
                        };

TypeDeclarations :   TypeDeclarations TypeDeclaration
                        {
                            $$ = make_string("%s\n%s", 2, $1, $2);
                        }
                        |
                        {
                            $$ = strdup("\0");
                        };

TypeDeclaration     :   CLASS Identifier EXTENDS Identifier LCPAREN
                        Declarations MethodDeclarations
                        RCPAREN
                        {
                            $$ = make_string("class %s extends %s{\n%s%s}", 4, $2, $4, $6, $7);
                        }
                        |
                        CLASS Identifier LCPAREN Declarations
                        MethodDeclarations
                        RCPAREN
                        {
                            $$ = make_string("class %s{\n%s%s}", 3, $2, $4, $5);
                        };

Declarations     :   Declarations Declaration
                    {
                        $$ = make_string("%s\n%s", 2, $1, $2);
                    }
                    |   {$$ = strdup("\0");};

Declaration         :   Type Identifier SEMICOLON
                        {
                            $$ = make_string("%s %s;", 2, $1, $2);
                        };

MethodDeclarations  :   MethodDeclarations MethodDeclaration
                        {
                            $$ = make_string("%s\n%s", 2, $1, $2);

                        }
                        |   {$$ = strdup("\0");};

MethodDeclaration   :   PUBLIC Type Identifier LPAREN Parameters RPAREN LCPAREN
                        Declarations  Statements RETURN
                        Expression SEMICOLON RCPAREN
                        {
                            $$ = make_string( "public %s %s(%s){\n%s\n%s\nreturn %s;\n}", 6, $2, $3, $5, $8, $9, $11);
                        };

Parameters          :   Type Identifier CommaParameters
                        {
                            $$ = make_string( "%s %s%s", 3, $1, $2, $3);
                        }
                        |
                        {
                            $$ = strdup("\0");
                        };

CommaParameters     :   COMMA Type Identifier CommaParameters
                        {
                            $$ = make_string( ", %s %s%s", 3, $2, $3, $4);
                        }
                        |   {$$ = strdup("\0");};

Statement           :   LCPAREN Statements RCPAREN
                        {
                            $$ = make_string( "{%s}", 1, $2);
                        }
                        |    SYSTEM LPAREN Expression RPAREN SEMICOLON
                        {
                            $$ = make_string( "System.out.println(%s);\n", 1, $3);
                        }
                        |   Identifier EQUALTO Expression SEMICOLON
                        {
                            $$ = make_string( "%s = %s;\n", 2, $1, $3);
                        }
                        |   Identifier LSPAREN Expression RSPAREN EQUALTO Expression SEMICOLON
                        {
                            $$ = make_string( "%s[%s] = %s;\n", 3, $1, $3, $6);
                        }
                        |   IF LPAREN Expression RPAREN Statement ELSE Statement
                        {
                            $$ = make_string( "if(%s)\n%s\nelse\n%s\n", 3, $3, $5, $7);
                        }
                        |   IF LPAREN Expression RPAREN Statement
                        {
                            $$ = make_string( "if(%s)\n%s", 2, $3, $5);
                        }
                        |   WHILE LPAREN Expression RPAREN Statement
                        {
                            $$ = make_string( "while(%s)\n%s", 2, $3, $5);
                        }
                        |   Identifier LPAREN Arguments RPAREN SEMICOLON
                        {
                            char* p = strdup("\0");
                            $$ = p;
                            if(!(check_if_macro_present(statements, $1, no_of_macro_statements))){
                                struct Macro* v = get_macro(statements, $1, no_of_macro_statements);
                                char* val = routine_for_calls(v, $3);
                                if(val[0] != '\0')
                                    $$ = make_string("%s\n", 1, val);
                            }
                            if($$[0] == '\0'){

                                $$ = make_string( "%s(%s);\n", 2, $1, $3);
                            }
                            free(p);
                        };

Statements          :   Statement Statements
                        {
                            $$ = make_string( "%s%s", 2, $1, $2);
                        }
                        |
                        {
                            $$ = strdup("\0");
                        }

Arguments          :   Expression CommaExpressions
                        {
                            $$ = make_string( "%s%s", 2, $1, $2);
                        }
                        |
                        {
                            $$ = strdup("\0");
                        }

CommaExpressions    :   CommaExpressions CommaExpression
                        {
                            $$ = make_string( "%s%s", 2, $1, $2);
                        }
                        |
                        {
                            $$ = strdup("\0");
                        };

CommaExpression     :   COMMA Expression
                        {
                            $$ = make_string( ",%s", 1, $2);
                        };

Type                :   INT LSPAREN RSPAREN  {$$ = strdup("int[]");}
                        |    BOOLEAN {$$ = strdup("boolean");}
                        |    INT {$$ = strdup("int");}
                        |    Identifier {$$ = $1;};

Expression          :   PrimaryExpression Op PrimaryExpression
                        {
                            $$ = make_string( "%s%s%s", 3, $1, $2, $3);
                        }
                        |   PrimaryExpression LSPAREN PrimaryExpression RSPAREN
                        {
                            $$ = make_string( "%s[%s]", 2, $1, $3);
                        }
                        |   PrimaryExpression LENGTH
                        {
                            $$ = make_string( "%s.length", 1, $1);
                        }
                        |   PrimaryExpression DOT Identifier LPAREN Arguments RPAREN
                        {
                            $$ = make_string( "%s.%s(%s)", 3, $1, $3, $5);
                        }
                        |   PrimaryExpression
                        {
                            $$ = $1;
                        }
                        |   Identifier LPAREN Arguments RPAREN
                        {
                            char*p = strdup("\0");
                            $$ = p;
                            if(!check_if_macro_present(expressions, $1, no_of_macro_expressions)){
                                struct Macro* v = get_macro(expressions, $1, no_of_macro_expressions);
                                $$ = routine_for_calls(v, $3);
                            }
                            if($$[0] == '\0') {

                                $$ = make_string( "%s(%s)", 2, $1, $3);
                            }
                            free(p);
                        }

Op                  :   AND  {$$ = strdup("&");}
                        |   LESS  {$$ = strdup("<");}
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
                            $$ = make_string( "new int[%s]", 1, $4);
                        }
                        |   NEW Identifier LPAREN RPAREN
                        {
                            $$ = make_string( "new %s()", 1, $2);
                        }
                        |   NOT Expression
                        {
                            $$ = make_string( "!%s", 1, $2);
                        }
                        |   LPAREN Expression RPAREN
                        {
                            $$ = make_string( "(%s)", 1, $2);
                        };

MacroDefinitions    :   MacroDefinition MacroDefinitions {}
                        |   {}

MacroDefinition     :   MacroDefExpression {}
                        |   MacroDefStatement {};

MacroDefStatement   :   DEFINE Identifier LPAREN DefineParameters RPAREN LCPAREN Statements
                        RCPAREN
                        {
                            if(check_if_macro_present(statements, $2, no_of_macro_statements)){
                                routine_for_macros(&statements[no_of_macro_statements], $2, $4, $7);
                                no_of_macro_statements++;
                            }
                            else{
                                printf("syntax error");
                                exit(0);
                            }
                        };

MacroDefExpression  :   DEFINE Identifier LPAREN DefineParameters RPAREN LPAREN
                        Expression RPAREN
                        {
                            if(check_if_macro_present(expressions, $2, no_of_macro_expressions)){
                                routine_for_macros(&expressions[no_of_macro_expressions], $2, $4, $7);
                                no_of_macro_expressions++;
                            }
                            else{
                                printf("syntax error\n");
                                exit(0);
                            }

                        };

DefineParameters    :   Identifier CommaIdentifiers
                        {
                            $$ = make_string( "%s%s", 2, $1, $2);
                        }
                        |
                        {$$ = strdup("\0");};

CommaIdentifiers    :   COMMA Identifier CommaIdentifiers
                        {
                            $$ = make_string( ",%s%s", 2, $2, $3);
                        }
                        |
                        {$$ = strdup("\0");};

%%

int yyerror(char * s){
    printf("%s \n",s);
    return 1;
}

int main(){
    yyparse();
}
