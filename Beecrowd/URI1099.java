import java.io.IOException;
import java.util.Scanner;

/*
    Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. 
    Cada caso de teste consiste de dois inteiros X e Y. 
    Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

    ENTRADA:
    A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. 
    Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

    SAÍDA:
    Imprima a soma de todos valores ímpares entre X e Y.
*/
 
public class URI1099 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X;
        int Y;
        int soma;
        
        for (int i = 0; i < N; i++){
            
            X = sc.nextInt();
            Y = sc.nextInt();
            
            soma = 0;
            
            if (Y > X) {
	    		for (int j = X+1; j < Y; j++) {
	    			if (j % 2 != 0) soma += j;
	    		}
    		} else {
	    		for (int j = Y+1; j < X; j++) {
	    			if (j % 2 != 0) soma += j;
	    		}
    		}
    		
    		System.out.println(soma);

        }
 
    }
 
}