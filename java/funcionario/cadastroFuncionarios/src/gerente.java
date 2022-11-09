public class gerente extends funcionario {
    public gerente(String nome, int cpf, double salario) {
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