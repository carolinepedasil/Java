import java.io.IOException;
import java.util.Scanner;

/*
    Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10]. 
    Em cada posição subsequente, coloque o dobro do valor da posição anterior. 
    Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. 
    Mostre o vetor em seguida.

    ENTRADA:
    A entrada contém um valor inteiro (V<=50).

    SAÍDA:
    Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o valor armazenado na posição i. 
    O primeiro número do vetor N (N[0]) irá receber o valor de V.
    Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10]. 
    Em cada posição subsequente, coloque o dobro do valor da posição anterior. 
    Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. 
    Mostre o vetor em seguida.

    Exemplo de Entrada:
    1

    Exemplo de Saída:
    N[0] = 1
    N[1] = 2
    N[2] = 4
    ...
*/

public class URI1173 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        N[0] = sc.nextInt();
        
        for (int i=1; i <10; i++) {
            N[i] = N[i-1] * 2;
        }
        for (int i=0; i <10; i++) {
            System.out.println("N["+ i +"] = " + N[i]);
        }
 
    }
 
}