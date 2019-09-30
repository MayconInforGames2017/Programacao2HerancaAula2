package br.com.engenhariasoftware.model.aula2;

public class Professor extends Pessoa implements Educador, SerVivo {

	private String nome;
	private String cpf;
	private String telefone;

	public Professor(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public void ensina() {
		System.out.println("O professor " + nome + " está ensinando");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
