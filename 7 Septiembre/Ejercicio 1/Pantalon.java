public abstract class Pantalon extends Ropa{
    private double medidaCadera;
    private double medidaCintura;
    private double medidaLargo;

    public Pantalon(double medidaCadera, double medidaCintura, double medidaLargo) {
        this.medidaCadera = medidaCadera;
        this.medidaCintura = medidaCintura;
        this.medidaLargo = medidaLargo;
    }

    public double getMedidaCadera() {
        return medidaCadera;
    }

    public void setMedidaCadera(double medidaCadera) {
        this.medidaCadera = medidaCadera;
    }

    public double getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(double medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public double getMedidaLargo() {
        return medidaLargo;
    }

    public void setMedidaLargo(double medidaLargo) {
        this.medidaLargo = medidaLargo;
    }
}
