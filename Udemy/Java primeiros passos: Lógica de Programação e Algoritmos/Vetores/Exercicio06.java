import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa que leia N números reais e armazene-os em um vetor. 
    Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). 
    Mostrar também a posição do maior elemento.

    Exemplo:

    Entrada:
    6 
    8.0 4.0 10.0 14.0 13.0 7.0

    Saída:
    14.0 
    3
*/

public class Exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
		}
		
		double maior = vet[0];
		int posicaoMaior = 0;
		
		for (int i=1; i<N; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("%.1f%n", maior);
		System.out.println(posicaoMaior);
		
		sc.close();
    
    }

}