package Fuentes;

import java.util.Comparator;

public class ComparadorNumHabitantes implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        int aux;
        Provincia provincia1 = (Provincia)t;
        Provincia provincia2 = (Provincia)t1;
        if(provincia1.getNumHabitProvincia() == provincia2.getNumHabitProvincia())
            aux = 0;
        else 
            if(provincia1.getNumHabitProvincia()> provincia2.getNumHabitProvincia())
                aux = 1;
            else 
                aux = -1;
        return aux;
    }
}
