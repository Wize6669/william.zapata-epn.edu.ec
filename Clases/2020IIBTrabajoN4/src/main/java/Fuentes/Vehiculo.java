package Fuentes;

import javax.swing.JOptionPane;

public class Vehiculo {
    private String marca;
    private String numPlaca;
    private String modelo;
    private static int vehiculo;

    public Vehiculo(String carro) {
        super();
        marca = JOptionPane.showInputDialog("Ingrese la Marca del Vehículo")
                +" "+carro+" "+"vehículo";
        modelo = JOptionPane.showInputDialog("Ingrese el Modelo del Vehículo")
                +" "+carro+" "+"vehículo";
        numPlaca = JOptionPane.showInputDialog("Ingrese el número de placa del Vehículo")
                +" "+carro+" "+"vehículo";
        vehiculo++;
        System.out.printf("Información:%s %s %s ; Vehículo %d \n",marca,modelo,numPlaca,vehiculo);   
    }
    
    protected void termine() {
        vehiculo++;
        System.out.printf("Finalizador del Vehículo:%s %s %s ; Vehículo %d \n",marca,modelo,numPlaca,vehiculo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }
   
    public static int getVehiculo() {
        return vehiculo;
    }

    public static void setVehiculo(int vehiculo) {
        Vehiculo.vehiculo = vehiculo;
    }
}
