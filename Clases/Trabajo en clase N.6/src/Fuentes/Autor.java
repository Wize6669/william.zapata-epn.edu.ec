
package Fuentes;

public class Autor {
    private String nombre;
    private Fecha fechaNacimiento;
    
    public Autor () {
        fechaNacimiento = new Fecha(); //Composicón 
    }
    
    public void setAutor(String fecha, String nombre){
        fechaNacimiento.setFecha(fecha);
        this.nombre = nombre;   
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
    @Override
    public String toString() {
        return "\nNombre del Autor: " + nombre + "\nFecha de Nacimiento: " + fechaNacimiento;   
    }
}
