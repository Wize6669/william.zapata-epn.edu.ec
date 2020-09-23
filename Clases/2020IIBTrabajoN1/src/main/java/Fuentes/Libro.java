package Fuentes;

public class Libro {
private Autor autor;
private Fecha fechaPublicacion;
private String titulo;
private int precio;
public Libro(){
    autor = new Autor(); // composicion 
    fechaPublicacion = new Fecha(); // composion
}
public void setLibro(String autor, String fechaPublicacion, String titulo, String fecha){
    
            
}

    public Autor getAutor() {
        return autor;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrecio() {
        return precio;
    }
    

@Override
public String toString() {
    return "Libro{" + "autor=" + autor + ", fechaEdicion=" + fechaPublicacion + ", titulo=" + titulo + '}';
}



}
