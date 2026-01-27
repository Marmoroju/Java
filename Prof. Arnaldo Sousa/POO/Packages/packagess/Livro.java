package packagess;

public class Livro {

	public String titulo;
	private String autor;
	protected short anoPublicacao;
	double preco;

	public Livro (String titulo, String autor, short anoPublicacao, double preco) {

		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.preco = preco;
	}

	public Livro () {
		
		this.titulo = "Desconhecido";
		this.autor = "Desconhecido";
		this.anoPublicacao = 0;
		this.preco = 0;
	}

	public Livro (String titulo, String autor) {

		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = 0;
		this.preco = 0.0;

	}

	public String getAutor() {

		return autor;
	}


	public void exibirInformacoes() {
		
		System.out.println("Título do Livro: " + titulo);
		System.out.println("Autor: " + getAutor());
		System.out.println("Ano da Publicação: " + anoPublicacao);
		System.out.println("Preço: R$ " + preco);
		System.out.println("");

	}

}