public class AprendenedoIfElse {
    public static void main(String[] args) {
        int idade = 73;
        if (idade <=17) {
            System.out.println("Você é menor de idade");
        } else if(idade >= 18 && idade <=59){
            System.out.println("Você é adulto");
        }else {
            System.out.println("Você é velho");
        }
    }
}
