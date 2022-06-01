import java.io.IOException;
import java.util.Scanner;

/*
    Faça um algoritmo para ler um valor A e um valor N. 
    Imprimir a soma de A + i para cada i com os valores (0 <= i <= N-1). 
    Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.

    ENTRADA:
    A entrada contém somente valores inteiros, podendo ser positivos ou negativos. Todos os valores estão na mesma linha.

    SAÍDA:
    A saída contém apenas um valor inteiro.

    Exemplo de Entrada:
    3 2

    Exemplo de Saída:
    7

    Exemplo de Entrada:
    3 -1 0 -2 2

    Exemplo de Saída:
    7
*/

public class URI1149 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in); 

        int A = sc.nextInt();
        int N = sc.nextInt();
        int soma = 0;
        
        while (N <= 0) {
            N = sc.nextInt();
        }
        
        for (int i = 1; i <= N; i++) {
            soma = soma + A;
            A++;
        }

        System.out.println(soma);

    }
 
}