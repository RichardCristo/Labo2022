import java.util.ArrayList;

public class Sensores {
    private boolean estado;
    private double medida;
    private double valorUmbral;
    private int añoEnQueSeAdquirio;

    public Sensores() {
        this.estado = estado;
        this.medida = medida;
        this.valorUmbral = 5;
        this.añoEnQueSeAdquirio = añoEnQueSeAdquirio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public double getValorUmbral() {
        return valorUmbral;
    }

    public void setValorUmbral(double valorUmbral) {
        this.valorUmbral = valorUmbral;
    }

    public int getAñoEnQueSeAdquirio() {
        return añoEnQueSeAdquirio;
    }

    public void setAñoEnQueSeAdquirio(int añoEnQueSeAdquirio) {
        this.añoEnQueSeAdquirio = añoEnQueSeAdquirio;
    }

    public boolean seDisparoLaAlarma(){
        boolean seDisparo = true;
        ArrayList<Sensores> listaDeSensores = new ArrayList<>();
        for(Sensores unSensor : listaDeSensores){
            if(unSensor.getMedida() >= unSensor.getValorUmbral()){
               seDisparo = true;
            }
            else seDisparo = false;
        }
        return seDisparo;
    }
}
