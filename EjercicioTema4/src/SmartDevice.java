public class SmartDevice {
  String marca;
  String modelo;
  int capacidadbateria;
  String tipopantalla;

  int cantmemoria;
  String procesador;
  boolean resistentealagua;
  int pulgadas;
  int cantram;

  public SmartDevice(){
  }
   public SmartDevice(String marca,String modelo,int capacidadbateria,String tipopantalla,
                      String procesador,boolean resistentealagua,int pulgadas,int cantram)

   {
       this.marca = marca;
       this.modelo = modelo;
       this.capacidadbateria = capacidadbateria;
       this.tipopantalla = tipopantalla;
       this.procesador= procesador;
       this.resistentealagua= resistentealagua;
       this.pulgadas=pulgadas;
       this.cantram=cantram;

   }
}
