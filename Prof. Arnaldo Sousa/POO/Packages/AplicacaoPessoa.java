import packagess.Pessoa;

public class AplicacaoPessoa {
	
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa()		;

		pessoa1.exibirInformacoes();
		pessoa2.exibirInformacoes();

		pessoa1.setIdade((byte) 5);
		pessoa1.exibirInformacoes();

		pessoa2.setEndereco("Rua que sobe");
		pessoa2.exibirInformacoes();

	}

}