
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222-22");
		paulo.setProfissao("programador");

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);

		/* associa o cliente paulo a conta contaDoPaulo - associação */
		//contaDoPaulo.setTitular = paulo;
		//System.out.println(contaDoPaulo.getTitular.nome);
		//System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
	}

}
