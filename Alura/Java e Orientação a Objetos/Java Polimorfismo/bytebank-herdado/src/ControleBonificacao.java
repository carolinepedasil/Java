public class ControleBonificacao {

	// Atributo:
	private double soma;
	
	// Métodos:	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	// Get:
	public double getSoma() {
		return soma;
	}
}
