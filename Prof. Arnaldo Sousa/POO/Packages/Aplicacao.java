import packagess.Carro;

public class Aplicacao {

	public static void main(String[] args) {

		Carro carro1 = new Carro("Fiat", "Uno", (short)2020 );
		Carro carro2 = new Carro("Volksvagen", "Gol");
		Carro carro3 = new Carro();

		carro1.exibirInformacoes();
		carro2.exibirInformacoes();
		carro3.exibirInformacoes();


	}

}