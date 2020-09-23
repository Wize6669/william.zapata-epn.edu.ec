
package Fuentes;

import java.util.Comparator;

/**
 *
 * @author USER
 */
public class ComparadorLibrosEdad implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
          int aux = 0;
        Libro libro1, libro2;
        libro1 = (Libro)t;
        libro2 = (Libro)t1;
        if (libro1.getFechaEdicion() == libro2.getFechaEdicion()){
            aux = 0;
        } else {
            if (libro1.getFechaEdicion().getAño()> libro2.getFechaEdicion().getAño()){
                aux = 1;
            } else if (libro1.getFechaEdicion().getMes()> libro2.getFechaEdicion().getMes()){
                aux = 1;
            } else if (libro1.getFechaEdicion().getDia()> libro2.getFechaEdicion().getDia()) {
                aux = 1;
            } else {
                aux = -1;
            }
        }
        return aux; 
    }
        
}
    

 