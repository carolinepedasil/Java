class Teste {
    public Teste() {
    }
    public Teste(int i) {
    }
}

class Teste {
    public Teste() {
        System.out.println("construtor simples");
    }
    public Teste(int i) {
        this();
    }
    public Teste(String s) {
        this(s, s);  // não compila, loop
    }
    public Teste(String s, String s2) {
        this(s); // não compila, loop
    }
}

void desativa(Cliente... clientes) {
    System.out.println("varargs");
}
void desativa() {
    System.out.println("sem argumento");
}
void metodo() {
    desativa(); // imprime sem argumento
}

class Teste {
    Teste() {
        String valor = "valor...";
        this(valor); // não compila
    }

    Teste(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Teste();
    }
}

class Teste {
    Teste() {
        this(valor);
        this(valor); // não compila
    }

    Teste(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Teste();
    }
}

class Teste {
    Teste() {
        this(valor());
    }

    private static String valor() {
        return "valor...";
    }

    Teste(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Teste();
    }
}

class Teste {
    Teste() {
        this(valor()); // valor não é estático, não compila
    }

    private String valor() {
        return "valor...";
    }

    Teste(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Teste();
    }
}