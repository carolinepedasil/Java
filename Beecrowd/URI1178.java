import java.io.IOException;
import java.util.Scanner;

/*
    Leia um valor X. Coloque este valor na primeira posição de um vetor N[100]. 
    Em cada posição subsequente de N (1 até 99), coloque a metade do valor armazenado na posição anterior, conforme o exemplo abaixo. 
    Imprima o vetor N.

    ENTRADA:
    A entrada contem um valor de dupla precisão com 4 casas decimais.

    SAÍDA:
    Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição. 
    Cada valor do vetor deve ser apresentado com 4 casas decimais.

    Exemplo de Entrada:
    200.0000

    Exemplo de Saída:
    N[0] = 200.0000
    N[1] = 100.0000
    N[2] = 50.0000
    N[3] = 25.0000
    N[4] = 12.5000
    ...
*/

public class URI1178 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        double X = sc.nextDouble();
        double[] N = new double[100];
        N[0] = X;
        
        for (int i = 1; i < N.length; i++) {
        	N[i] = N[i - 1] / 2.0000;
        }
        for (int i = 0; i < N.length; i++) {
        	System.out.println(String.format("N[" + i + "] = %.4f", N[i]));
        }
 
    }
 
}