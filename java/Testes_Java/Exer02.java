import java.util.Scanner;

class Exer02{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um valor:");
			int valor = scan.nextInt();
			if (valor >=0) {
				System.out.println("Valor positivo.");
			} else{
				System.out.println("Valor negativo.");
			}
		}
	}
}
