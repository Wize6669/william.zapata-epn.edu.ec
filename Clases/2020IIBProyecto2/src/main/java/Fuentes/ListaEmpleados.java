package Fuentes;

import java.util.ArrayList;

public class ListaEmpleados {
    private ArrayList <Empleado> lista;

    public ListaEmpleados() {
        this.lista = new ArrayList<Empleado>();
                
    }
    
    public void addEmpleado(Empleado empleado){
    lista.add(empleado);
    }

    @Override
    public String toString() {
        String salida="";
        for(Empleado aux: lista)
            salida+=aux + "\n\n"; // asume aux.toString
        return salida;
    }  
}

