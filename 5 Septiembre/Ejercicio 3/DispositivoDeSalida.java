public class DispositivoDeSalida extends Componente{
    private String tipo;
    private String puertoValido;
    private String metodoImpresion;

    public DispositivoDeSalida(String tipo, String puertoValido, String metodoImpresion) {
        this.tipo = tipo;
        this.puertoValido = puertoValido;
        this.metodoImpresion = metodoImpresion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPuertoValido() {
        return puertoValido;
    }

    public void setPuertoValido(String puertoValido) {
        this.puertoValido = puertoValido;
    }

    public String getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(String metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
