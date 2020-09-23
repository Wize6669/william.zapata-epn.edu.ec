package Fuentes;

public class Animal implements AccionesGenerales {
    private String nombres;
    private String sonidoRealiza;
    private String lugarDiriges;
    private String queJuegas;
    private String alimento;
    private int numHrsDormir;

    public Animal(String nombres, String sonidoRealiza, String lugarDiriges, String queJuegas, String alimento, int numHrsDormir) {
        this.nombres = nombres;
        this.sonidoRealiza = sonidoRealiza;
        this.lugarDiriges = lugarDiriges;
        this.queJuegas = queJuegas;
        this.alimento = alimento;
        this.numHrsDormir = numHrsDormir;
    }
   
    public String getSonidoRealiza() {
        return sonidoRealiza;
    }

    public String getLugarDiriges() {
        return lugarDiriges;
    }

    public String getQueJuegas() {
        return queJuegas;
    }

    public String getAlimento() {
        return alimento;
    }

    public int getNumHrsDormir() {
        return numHrsDormir;
    }

    public String getNombres() {
        return nombres;
    }
    
    public void setSonidoRealiza(String sonidoRealiza) {
        this.sonidoRealiza = sonidoRealiza;
    }

    public void setLugarDiriges(String lugarDiriges) {
        this.lugarDiriges = lugarDiriges;
    }

    public void setQueJuegas(String queJuegas) {
        this.queJuegas = queJuegas;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void setNumHrsDormir(int numHrsDormir) {
        this.numHrsDormir = numHrsDormir;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    @Override
    public String hablar() {
        return this.sonidoRealiza;
    }

    @Override
    public String desplazarse() {
        return this.lugarDiriges;
    }

    @Override
    public String jugar() {
        return this.queJuegas;
    }

    @Override
    public String alimentarse() {
        return this.alimento;
    }

    @Override
    public int dormir() {
        return this.numHrsDormir;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombres=" + nombres + ", sonidoRealiza=" 
                + sonidoRealiza + ", lugarDiriges=" + lugarDiriges 
                + ", queJuegas=" + queJuegas + ", alimento=" + alimento 
                + ", numHrsDormir=" + numHrsDormir + '}';
    }
}
