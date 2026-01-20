import java.util.Locale;
import java.util.Scanner;

public class Repeticao_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int count = 0;
		
		while (idade >= 0) {
			soma += idade;
			count += 1;
			
			idade = sc.nextInt();
		}
		
		if (count > 0) {
			double media = (double) soma / count;
			System.out.printf("%.2f %n", media);
		}
		else {
			System.out.println("Impossível de calcular.");
		}
		
		sc.close();

	}

}
