import java.io.IOException;
import java.util.Scanner;

/*
    Ler um número inteiro N e calcular todos os seus divisores.

    ENTRADA:
    O arquivo de entrada contém um valor inteiro.

    SAÍDA:
    Escreva todos os divisores positivos de N, um valor por linha.

    Exemplo de Entrada:
    6

    Exemplo de Saída:
    1
    2
    3
    6
*/
 
public class URI1157 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
        	if (N % i == 0) {
        	    System.out.println(i);
        	}
        }
 
    }
 
}