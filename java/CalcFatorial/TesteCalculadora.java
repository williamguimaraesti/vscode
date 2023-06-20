public class TesteCalculadora {
    public static void main(String[] args) {
        int fatorialNR = Calculadora.fatorialNaoRecursivo(6);
        System.out.println(fatorialNR);

        int fatorial = Calculadora.fatorial(6);
        System.out.println(fatorial);
    }
}