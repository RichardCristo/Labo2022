import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Ingresar un numero");
        int n1;
        Scanner ingreso1 = new Scanner(System.in);
        n1 = ingreso1.nextInt();

        NumeroExcepcion ej = new NumeroExcepcion("");
        ej.setNumero(n1);
        try{
           ej.numeroValido();
        }
        catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }
    }
}
