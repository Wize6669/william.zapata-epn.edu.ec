package Fuentes;

import java.util.ArrayList;

public class ListaFiguras {
    private ArrayList <Figura> listaFiguras;
    
    public ListaFiguras(){
        this.listaFiguras = new <Figura>ArrayList();
    }
    
    public void addFigura(Figura figura){
        listaFiguras.add(figura);
    }

    @Override
    public String toString() {
        String salida = "";
        for (Figura aux: listaFiguras)
            salida += aux.toString() + "\n";
        return salida;
    }
}
