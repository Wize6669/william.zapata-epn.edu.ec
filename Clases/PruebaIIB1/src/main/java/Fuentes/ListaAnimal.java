package Fuentes;

import java.util.ArrayList;


public class ListaAnimal {
    private ArrayList<Animal> lista;

    public ListaAnimal() {
        lista = new ArrayList<Animal>();
    }
    
    public void addAnimal(Animal animal) {
        lista.add(animal);
    }

    @Override
    public String toString() {
        String salida = "";
        for(Animal aux:lista)
            salida+=aux+"";
        return salida;
    }
}
