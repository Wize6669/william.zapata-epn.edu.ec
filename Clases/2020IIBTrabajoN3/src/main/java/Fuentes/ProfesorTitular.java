package Fuentes;

public class ProfesorTitular extends Profesor {
    private Fecha fechaNombramiento;
    private int numHorasInvestigacion;
    private int numHorasClase;
    private double costoHora;

    public ProfesorTitular(String nombres, Fecha fechaNacimiento) {
        super(nombres, fechaNacimiento);
    }

    public ProfesorTitular(Fecha fechaNombramiento, int numHorasInvestigacion, int numHorasClase, double costoHora, String experienciaDocencia, Fecha fechaIngreso, String nombres, Fecha fechaNacimiento) {
        super(experienciaDocencia, fechaIngreso, nombres, fechaNacimiento);
        this.fechaNombramiento = fechaNombramiento;
        this.numHorasInvestigacion = numHorasInvestigacion;
        this.numHorasClase = numHorasClase;
        this.costoHora = costoHora;
    }

    @Override
    public double getSalario() {
        return (this.numHorasInvestigacion+this.numHorasClase)*this.costoHora;
    }

    @Override
    public int getNumHorasClase() {
        return this.numHorasClase;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFecha de Nombramiento: "+fechaNombramiento
                +"\nNúmero de Horas de Clase: "+getNumHorasClase()
                +"\nSalario de un Profesor Titular: "+getSalario();
    }    
}
