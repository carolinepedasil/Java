import java.util.Scanner;

/* 
    Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1=domingo, 2=segunda, e assim por diante). 
    Escrever na tela o dia da semana correspondente, conforme exemplos.

    Entrada:
    1 
    
    Saída:
    Dia da semana: domingo

    -

    Entrada:
    4 
    
    Saída:
    Dia da semana: quarta

    -

    Entrada: 
    9 
    
    Saída:
    Dia da semana: valor inválido
*/

public class Exercicio04 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Escreva um valor inteiro de 1 a 7 representando um dia da semana: ");
        int numeroInteiro = sc.nextInt();

        switch (numeroInteiro) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabádo");
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }

        sc.close();

    }
    
}
