import java.util.Locale;
import java.util.Scanner;

public class Ler_nota {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double notaSemestre1, notaSemestre2, notaFinal;
		
		notaSemestre1 = sc.nextDouble();
		notaSemestre2 = sc.nextDouble();
		notaFinal = notaSemestre1 + notaSemestre2;
		
		System.out.println(notaFinal);
		if (notaFinal < 60.0) {
			System.out.println("REPROVADO");
		}
		else {
			System.out.println("APROVADO");
		}		
		
		sc.close();

	}

}
