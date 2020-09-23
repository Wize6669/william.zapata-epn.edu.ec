package Fuentes;

public class Mujer extends Humano {
    
    public Mujer(String nombres, String idioma, String lugarDiriges, String queJuegas, String alimento, int numHrsDormir, String musicaBailas, String instrumentoTocas, String carrera, String oficio) {
        super(nombres, idioma, lugarDiriges, queJuegas, alimento, numHrsDormir, musicaBailas, instrumentoTocas, carrera, oficio);
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
   
}
