/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;

import java.util.Comparator;

/**
 *
 * @author USER
 */
public class ComparadorLibrosPorAutor implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        Libro libro1,libro2;
        libro1 = (Libro)t;
        libro2 = (Libro)t1;
        return(libro1.getAutor().getNombre().compareTo (libro2.getAutor().getNombre()));  
    }
    
}


