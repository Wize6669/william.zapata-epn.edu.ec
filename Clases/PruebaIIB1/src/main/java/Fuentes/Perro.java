package Fuentes;

public class Perro extends Animal {
    
    public Perro(String nombres, String sonidoRealiza, String lugarDiriges, String queJuegas, String alimento, int numHrsDormir) {
        super(nombres, sonidoRealiza, lugarDiriges, queJuegas, alimento, numHrsDormir);
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
}
