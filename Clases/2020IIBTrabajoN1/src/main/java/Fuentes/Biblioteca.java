
package Fuentes;

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
    
   public void ordenarPaisNombreProvincias() {
        Collections.sort(listaLibros, new ComparadorNum());
    }
   
    @Override
    public String toString() {
        String salida = "";
        for(Libro libroaux:listaLibros){
            salida+=libroaux+"\n";
        }
        return salida;
    }
   
}
