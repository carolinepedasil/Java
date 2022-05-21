import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa que leia as notas referentes às duas avaliações de um aluno. 
    Calcule e imprima a média semestral. 
    Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). 
    Cada nota deve ser validada separadamente.

    ENTRADA:
    A entrada contém vários valores reais, positivos ou negativos. 
    O programa deve ser encerrado quando forem lidas duas notas válidas.

    SAÍDA:
    Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
    Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. 
    O valor deve ser apresentado com duas casas após o ponto decimal.
*/

public class URI1117 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
		double nota1, nota2, media;
		
		nota1 = sc.nextDouble();
			
		while (nota1 < 0 || nota1 > 10) {
		    System.out.println("nota invalida");
		    nota1 = sc.nextDouble();
		}
		    
	    nota2 = sc.nextDouble();
		    
	    while (nota2 < 0 || nota2 > 10 ) {
	        System.out.println("nota invalida");
	        nota2 = sc.nextDouble();
		} 
		
		media = (nota1 + nota2) / 2;
	    System.out.println(String.format("media = %.2f", media));
        
    }
 
}