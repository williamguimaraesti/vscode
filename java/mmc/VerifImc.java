package mmc;

import java.util.Scanner;

public class VerifImc {

    public static void main(String a[]) {
        try (Scanner teclado = new Scanner(System.in)) {
            Imc p1 = new Imc();
            Imc p2 = new Imc();

            System.out.println("###########Vamos verificar e comparar os resultado####################");
            System.out.println("Digite o nome da primeira pessoa: ");
            p1.setNome(teclado.nextLine());
            System.out.println("Digite seu peso (kg): ");
            p1.setPeso(teclado.nextFloat());
            System.out.println("Digite sua altura: ");
            p1.setAltura(teclado.nextFloat());
            teclado.nextLine();

            System.out.println(" ");

            System.out.println("Digite o nome da segunda pessoa:");
            p2.setNome(teclado.nextLine());
            System.out.println("Digite seu peso (kg): ");
            p2.setPeso(teclado.nextFloat());
            System.out.println("Digite sua altura: ");
            p2.setAltura(teclado.nextFloat());

            System.out.println("#############################################");
            System.out.printf("IMC de " + p1.getNome() + " = %.1f - %s\n",
                    p1.calcularIMC(), p1.classificarIMC());

            System.out.println("#############################################");

            System.out.printf("IMC de " + p2.getNome() + " = %.1f - %s\n",
                    p2.calcularIMC(), p2.classificarIMC());
            System.out.println("#############################################");

            if (p1.calcularIMC() > p2.calcularIMC()) {
                System.out.println(p1.getNome() + "\" tem Maior IMC");
            } else {
                System.out.println(p2.getNome() + "\" tem Maior IMC");
            }
        }
    }
}