public class SmartWatch extends SmartDevice {
    boolean contadordepasos;
    boolean sensorcardiaco;
    public SmartWatch(String marca,String modelo,int capacidadbateria,String tipopantalla
            ,String procesador,boolean resistentealagua,int pulgadas,int cantram,boolean contadordepasos,boolean sensorcardiaco){

    }

    public SmartWatch() {

    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "contadordepasos=" + contadordepasos +
                ", sensorcardiaco=" + sensorcardiaco +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadbateria=" + capacidadbateria +
                ", tipopantalla='" + tipopantalla + '\'' +
                ", cantmemoria=" + cantmemoria +
                ", procesador='" + procesador + '\'' +
                ", resistentealagua=" + resistentealagua +
                ", pulgadas=" + pulgadas +
                ", cantram=" + cantram +
                '}';
    }
}
