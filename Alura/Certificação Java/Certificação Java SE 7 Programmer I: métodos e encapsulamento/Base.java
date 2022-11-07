class A {
}

class A {
    A() {
        super();
    }
}

class A {}
class B {
    B(String s) {}
}
class Teste {
    public static void main(String[] args) {
        new A(); // construtor padrão, compila
        new B(); // não existe mais construtor padrão
        new B("CDC"); // construtor existente
    }
}

class Teste {
    int i;
    Teste() {
        i = 15; // agora i vale 15
        System.out.println(i); // 15
    }

    public static void main(String[] args) {
        new Teste();
    }
}

class Teste {
    int i;
    Teste() {
        System.out.println(i); // vale 0 por padrão
        i = 15; // agora i vale 15
        System.out.println(i); // 15
    }

    public static void main(String[] args) {
        new Teste();
    }
}

class A {

    int i = 15;
    String nome;
    int tamanho = tamanhoDoNome();

    A(String nome) {
        this.nome = nome;
    }

    int tamanhoDoNome() {
        return nome.length();
    }

    A() {
    }

}

class A {

    int i = 15;
    String nome;
    int tamanho = tamanhoDoSobrenome();
    String sobrenome = "Silveira";

    A(String nome) {
        this.nome = nome;
    }

    int tamanhoDoSobrenome() {
        return sobrenome.length();
    }

    A() {
    }

}

class A {

    int i = 15;
    String nome;
    String sobrenome = "Silveira";
    int tamanho = tamanhoDoSobrenome();

    A(String nome) {
        this.nome = nome;
    }

    int tamanhoDoSobrenome() {
        return sobrenome.length();
    }

    A() {
    }

}

class Teste {
    String nome;
    Teste() {
        testaTamanho(); // NullPointerException
        nome = "aprendendo";
    }

    private void testaTamanho() {
        System.out.println(nome.length());
    }

    public static void main(String[] args) {
        new Teste();
    }
}


class Base {
    String nome;
    Base() {
        testa();
        nome = "aprendendo";
    }

    void testa() {
        System.out.println("testa");
    }

}

class Teste extends Base {
    void testa() {
        System.out.println(nome.length());
    }
    public static void main(String[] args) {
        new Teste();
    }
}

class Base {
    String nome;
    Base() {
        testa();
        nome = "aprendendo";
    }

    private void testa() {
        System.out.println("testa");
    }

}

class Teste extends Base {
    void testa() {
        System.out.println(nome.length());
    }
    public static void main(String[] args) {
        new Teste();
    }
}

class Teste {
    Teste() {
        new Teste();
    }
    public static void main(String[] args) {
        new Teste();
    }
}

class Teste {
    private Teste() {
    }

    public static Teste cria() {
        return new Teste();
    }
}

class Teste {
  void Teste() {
    System.out.println("Construindo");
  }

  public static void main(String[] args) {

    new Teste(); 
    // não imprime nada, definimos um método e não o construtor
    new Teste().Teste(); 
    // agora imprime Construindo
  }
}