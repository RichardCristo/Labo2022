public class DetectorDeHumo extends Sensores{
    DetectorDeHumo detectorDeHumo = new DetectorDeHumo();

    public void estadoDectectorDeHumo(){
        if(!detectorDeHumo.seDisparoLaAlarma()){
            System.out.println("No se disparo");
        }
        else System.out.println("Llamando a los bombreos");
    }
}
