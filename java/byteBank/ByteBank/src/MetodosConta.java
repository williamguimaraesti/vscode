public class MetodosConta {
    float depositar;
    float sacar;
    float transferir;
    float pagar;
    private float saldo;
    
    public MetodosConta(float depositar, float sacar, float transferir, float pagar) {
        this.depositar  = depositar;
        this.sacar      = sacar;
        this.transferir = transferir;
        this.pagar      = pagar;
    }

    public float getDepositar() {
        return depositar;
    }

    public void setDepositar(float depositar) {
        this.depositar = depositar;
    }

    public float getSacar() {
        return sacar;
    }

    public void setSacar(float sacar) {
        if (this.saldo >= this.sacar) {
            System.out.println("Saque liberado.");
        } else {
            System.out.println("Saldo insuficiente na conta para realizar esta operação.");
        }
    }

    public float getTransferir() {
        return transferir;
    }

    public void setTransferir(float transferir) {
        if (this.saldo >= this.transferir) {
            System.out.println("Transferencia autorizada.");
        } else {
            System.out.println("Saldo insuficiente na conta para realizar esta operação.");
        }
    }

    public float getPagar() {
        return pagar;
    }

    public void setPagar(float pagar) {
        if (this.saldo >= this.pagar) {
            System.out.println("Pagamento realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente na conta para realizar esta operação.");
        }
    }   
}