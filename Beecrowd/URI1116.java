import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. 
    Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

    ENTRADA:
    A entrada contém um número inteiro N. 
    Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.

    SAÍDA:
    Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.
*/

public class URI1116 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int numero1;
		int numero2;
		
		for (int i = 0; i < N; i++) {
		    
			numero1 = sc.nextInt();
			numero2 = sc.nextInt();
			
			if (numero2 == 0) {
			    System.out.println("divisao impossivel");
			} else {
			    System.out.println((double) numero1 / numero2);
			}
			
		}
 
    }
 
}