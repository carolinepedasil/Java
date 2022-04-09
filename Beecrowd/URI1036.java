import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
    Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
    Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

    ENTRADA:
    Leia três valores de ponto flutuante (double) A, B e C.

    SAÍDA:
    Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 
    Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. 
    Imprima sempre o final de linha após cada mensagem.
*/

public class URI1036 {
 
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
 
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double delta = (b * b) - (4 * a * c);
        
        if((2*a==0) || (delta<0)){
			System.out.println("Impossivel calcular");
		}else{
		    double r1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
			double r2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
            
            System.out.println(String.format("R1 = %.5f", r1));
            System.out.println(String.format("R2 = %.5f", r2));
		}
       
        sc.close();
        
    }
 
}