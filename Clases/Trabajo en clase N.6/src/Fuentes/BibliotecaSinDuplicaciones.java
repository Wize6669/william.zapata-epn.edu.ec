/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author USER
 */
public class BibliotecaSinDuplicaciones {
    private HashSet<Libro> listaLibrosSD;
    
    public BibliotecaSinDuplicaciones() {
        this.listaLibrosSD = new HashSet<Libro>();
    }
    
    public void addLibroSD(Libro libro){
        this.listaLibrosSD.add(libro);
    }
    
    @Override
    public String toString() {
        String salida="";
        for(Libro aux: listaLibrosSD){
            salida+=aux.toString()+" \n";
        }
        return salida;
    }
}


