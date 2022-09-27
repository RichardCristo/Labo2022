public abstract class Ropa implements InterfazPrestable{
    private String color;
    private String material;
    private String marca;
    private boolean estado;

    public Ropa() {
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public boolean prestar(){
        if(!estado) return false;
        else return true;
    }

    @Override
    public void agregarElemento(){
        if(!prestar()) System.out.println("El articulo no puede ingresar a nuestro sistema");
        else System.out.println("El articulo puede ingresar a nuestro sistema");
    }

}
