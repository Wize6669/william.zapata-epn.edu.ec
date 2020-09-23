package Fuentes;

public class Provincia {
    String nombreProvincia;
    int numHabPro;

    public Provincia(String nombreProvincia, int numHabPro) {
        this.nombreProvincia = nombreProvincia;
        this.numHabPro = numHabPro;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public int getNumHabPro() {
        return numHabPro;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public void setNumHabPro(int numHabPro) {
        this.numHabPro = numHabPro;
    }

    @Override
    public String toString() {
        return "Provincia{" + "nombreProvincia=" + nombreProvincia + ", numHabPro=" + numHabPro + '}';
    }
    
    
   
}
