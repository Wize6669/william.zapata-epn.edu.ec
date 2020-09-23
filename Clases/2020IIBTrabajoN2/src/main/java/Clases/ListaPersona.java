package Clases;

import java.util.ArrayList;

public class ListaPersona {
    private ArrayList <Persona> lista;
    
    public ListaPersona(){
        lista = new ArrayList<Persona>();
    }
    
    public void addPersona(Persona persona){
        lista.add(persona);
    }
    
    @Override
    public String toString() {
        String salida = "";
        for(Persona aux: lista)
            salida+=aux + "\n\n";
        return salida;
    }
    
}
