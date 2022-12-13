/*Gerente é um Funcionário, herda da class Funcionario, assina o contrato Autenticavel*/
public class Gerente extends Funcionario implements Autenticavel {

private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	// mesma assinatura da classe super -> reescrita
	@Override
	public double getBonificacao() {
		return super.getSalario();
	}

	

}