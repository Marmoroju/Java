import packagess.Personagem;

public class AplicacaoPersonagem {

	public static void main(String[] args) {

		Personagem personagem1 = new Personagem("Marcos", 36);
		personagem1.exibirInformacoes();
		
		System.out.println("Passagem por valor");		
		personagem1.aumentarNivelDePoder();
		personagem1.exibirInformacoes();

		System.out.println("Passagem por referência");
		personagem1.mudarNome(personagem1);
		personagem1.exibirInformacoes();


	}

}