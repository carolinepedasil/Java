public class Gerente extends Funcionario implements Autenticavel { // Gerente é um funcionário autenticavel, por isso que ele herdou (extends) o Funcionário Autenticavel
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario(); // super para indicar que é da classe mãe. pra cima, subiu a hierarquia pra encontrar esse atributo
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
