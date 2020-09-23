package Fuentes;

import java.util.StringTokenizer;

public class Padres {
private String nombre,papel;
public Padres(String rol){
    setPadre(rol);
}
public void setPadre(String rol){
    StringTokenizer tk = new StringTokenizer(rol, ",");
    this.nombre = tk.nextToken();
    this.papel = tk.nextToken();
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    @Override
    public String toString() {
        return "Padres{" + "nombre=" + nombre + ", papel=" + papel + '}';
    }
    
    
    


}
