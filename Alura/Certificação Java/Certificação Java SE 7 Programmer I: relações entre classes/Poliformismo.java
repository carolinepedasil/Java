import java.sql.SQLException;
import java.io.IOException;

class Veiculo {
    public void liga() {
        System.out.println("Veiculo está sendo ligado!");
    }
}

class Carro extends Veiculo {
    public void liga() {
        System.out.println("Carro está sendo ligado!");
    }
}

public class Teste{
    public static void main(String [] args){
        Veiculo v = new Carro();
        v.liga();
    }
}

class Veiculo {
    public void liga() {
        System.out.println("Veiculo esta sendo ligado!");
    }
}

class Carro extends Veiculo {
    protected void liga() {
        System.out.println("Carro esta sendo ligado!");
    }
}

interface A {
    void a();
}

class B implements A {
    void a() {
        // não compila, o método deveria ser público
    }
}

class C implements A {
    public void a() {
        // compila
    }
}

class A {
    void a() {
    }
}

abstract class B extends A {
    abstract void a(); // sobrescrevendo como abstrato
}

class C extends B{
    // não compila, não redefiniu a
}

class D extends B{
    void a() {
        // compila pois redefiniu a
    }
}

class A {
    List<String> metodo () {
        // devolve lista
    }
}

class B extends A {
    ArrayList<String> metodo() {
        // devolve array list
    }
}

class A {
    public void metodo () throws SQLException, IOException { //
    }
}

class B extends A {
    public void metodo () throws IOException {
    }
}

// não compila
class A {
    public void metodo () throws IOException {
    }
}

class B extends A {
    public void metodo () throws Exception {
    }
}

// não compila
class A {
    public void metodo () throws IOException {
    }
}

class B extends A {
    public void metodo () throws Exception {
    }
}

class Veiculo {
    void liga() {
        System.out.println("ligando o veiculo");
    }
}

class Carro extends Veiculo {
    void liga() {
        System.out.println("ligando o carro");
    }

    void desliga() {
    }
}

Carro c = new Carro();
c.liga(); // ligando o carro
c.desliga();


Veiculo v = new Carro();
v.liga(); // ligando o carro?
v.desliga();


void metodo (Veiculo v) {
    v.liga(); // compila
    v.desliga(); // não compila
}

class A {
    public void metodo() {
        System.out.println("a");
    }
}

class B extends A {
    public void metodo() {
        System.out.println("b");
        super.metodo(); // imprime a
    }

    public void metodo2() {
        metodo(); // imprime b, a
        super.metodo(); // imprime a
    }
}

class A{
    public void metodo() {
        System.out.println("a");
        metodo2();
    }
    public void metodo2() {
        System.out.println("metodo 2 do pai");
    }
}

class B extends A {
    public void metodo() {
        System.out.println("b");
        super.metodo();
    }
    public void metodo2() {
        System.out.println("c");
        metodo();
        super.metodo();
    }
    public static void main(String[] args) {
        new B().metodo2();
    }
}

class A{
    public void metodo() {
        System.out.println("a");
        this.metodo2();
    }
    public void metodo2() {
        System.out.println("metodo 2 do pai");
    }
}

class B extends A {
    public void metodo() {
        System.out.println("b");
        super.metodo();
    }
    public void metodo2() {
        System.out.println("c");
        metodo();
        super.metodo();
    }
    public static void main(String[] args) {
        new B().metodo2();
    }
}