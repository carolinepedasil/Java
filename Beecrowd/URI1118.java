import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. 
    Calcule e imprima a média semestral. O programa só deverá aceitar notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). C
    ada nota deve ser validada separadamente.
    No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). 
    Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.

    ENTRADA:
    O arquivo de entrada contém vários valores reais, positivos ou negativos. 
    Quando forem lidas duas notas válidas, deve ser lido um valor inteiro X . 
    O programa deve parar quando o valor lido para este X for igual a 2.

    SAÍDA:
    Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”. 
    Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.
    Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta mensagem deve ser apresentada novamente se o valor da entrada padrão para X for menor do que 1 ou maior do que 2, conforme o exemplo abaixo.
    A média deve ser impressa com dois dígitos após o ponto decimal.
*/

public class URI1118 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
		double nota1, nota2, media;
		int novoCalculo = 1;
		
		while (novoCalculo == 1) {
		
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
     
            //

            System.out.println("novo calculo (1-sim 2-nao)");
            novoCalculo = sc.nextInt();
            
            while (novoCalculo != 1 && novoCalculo != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				novoCalculo = sc.nextInt();
			}
            
		}
        
        sc.close();
    
    }
 
}