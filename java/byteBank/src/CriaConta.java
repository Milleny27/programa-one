public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // create a new object type Conta
		primeiraConta.saldo = 200;
		System.out.println("Primeira conta: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		primeiraConta.deposita(50);
		
		System.out.println("Segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		if (primeiraConta == segundaConta) { //verifica o endereço na memória
			System.out.println("São a mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}