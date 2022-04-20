import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
 
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