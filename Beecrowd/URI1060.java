import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
    A seguir, mostre a quantidade de valores positivos digitados.

    ENTRADA:
    Seis valores, negativos e/ou positivos.

    SAÍDA:
    Imprima uma mensagem dizendo quantos valores positivos foram lidos.
*/

public class URI1060 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
 
        int contador = 0;
        
        for (int i=0; i < 6; i++) {
        	double valores = sc.nextDouble();
        	if (valores > 0) contador++;
        }
        
        System.out.println(contador + " valores positivos");
        
    }
 
}