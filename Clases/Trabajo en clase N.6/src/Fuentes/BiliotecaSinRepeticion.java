package Fuentes;

import java.util.Collections;
import java.util.HashSet;

public class BiliotecaSinRepeticion {
        HashSet<Libro> listaLibrosSinRep;
    
    public BiliotecaSinRepeticion(){
        this.listaLibrosSinRep = new  HashSet<Libro>();
    }
    public void addLibroSinRepeticion(Libro libro){
        this.listaLibrosSinRep.add(libro);
    }
    
        public Object ordenarLibroRecienteSR() {
        return Collections.min(listaLibrosSinRep, new ComparadorLibrosEdad());
    }
    
    public Object ordenarLibroLongevoSR() {
        return Collections.max(listaLibrosSinRep, new ComparadorLibrosEdad());
    }
    
    public Object ordenarLibroPrecioMenorSR() {
        return Collections.min(listaLibrosSinRep, new ComparadorLibrosPrecio());
    }
    
    public Object ordenarLibroPrecioMayorSR() {
        return Collections.max(listaLibrosSinRep, new ComparadorLibrosPrecio());
    }
    
    @Override
    public String toString() {
        String salida="";
        for(Libro aux: listaLibrosSinRep){
            salida+=aux.toString()+" \n";
        }
        return salida;
    }
}
