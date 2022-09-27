public class DispositivoDeEntrada extends Componente {
    private String tipo;
    private String tipoConector;
    private String puertosValidos;

    public DispositivoDeEntrada(String tipo, String tipoConector, String puertosValidos) {
        this.tipo = tipo;
        this.tipoConector = tipoConector;
        this.puertosValidos = puertosValidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public String getPuertosValidos() {
        return puertosValidos;
    }

    public void setPuertosValidos(String puertosValidos) {
        this.puertosValidos = puertosValidos;
    }
}

