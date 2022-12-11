import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        int escolha = 1;
        while (escolha != 2) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int num = teclado.nextInt();
            for (int i = 1; i < 100; i++) {
                if (i % num == 0) {
                    System.out.println(i);
                }
            }
            System.out.println("Deseja efetuar outra operação?\n Digite:1-Sim\n2-Não");
            escolha = teclado.nextInt();
        }
        System.out.println("Obrigado.");
    }
}