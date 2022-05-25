public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario carol = new Funcionario();
		carol.setNome("Caroline");
		carol.setCpf("123456789-10");
		carol.setSalario(1234.00);
		
		System.out.println(carol.getNome());
		System.out.println(carol.getBonificacao());
		
	}

}
