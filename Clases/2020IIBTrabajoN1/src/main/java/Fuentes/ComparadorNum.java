package Fuentes;
import java.util.Comparator;

public class ComparadorNum implements Comparator {
    int aux;
    @Override
    public int compare(Object o1, Object o2) {
        Libro libro1 = (Libro) t;
        Libro libro2 = (Libro) t1;
        if(libro1.getFechaEdicion() == libro2.getFechaEdicion())
            aux = 0;
        else 
            if(libro1.getFechaEdicion() > libro2.getFechaEdicion())
                aux = 1;
            else
                aux = -1;
        return aux;
    }
    
    
}
