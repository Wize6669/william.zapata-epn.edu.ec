package Fuentes;
import java.util.ArrayList;

public class ListaEmpleados {
    ArrayList<Empleado> listaEmpleados;
    
    public ListaEmpleados(){
        this.listaEmpleados = new ArrayList<Empleado>();
    }
    public void addEmpleado(Empleado empleado){
        this.listaEmpleados.add(empleado);
    }

    @Override
    public String toString() {
        String salida="";
        for(Empleado aux: listaEmpleados){
            salida+=aux.toString()+" \n";
        }
        return salida;
    } 
}
