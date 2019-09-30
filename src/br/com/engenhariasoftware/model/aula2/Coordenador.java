package br.com.engenhariasoftware.model.aula2;

public class Coordenador extends Professor implements Gestor {

	private String nome;
	private String cpf;
	private String telefone;
	
	public Coordenador(String nome, String cpf, String telefone, String nome2, String cpf2, String telefone2) {
		super(nome, cpf, telefone);
		nome = nome2;
		cpf = cpf2;
		telefone = telefone2;
	}

	public void finannceiro() {
		System.out.println("O coordenadoor " + nome + " é responsavel pelo financeiro");
	}

	@Override
	public void guiarProfessor() {
		System.out.println("O coordenador " + nome + " é responsavel por orientar os professores");

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
