package Fuentes;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(double totalVenta, double porcentajeComision,Fecha fechaingreso, String nombre, Fecha fechaNacimiento) {
        super(totalVenta,porcentajeComision,fechaingreso, nombre, fechaNacimiento);
    }

    public EmpleadoBaseMasComision(double salarioBase, double totalVenta, double porcentajeComision, Fecha fechaingreso, String nombre, Fecha fechaNacimiento) {
        super(totalVenta, porcentajeComision, fechaingreso, nombre, fechaNacimiento);
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double getSalario() {
        return super.getSalario()+this.salarioBase;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSalario Base: "+salarioBase;
    }
}
