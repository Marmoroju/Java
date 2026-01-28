package packagess;

public class Pessoa {

	String nome;
	private byte idade;
	protected String endereco;
	String telefone;

	public Pessoa (String nome, byte idade, String endereco, String telefone) {

		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Pessoa() {
		
		this.nome = "Desconhecido";
		this.idade = 0;
		this.endereco = "Desconhecido";
		this.telefone = "Desconhecido";
	}

	public byte getIdade() {

		return idade;
	}

	public void setIdade(byte idade) {

		this.idade = idade;
	}

	public String getEndereco() {

		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public void exibirInformacoes() {

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + getIdade());
		//System.out.println("Endereço: " + endereco);
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Telefone: " + telefone);
		System.out.println("");
	}

}