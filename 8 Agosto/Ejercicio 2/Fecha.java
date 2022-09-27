public class Fecha {
    private int dia;
    private int  mes;
    private int año;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Fecha(){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public boolean verificacionFecha(){
      Fecha fecha1 = new Fecha();

        if(fecha1.getDia() < 32 && fecha1.getMes() < 13 && fecha1.getAño() > 0 ){
           if(fecha1.getMes() == 4 || fecha1.getMes() == 6 || fecha1.getMes() == 9 || fecha1.getMes() == 11){
              if(fecha1.getDia() > 30){
                  return false;
              }
              else return true;
           }
           if(fecha1.getMes() == 1 || fecha1.getMes() == 3 || fecha1.getMes() == 5 || fecha1.getMes() == 7 || fecha1.getMes() == 8 || fecha1.getMes() == 10 || fecha1.getMes() == 12) {
               if(fecha1.getDia() > 31){
                   return false;
               }
               else return true;
           }
        }
    }
}
