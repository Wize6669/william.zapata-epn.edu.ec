package Fuentes;

import java.util.Collections;
import java.util.Vector;

public class Biblioteca {
    Vector<Libro> listaLibros;
    
    public Biblioteca(){
        this.listaLibros = new Vector<Libro>();
    }
    public void addLibro(Libro libro){
        this.listaLibros.add(libro);
    }
    
    public Object ordenarLibroReciente() {
        return Collections.min(listaLibros, new ComparadorLibrosEdad());
    }
    
    public Object ordenarLibroLongevo() {
        return Collections.max(listaLibros, new ComparadorLibrosEdad());
    }
    
    public Object ordenarLibroPrecioMenor() {
        return Collections.min(listaLibros, new ComparadorLibrosPrecio());
    }
    
    public Object ordenarLibroPrecioMayor() {
        return Collections.max(listaLibros, new ComparadorLibrosPrecio());
    }
    
    public void ordenarLibrosTitulo() {
        Collections.sort(listaLibros, new ComparadorLibrosTitulo());
    }
    
    public void ordenarLibroAutor() {
        Collections.sort(listaLibros, new ComparadorLibrosPorAutor());
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
