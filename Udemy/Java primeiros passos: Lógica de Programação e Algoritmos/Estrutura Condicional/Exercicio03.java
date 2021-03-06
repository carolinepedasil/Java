import java.util.Locale;
import java.util.Scanner;

/* 
    Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone. 
    Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. 
    Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.

    Entrada:
    22 
    
    Saída: 
    Valor a pagar: R$ 50.00

    -

    Entrada:
    103 
    
    Saída:
    Valor a pagar: R$ 56.00  
*/

public class Exercicio03 {

    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in); 
        
        double planoBasico = 50.00;
        double minutos = sc.nextDouble();
        double valorExcedente = 2.00;
        double quantidadeConsumida = planoBasico + ((minutos - 100) * valorExcedente);

        if (minutos < 100) { 
            System.out.printf("Valor a pagar: R$ %.2f", planoBasico);
        } else {
            System.out.printf("Valor a pagar: R$ %.2f", quantidadeConsumida);
        }

        sc.close();

    }
    
}
