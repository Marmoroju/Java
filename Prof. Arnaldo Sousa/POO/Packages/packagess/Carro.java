package packagess;

public class Carro {

	String marcaDoCarro;
	String modeloDoCarro;
	short anoDoCarro;

	public Carro(String marca, String modelo, short ano) {
		
		marcaDoCarro = marca;
		modeloDoCarro = modelo;
		anoDoCarro = ano;
	}

	// sobrecarga de construtores
	public Carro (String marca, String modelo) {

		marcaDoCarro = marca;
		modeloDoCarro = modelo;
	}

	// sobrecarga de construtores
	public Carro(){		
	}


	// método
	public void exibirInformacoes() {

		System.out.println("Marca: " + marcaDoCarro);
		System.out.println("Modelo: " + modeloDoCarro);
		System.out.println("Ano: " + anoDoCarro);
		System.out.println("");
	}

}