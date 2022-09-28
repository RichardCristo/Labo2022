public abstract class Escrito extends Examen implements Aprobado{
    private int duracion;
    private double notaNumerica;

    public Escrito(int duracion, double notaNumerica) {
        this.duracion = duracion;
        this.notaNumerica = notaNumerica;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getNotaNumerica() {
        return notaNumerica;
    }

    public void setNotaNumerica(double notaNumerica) {
        this.notaNumerica = notaNumerica;
    }

    @Override
    public boolean aprobado(){
        if(this.duracion < 90 && this.notaNumerica > 6) return true;
        else return false;
    }
}
