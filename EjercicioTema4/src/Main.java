//En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

       // Agregaréis atributos tal cual tendrían esos objetos en la realidad.

       // Crear constructor vacío y con todos los parámetros para cada clase.

       // Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.

public class Main {
    public static void main(String[] args) {
        SmartPhone xiaomi= new SmartPhone();
             xiaomi.marca="xiaomi";
             xiaomi.modelo="redmi10";
             xiaomi.capacidadbateria=1500;
             xiaomi.tipopantalla="oled";
             xiaomi.cantmemoria=128;
             xiaomi.procesador="snapdragon";
             xiaomi.resistentealagua=false;
             xiaomi.pulgadas=7;
             xiaomi.cantram=4;
             xiaomi.plug=true;
             xiaomi.cantmegapixeles=48;
        System.out.println(xiaomi);

        SmartWatch smartwach6= new SmartWatch();
        smartwach6.marca="smart";
        smartwach6.modelo="mi8";
        smartwach6.capacidadbateria=400;
        smartwach6.tipopantalla="led";
        smartwach6.cantmemoria=8;
        smartwach6.procesador="Exynos";
        smartwach6.resistentealagua=false;
        smartwach6.pulgadas=3;
        smartwach6.cantram=2;
        smartwach6.contadordepasos=true;
        smartwach6.sensorcardiaco=true;
        System.out.println(smartwach6);
    }
}