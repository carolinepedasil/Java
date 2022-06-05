import java.io.IOException;
import java.util.Scanner;

/*
    Ler um valor N. 
    Calcular e escrever seu respectivo fatorial. 
    Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

    ENTRADA:
    A entrada contém um valor inteiro N (0 < N < 13).

    SAÍDA:
    A saída contém um valor inteiro, correspondente ao fatorial de N.

    Exemplo de Entrada:
    4

    Exemplo de Saída:
    24
*/

public class URI1153 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in); 
        
        int N = sc.nextInt();
        int fatorial = 1;
        
        for (int i = 1; i <= N; i++) {
        	fatorial *= i;
        }
        
        System.out.println(fatorial);
    }
 
}