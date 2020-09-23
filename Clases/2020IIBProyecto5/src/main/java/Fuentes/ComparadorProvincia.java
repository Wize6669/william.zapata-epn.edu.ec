package Fuentes;

import java.util.Comparator;

public class ComparadorProvincia implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        Provincia provincia1 = (Provincia)t;
        Provincia provincia2 = (Provincia)t1;
        return (provincia1.getNombreProv().compareTo(provincia2.getNombreProv()));
    }   
}
