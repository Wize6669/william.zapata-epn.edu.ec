package Fuentes;


public class NodoProvincia {
    Provincia dato;
    NodoCanton enlace1;
    NodoProvincia enlace2;

    public NodoProvincia(Provincia datos) {
        this.dato = datos;
        this.enlace1 = enlace1;
        this.enlace2 = enlace2;
    
    }
    public NodoProvincia(Provincia dato, NodoCanton enlace1, NodoProvincia enlace2) {
        this.dato = dato;
        this.enlace1 = enlace1;
        this.enlace2 = enlace2;
    }
    
    public Provincia getDato() {
        return dato;
    }
    
    public void setDato(Provincia dato) {
        this.dato = dato;
    }
    
    public NodoCanton setEnlace1() {
        return enlace1;
    }
    
    public NodoProvincia setEnlace2() {
        return enlace2;
    }

    @Override
    public String toString() {
        return "NodoProvincia: " + "dato: " + dato;
    }
    
   
    

    
    
    
    
    
    
    
    
    
    
    
}
