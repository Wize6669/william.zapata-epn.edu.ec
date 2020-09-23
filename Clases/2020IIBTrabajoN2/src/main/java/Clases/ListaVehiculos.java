package Clases;

import java.util.ArrayList;

public class ListaVehiculos {
    private ArrayList <Vehiculo> lista;
    
    public ListaVehiculos(){
        lista = new ArrayList<Vehiculo>();
    } 
    
    public void addVehiculo(Vehiculo vehiculo){
        lista.add(vehiculo);
    }

    @Override
    public String toString() {
        String salida = "";
        for(Vehiculo aux: lista)
            salida+=aux + "\n\n";
        return salida;
    } 
}
