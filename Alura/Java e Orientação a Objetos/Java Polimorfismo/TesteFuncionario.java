
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario caroline = new Funcionario();
		caroline.setNome("Caroline Pereira da Silva");
		caroline.setCpf("123456789-10");
		caroline.setSalario(9999.99);
		
		System.out.println(caroline.getNome());
		System.out.println(caroline.getBonificacao());

	}

}
