// compila
abstract class SemMetodos {
}

// não compila, se tem método abstrato, tem que implementar
class ComMetodoAbstrato {
    public abstract void executa();
}

abstract class X{

}

public class Teste{
    public static void main(String[] args) {
        X x = new X();        
    }
}

abstract class Veiculo {
    public abstract void liga();
}

// compila pois implementou
class Moto extends Veiculo {
    public void liga() {

    }    
}

// compila pois a classe é abstrata, com método herdado 
// abstrato ainda
abstract class QuatroRodas extends Veiculo {
}

// não compila pois a classe não é abstrata, 
// com método herdado abstrato ainda
class SemRodas extends Veiculo {
}

abstract class Veiculo {
    public abstract void liga();
}

class Moto extends Veiculo {
    public void liga() {

    }    
}

abstract class Veiculo {
    public abstract void liga();
}

abstract class Moto extends Veiculo {

}

class MotoEspecial extends Moto {
    public void liga() {

    }    
}

// compila: decidi implementar mas mesmo assim
// manter a classe abstrata
abstract class QuatroRodar extends Veiculo {
    public void liga() {
    }
}

abstract class X{
    void x() {
        System.out.println(y());
    }
    abstract String y();
}
class Y extends X {
    String y() {
        return "codigo";
    }
}
public class Teste {
    public static void main(String[] args) {
        new Y().x(); // imprime código
    }
}

interface Veiculo {
    void ligar(); 
    // public abstract! Você pode escrever, mas é por padrão 
    // isso.
    public abstract int pegaMarcha();
}

// compila, todos os métodos implementados
class Carro implements Veiculo {
    public void ligar() {
    }
    public int pegaMarcha() {
        return 0;
    }
}
// não compila, onde está o pegaMarcha?
class Moto implements Veiculo {
    public void ligar() {
    }
}
// não compila, o método pegaMarcha definiu escopo default, 
// quando deveria definir public
class Triciclo implements Veiculo {
    public void ligar() {
    }
    int pegaMarcha() {
        return 0;
    }
}

// compila, pois a classe é abstrata
abstract class Moto implements Veiculo {
    public void ligar() {
    }
}

abstract class MinhaClasse implements Serializable, Runnable {
}

interface A extends Runnable {}
interface B extends Serializable {}
interface C extends Runnable, Serializable {}

interface A implements Runnable {} // não compila

interface X {
    int i = 5;  
    // você até pode escrever public static final, mas é sempre
    // assim
}

interface X extends Runnable, Comparable { }
