import java.util.Scanner;

class Exer17{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um ano");
			int ano = scan.nextInt();
			if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
				System.out.println("Ano bissexto.");
			} else {
				System.out.println("Não é ano bissexto.");

			}
		}
	}
}
