public class Gerente extends Funcionario { // Gerente é um funcionário, por isso que ele herdou (extends) o Funcionário
	
	// Atributos:

	private int senha;
	
	// Método:
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getBonificacao() + super.getSalario(); // super para indicar que é da classe mãe. pra cima, subiu a hierarquia pra encontrar esse atributo
	}

}
