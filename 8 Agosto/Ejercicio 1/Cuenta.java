import java.util.Scanner;

public class Cuenta {
    private String nombre;
    private int numeroCuenta;
    private int tipoInteres;
    private float saldoDisponible;

    public Cuenta(){
        this.nombre = "Juan";
        this.numeroCuenta = 1;
        this.tipoInteres = 10;
        this.saldoDisponible = 15000;
    }

    public Cuenta(String nombre, int numeroCuenta, int tipoInteres, float saldoDisponible) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldoDisponible = saldoDisponible;
    }

    public Cuenta(float saldoDisponible) {
        this.nombre = "Juan";
        this.numeroCuenta = 1;
        this.tipoInteres = 10;
        this.saldoDisponible = saldoDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getTipoInteres() {
        return tipoInteres;
    }

    public float getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoInteres(int tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public void setSaldoDisponible(float saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void ingresarDinero(){
        System.out.println("Su saldo actual es: " + this.getSaldoDisponible());
        System.out.println("Cuanta plata quiere ingresar?");
        float fufu;
        Scanner ingreso1 = new Scanner(System.in);
        fufu = ingreso1.nextFloat();
        float saldoNuevo = this.getSaldoDisponible() + fufu;
        this.setSaldoDisponible(saldoNuevo);
        System.out.println("Su saldo actual es: " + this.getSaldoDisponible());
    }

    public  void retirarDinero(){
        if(this.getSaldoDisponible() > 0) {
            System.out.println("Su saldo actual es: " + this.getSaldoDisponible());
            System.out.println("Cuanta plata quiere retirar?");
            float fufu;
            Scanner ingreso1 = new Scanner(System.in);
            fufu = ingreso1.nextFloat();
            float saldoNuevo = this.getSaldoDisponible() - fufu;
            if(saldoNuevo < 0) System.out.println("ERROR TRANSACCIÓN");
            else {
                this.setSaldoDisponible(saldoNuevo);
                System.out.println("Su saldo actual es: " + this.getSaldoDisponible());
            }

        }

    }

    public void transferirDinero(){
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        System.out.println("Ingrese su numero de cuenta");
        int fofo;
        Scanner ingreso1 = new Scanner(System.in);
        fofo = ingreso1.nextInt();
        c1.setNumeroCuenta(fofo);
        System.out.println("Ingrese el numero de cuenta al que desea trasferirle");
        int fufu;
        Scanner ingreso2 = new Scanner(System.in);
        fufu = ingreso2.nextInt();
        c2.setNumeroCuenta(fufu);
        System.out.println("Cuanto desea transferir?");
        float fafa;
        Scanner ingreso3 = new Scanner(System.in);
        fafa = ingreso3.nextFloat();
        float saldoNuevo = c1.getSaldoDisponible() - fafa;
        c1.setSaldoDisponible(saldoNuevo);
        c2.setSaldoDisponible(c2.getSaldoDisponible() + fafa);
        System.out.println("Nuevo saldo disponible $" + c1.getSaldoDisponible());
        System.out.println("Saldo cuenta 2 " + c2.getSaldoDisponible());

    }

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.ingresarDinero();
        c1.retirarDinero();
        c1.transferirDinero();
    }
}
