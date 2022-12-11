import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numero; 
        int fatorial = 1; 
        int escolha = 1;
        System.out.println("##############################################################################\nNão é possível calcular o fatorial de números negativos.\nInsira um número maior ou igual a zero para descobrir seu respectivo Fatorial:\n##############################################################################");

        while (escolha != 2) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o número que deseja saber o fatorial: ");
            numero = teclado.nextInt();
            for (int i = numero; i > 1; i--) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + "!é:" + fatorial);  
            System.out.println("Deseja efetuar outra operação?\nDigite:\n1-Sim\n2-Não");
            escolha = teclado.nextInt(); 
        }
        System.out.println("Obrigado.");
        
    }
}

/*
 * DevMedia.com.br
 * O fatorial de um número n (n pertence ao conjunto dos números naturais) é
 * sempre o produto de todos os seus antecessores, incluindo si próprio e excluindo o zero.
 * cript
 * A representação é feita pelo número fatorial seguido do sinal de exclamação, n!.
 * 
 * Exemplo de número fatorial: 6! = 6 . 5 . 4 . 3 . 2 . 1 = 720
 * 
 * Importante: n >= 0 (n maior ou igual a zero) , ou seja, não existe fatorial
 * para números negativos.
 * 
 * O fatorial de 0 ( 0! ) é 1, pois o produto de número nenhum é 1.
 * 
 * O numero fatorial pode ser modificado para outras formas:
 * 
 * n! = n . (n-1) . (n-2) . (n-3)!
 * 
 * exemplo: 6! = 6 . (6-1) . (6-2) . (6-3)!
 * 6! = 6 . 5 . 4 . 3! 6! = 120 . 3!
 * 6! = 120 . 3 . (3-1) . (3-2)!
 * 6! = 120 . 3 . 2 . 1!
 * 6! = 120 . 6 = 720
 */