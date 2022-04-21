import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

/*
	A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

	Salário					Percentual de Reajuste
	0 - 400.00				15%
	400.01 - 800.00			12%
	800.01 - 1200.00		10%
	1200.01 - 2000.00		7%
	Acima de 2000.00		4%

	Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

	ENTRADA:
	A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

	SAÍDA:
	Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.
*/
 
public class URI1048 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        double salario = sc.nextDouble();
        double reajuste;
        double novoSalario;
        int percentual;
        
        if (salario >= 0 && salario <= 400) {
			reajuste = salario * 0.15;
			novoSalario = salario + reajuste;
			percentual = 15;
		} else if (salario > 400 && salario <= 800) {
			reajuste = salario * 0.12;
			novoSalario = salario + reajuste;
			percentual = 12;
		} else if (salario > 800 && salario <= 1200) {
			reajuste = salario * 0.10;
			novoSalario = salario + reajuste;
			percentual = 10;
		} else if (salario > 1200 && salario <= 2000) {
			reajuste = salario * 0.07;
			novoSalario = salario + reajuste;
			percentual = 7;
		} else {
			reajuste = salario * 0.04;
			novoSalario = salario + reajuste;
			percentual = 4;
		}
		
		System.out.println("Novo salario: " + df.format(novoSalario));
		System.out.println("Reajuste ganho: " + df.format(reajuste));
		System.out.println("Em percentual: " + percentual + " %");
        
        sc.close();
 
    }
 
}