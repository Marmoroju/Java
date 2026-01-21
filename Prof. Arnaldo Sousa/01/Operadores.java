public class Operadores {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;
		boolean c = true;


		// aritiméticos
		System.out.println("Aritméticos");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println();

		// comparação
		System.out.println("Comparação");
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println();

		// lógico
		// && IGUAL
		// || OU
		// ! NÃO

		System.out.println("Lógico");
		System.out.println(a < b && c);
		System.out.println(a > b || c);
		System.out.println(!c);
		System.out.println();

		// atribuição
		// = += -= *= /= %=

		a += 2;
		System.out.println("Atribuição");
		System.out.println(a);
		System.out.println();

		// unários
		// ++ -- + - !
		a ++;
		System.out.println("Unários");
		System.out.println(a);
		System.out.println();
		
		System.out.println("Precedencia");
		int d = 10;
		int e = ++d; // a = a + 1;
		// Primeiro será calculada a operação de unário
		// o operador unário pode ser adiconado antes ou depois da declaração
		// isso influencia o valor que a variável irá receber, inclusive a operação.
		System.out.println("Valor de d = " + d);
		System.out.println("Valor de e = " + e);

	}
}