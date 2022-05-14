import java.io.IOException;
import java.util.Locale;

/*
    Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    ENTRADA:
    Não há nenhuma entrada neste problema.

    SAÍDA:
    Imprima a sequencia conforme exemplo abaixo.
    I=0 J=1
    I=0 J=2
    I=0 J=3
    I=0.2 J=1.2
    I=0.2 J=2.2
    I=0.2 J=3.2
    .....
    I=2 J=?
    I=2 J=?
    I=2 J=?
*/

public class URI1098 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
 
        double i;
        double j;
        
        for (i = 0; i <= 2; i += 0.2) {
            for (j = 1; j <= 3; j++) {
                if (i == 0 || i == 1 || i >= 1.9) {
                    System.out.println("I=" + Math.round(i) + " J=" + Math.round((i + (j % 10))));
                } else {
                    System.out.printf("I=%.1f", i);
                    System.out.printf(" J=%.1f", (i + (j % 10)));
                    System.out.println();
                }
            }
        }
 
    }
 
}