import java.util.Locale;

public class VerificaAprovacaoNota {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		double nota1 = 40.5;
		double nota2 = 50.8;

		String media = ((nota1 + nota2) / 2 >= 60.0) ? "Aprovado" : "Reprovado";
		System.out.println(media);

	}
}