public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente funcionario = new Gerente();
		funcionario.setNome("Milleny");
		funcionario.setCpf("222.222.222-22");
		funcionario.setSalario(50000.00);

		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		System.out.println("Novo salario: R$ " + (funcionario.getSalario() + funcionario.getBonificacao()));

	}

}