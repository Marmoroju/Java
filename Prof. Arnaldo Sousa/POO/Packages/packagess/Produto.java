package packagess ;

public class Produto {

	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	public Produto(String nome, double preco, int quantidadeEmEstoque) {

		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quantidadeEmEstoque);

	}
}

