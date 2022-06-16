public class Gerente extends Funcionario implements Autenticavel { // Gerente é um funcionário autenticavel, por isso que ele herdou (extends) o Funcionário Autenticavel
	
	private int senha;
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario(); // super para indicar que é da classe mãe. pra cima, subiu a hierarquia pra encontrar esse atributo
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
