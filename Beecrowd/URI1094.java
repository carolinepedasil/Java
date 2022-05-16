import java.io.IOException;
import java.util.Scanner;

/*
    Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. 
    Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

    Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. 
    Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

    ENTRADA:
    A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. 
    Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

    SAÍDA:
    Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
*/

public class URI1094 {

	public static void main(String[] args) {
		
        int N;
        int animais;

        int total = 0;
        int total_C = 0;
        int total_R = 0;
        int total_S = 0;

		float total_C_percentual = 0;
        float total_R_percentual = 0;
        float total_S_percentual = 0;
		String cobaia;

		Scanner input = new Scanner(System.in);
		N = input.nextInt();

		for (int i = 1; i <= N; i++) {

			animais = input.nextInt();
			cobaia = input.next();
			total += animais;
			
            if (cobaia.equals("C")) {
				total_C += animais;
			} else if (cobaia.equals("R")) {
				total_R += animais;
			} else if (cobaia.equals("S")) {
				total_S += animais;
			}

			total_C_percentual = (float)((total_C * 100.00) / total);
			total_R_percentual = (float)((total_R * 100.00) / total);
			total_S_percentual = (float)((total_S * 100.00) / total);
			
		}
		
		System.out.print("Total: " + total + " cobaias\n");
		System.out.print("Total de coelhos: " + total_C + "\n");
		System.out.print("Total de ratos: " + total_R + "\n");
		System.out.print("Total de sapos: " + total_S + "\n");
		
		System.out.printf("Percentual de coelhos: %.2f", total_C_percentual);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f", total_R_percentual);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f", total_S_percentual);
		System.out.print(" %\n");

	}
}