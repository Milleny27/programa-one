public class Conta { //Caracteristicas de um caractere
	double saldo;
	int agencia; //iniciamos um valor aqui somente se constar na especificação
	int numero;
	String titular;
	
	public void deposita(double valor) {
		//this indica uma referência para a classe
		this.saldo += valor;	
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
}