package entities;

public class Product {

	// Atributos:
	private String name;
	private double price;
	private int quantity;
	
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
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() { // Não vai ser criada o setQuantity() para proteger o objeto-produto de alterações inconsistentes na quantidade dele - A quantidade do produto só pode ser alterada por meio das operações: entrada e saída do estoque
		return quantity;
	}
	
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
