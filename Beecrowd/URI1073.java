import java.io.IOException;
import java.util.Scanner;

/*
    Leia um valor inteiro N. 
    Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.

    ENTRADA:
    A entrada contém um valor inteiro N (5 < N < 2000).

    SAÍDA:
    Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.
*/

import java.io.IOException;
import java.util.Scanner;

public class URI1073 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	
    	for (int i = 1; i <= N; i++) {
    		if (i % 2 == 0) {
    		    System.out.println(i + "^2 = " + (i * i));
    		}
    	}
 
        sc.close();
    
    }
 
}