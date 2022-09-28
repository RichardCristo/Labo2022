public class NumeroExcepcion extends Exception {
    private int numero;

    public NumeroExcepcion(String mensaje) {
        super(mensaje);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void numeroValido() throws Exception {
        if (this.numero > 4) throw new NumeroExcepcion("valor nulo");
        else {
            switch (this.numero) {
                case 1:
                    System.out.println("Sensor de Temperatura");
                case 2:
                    System.out.println("Sensor de Presion");
                case 3:
                    System.out.println("Detector de humo");
                case 4:
                    System.out.println("Sensor complejo");
            }
        }
    }
}
