class Mae {
    public Mae(String msg) {
        System.out.println(msg);
    }
}

class Filha extends Mae {
    public Filha(String nome) {
        super("construindo parte mae");
        System.out.println("construindo parte filha");
    }
}

class Mae {
    public Mae() {
        System.out.println("construindo parte mae");
    }
}

class Filha extends Mae {
    public Filha(String nome) {
        // super() esta implícito!!!
        System.out.println("construindo parte filha");
    }
}

public class X{
    public static void main(String [] args){
        Filha filha = new Filha("Teste");
    }
}

class Mae {
    public Mae() {
        System.out.println("construindo parte mae");
    }
}

class Filha extends Mae {
    public Filha() {
        // super() implicito!
        System.out.println("construindo filha parte 1");
    }

    public Filha(String nome) {
        this();
        System.out.println("construindo filha parte 2");
    }
}

public class X{
    public static void main(String [] args){
        Filha filha = new Filha("Teste");
    }
}

class Filha extends Object {
    public Filha() {
        // super() implicito!
    }

    public Filha(String nome) {
        this();
    }

    public Filha(int idade) {
        super();
        this(); // não compila, ou um ou outro!
    }
    public Filha(long valor) {
        this();
        this(); // não compila, só uma vez!
    }

    public Filha(char caracter) {
        super();
        super(); // não compila, só uma vez!
    }
}

class Teste {
    int i = 5;
    void roda(int i) {
        System.out.println(i);
        System.out.println(this.i);
    }
    public static void main() {
        new Teste().roda(3);
    }
}

class A{
    int i = 5;
}
class Teste extends A{
    void roda(int i) {
        System.out.println(this.i); // imprime 5
    }
    public static void main(String [] args) {
        new Teste().roda(3);
    }
}

class Teste {
    void roda(int i) {
        System.out.println(this.i); // não há variável membro i
    }
    public static void main(String [] args) {
        new Teste().roda(3);
    }
}

class A{
    int i = 5;
}
class Teste extends A{
    int i = 10;
    void roda(int i) {
        System.out.println(i); // imprime 3
        System.out.println(this.i); // imprime 10
        System.out.println(super.i); // imprime 5
    }
    public static void main(String [] args) {
        new Teste().roda(3);
    }
}

class A{
    int i() { return 5; }
}
class Teste extends A{
    void roda() {
        System.out.println(this.i()); // imprime 5
    }
    public static void main(String [] args) {
        new Teste().roda();
    }
}
class Teste2 {
    int i() { return 5; }
    void roda() {
        System.out.println(this.i()); // imprime 5
    }
    public static void main(String [] args) {
        new Teste().roda();
    }
}

class Veiculo {
    double velocidade = 30;
}
class Carro extends Veiculo {
    double velocidade = 50;
    void imprime() {
        System.out.println(velocidade); // 50
        System.out.println(this.velocidade); // 50
        System.out.println(super.velocidade); // 30
    }
}
class Teste {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.imprime();
    }
}

class Veiculo {
    double velocidade = 30;
}
class Carro extends Veiculo {
    double velocidade = 50;
    void imprime() {
        System.out.println(velocidade); // 1000
        System.out.println(this.velocidade); // 1000
        System.out.println(super.velocidade); // 30
    }
}
class Teste {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.velocidade = 1000;
        c.imprime();
    }
}

class Veiculo {
    double velocidade = 30;
}
class Carro extends Veiculo {
    double velocidade = 50;
    void imprime() {
        System.out.println(velocidade); // 50
        System.out.println(this.velocidade); // 50
        System.out.println(super.velocidade); // 1000
    }
}
class Teste {
    public static void main(String[] args) {
        Carro c = new Carro();
        ((Veiculo) c).velocidade = 1000;
        c.imprime();
    }
}

class A{
    int i = 5;
}
class Teste extends A{
    int i = 10;
    public static void main(String [] args) {
        this.i = 5; // this? não compila. código estático
        super.i = 10; // super? não compila. código estático
    }
}