class Animal {
	String nome;

	Animal(String nome) {
		this.nome = nome;
	}
}


class Cachorro extends Animal {
	String raca;

	Cachorro(String nome, String raca) {
		super(nome); // chama o construtor da super classe Animal
		this.raca = raca;
	}
}

public class SuperKeyConstrutor {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Rex", "Labrador");
		System.out.println("O nome do animal é: " + dog.nome);
		System.out.println("A raça do cachorro é: " + dog.raca);
	}
}