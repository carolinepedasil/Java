import java.io.IOException;
import java.util.Scanner;

/*
    Escreva um programa que leia um valor inteiro N. 
    N * 2 linhas de saída serão apresentadas na execução do programa, seguindo a lógica do exemplo abaixo. 
    Para valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.

    ENTRADA:
    O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

    SAÍDA:
    Imprima a saída conforme o exemplo fornecido.

    Exemplo de Entrada:
    5

    Exemplo de Saída:
    1   1   1
    1   2   2
    2   4   8
    2   5   9
    3   9   27
    3   10  28
    4   16  64
    4   17  65
    5   25  125
    5   26  126
*/
 
public class URI1144 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println(i + " " + (i*i) + " " + (i*i*i));
            System.out.println(i + " " + (i*i+1) + " " + (i*i*i+1));
        }
        
        sc.close();
 
    }
 
}