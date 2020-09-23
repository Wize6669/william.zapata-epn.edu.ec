package Fuentes;

public class Nodo {
    Empleado dato;
    Nodo enlace;

    public Nodo(Empleado dato) {
        this.dato = dato;
        this.enlace = null;
    }

    public Nodo(Empleado dato, Nodo enlace) {
        this.dato = dato;
        this.enlace = enlace;
    }

    public Empleado getDato() {
        return dato;
    }

    public void setDato(Empleado dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "Dato: " + dato + "\nEnlace: " + enlace + '}';
    }
    
    


    
    
    
    
    
}
