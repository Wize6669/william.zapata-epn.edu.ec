package Fuentes;

import java.util.ArrayList;

public class ListaProfesores {

    private ArrayList <Profesor> lista;
    public ListaProfesores() {
        this.lista = new ArrayList<Profesor>();
    }
    
    public void addProfesor(Profesor profesor){
        lista.add(profesor);
    }

    @Override
    public String toString() {
        
        String salida = " ";
        for(Profesor aux: lista)
            salida+=aux + "\n";
        return salida;
    } 
}
