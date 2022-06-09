public class Gerente extends FuncionarioAutenticavel { // Gerente é um funcionário autenticavel, por isso que ele herdou (extends) o Funcionário Autenticavel
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario(); // super para indicar que é da classe mãe. pra cima, subiu a hierarquia pra encontrar esse atributo
	}

}
