import java.io.IOException;
import java.util.Scanner;

/*
    Escreva um programa que leia um valor inteiro N (1 < N < 1000). 
    Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

    ENTRADA:
    O arquivo de entrada contém um número inteiro positivo N.

    SAÍDA:
    Imprima a saída conforme o exemplo fornecido.

    Exemplo de Entrada:
    5

    Exemplo de Saída:
    1   1   1
    2   4   8
    3   9   27
    4   16  64
    5   25  125
*/

public class URI1143 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println(i + " " + (i*i) + " " + (i*i*i));
        }
        
        sc.close();
 
    }
 
}