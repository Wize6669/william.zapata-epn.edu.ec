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
public class ComparadorLibrosPrecio implements Comparator {
        @Override
    public int compare(Object t, Object t1) {
        int aux;
        Libro libro1, libro2;
        libro1 = (Libro)t;
        libro2 = (Libro)t1;
        if (libro1.getPrecio() == libro2.getPrecio()){
            aux = 0;
        } else {
            if (libro1.getPrecio() > libro2.getPrecio()){
                aux = 1;
            } else {
                aux = -1;
            }
        }
        return aux; 
    }
    
}
