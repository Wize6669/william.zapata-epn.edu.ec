package Fuentes;

import java.util.Comparator;

public class ComparadorSalario implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        int aux;
        Empleado empleado1 = (Empleado)t;
        Empleado empleado2 = (Empleado)t1;
        if((empleado1.getSalario())>(empleado2.getSalario())) {
            aux = 0;
        }else {
            if(empleado1.getSalario() > empleado2.getSalario()) {
                aux = 1;
            }else {
                aux = -1;
            }       
        }
    return aux;
    } 
}
