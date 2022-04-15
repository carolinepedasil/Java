import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler um número inteiro positivo N, depois ler N números quaisquer e armazená-los em um vetor. 
    Em seguida, mostrar na tela todos elementos do vetor.
*/

public class Exercicio01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vet = new double[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextDouble();
        }

        for (int i=0; i<N; i++) {
            System.out.printf("%.1f%n", vet[i]);
        }

        sc.close();

    }

}
