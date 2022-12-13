package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
//		Full Qualifield None FQN - o nome completo da classe composto pelo nome do pacote e o nome da classe
//		modelo.ContaCorrente cc = new modelo.ContaCorrente(111, 111);
//		cc.deposita(100.0);
		

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("CC - R$ " + cc.getSaldo());
		System.out.println("CP - R$ " + cp.getSaldo());

	}

}
