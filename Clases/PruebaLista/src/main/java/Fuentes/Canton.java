package Fuentes;

public class Canton {
        String nombreCanton;
        int numHambitantes;

    public Canton(String nombreCanton, int numHambitantes) {
        this.nombreCanton = nombreCanton;
        this.numHambitantes = numHambitantes;
    }

    public String getNombreCanton() {
        return nombreCanton;
    }

    public int getNumHambitantes() {
        return numHambitantes;
    }

    public void setNombreCanton(String nombreCanton) {
        this.nombreCanton = nombreCanton;
    }

    public void setNumHambitantes(int numHambitantes) {
        this.numHambitantes = numHambitantes;
    }

    @Override
    public String toString() {
        return "Canton{" + "nombreCanton=" + nombreCanton + ", numHambitantes=" + numHambitantes + '}';
    }
       
}
