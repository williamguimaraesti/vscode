public class MetodosConta {
    float depositar;
    float sacar;
    float transferir;
    float pagar;
    
    public MetodosConta(float depositar, float sacar, float transferir, float pagar) {
        this.depositar = depositar;
        this.sacar = sacar;
        this.transferir = transferir;
        this.pagar = pagar;
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
        this.sacar = sacar;
    }

    public float getTransferir() {
        return transferir;
    }

    public void setTransferir(float transferir) {
        this.transferir = transferir;
    }

    public float getPagar() {
        return pagar;
    }

    public void setPagar(float pagar) {
        this.pagar = pagar;
    }   
}