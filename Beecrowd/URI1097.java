import java.io.IOException;

/*
    Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    ENTRADA:
    Não há nenhuma entrada neste problema.

    SAÍDA:
    Imprima a sequencia conforme exemplo abaixo.
*/

public class URI1097 {
 
    public static void main(String[] args) throws IOException {
 
        int i = 1;
        int j = 7;
        
		while (i <= 9) {
		    
			for (int aux = 0; aux < 3; aux++) {
				System.out.println("I=" + i + " J=" + j);
				j--;
			}
			
			j += 5;
			i += 2;
			
		}
 
    }
 
}