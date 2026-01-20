import java.util.Locale;

public class PercentutalFrequencia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		double nota1 = 80.5;
		double nota2 = 50.8;
		int percentualFreq = 75;

		String media = ((nota1 + nota2) / 2 >= 60.0 && percentualFreq >= 75) ? "Aprovado" : "Reprovado";
		System.out.println(media);

	}
}