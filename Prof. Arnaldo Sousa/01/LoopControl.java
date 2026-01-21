public class LoopControl {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i == 5) {

				break; // Sai do loop quando i é igual a 5
				//continue; // Pula fora a iteração quando i = 5
			}

			System.out.println(i);

		}

	}

}