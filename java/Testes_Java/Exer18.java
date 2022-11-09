import java.util.Scanner;

class Exer18{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite u número");
			int num = scan.nextInt();

			if (num %2 == 0){
				System.out.println("Par");
			}else{
				System.out.println("Impar");
			}
		}
	}
}
