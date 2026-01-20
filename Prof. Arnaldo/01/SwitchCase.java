public class SwitchCase {

	public static void main(String[] args) {

		int day = 3;

		switch(day) {

		case 1 -> System.out.println("Segunda");

		case 2 -> System.out.println("Terça");

		case 3 -> System.out.println("Quarta");

		// ..

		default -> System.out.println("Desconhecido");
		}


		// Switch Expression

		String dia = "Terc.";

		String tipoDeDia = switch (dia) {
			case "Seg.", "Terc.", "Qua.", "Qui.", "Sex." -> "Dia util";
			case "Sábado", "Domingo" -> "Fim de Semana";
			default -> "Desconhecido";
		};
		System.out.println(tipoDeDia);

	}
}