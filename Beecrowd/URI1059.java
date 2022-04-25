import java.io.IOException;

/*
    Faça um programa que mostre os números pares entre 1 e 100, inclusive.

    ENTRADA:
    Neste problema extremamente simples de repetição não há entrada.

    SAÍDA:
    Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha.
*/

public class URI1059 {
 
    public static void main(String[] args) throws IOException {
 
        for (int numero = 1; numero <= 100; numero++) {
    		if (numero % 2 == 0) {
    		    System.out.println(numero);
    		}
    	}
 
    }
 
}