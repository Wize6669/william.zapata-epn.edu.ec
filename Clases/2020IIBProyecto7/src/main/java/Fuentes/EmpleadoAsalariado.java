package Fuentes;

public class EmpleadoAsalariado extends Empleado {
    private double salarioBasico;

    public EmpleadoAsalariado(Fecha fechaingreso, String nombre, Fecha fechaNacimiento) {
        super(fechaingreso, nombre, fechaNacimiento);
    }

    public EmpleadoAsalariado(double salarioBasico,Fecha fechaIngreso, String nombre, Fecha fechaNacimiento) {
        super(fechaIngreso,nombre, fechaNacimiento);
        this.salarioBasico = salarioBasico;
    }
    
    @Override
    public double getSalario() {
        return this.salarioBasico;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSalario Basico: "+salarioBasico;
    }
}

