import java.io.IOException;
import java.util.Scanner;

/*
    Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. 
    A seguir calcule a duração do jogo.

    OBS: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

    ENTRADA:
    Quatro números inteiros representando a hora de início e fim do jogo.

    SAÍDA:
    Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
*/

public class URI1047 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		
		int minutosIniciais = (horaInicial * 60) + minutoInicial;
        int minutosFinais = (horaFinal * 60) + minutoFinal;
        int horasNoDia = (24 * 60);
        int resultado;
        
        if (minutosFinais > minutosIniciais) {
            resultado = minutosFinais - minutosIniciais;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (resultado/60), (resultado%60));
        } else if (minutosIniciais > minutosFinais){
            resultado = (horasNoDia - minutosIniciais) + minutosFinais;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (resultado/60), (resultado%60));
        } else if (minutosFinais == minutosIniciais){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
 
    }
 
}