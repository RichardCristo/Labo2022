public class Persona extends Exception{
    private String nombre;

    public Persona(String mensaje){
        super(mensaje);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void largoDeUnNombre() throws Exception{
        if(this.nombre == null) throw new Persona("valor nulo");
        else System.out.println(this.nombre);
    }
}
