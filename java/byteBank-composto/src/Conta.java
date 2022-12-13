public class Conta { // Caracteristicas de um caractere
	private double saldo;
	private int agencia; // iniciamos um valor aqui somente se constar na especifica��o
	private int numero;
	private Cliente titular;
	
	//Pertence a classe, n�o mais ao objeto
	private static int total = 0;
	
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero) {
		total++;
		System.out.println("o total de contas �: " + total);
		if (agencia <= 0 || numero <= 0) {
			System.out.println("n�o pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("construtor inicializado");
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		//dentro de um m�todo static n�o existe this
		return Conta.total;
	}

	public double getSaldo() {
		return this.saldo;
		/*
		 * Porque tenho esse m�todo? Porque n�o quero que ningu�m acesse esse atributo
		 * diretamente
		 */
	}

	public void deposita(double valor) {
		// this indica uma refer�ncia para a classe
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