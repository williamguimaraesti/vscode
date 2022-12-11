package questaoSeis;
import java.util.Scanner;

public class Converte{
    public static void main(String[] args) {
        float real;
        int cotacao, escolha = 1;

        Scanner teclado = new Scanner(System.in);

        ConversorMoeda valor = new ConversorMoeda();
        valor.setDolar (5.27f);
        valor.setEuro  (5.27f);
        valor.setLibra (5.27f);

        while(escolha != 2){
            System.out.println("Para qual Moeda deseja realizar uma conversão\n1-Dólar\n2-Euro\n3-Libra\n");
            cotacao = teclado.nextInt();

            if (cotacao == 1) {
                System.out.println("Digite o valor a ser convertido:");
                real = teclado.nextFloat();
                System.out.println("O valor em dólar:US$" + valor.convDolar(real));
            } else if (cotacao == 2) {
                System.out.println("Digite o valor a ser convertido:");
                real = teclado.nextFloat();
                System.out.println("O valor em euro:€" + valor.convEuro(real));
            } else if (cotacao == 3) {
                System.out.println("Digite o valor a ser convertido:");
                real = teclado.nextFloat();
                System.out.println("O valor em libra:£" + valor.convLibra(real));
            } else {
                System.out.println("Por favor escolha uma opção valida.");
            }  
            System.out.println("Deseja realizar mais uma conversão de moeda?\n1-Sim ou 2-Não"); 
            escolha = teclado.nextInt();                  
        }
        System.out.println("Obrigado.");
        teclado.close();
    }
}

