package Fuentes;

import java.util.Comparator;

public class ComparadorLibrosTitulo implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        Libro libro1, libro2;
        libro1 = (Libro)t;
        libro2 = (Libro)t1;
        return (libro1.getTitulo().compareTo(libro2.getTitulo()));   
    }  
}
