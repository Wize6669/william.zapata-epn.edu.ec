package Fuentes;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListaEmpleadosLink {
    private LinkedList <Empleado> lista;

    public ListaEmpleadosLink() {
        this.lista = new LinkedList <Empleado>();
                
    }
    
    public void addEmpleado(Empleado empleado){
        lista.add(empleado);
    }
    
    public void addInicio(Empleado empleado) {
        lista.addFirst(empleado);
    }
    
    public void addFinal(Empleado empleado) {
        lista.addLast(empleado);
    }
    
    public void ordenarNombreEmpleado() {
        Collections.sort(lista, new ComparadorNombreEmpleado());
    }
    
    public Object ordenarMayorSalario() {
        return Collections.max(lista, new ComparadorSalario());
    }
    
    public void remover(String nombre) {
        Iterator<Empleado> it= lista.iterator();
        while(it.hasNext()) {
            Empleado empleado = it.next();
            if(empleado.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
            }
        }
    }
    
    @Override
    public String toString() {
        String salida="";
        for(Empleado aux: lista)
            salida+=aux + "\n\n"; // asume aux.toString
        return salida;
    }  
}

