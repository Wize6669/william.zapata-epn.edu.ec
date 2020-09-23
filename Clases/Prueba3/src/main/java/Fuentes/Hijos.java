
package Fuentes;

import java.util.StringTokenizer;

public class Hijos {
    private String nombre;
    private String papel;
public Hijos(String rol){
    setHijos(rol);
}
public void setHijos(String rol){
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
        return "Nombre: "+nombre+"Patentesco: "+papel;
    }
    
    
    

}
