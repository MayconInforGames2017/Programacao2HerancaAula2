package br.com.engenhariasoftware.model.aula2.teste;

import br.com.engenhariasoftware.model.aula2.Coordenador;
import br.com.engenhariasoftware.model.aula2.Professor;

public class Launch {

	public static void main(String[] args) {

		Professor p1 = new Professor(null, null, null);
		p1.setNome("Marcelo");
		p1.setCpf("000.012.036-20");
		p1.setTelefone("88-99999-9999");
		p1.ensina();
		
		Coordenador c1 = new Coordenador(null, null, null, null, null, null);
		c1.setNome("Revoredo");
		c1.finannceiro();
		c1.come();

	}

}
