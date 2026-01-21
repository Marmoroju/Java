public class Funcionario {

	String nome;
	String cargo;
	int idade;

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		funcionario.nome = "Marcos";
		funcionario.cargo = "Desenvolvedor";
		funcionario.idade = 36;

		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Idade: " + funcionario.idade);

	}

}