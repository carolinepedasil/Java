import java.io.IOException;
import java.util.Scanner;

/*
    Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. 
    Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.

    ENTRADA:
    A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. 
    A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

    SAÍDA:
    Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, caso contrário imprima a mensagem “Decrescente”.
*/

public class URI1113 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        while (true) {
    
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x == y || y == x) {
                break;
            }
            
            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
        
        }
 
    }
 
}