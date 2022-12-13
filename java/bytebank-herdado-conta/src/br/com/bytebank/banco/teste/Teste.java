package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		System.out.println("s");
		System.out.println(3);
		System.out.println(false);
		
		Cliente c = new Cliente();
		c.setNome("Milleny");
		c.setCpf("111.111.111-11");
		
		ContaCorrente cc = new ContaCorrente(123,321);
		Object cp = new ContaPoupanca(33, 22);
		cc.setTitular(c);
		
		
		System.out.println(cc.toString());
		System.out.println(cp);
		
//		println(cc);
//		println(c);
		
	}
	
	static void println() {}
	
	static void println(int num) {}
	
	static void println(boolean valor) {}
	
	static void println(Object conta) {}
	//Um tipo mais genérico e passar qualquer tipo de referência

}
