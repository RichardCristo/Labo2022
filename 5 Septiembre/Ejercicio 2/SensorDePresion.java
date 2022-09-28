public class SensorDePresion extends Sensores{
    SensorDePresion sensorDePresion = new SensorDePresion();

    public void estadoSensorDePresion(){
        if(!sensorDePresion.seDisparoLaAlarma()){
            System.out.println("No se disparo");
        }
        else System.out.println("Sensor de presion activado");
    }
}
