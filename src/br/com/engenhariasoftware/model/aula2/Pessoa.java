package br.com.engenhariasoftware.model.aula2;

public abstract class Pessoa implements SerVivo{

	protected String nome;
	protected String cpf;
	protected String telefone;

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

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bebe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void come() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormi() {
		// TODO Auto-generated method stub
		
	}
}
