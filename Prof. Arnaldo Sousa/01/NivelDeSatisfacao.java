public class NivelDeSatisfacao {

	public static void main(String[] args) {

		int nivel = 5;

		switch (nivel) {

			case 1 -> System.out.println("Muito Insatisfeito");
			case 2 -> System.out.println("Insatisfeito");
			case 3 -> System.out.println("Neutro");
			case 4 -> System.out.println("Satisfeito");
			case 5 -> System.out.println("Muito Satisfeito");
			default -> System.out.println("Nenhuma resposta.");
		}

	}
}