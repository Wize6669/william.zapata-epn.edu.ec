package Fuentes;

public abstract class Persona {
    private String nombres;
    private Fecha fechaNacimiento;

    public Persona(String nombres, Fecha fechaNacimiento) {
        setPersona(nombres, fechaNacimiento);
    }
    
    public void setPersona(String nombres, Fecha fechaNacimiento) {
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "\nNombres: " + nombres + "\nFecha de Nacimiento: " + fechaNacimiento;
    }
}
