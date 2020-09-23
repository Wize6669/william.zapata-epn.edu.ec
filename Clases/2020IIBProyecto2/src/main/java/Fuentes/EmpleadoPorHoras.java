package Fuentes;

public class EmpleadoPorHoras extends Empleado{
    private int numHoras;
    private double costoHora;

    public EmpleadoPorHoras(Fecha fechaingreso, String nombre, Fecha fechaNacimiento) {
        super(fechaingreso, nombre, fechaNacimiento);
    }

    public EmpleadoPorHoras(int numHoras, double costoHora, Fecha fechaingreso, String nombre, Fecha fechaNacimiento) {
        super(fechaingreso, nombre, fechaNacimiento);
        this.numHoras = numHoras;
        this.costoHora = costoHora;
    }
    
    @Override
    public double getSalario() {
       return this.numHoras*this.costoHora;
    } 

    @Override
    public String toString() {
        return super.toString()+"\nSalario por Horas: "+getSalario();
    }   
}
