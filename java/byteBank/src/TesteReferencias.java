
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("saldo - primeira conta:  " + primeiraConta.saldo);
		// primeiraConta é uma referência à um objeto do tipo Conta

		Conta segundaConta = primeiraConta; // vai apontar para a mesma referência, não copia.

		System.out.println("saldo - segunda conta: " + segundaConta.saldo);

		/*
		 * são referências para o mesmo objeto, se alterar um atributo em um, o outro
		 * também altera, estão alterando o mesmo objeto.
		 */
		segundaConta.saldo += 100;
		System.out.println("saldo - primeira conta:  " + primeiraConta.saldo);
		System.out.println("saldo - segunda conta: " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) { //verifica o endereço na memória
			System.out.println("São a mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
