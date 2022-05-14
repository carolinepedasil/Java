import java.io.IOException;

/*
    Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    ENTRADA:
    Não há nenhuma entrada neste problema.

    SAÍDA:
    Imprima a sequencia conforme exemplo abaixo.
    I=1 J=7
    I=1 J=6
    I=1 J=5
    I=3 J=9
    I=3 J=8
    I=3 J=7
    ...
    I=9 J=15
    I=9 J=14
    I=9 J=13
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