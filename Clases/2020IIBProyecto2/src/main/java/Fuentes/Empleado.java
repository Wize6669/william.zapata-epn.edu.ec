package Fuentes;

public abstract class Empleado extends Persona { //Clase abstracta y herencia -> extends
    private Fecha fechaIngreso;
    public abstract double getSalario();

    public Empleado(String nombre, Fecha fechaNacimiento){
        super(nombre, fechaNacimiento);
    }
    public Empleado(Fecha fechaIngreso, String nombre, Fecha fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.fechaIngreso = fechaIngreso;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nFecha de ingreso: "+fechaIngreso;
    }
    //Con super.toString(), incluimos: nombre y fecha de nacimeinto
}
