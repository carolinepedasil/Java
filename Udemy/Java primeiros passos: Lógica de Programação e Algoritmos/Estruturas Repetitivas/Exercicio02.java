import java.util.Locale;
import java.util.Scanner;

/* 
    Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. 
    O último dado, que não entrará nos cálculos, contém um valor de idade negativa. 
    Calcular e imprimir a idade média deste grupo de indivíduos. 
    Se for entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".

    Exemplos:

    Entrada:
    31 
    27
    46 
    -5

    Saída:
    34.67

    -

    Entrada:
    -10

    Saída:
    impossivel calcular
*/

public class Exercicio02 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int idade = sc.nextInt(); 
        int soma = 0;
        int cont = 0;

        while (idade >= 0) {
            soma = soma + idade; 
            cont = cont + 1; 
            idade = sc.nextInt();
        }

        if (cont > 0) {
            double media = (double) soma / cont; 
            System.out.printf("%.2f%n", media);
        } else {
            System.out.println("impossivel calcular");
        }

        sc.close();

    }
    
}
