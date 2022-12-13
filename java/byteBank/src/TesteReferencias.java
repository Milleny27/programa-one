
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("saldo - primeira conta:  " + primeiraConta.saldo);
		// primeiraConta � uma refer�ncia � um objeto do tipo Conta

		Conta segundaConta = primeiraConta; // vai apontar para a mesma refer�ncia, n�o copia.

		System.out.println("saldo - segunda conta: " + segundaConta.saldo);

		/*
		 * s�o refer�ncias para o mesmo objeto, se alterar um atributo em um, o outro
		 * tamb�m altera, est�o alterando o mesmo objeto.
		 */
		segundaConta.saldo += 100;
		System.out.println("saldo - primeira conta:  " + primeiraConta.saldo);
		System.out.println("saldo - segunda conta: " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) { //verifica o endere�o na mem�ria
			System.out.println("S�o a mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
