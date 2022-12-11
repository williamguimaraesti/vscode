package questaoNove;

public class BaseCalcSalario{
    private int nhtd;
    private float vht;
    private int ndm;

    public float salario(){
        return (float) (nhtd * vht)*ndm;
    }

        public int getNhtd(){
            return this.nhtd;
        }

        public void setNhtd (int nhtd){
            this.nhtd = nhtd;
        }

        public float getVht(){
            return this.vht;
        }
        public void setVht (float vht){
            this.vht = vht;
        }

        public int getNdm(){
            return this.ndm;
        }

        public void setNdm (int ndm){
            this.ndm = ndm;
        }
}