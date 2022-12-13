
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel g = new Gerente();
		Autenticavel adm = new Administrador();
		Autenticavel c = new Cliente();
		
		Gerente gerente = new Gerente();
		gerente.setNome("Milleny");
		gerente.setCpf("111.111.111-11");
		gerente.setSalario(1000);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(2222);
		boolean autenticou = gerente.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(gerente.getBonificacao());

	}

}
