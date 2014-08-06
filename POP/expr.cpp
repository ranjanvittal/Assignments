#include<stdio.h>
#include<assert.h>
#include<string.h>

struct Matrix{
    int elements[100][100];
    int size;
};

Matrix a;

Matrix mat_add(Matrix a, Matrix b){
    Matrix c;
    int size = a.size;
    c.size = size;
    for(int i = 0; i < size; i++)
        for (int j =0; j < size; j++)
            c.elements[i][j] = a.elements[i][j] + b.elements[i][j];
    return c;
}

Matrix scalar_mat_mul(int a, Matrix b){
    Matrix c;
    int size = b.size;
    c.size = size;
    for(int i = 0 ; i < size; i++)
        for(int j = 0 ; j < size; j++)
            c.elements[i][j] = a*b.elements[i][j];
        return c;
}

Matrix mat_mul(Matrix a, Matrix b){
    Matrix c;
    int size = c.size = a.size;
    for(int i = 0 ; i < size; i++)
        for(int j = 0 ; j < size; j++){
            c.elements[i][j] = 0;
            for(int k = 0; k < size ; k++)
                c.elements[i][j] += a.elements[i][k]*b.elements[k][j];
        }
    return c;
}

class Expr {
public:
    virtual int type(){return -1;};
    virtual Expr* evaluate(){return this;};
    virtual int int_value(){return 0;};
    virtual Matrix mat_value(){};
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
    return new MatExpr(mat_add(a->mat_value(), b->mat_value()));
}

Expr* multiply(Expr* a, Expr* b){
    if(a->type() == 1 && b->type() == 1)
        return new IntExpr(a->int_value() * b->int_value());
    else if(a->type() == 1 && b->type() == 2)
        return new MatExpr(scalar_mat_mul(a->int_value(), b->mat_value()));
    return new MatExpr(mat_mul(a->mat_value(), b->mat_value()));
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
        {
            printf("Multiplying Inappropriate types\n");
            exit(0);
        }
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
        {
            printf("Adding Inappropriate types\n");
            exit(0);
        }
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
    int i = 0;
    if(strlen(s) <=0 )
    {
        printf("error\n");
        exit(0);
    }

    if(s[0] == 'A'){
         s = s + 1;
         return new MatExpr(a);
    }

    if(s[0] >= '0' && s[0] <= '9')
    {
        int k = 0;
        int length = strlen(s);
        int ten_power = 1;
        while(i<length && s[i] >= '0' && s[i] <= '9')
        {
            k = k + (s[i++]-'0')*ten_power;
            ten_power = ten_power*10;
        }

        s = s + i;
        return new IntExpr(k);
    }

    else if(s[0] == '(')
    {
        Expr* e;
        s = s+1;
        e = add_expr(s);
        if(strlen(s) <= 0)
        {
            printf("error_for_unmatch\n");
            exit(0);
        }
        if(s[0] == ')'){
            s = s + 1;
            return e;
        }
    }

    else{
        printf("no atom expr\n");
        exit(0);
    }

}

Expr* multiply_expr(char*& s)
{
    Expr* e = atomic_expr(s);
    if(strlen(s) > 0 && s[0] == '*'){
        s = s+1;
        if(strlen(s) == 0)
        {
            printf("* Hanging\n");
            exit(0);
        }
        Expr* f = multiply_expr(s);
        return new MultiplyExpr(f, e);
    }
    return e;
}

Expr* add_expr(char*& s)
{
    Expr* e = multiply_expr(s);
    if(strlen(s) > 0 && s[0] == '+'){
        s = s + 1;
        if(strlen(s) == 0)
        {
            printf("+ Hanging\n");
            exit(0);
        }
        Expr* f = add_expr(s);
        return new AddExpr(e, f);
    }
    return e;
}

int main(){
    char input[100];
    char ch;
    char* s;
    int i;
    int j;
    int n;
    scanf("%d", &n);
    a.size = n;

    for (i = 0 ; i < n;i++)
        for(j = 0 ; j < n; j++)
            scanf("%d", &a.elements[i][j]);

    i = 0;
    scanf("%c",&ch);

    while(1){
        scanf("%c", &ch);
        if(ch == '\n'){
            if(i == 0){
                printf("No Input");
                exit(0);
            }
            break;
        }
        if(ch != ' ' && ch != '\t')
            input[i++] = ch;
    }

    input[i] = '\0';
    int length = strlen(input);
    for(i = 0; i < length/2; i++){
        char temp = input[i];
        input[i] = input[length - 1 - i];
        input[length -1 - i] = temp;
    }
    input[length] = '\0';
    s = input;
    Expr* c = add_expr(s) -> evaluate();
    if(strlen(s) != 0)
        printf("Unparsed junk at the end %s \n", s);
    if(c->type() == 1)
        printf("%d\n", c->int_value());
    else
    {
        Matrix b = c->mat_value();
        int size = b.size;
        for(i = 0 ; i < size; i++)
            for(j = 0; j < size; j++)
                printf("%d\n", b.elements[i][j]);
    }
    c->destruct();
}
