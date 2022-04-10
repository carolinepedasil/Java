import java.io.IOException;
import java.util.Scanner;

/*
    Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
    A seguir, calcule e mostre o valor da conta a pagar.

    CODIGO  ESPECIFICACAO     PREÇO
    1       Cachorro Quente   R$ 4.00
    2       X-Salada          R$ 4.50
    3       X-Bacon           R$ 5.00
    4       Torrada simples   R$ 2.00
    5       Refrigerante      R$ 1.50

    ENTRADA:
    O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

    SAÍDA:
    O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
*/
 
public class URI1038 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total;
        
        switch (codigo) {
            case 1:
                total = (double) quantidade * 4.00;
                System.out.println(String.format("Total: R$ %.2f", total));
                break;
            case 2:
                total = (double) quantidade * 4.50;
                System.out.println(String.format("Total: R$ %.2f", total));
                break;
            case 3:
                total = (double) quantidade * 5.00;
                System.out.println(String.format("Total: R$ %.2f", total));
                break;
            case 4:
                total = (double) quantidade * 2.00;
                System.out.println(String.format("Total: R$ %.2f", total));
                break;
            case 5:
                total = (double) quantidade * 1.50;
                System.out.println(String.format("Total: R$ %.2f", total));
                break;
        }

        sc.close();
        
    }
 
}