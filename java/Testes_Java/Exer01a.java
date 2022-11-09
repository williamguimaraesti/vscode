import java.util.Scanner;

class Exer01a{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número:");
			float num = scan.nextFloat();
			System.out.println("Digite o segundo número:");
			float num2 = scan.nextFloat();
			if(num>num2){
				System.out.println("O maior número é: " + num);
			}else {
				System.out.println("O maior número é: " + num2);
			}
		}
	}
}
