import java.io.IOException;
import java.util.Scanner;

/*
    Este programa deve ler uma variável inteira X inúmeras vezes (deve parar quando o valor no arquivo de entrada for igual a zero). 
    Para cada valor lido imprima a sequência de 1 até X, com um espaço entre cada número e seu sucessor.

    OBS: cuide para não deixar espaço em branco após o último valor apresentado na linha ou você receberá Presentation Error.

    ENTRADA:
    O arquivo de entrada contém vários números inteiros. O último número no arquivo de entrada é 0.

    SAÍDA:
    Para cada número N do arquivo de entrada deve ser impressa uma linha de 1 até N, conforme o exemplo abaixo. 
    Não deve haver espaço em branco após o último valor da linha.

    Exemplo de Entrada:
    5
    10
    3
    0

    Exemplo de Saída:
    1   2   3   4   5 
    1   2   3   4   5   6   7   8   9   10
    1   2   3
*/

public class URI1146 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in); 
        int X = sc.nextInt();
        
        while (X != 0) {
            
            for (int i = 1; i <= X; i++) {

    			if (i % X == 0) {
    			    System.out.print(i + "\n");
    			} else {
    			    System.out.print(i + " ");
    			}
            
            }
            
            X = sc.nextInt();
            
        }
 
    }
 
}