import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private int telefono;
    private String metodoPago;
    private Tarjeta tarjeta1;

    public Cliente(String nombre, String apellido, int telefono, String metodoPago, Tarjeta tarjeta1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.metodoPago = metodoPago;
        this.tarjeta1 = tarjeta1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Tarjeta getTarjeta1() {
        return tarjeta1;
    }

    public void setTarjeta1(Tarjeta tarjeta1) {
        this.tarjeta1 = tarjeta1;
    }

    public void hacerCompra(){
        ArrayList<Componente> listaComponente = new ArrayList<>();
        Compra unaCompra =new Compra(this, listaComponente);
    }
}
