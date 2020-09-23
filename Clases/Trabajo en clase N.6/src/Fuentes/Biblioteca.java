
package Fuentes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Biblioteca {
    private Vector<Libro> listaLibros;
    
    public Biblioteca(){
        this.listaLibros = new Vector<Libro>();
    }
    public void addLibro(Libro libro){
        this.listaLibros.add(libro);
    }
  
    public void ordenarLibrosPorTitulo(){
        Collections.sort(listaLibros, new ComparadorLibros());
    }
    
    public void ordenarLibrosPorAutor(){
       Collections.sort(listaLibros, new ComparadorLibrosPorAutor());
    }
     
    public Object buscarLibroBarato(){
       return Collections.min(listaLibros, new ComparadorLibrosPrecio());
    }
    
    public Object buscarLibroCaro(){
        return Collections.max(listaLibros, new ComparadorLibrosPrecio());
    }
    
    public Object buscarLibroAntiguo(){
        return Collections.min(listaLibros, new ComparadorLibrosEdad());
    }
    
     public Object buscarLibroActual(){
        return Collections.max(listaLibros, new ComparadorLibrosEdad());
    }
     
    @Override
    public String toString() {
        String salida="";
        for(Libro aux: listaLibros){
            salida+=aux.toString()+" \n";
        }
        return salida;
    }
    
}


