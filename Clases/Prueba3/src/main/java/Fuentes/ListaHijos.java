package Fuentes;

import java.util.ArrayList;

public class ListaHijos {
ArrayList <Hijos> listaHijos;
public ListaHijos(){
    this.listaHijos = new ArrayList<>();
}
public void addHijos(Hijos hijos){
    this.listaHijos.add(hijos);
}

    @Override
    public String toString() {
        String salida = "";
        for(Hijos aux: listaHijos)
            salida+= aux.toString()+ "\n";
        return salida;
    }

}
