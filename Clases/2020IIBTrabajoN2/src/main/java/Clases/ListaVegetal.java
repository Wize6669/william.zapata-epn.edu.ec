package Clases;

import java.util.ArrayList;

public class ListaVegetal {
    private ArrayList <Vegetal> lista;
    public ListaVegetal(){
        lista = new ArrayList<Vegetal>();
    }
    
    public void addVegetal(Vegetal vegetal){
        lista.add(vegetal);
    }
    
    @Override
    public String toString() {
        String salida = "";
        for(Vegetal aux: lista)
            salida+=aux + "\n\n";
        return salida;
    } 
}
