package tiposprimitivos;
import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = teclado.nextLine();
            System.out.print("Digite sua nota: ");
            float nota = teclado.nextFloat();
            System.out.println("Sua primeira de " + nome + " nota é:" + nota);
            System.out.printf("Sua primeira de %s nota é:%.2f \n", nome, nota);
            System.out.format("Sua primeira de %s nota é:%.2f \n", nome, nota);
        }
        

    }
    
}
