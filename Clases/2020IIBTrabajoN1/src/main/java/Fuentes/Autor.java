package Fuentes;

public class Autor {
    private String nombres;
    private Fecha fechaNacimiento;
    public Autor(){
        fechaNacimiento = new Fecha();
    }
    public void setAutor(String nombres, String fecha){
        fechaNacimiento.setFecha(fecha);
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombres + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreAutor() {
        return nombres;
    }

    public void setNombreAutor(String nombre) {
        this.nombres = nombre;
    }
    
    
    
}
