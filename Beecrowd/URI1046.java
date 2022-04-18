import java.io.IOException;
import java.util.Scanner; 

/*
    Leia a hora inicial e a hora final de um jogo. 
    A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

    ENTRADA:
    A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

    SAÍDA:
    Apresente a duração do jogo conforme exemplo abaixo.
*/

public class URI1046 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int horas;

        if (horaInicial == horaFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (horaInicial > horaFinal) {
            horas = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + horas + " HORA(S)");
        } else if (horaInicial < horaFinal) {
            horas = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + horas + " HORA(S)");
        }
        
        sc.close();
 
    }
 
}