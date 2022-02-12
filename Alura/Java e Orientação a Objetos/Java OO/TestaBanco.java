public class TestaBanco {
	public static void main(String[] args) {
		Cliente caroline = new Cliente();
		caroline.setNome("Caroline");
		caroline.setCpf("222.222.222.-22");
		caroline.setProfissao("Desenvolvedora");

		Conta contaDaCaroline = new Conta();
		contaDaCaroline.deposita(100);

		contaDaCaroline.setTitular(caroline);
		System.out.println(contaDaCaroline.getTitular().getNome());
		System.out.println(contaDaCaroline.getTitular());

	}
}