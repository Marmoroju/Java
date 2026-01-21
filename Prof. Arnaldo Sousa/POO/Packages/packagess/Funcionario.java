package packagess;

public class Funcionario {

	private String nome; // modificador de acesso private
						 // private só pode ser acessada de dentro da classe Funcionário
						 // não pode ser chamada como funcionario.nome
						 // para isso deveria estar como public
	

	//String nome;
	double salario;

	private Funcionario(String nomeInit, double salarioInit) {
		nome = nomeInit;
		salario = salarioInit;
		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + salario);
	}

	// precisa ser criado outro arquivo como 'ProtectedClass.java' no mesmo
	// diretório (pacote) deste e depois fora deste diretório
	// criar o arquivo com a classe que irá chamá-lo
	// igual ao arquivo 'FolhaDePagamento.java'

	// Em resumo, você não consegue acessar a classe a partir do seu
	// arquivo original de criação
	// precisa criar um outro arquivo por onde será realizada as declarações
	// e depois chamá-lo através de um Main.

	protected Funcionario() {
		Funcionario func = new Funcionario("Martha", 8000);
	}
}