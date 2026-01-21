public class SomaIntPositivo {

	public static void main(String[] args) {

		int numero = 10;
		int i = 1;
		int soma = 0;

		do {
			soma += i;
			i++;
		} while (i <= numero);

		System.out.println("Soma = " + soma);

	}


}