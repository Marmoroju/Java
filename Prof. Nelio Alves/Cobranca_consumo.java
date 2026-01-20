import java.util.Scanner;

public class Cobranca_consumo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int planoBasico, minuto, franquia, excedido;
		
		planoBasico = 50;
		franquia = 100;
		
		System.out.println("Informe o tempo de consumo em minuto.");
		minuto = sc.nextInt();
		
		if (minuto < franquia) {
			System.out.println("Valor a pagar: R$ " + planoBasico);
		}
		else {
			excedido = ((minuto - franquia) * 2) + planoBasico;
			System.out.println("Valor a pagar: R$ " + excedido);
		}
		
		sc.close();

	}

}
