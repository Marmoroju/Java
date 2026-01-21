package packagess;

public class Funcionario {

	private String nome;
	private double salario;

	public Funcionario(String nomeInit, double salarioInit) {
		nome = nomeInit;
		salario = salarioInit;
	}

	// A declaração de um método inclui o modificador de acesso, 
	// o tipo de retorno, o nome do método e os parâmetros;
	public String obterInfo() {
		return "Nome: " + nome + ", Salário: " + salario;
	}
}