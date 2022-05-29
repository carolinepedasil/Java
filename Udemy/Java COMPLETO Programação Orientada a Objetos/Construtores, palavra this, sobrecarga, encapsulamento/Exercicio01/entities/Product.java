package entities;

public class Product {

	// Atributos:
	public String name;
	public double price;
	public int quantity;
	
	// Construtor Padrão - Sobrecarga a mais - Inclui manualmente
	public Product() {
	}
	
	// Construtor:
	public Product(String name, double price, int quantity) { // Parâmetros
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	//		SOBRECARGA
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		quantity = 0; // essa linha é opcional - o this também, pois ele foi retirado do parâmetro
	}
	
	// Métodos:
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
