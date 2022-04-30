import java.io.IOException;
import java.util.Scanner;

/*
    Leia um valor inteiro X. 
    Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

    ENTRADA:
    A entrada será um valor inteiro positivo.

    SAÍDA:
    A saída será uma sequência de seis números ímpares.
*/
 
public class URI1070 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int contador = 0;
        
        while (contador < 6) {
        	if (valor % 2 == 1) {
        		System.out.println(valor);
        		contador++;
        	}
    		valor++;
        }
    	
    	sc.close();
 
    }
 
}