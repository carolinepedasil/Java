import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa que leia N números reais e armazene-os em um vetor. 
    Em seguida:

    - Imprimir todos os elementos do vetor
    - Mostrar na tela a soma e a média dos elementos do vetor

    Exemplo:

    Entrada:
    4
    8.0 4.0 10.0 14.0

    Saída:
    8.0 4.0 10.0 14.0
    8.0 4.0 10.0 14.0 36.00
    9.00
*/

public class Exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<N; i++) { 
            System.out.print(vet[i] + " ");
        } 
        System.out.println();
        
        double soma = 0.0;
        for (int i=0; i<N; i++) {
            soma = soma + vet[i]; 
        }
        System.out.printf("%.2f%n", soma); 
        
        double media = soma / N;
        System.out.printf("%.2f%n", media);

        sc.close();
    }
    
}
