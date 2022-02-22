public class TestaOperadores {
    public static void main(String[] args) {
        
        // operador diamante na atribuição e inicialização:
        ArrayList<String> lista = new ArrayList<String>();
        // copia o valor da referência, o objeto é o mesmo
        ArrayList<String> lista2 = lista;

        List<String> lista2 = lista; 
        lista2.add("Caroline");

        // verdadeiro
        System.out.println(lista.size() == lista2.size());

        int idade = 15;

        int idade2 = idade; // copia o valor
        idade2 = 20;

        System.out.println(idade == idade2); // falso

        // Iniciando uma variável com o operador de atribuição "=".
        // O valor literal 10 é do tipo int e a variável é do tipo long.
        // Como int é menos abrangente que long essa atribuição está correta.
        int a = 10; 
        long b = 20; // int cabe em um long
        int a = 10; // tipos iguais
        long b = 20; // int cabe em um long
        float c = 10f; // tipos iguais
        double d = 20.0f; // float cabe em um double
        double e = 30.0; // tipos iguais
        float f = 40.0; // erro, double não cabe em um float.
        int g = 10l; // erro, long não cabe em int
        float h = 10l; // inteiros cabem em decimais
        double i = 20; // inteiros cabem em decimais
        long j = 20f; // decimais não cabem em inteiros

        byte b1 = 10;
        byte b2 = 200; // não compila, estoura byte

        char c1 = 10;
        char c2 = -3; // não compila, char não pode ser negativo
    }
}