import java.util.Date;

public abstract class Revista extends Libreria implements InterfazPrestable{
    private Date fechaDePublicacion;

    public Revista(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    @Override
    public boolean prestar(){
        Date fechaActual = new Date(2022,9,27);
        if(this.fechaDePublicacion.compareTo(fechaActual) < 0) return false;
        else return true;
    }

    @Override
    public void agregarElemento(){
        if(!prestar()) System.out.println("El articulo no puede entrar a nuestro sistema");
        else System.out.println("El articulo puede entrar a nuestro sistema");
    }
}
