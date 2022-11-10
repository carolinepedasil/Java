class Mae {
}

class Filha extends Mae {
}

class Neta extends Filha {
}


class Explicito extends Object {
}

class Implicito {
    // extends Object por padrão
}

class FilhoDeImplicito extends Implicito{
    // também herda de Object, indiretamente
}

class Simples1 {}
class Simples2 {}
class Complexa extends Simples1, Simples2 {
    // não compila
}


class Pai {
    Pai(int x) {
    }
}

class Filho1 extends Pai{
    // não compila pois o construtor padrão chama super() 
    // e o Pai não tem construtor vazio
}

class Filho2 extends Pai{
    Filho2() {
        super(15); //compila
    }
}

final class Pai {
}

class Filho extends Pai {
    // não compila, Pai é final
}

class Mae {
}

final class Filha extends Mae {
    // uma classe final pode estender de alguém, compila
}

class X {
    int x;
    public void y() {
    }
}

class Y {
    // tenho um x, e o método y
}


class X {
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Y extends X {
    public void metodo () {
        this.x = 5; // não compila: "x has private access in X"

        this.setX(10); // compila e altero o x herdado mas 
                       // não visível
    }
}

class W {
    static void metodo() {
    }
}

class  Z extends W {
}

class Teste {
    public static void main(String[] args) {
        Z.metodo(); // melhor seria escrever W.metodo()
    }
}

class W {
    public static void metodo() {
        System.out.println("w");
    }
}

class Z extends W {
    public static void metodo() {

        // não existe super em contexto estático, não compila
        super.metodo(); 

    }
}

class W {
    public static void metodo() {
        System.out.println("w");
    }
}

class Z extends W {
    public static void metodo() {
        System.out.println("z");
    }
}

public class Teste {
    public static void main(String[] args) {
        System.out.println(W.metodo()); // w
        System.out.println(Z.metodo()); // z
    }
}

public class Teste {
    public static void main(String[] args) {
        W w = new W();
        w.metodo(); // w

        Z z = new Z();
        z.metodo(); // z

        W zPolimorfadoComoW = z;
        zPolimorfadoComoW.metodo();
        // este último imprime w,
        // pois o binding é feito em compilação:
        // zPolimorfadoComoW.metodo é uma referencia 
        // em compilação para W
    }
}

class Carro {
    String cor;

    public String toString() {
        return "Um carro de cor " + this.cor;
    }
}


Carro c = new Carro();
c.cor = "Verde";

System.out.println(c); // chama toString

String s = "Mensagem: " + c; // chama toString
System.out.println(s);