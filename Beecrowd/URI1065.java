import java.io.IOException;
import java.util.Scanner; 

/*
    Faça um programa que leia 5 valores inteiros. 
    Conte quantos destes valores digitados são pares e mostre esta informação.

    ENTRADA:
    O arquivo de entrada contém 5 valores inteiros quaisquer.

    SAÍDA:
    Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
*/

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        
        for (int i = 0; i < 5; i++) {
        	
            int valores = sc.nextInt();

        	if (valores % 2 == 0 ) {
        	    contador++;
        	}
        }

        System.out.println(contador + " valores pares");
        
    }
 
}