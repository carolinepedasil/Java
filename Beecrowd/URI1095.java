import java.io.IOException;

/*
    Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    ENTRADA:
    Não há nenhuma entrada neste problema.

    SAÍDA:
    Imprima a sequencia conforme exemplo abaixo
*/

public class URI1095 {
 
    public static void main(String[] args) throws IOException {
 
        int i = 1; 
        int j = 60;
		
		while (j >= 0) {
			System.out.println("I=" + i + " J=" + j);
			j -= 5;
			i += 3;
		}
 
    }
 
}