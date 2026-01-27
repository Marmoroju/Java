package packagess;

public class SalaDeAula {
	
	private static int totalAlunos = 0;

	public static void addAluno(int quantidade) {

		totalAlunos += quantidade;

	}

	public static void exibirTotalAlunos() {
		System.out.println("Total de lunos: " + totalAlunos);

	}

}