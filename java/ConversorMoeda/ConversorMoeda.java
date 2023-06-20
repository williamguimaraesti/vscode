package questaoSeis;

public class ConversorMoeda {
    private float dolar;
    private float euro;
    private float libra;

    public float convDolar (float real){
        return real * dolar;
    }

    public float convEuro (float real){
        return real * euro;
    }

    public float convLibra (float real){
        return real * libra;
    }


    public void setDolar (float dolar){
        this.dolar = dolar;
    }

    public float getDolar(){
        return dolar;
    }

    public void setEuro (float euro){
        this.euro = euro;
    }

    public float geteuro(){
        return euro;
    }

    public void setLibra (float libra){
        this.libra = libra;
    }

    public float getLibra(){
        return libra;
    }
}
