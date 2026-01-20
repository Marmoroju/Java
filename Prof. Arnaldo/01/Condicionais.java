public class Condicionais {

	public static void main(String[] args) {

		/*int a = 10;
		int b = 5;

		if (a > b) {
			System.out.println("a é maior que " + b);		
		}
		else {
			System.out.println("a é menor que " + b);
		}
		System.out.println();

;

		// instance of
		System.out.println("InstanceOf");
		Object obj = "Hello";
		if (obj instanceof String) {
			System.out.println(obj);			
		}
		System.out.println();

		// operação ternária
		// variável = (condicao) ? "valorSeVerdadeiro" : valorSeFalso;
		System.out.println("Condição Ternária");
		String resultado = (a > b) ? "Maior" : "Menor";
		System.out.println(resultado);
		System.out.println()*/

		// Par ou ímpar
		int numero = 13;
		String parOuImpar = (numero % 2 == 0) ? "Par" : "Ímpar";
		System.out.println(parOuImpar);
	}
}