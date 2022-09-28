import java.util.ArrayList;

public class SensorComplejo extends Sensores{

    public boolean seDisparoElSensorComplejo(){
        ArrayList<Sensores> listaDeSensor = new ArrayList<>();
        double valorTotal = 0;
        double valorMedio = 0;
        int i = 0;
        for(Sensores unSensor : listaDeSensor){
            valorTotal += unSensor.getMedida();
            i++;
        }
        valorMedio = valorTotal / i;
        SensorComplejo unSensorComplejo = new SensorComplejo();
        if(valorMedio > unSensorComplejo.getValorUmbral()) return true;
        else return false;
    }
}
