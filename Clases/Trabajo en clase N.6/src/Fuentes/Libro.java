
package Fuentes;

public class Libro {
    private String titulo;
    private Fecha fechaEdicion;
    private Autor autor;
    private double precio;
    
    
    public Libro (){
        autor = new Autor(); //Composición
        fechaEdicion = new Fecha(); //Composición
    }
    
    public void setLibro(String nombre,String fechaNacimiento,String fecha, String titulo, int precio){
        autor.setAutor(fechaNacimiento, nombre);
        fechaEdicion.setFecha(fecha);
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public Fecha getFechaEdicion() {
        return fechaEdicion;
    }
    
    
    @Override
    public String toString() {
        return "\nTitulo: " + titulo + "\nFecha de Edicion: " + fechaEdicion + autor.toString() 
                + "\n Precio: " + this.precio;
    }  
    
} 
