public class AplicarContinueBreak {

	public static void main(String[] args) {

		int codigoDeSaida = 9;

		for (int i = 1; i <= 10; i++) {

			
			//String carteirinha = (i == 3 || i == 7 || i == 10) ? "Aceita" : "Não aceita";
			
			String carteirinha = switch (i) {
			case 3, 7, 10 -> "Aceita";
			default -> "Não aceita";
			};
			
			System.out.println("Carteirinha com final "+ i  + ": " + carteirinha);

		}
	}


}