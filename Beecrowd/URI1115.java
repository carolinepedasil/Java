import java.io.IOException;
import java.util.Scanner;

/*
    Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
    Para cada ponto escrever o quadrante a que ele pertence. 
    O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

    ENTRADA:
    A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

    SAÍDA:
    Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.
*/

public class URI1115 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        while (true) {
    
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x == 0 || y == 0) {
                break;
            }
            
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
        
        }
 
    }
 
}