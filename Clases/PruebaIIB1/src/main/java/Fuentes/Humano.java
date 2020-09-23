package Fuentes;

public class Humano implements AccionesGenerales, AccionesHumano {
    private String nombres;
    private String idioma;
    private String lugarDiriges;
    private String queJuegas;
    private String alimento;
    private int numHrsDormir;
    private String musicaBailas;
    private String instrumentoTocas;
    private String carrera;
    private String oficio;

    public Humano(String nombres, String idioma, String lugarDiriges, String queJuegas, String alimento, int numHrsDormir, String musicaBailas, String instrumentoTocas, String carrera, String oficio) {
        this.nombres = nombres;
        this.idioma = idioma;
        this.lugarDiriges = lugarDiriges;
        this.queJuegas = queJuegas;
        this.alimento = alimento;
        this.numHrsDormir = numHrsDormir;
        this.musicaBailas = musicaBailas;
        this.instrumentoTocas = instrumentoTocas;
        this.carrera = carrera;
        this.oficio = oficio;
    }
    
    public String getIdioma() {
        return idioma;
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

    public String getMusicaBailas() {
        return musicaBailas;
    }

    public String getInstrumentoTocas() {
        return instrumentoTocas;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getOficio() {
        return oficio;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public void setMusicaBailas(String musicaBailas) {
        this.musicaBailas = musicaBailas;
    }

    public void setInstrumentoTocas(String instrumentoTocas) {
        this.instrumentoTocas = instrumentoTocas;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }
    
    @Override
    public String hablar() {
        return this.idioma;
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
    public String bailar() {
        return this.musicaBailas;
    }

    @Override
    public String tocarInstrumento() {
        return this.instrumentoTocas;
    }

    @Override
    public String estudiar() {
        return this.carrera;
    }

    @Override
    public String trabajar() {
       return this.oficio;
    }

    @Override
    public String toString() {
        return "Humano{" + "nombres=" + nombres + ", idioma=" + idioma 
                + ", lugarDiriges=" + lugarDiriges + ", queJuegas=" + queJuegas + ", alimento=" 
                + alimento + ", numHrsDormir=" + numHrsDormir + ", musicaBailas=" 
                + musicaBailas + ", instrumentoTocas=" + instrumentoTocas + ", carrera=" 
                + carrera + ", oficio=" + oficio + '}';
    }
}
