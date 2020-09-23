package Fuentes;

public abstract class Persona {
    private String nombre;
    private Fecha fechaNacimiento; //Agregacion 
    public Persona(String nombre, Fecha fechaNacimiento){ // Agregacion de Fecha
        setPersona(nombre, fechaNacimiento); // Lammar al metodo SetPersona()
    }
    public void setPersona(String nombre, Fecha fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombres: "+nombre+"\nFecha de Nacimiento: "+this.fechaNacimiento;
    }
}
