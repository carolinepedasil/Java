import java.io.IOException;
import java.util.Scanner;

/*
    Leia 100 valores inteiros. 
    Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

    ENTRADA:
    O arquivo de entrada contém 100 números inteiros, positivos e distintos.

    SAÍDA:
    Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
*/

public class URI1080 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int valores;
        int maior = 0;
		int posicaoMaior = 0;
        
        for (int i = 1; i <= 100; i++){
            
            valores = sc.nextInt();
			
			if (maior > valores) {
				maior = maior;
				posicaoMaior = posicaoMaior;
			} else {
				maior = valores;
				posicaoMaior = i;
			}
		}
		
		System.out.println(maior);
		System.out.println(posicaoMaior);
		
    	sc.close();
 
    }
 
}