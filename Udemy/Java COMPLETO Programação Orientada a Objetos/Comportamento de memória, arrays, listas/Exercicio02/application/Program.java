package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/*
	Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos. 
	Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
*/

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++) { // ou: i<n
			sc.nextLine(); //pular a linha
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price); // instâncio o produto
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) { // ou: i<n
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length; // ou n
		
		System.out.printf("AVERAGE PRICE = %.2f!%n", avg);
	
		sc.close();

	}

}
