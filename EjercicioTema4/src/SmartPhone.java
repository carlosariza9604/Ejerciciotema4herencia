public class SmartPhone extends SmartDevice {
    boolean plug;
    int cantmegapixeles;

    public SmartPhone(){
}
    public SmartPhone(String marca,String modelo,int capacidadbateria,String tipopantalla
                      ,String procesador,boolean resistentealagua,int pulgadas,int cantram,boolean plug,int cantmegapixeles){
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "plug=" + plug +
                ", cantmegapixeles=" + cantmegapixeles +
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
