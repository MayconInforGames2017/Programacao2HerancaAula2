package br.com.engenhariasoftware.model.prova;

public class Mamifero {

	protected void andar() {
		System.out.println("Mamifero andando");
		ouvir();
	}

	protected void ver() {
		System.out.println("Mamifero vendo");

	}

	protected void ouvir() {
		System.out.println("Mamifero ouvindo");
		ver();
	}

}
