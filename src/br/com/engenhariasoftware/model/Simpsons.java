package br.com.engenhariasoftware.model;

public class Simpsons extends Pessoa {
	
	public Simpsons(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void trabalhar() {
		System.out.println("Eu " + nome + " trabalho com preguiça");
		
	}
	

}
