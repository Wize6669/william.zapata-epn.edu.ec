package Fuentes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Pais {
    List <Provincia> provincias;

    public Pais() {
        this.provincias = new <Provincia>ArrayList(); 
    }
    public void addProvincia(Provincia provincia){
        provincias.add(provincia);
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }
 
    public void ordenarPaisNombreProvincias() {
        Collections.sort(provincias, new ComparadorProvincia());
    }
    
    public void ordenarPaisNumHabitantes() {
        Collections.sort(provincias, new ComparadorNumHabitantes());
    }
    
    public Object provinciaMaxNumHabitantentes() {
        return Collections.max(provincias, new ComparadorNumHabitantes());
    }
    
    public Object provinciaMinNumHabitantentes() {
        return Collections.min(provincias, new ComparadorNumHabitantes());
    }
    
    public int busquedaBinariaNombreProvincia(Provincia prov) {
        ordenarPaisNombreProvincias();
        return Collections.binarySearch(provincias, prov, new ComparadorProvincia());
    }
    
    public int busquedaBinariaNumHabitantes(Provincia prov) {
        ordenarPaisNumHabitantes();
        return Collections.binarySearch(provincias, prov, new ComparadorNumHabitantes());
    }
    
    public void remover(String provincia) {
    Iterator<Provincia> it = provincias.iterator();
    while(it.hasNext()) {
        Provincia provActual = it.next();
        if(provActual.getNombreProv().equalsIgnoreCase(provincia))
            it.remove();
    }
    
    }
        @Override
    public String toString() {
        String salida = "";
        for (Provincia aux: provincias)
            salida+=aux.toString()+"\n";
        return salida;
    }
}
