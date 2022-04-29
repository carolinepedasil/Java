import java.io.IOException;
import java.util.Scanner; 

/*
    Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

    ENTRADA:
    O arquivo de entrada contém 5 valores inteiros quaisquer.

    SAÍDA:
    Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.
*/
 
public class URI1066 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int valores;
        int contadorPar = 0;
        int contadorImpar = 0;
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        
        for (int i = 0; i < 5; i++) {
            
        	valores = sc.nextInt();
        	
        	if (valores % 2 == 0) {
        	    contadorPar++;
        	} else { 
        	    contadorImpar++;
        	}
        	
        	if (valores > 0) {
        	    contadorPositivo++;
        	} else if(valores < 0) {
        	    contadorNegativo++;
        	}
        	
        }
        
        System.out.println(contadorPar + " valor(es) par(es)");
        System.out.println(contadorImpar + " valor(es) impar(es)");
        System.out.println(contadorPositivo + " valor(es) positivo(s)");
        System.out.println(contadorNegativo + " valor(es) negativo(s)");
    
        sc.close();
        
    }
 
}