import java.util.Scanner;

class Exer01{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número:");
			int num = scan.nextInt();
			System.out.println("Digite o segundo número:");
			int num2 = scan.nextInt();
			if(num>num2){
				System.out.println("O maior número é: " + num);
			}else {
				System.out.println("O maior número é: " + num2);
			}
		}
	}
}
