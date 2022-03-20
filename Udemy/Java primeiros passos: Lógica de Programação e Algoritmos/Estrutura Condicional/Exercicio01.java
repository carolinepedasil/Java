import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de uma disciplina anual. 
    Em seguida, mostrar a nota final que o aluno obteve no ano juntamente com um texto explicativo. 
    Caso a nota final do aluno seja inferior a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos. 
    Todos os valores devem ter uma casa decimal.

    Exemplos:

    Entrada:
    45.5 
    31.3

    Saída:
    NOTA FINAL = 76.8

    -

    Entrada:
    34.0 
    23.5

    Saída:
    NOTA FINAL = 57.5 
    REPROVADO
*/

public class Exercicio01 {

    public static void main(String[] args){
        
        Locale.setDefault(Locale.US); // Para aceitar "." ao invés de "," nos números

        Scanner sc = new Scanner(System.in); 
        
        double nota1 = sc.nextDouble(); 
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;

        System.out.printf("NOTA FINAL = %.1f %n", notaFinal);

        if (notaFinal < 60.0) { 
            System.out.println("REPROVADO");
        }

        sc.close();

    }

}