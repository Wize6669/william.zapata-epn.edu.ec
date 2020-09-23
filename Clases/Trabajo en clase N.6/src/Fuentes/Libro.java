package Fuentes;

public class Libro {
    private String titulo;
    private Fecha fechaEdicion;
    private Autor autor;
    private Double precio;
    
    
    public Libro (){
        autor = new Autor(); //Composición
        fechaEdicion = new Fecha(); //Composición
    }
    
    public void setLibro(String nombre,String fechaNacimiento,String fecha, String titulo, Double precio){
        autor.setAutor(fechaNacimiento, nombre);
        fechaEdicion.setFecha(fecha);
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public Fecha getFechaEdicion() {
        return fechaEdicion;
    }

    public Autor getAutor() {
        return autor;
    }

    public Double getPrecio() {
        return precio;
    }
     
    @Override
    public String toString() {
        return "\nTitulo: " + titulo + "\nFecha de Publicación: " + fechaEdicion 
                + autor.toString() + "\nPrecio: "+precio;
    }  
    
}
