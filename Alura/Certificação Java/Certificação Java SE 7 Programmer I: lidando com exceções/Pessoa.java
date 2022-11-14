class Pessoa {
    boolean dormindo = false;

    void dormir() {
        this.dormindo = true;
        System.out.println("dormindo...");
    }
    void acordar() {
        this.dormindo = false;
        System.out.println("acordando...");
    }
    void andar() {
        if(this.dormindo) { // Só pode andar acordado.
            throw new IllegalStateException("Deveria estar 
                                             acordado!"); 
        }

        System.out.println("andando...");
    }        
}

class Teste {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[10] = 10; // Aqui ocorre 
                        // ArrayIndexOutOfBoundsException.
    }
}

class Teste {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        //Aqui ocorre IndexOutOfBoundsException
        String valor = lista.get(2); 
    }
}

class Teste {
    public static void main(String[] args) {
        String s = null;
        s.length(); // Aqui ocorre uma NullPointerException
    }
}

class Teste {
    public static void main(String[] args) {
        Object o = "SCJP"; // String
        Integer i = (Integer)o; // Aqui ocorre 
                                // ClassCastException.
    }
}

class Teste {
    public static void main(String[] args) {
        String s = "ABCD1";

        // Aqui ocorre um NumberFormatException.
        int i =    Integer.parseInt(s); 
    }
}

class Teste {
    public static void main(String[] args) {
        try {
            divideEImprime(5,0);
        } catch (IllegalArgumentException e) {
            // tratamento.
        }
    }

    public static void divideEImprime(int i, int j) {
        if(j == 0) { // Evita dividir por zero.
            throw new IllegalArgumentException();
        }
        System.out.println(i/j);
    }
}

class A {
    static {
        // trecho a ser executado no carregamento da classe.
    }
}

class A {
    static {
        if(true)
            throw new RuntimeException("nao vou deixar nao...");
    }
}

public class Teste {

    public static void main(String[] args) {
        new A();
    }
}

class Teste {
    public static void main(String[] args) {
        metodoSemFim();
    }

    static void metodoSemFim() {
        metodoSemFim();
    }
}

class OutraClasse {

}
class Teste {
    public static void main(String[] args) {
        new OutraClasse();
    }
}

void metodo() {
    ArrayList<String> objetos = new ArrayList<String>();
    String atual = "";
    while(true) {
        atual += " ficou maior";
        objetos.add(atual);
    }
}