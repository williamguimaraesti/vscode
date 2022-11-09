public class Cliente {
    private String nome;
    private int cpf;


    public funcionario(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getcpf() {
        return cpf;
    }


    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
}
