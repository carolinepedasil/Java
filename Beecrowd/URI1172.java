import java.io.IOException;
import java.util.Scanner;

/*
    Faça um programa que leia um vetor X[10]. 
    Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. 
    Em seguida mostre o vetor X.

    ENTRADA:
    A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

    SAÍDA:
    Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

    Exemplo de Entrada:
    0
    -5
    63
    0
    ...

    Exemplo de Saída:
    X[0] = 1
    X[1] = 1
    X[2] = 63
    X[3] = 1
    ...
*/

public class URI1172 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int[] X = new int[10];
        
        for (int i=0; i < X.length; i++) {
            X[i] = sc.nextInt();
        }
        for (int i=0; i < X.length; i++) {
            if (X[i] <= 0) X[i] = 1;
        }
        for (int i=0; i < X.length; i++) {
            System.out.println("X["+ i +"] = " + X[i]);
        }
 
    }
 
}