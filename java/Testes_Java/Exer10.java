import java.util.Scanner;

class Exer10 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Bom, dia. Em que turno você estuda?");
			System.out.println("Digite: M - Matutino V - Vespertino N - Noturno.");
			/*
			 * String letra = scan.next();
			 * if (letra.equalsIgnoreCase("M")) {
			 * System.out.println("Bom dia.");
			 * } else if (letra.equalsIgnoreCase("V")){
			 * System.out.println("Boa tarde.");
			 * }else if (letra.equalsIgnoreCase("N")){
			 * System.out.println("Boa noite.");
			 * }else{
			 * System.out.println("Valor invalido.");
			 */
			String turno = scan.next();
			switch (turno) {
				case "m":
				case "M":
					System.out.println("Bom dia.");
					break;
				case "v":
				case "V":
					System.out.println("Boa tarde.");
					break;
				case "n":
				case "N":
					System.out.println("Boa noite.");
					break;
				default:
					System.out.println("Valor inválido");
			}
		}
	}
}