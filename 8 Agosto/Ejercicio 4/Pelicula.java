public class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMinimaPermitida;
    private String director;

    public Pelicula(String titulo, int duracion, int edadMinimaPermitida, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinimaPermitida = edadMinimaPermitida;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinimaPermitida() {
        return edadMinimaPermitida;
    }

    public void setEdadMinimaPermitida(int edadMinimaPermitida) {
        this.edadMinimaPermitida = edadMinimaPermitida;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
