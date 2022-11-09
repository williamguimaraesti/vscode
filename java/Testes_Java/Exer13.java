import java.util.Scanner;

class Exer13 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com um dia da semana (1-7)");
			int diasemana = scan.nextInt();
			switch (diasemana) {
				case 1:
					System.out.println("Domingo");
					break;
				case 2:
					System.out.println("Segunda");
					break;
				case 3:
					System.out.println("Terça");
					break;
				case 4:
					System.out.println("Quarta");
					break;
				case 5:
					System.out.println("Quinta");
					break;
				case 6:
					System.out.println("Sexta");
					break;
				case 7:
					System.out.println("Sábado");
					break;
				default:
					System.out.println("Valor inválido");
					break;
			}

		}
	}
}
