public abstract class Remera extends Ropa{
    private double medidaEspalda;
    private double medidaContorno;
    private double medidaLargoDelTorso;

    public Remera(double medidaEspalda, double medidaContorno, double medidaLargoDelTorso) {
        this.medidaEspalda = medidaEspalda;
        this.medidaContorno = medidaContorno;
        this.medidaLargoDelTorso = medidaLargoDelTorso;
    }

    public double getMedidaEspalda() {
        return medidaEspalda;
    }

    public void setMedidaEspalda(double medidaEspalda) {
        this.medidaEspalda = medidaEspalda;
    }

    public double getMedidaContorno() {
        return medidaContorno;
    }

    public void setMedidaContorno(double medidaContorno) {
        this.medidaContorno = medidaContorno;
    }

    public double getMedidaLargoDelTorso() {
        return medidaLargoDelTorso;
    }

    public void setMedidaLargoDelTorso(double medidaLargoDelTorso) {
        this.medidaLargoDelTorso = medidaLargoDelTorso;
    }
}
