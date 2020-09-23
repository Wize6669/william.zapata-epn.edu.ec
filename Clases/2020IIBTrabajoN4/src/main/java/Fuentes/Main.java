package Fuentes;

import Fuentes.Vehiculo;

public class Main {

    public static void main(String[] args) {
       System.out.println("Contador de Vehiculos antes de instanciar vehiculos: "
               +Vehiculo.getVehiculo());
       Vehiculo vehiculo1 = new Vehiculo("Primer");
       Vehiculo vehiculo2 = new Vehiculo("Segundo");
       Vehiculo vehiculo3 = new Vehiculo("Tercer");
       System.out.println("Contador de Vehiculos después de instanciar los 3 vehículos: "
               +Vehiculo.getVehiculo());
       vehiculo1 = null;
       vehiculo2 = null;
       vehiculo3 = null;
       System.gc();//pide que la recoleccion de basura se realice 
       System.out.println("Contador de Vehiculos después de llamar al recolector de basura: "
               +Vehiculo.getVehiculo());
    }
}
