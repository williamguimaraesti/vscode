import java.util.Scanner;

class Exer07{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("digite um número:");
			double num1 = scan.nextDouble();
			System.out.println("digite outro número:");
			double num2 = scan.nextDouble();
			System.out.println("digite mais um número:");
			double num3 = scan.nextDouble();

			if (num1 > num2 && num1 > num3) {
				System.out.println("O maior número é: " + num1);
			} else if (num2 > num1 && num2 > num3) {
				System.out.println("O maior número é: " + num2);
			}else {
				System.out.println("O maior número é: " + num3);
			}
			
			if (num1 < num2 && num1 < num3) {
				System.out.println("O maior número é: " + num1);
			} else if (num2 < num1 && num2 < num3) {
				System.out.println("O menor número é: " + num2);
			}else {
				System.out.println("O menor número é: " + num3);

			}

		}
	}
}
