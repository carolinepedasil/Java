public class Teste{
    public static void main(String...args){
        Object[] objetos = new Object[100];

        String s = "certificacao";
        objetos[0] = s;

        String recuperada = objetos[0];
    }
}

Teste.java:3: incompatible types
found   : java.lang.Object
required: java.lang.String
                String recuperada = objetos[0];
                                           ^
1 error

String recuperada = (String) objetos[0];

class Veiculo {}
class Moto extends Veiculo {}
class Carro extends Veiculo {}

Veiculo v = new Carro();
Moto m = v;

Veiculo v = new Carro();
Moto m = (Moto) v;

Carro c = new Carro();
Moto m = (Moto) c;

String guilherme = "guilherme";
String nome = guilherme;
String nome2 = (String) guilherme;
Object nome3 = guilherme;
Object nome4 = (String) guilherme;
Object nome5 = (Object) guilherme;

Carro c = new Carro();
Moto m = (Moto) c;

class X extends Moto, Carro { // não compila!
}

Carro c = new Carro();
Runnable r = (Runnable) c;

class CarroRodavel extends Carro implements Runnable { ... }

Object c = new Carro();
boolean b1 = c instanceof Carro; // true
boolean b2 = c instanceof Moto; // false

String s = "a";
boolean b  = s instanceof java.util.List; // não compila