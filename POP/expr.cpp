#include<stdio.h>
#include<assert.h>
#include<string.h>
#include<fstream>
using namespace std;

class ErrorHandler{
public:
    void addition_error_for_matrices(){
        printf("Improper size for addition of matrices\n");
        exit(0);
    }

    void multiplication_error_for_matrices(){
        printf("Improper Multiplication of two matrices\n");
        exit(0);
    }

    void multiplication_semantic_error(){
        printf("Multiplication semantic error\n");
        exit(0);
    }

    void inappropriate_addition_type(){
        printf("Addition can be done only for objects of the same type\n");
        exit(0);
    }

    void atomic_expr_not_present(){
        printf("Expected (expr), Integer or A at the end of input\n");
        exit(0);
    }

    void unmatched_brackets(){
        printf("Brackets not matched\n");
        exit(0);
    }

    void unexpected_symbol(char a){
        printf("Unexpected symbol got : %c \n", a);
        exit(0);
    }

    void hanging_multiply(){
        printf("* symbol hanging\n");
        exit(0);
    }

    void hanging_plus(){
        printf("+ symbol hanging\n");
        exit(0);
    }

    void no_input(){
        printf("No Input Expression got\n");
        exit(0);
    }
    void junk(){
        printf("junk expression got\n");
        exit(0);
    }
    void faulty_command_line(){
        printf("Faulty number of commandline arguments\n");
        exit(0);
    }
    void faulty_file(){
        printf("File Should be of the form : one integer with the corresponding matrix of size nXn\n");
        exit(0);
    }
} error_handler;

class Matrix{
public:
    int elements[100][100];
    int number_of_rows;
    int number_of_columns;

    Matrix operator+(Matrix b){
        Matrix c;
        if(number_of_rows != b.number_of_rows || number_of_columns != b.number_of_columns)
            error_handler.addition_error_for_matrices();

        c.number_of_rows = number_of_rows;
        c.number_of_columns = number_of_columns;

        for(int i = 0; i < number_of_rows; i++)
            for (int j = 0; j < number_of_columns; j++)
                c.elements[i][j] = elements[i][j] + b.elements[i][j];
        return c;
    }

    Matrix operator*(Matrix b){
        Matrix c;
        if(number_of_columns != b.number_of_rows)
            error_handler.multiplication_error_for_matrices();
        c.number_of_rows = number_of_rows;
        c.number_of_columns = b.number_of_columns;
        for(int i = 0 ; i < number_of_rows; i++)
            for(int j = 0 ; j < b.number_of_columns; j++){
                c.elements[i][j] = 0;
                for(int k = 0; k < number_of_columns ; k++)
                    c.elements[i][j] += elements[i][k]*b.elements[k][j];
            }
        return c;
    }

    void print(){
        for(int i = 0; i < number_of_rows; i++)
        {
            for(int j = 0; j< number_of_columns; j++)
                printf("%d ", elements[i][j]);
            printf("\n");
        }
    }
};

Matrix operator*(int a, Matrix b){
    Matrix c;
    c.number_of_rows = b.number_of_rows;
    c.number_of_columns = b.number_of_columns;
    for(int i = 0 ; i < c.number_of_rows; i++)
        for(int j = 0 ; j < c.number_of_columns; j++)
            c.elements[i][j] = a*b.elements[i][j];
    return c;
}

Matrix a;

class Expr {
public:
    virtual int type(){return -1;};
    virtual Expr* evaluate(){return this;};
    virtual int int_value(){return 0;};
    virtual Matrix mat_value(){Matrix a;return a;};
    virtual void destruct(){};
};

class IntExpr : public Expr{
    int value1;
public:
    int type(){return 1;}

    int int_value(){
        return value1;
    }

    IntExpr(int value){
        value1 = value;
    }

    Expr* evaluate(){
        return this;
    }

};

class MatExpr : public Expr{
     Matrix a;
public:
     int type(){return 2;}
     Matrix mat_value(){
         return a;
     }
     MatExpr(Matrix b){a = b;}
     Expr* evaluate(){ return this;}
 };

Expr* add(Expr* a, Expr* b){
    if(a->type() == 1)
        return new IntExpr(a->int_value() + b->int_value());
    return new MatExpr(a->mat_value() + b->mat_value());
}

Expr* multiply(Expr* a, Expr* b){

    if(a->type() == 1 && b->type() == 1)
        return new IntExpr(a->int_value() * b->int_value());

    else if(a->type() == 1 && b->type() == 2)
        return new MatExpr(a->int_value() * b->mat_value());

    return new MatExpr(a->mat_value()*b->mat_value());
}

class MultiplyExpr : public Expr{
    Expr* left;
    Expr* right;

public:

   int type(){return 3;}
    MultiplyExpr(Expr* e, Expr* f){
        left = e;
        right = f;
    }

    Expr* evaluate(){
        if(left->type() != 1 && right->type() == 1)
            error_handler.multiplication_semantic_error();
        return multiply(left->evaluate(), right->evaluate());
    }

    void destruct(){
        left->destruct();
        right->destruct();
        free(left);
        free(right);
    }
};

class AddExpr : public Expr{
    Expr* left;
    Expr* right;
public:

    int type(){return 4;}

    AddExpr(Expr* e, Expr* f){
        left = e;
        right = f;
    }

    Expr* evaluate(){
        if((left->type()  == 1) != (right->type() == 1) )
            error_handler.inappropriate_addition_type();
        return add(left->evaluate(), right->evaluate());
    }

    void destruct(){
        left->destruct();
        right->destruct();
        free(left);
        free(right);
    }
};



Expr* add_expr(char*& s);

Expr* atomic_expr(char* &s)
{
    if(*s == '\0')
        error_handler.atomic_expr_not_present();

    if(*s == 'A'){
         s++;
         return new MatExpr(a);
    }

    if(*s >= '0' && *s <= '9')
    {
        int i = 0;
        int k = 0;
        int length = strlen(s);
        int ten_power = 1;
        while(*s >= '0' && *s <= '9')
        {
            k = k + (*s++ - '0')*ten_power;
            ten_power = ten_power*10;
        }
        return new IntExpr(k);
    }

    else if(*s == '(')
    {
        Expr* e;
        s++;
        e = add_expr(s);

        if(*s != ')')
            error_handler.unmatched_brackets();

        s++;
        return e;
    }

    else
        error_handler.unexpected_symbol(*s);

}

Expr* multiply_expr(char*& s)
{
    Expr* e = atomic_expr(s);
    if(*s == '*'){
        s++;
        if(*s == '\0')
            error_handler.hanging_multiply();
        Expr* f = multiply_expr(s);
        return new MultiplyExpr(f, e);
    }
    return e;
}

Expr* add_expr(char*& s)
{
    Expr* e = multiply_expr(s);
    if(*s == '+'){
        s++;
        if(strlen(s) == 0)
            error_handler.hanging_plus();
        Expr* f = add_expr(s);
        return new AddExpr(e, f);
    }
    return e;
}

int main(int argc, char* argvs[]){
    char ch;
    char* s;
    int i;
    int j = 0;
    int n;
    if(argc!=3)
        error_handler.faulty_command_line();
    FILE* f = fopen(argvs[1], "r");

    if(feof(f))
        error_handler.faulty_file();

    fscanf(f, "%d", &n);

    if(feof(f))
        error_handler.faulty_file();

    a.number_of_rows = n;
    a.number_of_columns = n;

    for (i = 0 ; i < n;i++)
        for(j = 0 ; j < n; j++){
            fscanf(f,"%d", &a.elements[i][j]);
            if(feof(f) && i!=n-1 && j!=n-1)
                error_handler.faulty_file();
        }

    fclose(f);
    char input[100];
    int length = strlen(argvs[2]);
    j = 0;
    for(i=0;i<length;i++){
        if(argvs[2][i] != ' ' && argvs[2][i] != '\t')
            input[j++] = argvs[2][i];
    }
    input[j] = '\0';
    s = input;
    length =j;
    Expr* b = add_expr(s);
    b->destruct();

    for(i = 0; i < length/2; i++){
        char temp = input[i];
        input[i] = input[length - 1 - i];
        input[length -1 - i] = temp;
    }
    for(i = 0; i < length; i++){
        if(input[i] == '(')
            input[i] = ')';
        else if(input[i] == ')'){
            input[i] = '(';
        }
    }

    input[length] = '\0';
    s = input;

    Expr* c = add_expr(s);
    Expr* d = c->evaluate();

    if(*s != '\0')
        error_handler.junk();

    if(d->type() == 1)
        printf("%d\n", d->int_value());

    else
        d->mat_value().print();

    c->destruct();
    d->destruct();
}
