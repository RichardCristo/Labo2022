import static java.lang.Math.sqrt;

public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double determinante(){
        double determinante = this.b * this.b - 4 * this.a * this.c;
        return determinante;
    }

    public void raices(){
        if(determinante() >= 0) {
            double raiz1 = (this.b * -1 + sqrt(determinante())) / 2 * this.a;
            double raiz2 = (this.b * -1 - sqrt(determinante())) / 2 * this.a;
            System.out.println("x1 = " + raiz1 + " x2 = " + raiz2);
        }
        else System.out.println("ABSURDO");
    }

    public static void main(String[] args) {
       EcuacionSegundoGrado anashe = new EcuacionSegundoGrado(2,12,6);
       anashe.raices();
    }
}
