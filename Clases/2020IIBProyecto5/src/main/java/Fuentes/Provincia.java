package Fuentes;

public class Provincia {
    private String nombreProv;
    private int numProvincia;
    private int numHabitProvincia;

    public Provincia() {
    }

    public Provincia(String nombreProv, int numProvincia, int numHabitProvincia) {
        this.nombreProv = nombreProv;
        this.numProvincia = numProvincia;
        this.numHabitProvincia = numHabitProvincia;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public int getNumHabitProvincia() {
        return numHabitProvincia;
    }

    public void setNumHabitProvincia(int numHabitProvincia) {
        this.numHabitProvincia = numHabitProvincia;
    }

    public int getNumProvincia() {
        return numProvincia;
    }

    public void setNumProvincia(int numProvincia) {
        this.numProvincia = numProvincia;
    }

    @Override
    public String toString() {
        return "\nProvincia\n" +"Nombre de la Provincia: "+ nombreProv
                + "\nNumero de Provincia: " + numProvincia 
                + "\nNúmero de Habitantes de la Provincia: " + numHabitProvincia;
    }
}
