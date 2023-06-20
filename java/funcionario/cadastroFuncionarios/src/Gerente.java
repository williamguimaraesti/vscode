public class Gerente extends Funcionario {
    public Gerente(String nome, int cpf, double salario) {
        super(nome, cpf, salario);
    }

    private int senha;

    public boolean autentica(int senha){
        if (this.senha == senha) {
            System.out.println("Acesso Permitido");
            return true;
        } else {
            System.out.println("Acesso Negado");
            return false;
        }
    }
    
}