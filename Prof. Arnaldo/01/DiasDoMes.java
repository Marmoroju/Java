public class DiasDoMes {

	public static void main(String[] args) {

		String mes = "Junho";

		String diasDoMes = switch (mes) {
		case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> "O número de dias é 31";
		case "Abril", "Junho", "Setembro", "Novembro" -> "O número de dias é 30";
		case "Fevereiro" -> "O número de dias é 28";
		default -> "Desconhecido";

		};
		System.out.println(diasDoMes);

	}


}