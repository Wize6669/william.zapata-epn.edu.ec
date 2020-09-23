package Fuentes;

public abstract class Profesor extends Persona {
    private String experienciaDocencia;
    private Fecha fechaIngreso;
    public abstract double getSalario();
    public abstract int getNumHorasClase();

    public Profesor(String nombres, Fecha fechaNacimiento) {
        super(nombres, fechaNacimiento);
    }

    public Profesor(String experienciaDocencia, Fecha fechaIngreso, String nombres, Fecha fechaNacimiento) {
        super(nombres, fechaNacimiento);
        this.experienciaDocencia = experienciaDocencia;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFecha de Ingres: "+fechaIngreso
                +"\nExperiencia en la área de Docencia: "+experienciaDocencia;
    }   
}
