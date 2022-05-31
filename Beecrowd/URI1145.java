import java.io.IOException;
import java.util.Scanner;

/*
    Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, passando para a próxima linha a cada X números.

    ENTRADA:
    O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

    SAÍDA:
    Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme exemplo abaixo. 
    Não deve haver espaço em branco após o último valor da linha.

    Exemplo de Entrada:
    3  99

    Exemplo de Saída:
    1  2  3
    4  5  6
    7  8  9
    10 11 12
    ...
    97 98 99
*/

public class URI1145 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in); 
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int contagem = 1;

        for (int i = 1; i <= Y; i++) {
			System.out.print(i);
			
			if (i % X == 0) {
			    System.out.println("");
			} else {
			    System.out.print(" ");
			}
        }
        
        sc.close();

    }
 
}