public abstract class FuncionarioAutenticavel extends Funcionario {

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

}
