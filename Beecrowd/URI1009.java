import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
    Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

    ENTRADA:
    O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

    SAÍDA:
    Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
*/

public class URI1009 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String nome = sc.next();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        double comissao = 0.15;
        
        double total = salario + (vendas * comissao);
        
        System.out.println(String.format("TOTAL = R$ %.2f" , total));
        
        sc.close();
 
    }
 
}