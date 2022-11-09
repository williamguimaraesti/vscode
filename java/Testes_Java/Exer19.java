import java.util.Scanner;

class Exer19 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com primeiro número:");
			int num1 = scan.nextInt();
			System.out.println("Entre com segundo número:");
			int num2 = scan.nextInt();
			System.out.println("Qual operação (+ - / *):");
			String operacao = scan.next();

			double resultado = 0;
			boolean valida = true;
			switch (operacao) {
				case "+":
					resultado = num1 + num2;
					break;
				case "-":
					resultado = num1 - num2;
					break;
				case "/":
					resultado = num1 / num2;
					break;
				case "*":
					resultado = num1 * num2;
					break;
				default:
					System.out.println("Operação inválida");
					valida = false;
			}

			if (valida) {
				System.out.println("Resultado" + resultado);

				if (resultado >= 0) {
					System.out.println("Resultado positivo");

				} else {
					System.out.println("Resultado negativo");
				}

				if (resultado % 2 == 0) {
					System.out.println("Resultado par");
				} else {
					System.out.println("Resultado ímpar");
				}
			}

		}
	}
}
