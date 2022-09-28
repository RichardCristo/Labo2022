public class SensorDeTemperatura extends Sensores{
    SensorDeTemperatura sensorDeTemperatura = new SensorDeTemperatura();

    public void estadoSensorDeTemperatura(){
        if(!sensorDeTemperatura.seDisparoLaAlarma()){
            System.out.println("No se disparo");
        }
        else System.out.println("¡Cuidado! la temperatura sube");
    }

}
