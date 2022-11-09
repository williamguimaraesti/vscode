package pessoa;
public class Pessoa {
    public static void main(String [] args) {
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

    public class Aluno extends Pessoa {
        // atributos
        public Aluno(String nome, String cpf, int idade) {
            super(nome, cpf, idade);
        }

        private int matricula;
        public double tirarCopia;
        int copia;

        public double matricula() {
            return matricula;
        }
        
        public void tirarCopia(){
            if (this.copia() > 0){
                System.out.println("Tirando copia.");
            }else {
                System.out.println("Não está copiando");
            }
        }

        private int copia() {
            return 0;
        }

    }

    public class Professor extends Pessoa {

        public Professor(String nome, String cpf, int idade) {
            super(nome, cpf, idade);
            
        }

    }

    public class Funcionario extends Pessoa {

        public Funcionario(String nome, String cpf, int idade) {
            super(nome, cpf, idade);
            
        }

    
    }
    
}
