class Factorial {
public static void main(String[] a) {
 System.out.println(new Fac().ComputeFac((10+0)));
}}

class Fac1 extends Fac{


public int ComputeFac(int num){

int num_aux;

if(num<1)
num_aux = (1+0);

else
num_aux = num*(this.ComputeFac(num-1));


return num_aux;
}

public Fac1 gen(Fac c){ return new Fac1();}
}

class Fac{


public int ComputeFac(int num){

int num_aux;

if(num<1)
num_aux = (1+0);

else
num_aux = num*(this.ComputeFac(num-1));


return num_aux;
}

public Fac gen(Fac c){ return new Fac1();}
}


