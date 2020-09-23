package Fuentes;

public class Empleado {
    private String nombre;
    private Fecha fechaNacimiento;
    private Fecha fechaIngreso;
    
    public Empleado(String nombre,Fecha fechaNacimiento,Fecha fechaIngreso) {
        setEmpleado(nombre,fechaNacimiento,fechaIngreso);
    }
    public void setEmpleado(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public Fecha getFechaNacimiento(){
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
     public Fecha getFechaIngreso(){
        return fechaIngreso;
    }
     public void setFechaIngreso(Fecha fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "\nNombre=" + nombre + "\nFechaNacimiento=" + fechaNacimiento 
                + "\nFechaIngreso=" + fechaIngreso;
    }
    
     
}
