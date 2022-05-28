import java.io.IOException;
import java.util.Scanner;

/*
    Escreva um programa que leia um valor inteiro N. 
    Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

    ENTRADA:
    O arquivo de entrada contém um número inteiro positivo N.

    SAÍDA:
    Imprima a saída conforme o exemplo fornecido.

    Exemplo de Entrada:
    7

    Exemplo de Saída:
    1  2  3  PUM
    5  6  7  PUM
    9  10 11 PUM
    13 14 15 PUM
    17 18 19 PUM
    21 22 23 PUM
    25 26 27 PUM
*/

public class URI1142 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in); 
        
        int N = sc.nextInt();
        int contagem = 1;
        
        for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
                System.out.print(contagem + " ");
                contagem++;
            }
            System.out.println("PUM");
            contagem++;
        }
        
        sc.close();
 
    }
 
}