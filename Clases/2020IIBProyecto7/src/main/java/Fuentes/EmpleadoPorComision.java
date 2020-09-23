package Fuentes;

public class EmpleadoPorComision extends Empleado {
    private double totalVenta;
    private double porcentajeComision;

    public EmpleadoPorComision(Fecha fechaIngreso,String nombre,Fecha fechaNacimiento) {
        super(fechaIngreso, nombre,fechaNacimiento);
    }

    public EmpleadoPorComision(double totalVenta, double porcentajeComision, Fecha fechaingreso, String nombre, Fecha fechaNacimiento) {//primero lo que se
        super(fechaingreso, nombre, fechaNacimiento); // necesita->los atributos de la clase, superclase, super super clase
        this.totalVenta = totalVenta;
        this.porcentajeComision = porcentajeComision;
    }
    
    @Override
    public double getSalario() {
        return  this.totalVenta*(this.porcentajeComision/100);
    }

    @Override
    public String toString() {
        return super.toString()+"\nSalario por Comision: "+ getSalario();
    }
}
