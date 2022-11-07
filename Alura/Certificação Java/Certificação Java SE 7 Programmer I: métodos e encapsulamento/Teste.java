class Teste {
    public void metodo(int i) {
    }

    protected void metodo(double x) {
    }
}

class Teste {
    public int metodo() {}
    protected double metodo() {}
}

public class Teste {
    void metodo(Object o) {
        System.out.println("object");
    }
    void metodo(String s) {
        System.out.println("string");
    }

    public static void main(String[] args) {
        new Teste().metodo("string"); // imprime string
    }
}


public class Teste {
    void metodo(Object o) {
        System.out.println("object");
    }
    void metodo(String s) {
        System.out.println("string");
    }

    public static void main(String[] args) {
        new Teste().metodo((Object)"string"); // imprime object
    }
}

void metodo(String i, double x) {
}
void metodo(double x, String i) {
}


public class Teste {
    void metodo(int i, double x) {
    }
    void metodo(double x, int i) {
    }

    public static void main(String[] args) {
        new Teste().metodo(2, 3);
    }
}


public class Xpto {
    void metodo(Object o, String s) {
        System.out.println("object");
    }
    void metodo(String s, Object o) {
        System.out.println("string");
    }

    public static void main(String[] args) {
        new Xpto().metodo("string", "string");
    }
}

class Xpto2 {
    void metodo(Object o, Object o2) {
        System.out.println("object");
    }
    void metodo(String s, String s2) {
        System.out.println("string");
    }

    public static void main(String[] args) {
        new Xpto2().metodo("string", "string"); // imprime string
    }
}