package Fuentes;

import java.util.ArrayList;

public class ListaHumanos {
    private ArrayList<Humano> lista;

    public ListaHumanos() {
        lista = new ArrayList<Humano>();
    }
    
    public void addHumano(Humano humano) {
        lista.add(humano);
    }

    @Override
    public String toString() {
        String salida = "";
        for(Humano aux:lista)
            salida+=aux+"\n";
        return salida;
    } 
}
