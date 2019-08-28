package br.com.engenhariasoftware.model;

public class lauch {
	
	public static void main(String[] args) {
		
		Boxeador b1 = new Boxeador("Rocky", 40);
		Simpsons s1 = new Simpsons("Homer", 35);
		Boxeador b2 = new Boxeador("Apolo", 40);
		Simpsons s2 = new Simpsons("Ma", 10);
		
		
		b1.trabalhar();
		b2.trabalhar();
		b1.beber();
		b2.beber();
		s1.trabalhar();
	
		
	}

}
