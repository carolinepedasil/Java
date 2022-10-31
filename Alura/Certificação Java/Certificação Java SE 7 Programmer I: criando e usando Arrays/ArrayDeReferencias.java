// Declarando e iniciando um *array* de Prova
Prova[] provas = new Prova[10];

// Erro de execução ao tentar aplicar o operador "." em uma referência com valor null.
// NullPointerException
provas[0].tempo = 10;

for (int i = 0; i < provas.length; i++) {
    provas[i] = new Prova();
    provas[i].tempo = 210;
}

for (Prova prova : provas) {
    System.out.println(prova.tempo);
}

class Prova {
}

class ProvaPratica extends Prova {
}

class Test {
    public static void main(String[] args) {
        Prova[] provas = new Prova[2];
        provas[0] = new Prova();
        provas[1] = new ProvaPratica();
    }
}

Cliente guilherme = new Cliente();
guilherme.setNome("guilherme");

Cliente[] clientes = new Clientes[10];
clientes[0] = guilherme;

System.out.println(guilherme.getNome()); // guilherme
System.out.println(clientes[0].getNome()); // guilherme

guilherme.setNome("Silveira");

System.out.println(guilherme.getNome()); // silveira
System.out.println(clientes[0].getNome()); // silveira

int[] valores = new int[10];
long[] vals = valores; // Não compila

String[] valores = new String[2];
valores[0] = "Certificação";
valores[1] = "Java";

Object[] vals = valores;

for(Object valor : vals) {
    System.out.println(valor); // Certificação e depois Java
}

Object[] valores = new Object[2];

valores[0] = "Certificação";
valores[1] = "Java";

String[] vals = (String[]) valores;

for(Object valor : vals) {
    System.out.println(valor);
}

Object[ ] objetos = new Object[ 2 ];
String[ ] strings = new String[ 2 ];

System.out.println(objetos.getClass().getName()); 
// [ Ljava.lang.Object;

System.out.println(strings.getClass().getName()); 
// [ Ljava.lang.String;

System.out.println(strings.getClass().getSuperclass()); 
// java.lang.Objecta