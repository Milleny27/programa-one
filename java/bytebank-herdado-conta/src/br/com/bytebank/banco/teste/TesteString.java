package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		int a = 3;
		String vazio = "";
		String espaco = "      brbwr       ";
		String nome = "Alura"; //object literal
		//String outro = new String("Alura");
		
		System.out.println(nome.replace('A', 'a'));
		
		System.out.println(nome.toLowerCase());
		
		System.out.println(nome.toUpperCase());
		
		System.out.println();
		System.out.println(nome.indexOf('u'));
		
		System.out.println();
		System.out.println(nome.substring(1));
		
		System.out.println();
		System.out.println(nome.length());
		System.out.println();
		for(int i=0; i<nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println();
		System.out.println(nome.isEmpty());
		System.out.println(vazio.isEmpty());
		
		System.out.println();
		System.out.println(espaco);
		System.out.println(espaco.trim());
		
		System.out.println();
		System.out.println(nome.contains("A"));
	}

}
