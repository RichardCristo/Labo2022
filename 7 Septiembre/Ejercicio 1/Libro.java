public abstract class Libro extends Libreria implements InterfazPrestable{
    private int cantidadDePaginasPorCapitulo;

    public Libro(int cantidadDePaginasPorCapitulo) {
        this.cantidadDePaginasPorCapitulo = cantidadDePaginasPorCapitulo;
    }

    public int getCantidadDePaginasPorCapitulo() {
        return cantidadDePaginasPorCapitulo;
    }

    public void setCantidadDePaginasPorCapitulo(int cantidadDePaginasPorCapitulo) {
        this.cantidadDePaginasPorCapitulo = cantidadDePaginasPorCapitulo;
    }

    @Override
    public boolean prestar(){
        if(this.cantidadDePaginasPorCapitulo % 2 != 0) return true;
        else return false;
    }

    @Override
    public void agregarElemento(){
        if(!prestar()) System.out.println("El articulo no puede entrar a nuestro sistema");
        else System.out.println("El articulo puede entrar a nuestro sistema");
    }

}
