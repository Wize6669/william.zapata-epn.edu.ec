package Fuentes;

public class Familia {
    private String apellidoFamilia;
    private String madre;
    private String padre;
    public Familia(String apellidoFamilia, String madre, String padre){
        setFamilia(apellidoFamilia, madre, padre);
    }
    public Familia(){
    }
    public void setFamilia(String apellidoFamilia, String madre, String padre){
        this.apellidoFamilia = apellidoFamilia;
        this.madre = madre;
        this.padre = padre;
        
    }

    public String getApellidoFamilia() {
        return apellidoFamilia;
    }

    public void setApellidoFamilia(String apellidoFamilia) {
        this.apellidoFamilia = apellidoFamilia;
    }

    public String getMadre() {
        return madre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }
    

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getPadre() {
        return padre;
    }
    
    @Override
    public String toString() {
        return "Familia\n" + "Apellido de la Familia: " + apellidoFamilia + "\nMadre: " + madre + ", Padre: " + padre + ", Hij@ o Hij@s: " ;
    }
    
}
