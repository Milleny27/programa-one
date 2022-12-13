
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337 , 24336);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(1337 , 24336);
		Conta conta3 = new Conta(1337 , 24336);
		Conta conta4 = new Conta(1337 , 24336);
		Conta conta5 = new Conta(1337 , 24336);		
		
		System.out.println(Conta.getTotal());
		
	}

}
