import packagess.Livro;

public class AplicacaoLivro {

	public static void main(String[] args) {

		Livro livro1 = new Livro();
		Livro livro2 = new Livro("Assim Falou Zaratustra", "Nietzsche");
		Livro livro3 = new Livro("Box: O Senhor dos Anéis", "J.R.R. Tolkien", (short) 1937, 120.98);

		livro1.exibirInformacoes();
		livro2.exibirInformacoes();
		livro3.exibirInformacoes();

	}

}