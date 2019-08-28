package br.com.engenhariasoftware.model;

public class Boxeador extends Pessoa {
	
	public Boxeador(String nome, int idade) {
		super(nome,idade);
	}

	@Override
	public void trabalhar() {
		System.out.println("Eu " + nome + " estou trabalando...");
		
	}

}
