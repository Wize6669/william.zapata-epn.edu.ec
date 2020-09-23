package Fuentes;

public class ProfesorContrato extends Profesor {
    private Fecha fechaCulminacionContrato;
    private double costoHora;
    private int numHorasClase;

    public ProfesorContrato(String experienciaDocencia, Fecha fechaIngreso, String nombres, Fecha fechaNacimiento) {
        super(experienciaDocencia, fechaIngreso, nombres, fechaNacimiento);
    }

    public ProfesorContrato(Fecha fechaCulminacionContrato, double costoHora, int numHorasClase, String experienciaDocencia, Fecha fechaIngreso, String nombres, Fecha fechaNacimiento) {
        super(experienciaDocencia, fechaIngreso, nombres, fechaNacimiento);
        this.fechaCulminacionContrato = fechaCulminacionContrato;
        this.costoHora = costoHora;
        this.numHorasClase = numHorasClase;
    }
    
    @Override
    public double getSalario() {
        return this.numHorasClase*this.costoHora;
    }

    @Override
    public int getNumHorasClase() {
        return this.numHorasClase;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFecha de culminación del contrato: "+fechaCulminacionContrato
                +"\nNúmero de Horas de Clase: "+getNumHorasClase()
                +"\nSalario de un Profesor por Contarto: "+getSalario(); 
    }
}
