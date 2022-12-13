package br.com.bytebank.banco.modelo;

public interface Tributavel {

	// não preciso colocar o "public abstract", pois já implícito
	public abstract double getValorImposto();
}
