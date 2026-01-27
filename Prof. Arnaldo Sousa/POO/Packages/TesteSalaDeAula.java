import packagess.SalaDeAula;

public class TesteSalaDeAula {

	public static void main(String[] args) {

		SalaDeAula sala1 = new SalaDeAula();
		SalaDeAula sala2 = new SalaDeAula();
		SalaDeAula sala3 = new SalaDeAula();


		SalaDeAula.addAluno(10);
		SalaDeAula.addAluno(15);
		SalaDeAula.addAluno(20);

		SalaDeAula.exibirTotalAlunos();

	}
}