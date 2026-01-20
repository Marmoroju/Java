public class FuncionarioConstrutor {

	String nome;
	String cargo;
	int idade;

	// método construtor
	FuncionarioConstrutor(String nomeInit, String cargo, int idadeInit) {
		// this refencia a variável global sendo chamada dentro do método se
		// a variável utilizada no método possuir o mesmo nome.
		//this.nome = nome; 
		this.cargo = cargo;
		//this.idade = idade;

		// aqui não precisou do this porque a variável declarada no método 
		// não possui o mesmo nome, pois é uma variável local.
		nome = nomeInit;
		//cargo = cargoInit;
		idade = idadeInit;


	}
	// Construtor Default - Pode ser chamado sem atender todos os parâmetros.
	FuncionarioConstrutor() {		
	}


	public static void main(String[] args) {

		//FuncionarioConstrutor funcionario = new FuncionarioConstrutor("Marcos", "Desenvolvedor", 36);

		// Contrutor Default
		FuncionarioConstrutor funcionario = new FuncionarioConstrutor();
		funcionario.nome = "Marcos";


		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Idade: " + funcionario.idade);

	}


}