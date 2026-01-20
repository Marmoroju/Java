import java.util.Locale;
import java.util.Scanner;

public class Eq_seg_grau {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a, b, c, x1, x2, delta;
		
		System.out.println("Informe o valor de a");
		a = sc.nextDouble();
		
		System.out.println("Informe o valor de b");
		b = sc.nextDouble();
		
		System.out.println("Informe o valor de c");
		c = sc.nextDouble();
		
		
		delta = b * b - 4.0 * a * c;
		
		if (a == 0 || delta < 0.0) {
			System.out.println("Impossível Calcular");
		}
		else {
			x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("x1 = %.5f %n", x1);
			System.out.printf("x2 = %.5f %n", x2);
		}
		
		
		sc.close();

	}

}
