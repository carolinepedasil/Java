import java.io.IOException;

/*
    Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    ENTRADA:
    Não há nenhuma entrada neste problema.

    SAÍDA:
    Imprima a sequencia conforme exemplo abaixo
*/

public class URI1096 {
 
    public static void main(String[] args) throws IOException {
 
        int i = 1;
        
		while (i <= 9) {
            
			for (int j = 7; j > 4; j--) {
				System.out.println("I=" + i + " J=" + j);
			}
			
			i += 2;
			
		}
 
    }
 
}