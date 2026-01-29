public class SomaNumero {

	public static void main(String[] args) {

		int[] numeros = new int[1000];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}


		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}

		System.out.println("A soma dos números de 1 a 1000 é: " + soma);
	}

}