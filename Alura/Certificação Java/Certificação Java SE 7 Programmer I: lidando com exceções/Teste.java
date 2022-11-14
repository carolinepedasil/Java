class Teste {

    void primeiro(){
        System.out.println("primeiro antes");
        this.segundo();
        System.out.println("primeiro depois");
    }

    void segundo() {
        String s = null;
        System.out.println("segundo antes");
        s.length();
        System.out.println("segundo depois");
    }
}

class Teste {

    void primeiro(){
        try {
            System.out.println("primeiro antes");
            this.segundo();
            System.out.println("primeiro depois");
        } catch(IOException e) {
            // tratamento.
            System.out.println("primeiro catch");
        }
        System.out.println("primeiro fim");
    }

    void segundo() throws IOException {
        System.out.println("segundo antes");
        System.in.read(); // pode lançar IOException
        System.out.println("segundo depois");
    }
}

class Teste {

    void primeiro(){
        try {
            this.segundo();
        } catch (RuntimeException e) {
            // tratamento.
        }
    }

    void segundo() {
        throw new RuntimeException();
    }
}

class Teste {

    void primeiro(){
        try {
            this.segundo();
        } catch(Exception e) {
            // tratamento.
        }
    }

    void segundo() throws Exception {
        throw new Exception();
    }
}

class MinhaException extends Exception{}

public class Teste {

    public static void main(String[] args) {
        metodo();
        System.out.println("Apos a invocacao do metodo");
    }

    private static void metodo() {
        int[] i= new int[10];
        System.out.println(i[15]);
        System.out.println("Apos a exception");
    }

}

public class Teste {

    public static void main(String[] args) {
        try {
            metodo();
        } catch(RuntimeException ex) {
            System.out.println("Exception pega");
        }
        System.out.println("Apos a invocacao do metodo");
    }

    private static void metodo() {
        int[] i= new int[10];
        System.out.println(i[15]);
        System.out.println("Apos a exception");
    }

}

void metodo1() {
    try {
        metodo2();
    } catch(IOException ex) {
        System.out.println("io");
    } catch(RuntimeException ex) {
        System.out.println("runtime");
    } catch(Exception ex) {
        System.out.println("exception qualquer");
    }
}

void metodo1() {
    try {
        metodo2();
    } catch(IOException ex) {
        System.out.println("io");
    } catch(Exception ex) {
        System.out.println("exception qualquer");
    } catch(RuntimeException ex) { 
        // não compila pois jamais será executado
        System.out.println("runtime");
    }
}

class AcessoAoArquivo {
    // não compila, pois ao instanciar, pode dar IOException,
    // mas o construtor não fala nada
    private InputStream is = new FileInputStream("entrada.txt"); 
}

class AcessoAoArquivo {
    private InputStream is = new FileInputStream("entrada.txt");

    AcessoAoArquivo() throws IOException{
        // estou avisando os clientes dessa classe
        // que ao instanciar pode dar essa exception
        // e agora compila
    }
}