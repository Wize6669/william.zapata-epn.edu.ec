package Fuentes;


public class NodoCanton {
    Canton datosCanton;
    NodoCanton enlace;

    public NodoCanton(Canton datosCanton) {
        this.datosCanton = datosCanton;
        this.enlace = null;
    }

    public NodoCanton(Canton datosCanton, NodoCanton enlace) {
        this.datosCanton = datosCanton;
        this.enlace = enlace;
    }
    
    public Canton getDatosCaton() {
        return datosCanton;
    }

    @Override
    public String toString() {
        return "NodoCanton{" + "datosCanton=" + datosCanton + '}';
    }
    
}
