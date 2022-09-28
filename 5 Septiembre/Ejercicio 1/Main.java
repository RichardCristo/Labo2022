public class Main {
    public static void largoDeUnNombre(String nombre) throws Exception{
        System.out.println("El nombre es: "+nombre.length());
    }
    public static void main(String[] args){
        String nombre = "reale";

        //Bloque try/catch
        /*try{
            System.out.println("El nombre es: "+nombre.length());
        }
        catch (Exception e){
            System.out.println("Valor nulo");
        }*/

        //Throw
       /* try{
            if(nombre == null) {
                throw new Exception("Valor nulo");
            }
            System.out.println("El nombre es: "+nombre.length());
        }
        catch (Exception e){
            System.err.println(e);
        }*/

        //Throws
       /* try{
            largoDeUnNombre(null);
        }
        catch (Exception e){
            System.out.println("Valor nulo");
        }*/

        //Clase personalizada
        Persona p1 = new Persona("");
        p1.setNombre(null);
        try{
            p1.largoDeUnNombre();
        }
        catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }
    }
}
