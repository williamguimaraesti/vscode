public class Cliente {
    String nome;
    long cpf;
    float salario;
    String endereco;
    public Cliente(String nome, long cpf, float salario, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long ValidaCpf) {
        this.cpf = ValidaCpf;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }   
}