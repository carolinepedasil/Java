public class Carro {
    public static int totalDeCarros;
}

Carro.totalDeCarros = 5;

public class Carro{
    private static int totalDeCarros;


    public static int getTotalDeCarros() [
        return totalDeCarros;
    }
}

int i = Carro.getTotalDeCarros();

public class Carro{
    private static int totalDeCarros;
    private int peso;

    public static int getPeso() {
        return peso;
    }
}

static int b = getMetodo();
public static int getMetodo() {
    return a;
}
static int a = 15;

static Integer inicial = 10;
static Integer segunda = inicial + 5; // compila

static Integer outra;
static void inicializa() {
   outra = 10;
}
static Integer naoExecuta = outra + 1;
// compila mas dá exception em runtime, NullPointerException durante a inicializacao dessa linha

Carro c = new Carro();
int i = c.getTotalDeCarros();

class A {
    static void a() { // não compila
    }
    void a() { // não compila
    }
}

class B {
    static void a() {
    }
}
class C extends B {
    void a() { // não compila
    }
}


class A {
    static void metodo() {
        System.out.println("a");
    }
}

class B extends A {
    static void metodo() {
        System.out.println("b");
    }
}

A a= new A();
a.metodo(); // a

B b= new B();
b.metodo(); // b

A a2 = b;
a2.metodo(); // a

class A {
    static int idade = calculaIdade();
    static int calculaIdade() {
        return 18;
    }
}
