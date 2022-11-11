Veiculo v = new Carro();
List l = new ArrayList();

class Veiculo {}
class Carro extends Veiculo {}
class Moto extends Veiculo {}
class Onibus extends Veiculo {}
class Conversivel extends Carro {}

void metodo (Veiculo v) {
}

// .....

metodo(new Carro());
metodo(new Moto());
metodo(new Onibus());
metodo(new Veiculo());
metodo(new Conversivel());

interface A {}
interface B {}
class C implements A {}
class D extends C implements B {}
public class Teste {
    public static void main(String[] args) {

        // mesmo tipo, compila
        D d = new D();

        // D extends C, todo D é um C, compila
        C c = new D();
        C c2 = d;

        // D implements B, todo D implementa B, compila
        B b = new D(); 
        B b2 = d;

        // D implements A indiretamente, compila
        A a = new D();
        A a2 = a;

        D d2 = new C(); // não, C não é D, não compila

        D d3 = new D();
        C c3 = d3; // compila
        D d4 = c3; // não compila, por mais que o ser humano 
                   // saiba, em execução, nem todo C é um D.
    }
}

class Veiculo {
    public void liga() { }
}

class Carro extends Veiculo{
    public void mudaMarcha() {}    
}

// teste
Veiculo v = new Veiculo();
v.liga(); // compila

Carro c = new Carro(); // ok
c.mudaMarcha(); // compila

Veiculo v2 = c;
v2.liga(); // todo veiculo tem método liga, compila
v2.mudaMarcha(); // não compila, nem todo veiculo tem


abstract class Veiculo {
    public void liga() { }
}

class Carro extends Veiculo{
    public void desliga() { }
}

class Moto extends Veiculo{
    public void desliga() { }
}

Carro c = new Carro(); // ok
c.desliga(); // compila

Veiculo v2 = c;
v2.desliga(); // não compila, Veiculo não tem o método desliga definido

class Veiculo {
    int velocidade;
}
class Carro extends Veiculo{
    int marcha;
}

// teste
Veiculo v = new Veiculo();
v.velocidade = 3; // compila

Carro c = new Carro(); // ok
c.marcha = 1; // compila

Veiculo v2 = c;
v2.velocidade = 5; // compila
v2.marcha = 7; // não compila

package financeiro;
public class ContaFinanceira extends modelo.Conta {
    void fecha() {
        System.out.println("fechando financeiro");
    }
}

package modelo;
public class Conta {
    void fecha() {
        System.out.println("fechando conta normal");
    }
}

ContaFinanceira c = new ContaFinanceira();
c.fecha();
Conta d = c;
d.fecha();