import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
    Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
    Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

    ENTRADA:
    A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. 
    Pelo menos um destes números será positivo.

    SAÍDA:
    O primeiro valor de saída é a quantidade de valores positivos. 
    A próxima linha deve mostrar a média dos valores positivos digitados.
*/

public class URI1064 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
 
        int contador = 0;
        double media = 0;
        
        for (int i = 0; i < 6; i++) {
        	double valores = sc.nextDouble();
        	if (valores > 0) {
        		contador++;
        		media += valores;
        	}
        }
        
        media = media / contador;
        System.out.println(contador + " valores positivos");
        System.out.println(String.format("%.1f", media));
 
    }
 
}