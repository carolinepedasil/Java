// Declaração de um array para guardar variáveis do tipo int.
int[] idades;

// Declaração de um array para guardar variáveis do tipo double.
double pesos[];

// Declaração de um array para guardar variáveis do tipo long.
long []pesos;

// Declaração de um array para guardar variáveis do tipo long.
long[]tamanhos;

// Exemplo:

public class Clientes {

    int[] idades;

    public static void main(String[] args) {
        Clientes c = new Clientes();
        System.out.println(c.idades); // Imprime null
    }
}

public class Produtos {

    public static void main(String[] args) {
        int[] precos;
        System.out.println(precos); // Não compila, não foi inicializada
    }
}

// Inicialização do array “idades”.
idades = new int[10];

// Inicialização do array “pesos”.
pesos = new double[50];

// Imprime 0, pois esse é o valor default para int.
System.out.println(idades[0]);

// Compila e roda
int[] numeros = new int[0];

// Compila, mas joga NegativeArraySizeException
numeros = new int[-1];

int[] numeros;
numeros = new int[]{1, 2, 5, 7, 5};

Carro[] carros = new Carro[]{new Carro(), null, new Carro()};

int[] numeros = {1, 2, 5, 7, 5};

int[] numeros = {1, 2, 5, 7, 5}; // Compila
int[] numeros2;
numeros2 = {1, 2, 5, 7, 5} // Não compila

int[] numeros2;
numeros2 = new int[]{1, 2, 5, 7,5}; // Compila

// Coloca o valor 10 na primeira variável do array idades.
int idades[] = new int[10];
idades[0] = 10;

// Coloca o valor 73.14 na última variável do array pesos.
double pesos[] = new double[50];
pesos[49] = 73.14;

// Erro de execução ao tentar acessar um posição que não existe.
// ArrayIndexOutOfBoundsException
pesos[50] = 88.4;

for (int i = 0; i < idades.length; i++) {
    idades[i] = i;
}

for(int idade : idades) {
    System.out.println(idade);
}