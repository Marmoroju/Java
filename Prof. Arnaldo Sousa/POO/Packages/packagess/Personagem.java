package packagess;

public class Personagem {
		
	private String nome;
	private int nivelDePoder;

	public Personagem (String nome, int nivelDePoder) {
		this.nome = nome;
		this.nivelDePoder = nivelDePoder;
	}

	// passagem por valor
	public void tentarAumentarNivelDePoder (int nivelDePoder) {
		nivelDePoder += 10;
	}

	// passagem por referência
	public void mudarNome(Personagem p) {
		p.nome = "José";
	}

	public void aumentarNivelDePoder() {
		this.nivelDePoder += 10;
	}


	public void exibirInformacoes() {
		System.out.println("Nome do Personagem: " + this.nome);
		System.out.println("Nível de Poder: " + this.nivelDePoder);
		System.out.println("");

	}

}