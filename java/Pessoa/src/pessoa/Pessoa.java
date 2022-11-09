package pessoa;
public class Pessoa {
       // atributos
    private String nome;
    private String cpf;
    private int idade;
    
         // Métodos de acesso
    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getcpf() {
        return cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getidade() {
        return idade;
    }
    
}