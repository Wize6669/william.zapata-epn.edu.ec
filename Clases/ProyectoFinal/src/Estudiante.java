
/**
 *
 * @author USER
 */
public class Estudiante {
    private String carrera;
    private final Integer codUnico;
    private String direccion;
    private final Integer edad;
    private String email;
    private String nombre;
    private Integer telefono;
    
    public Estudiante() {
        this.carrera = null;
        this.codUnico = null;
        this.direccion = null;
        this.edad = null;
        this.email = null;
        this.nombre = null;
        this.telefono = null;
    }
    
    public Estudiante(String carrera, Integer codUnico, String direccion, Integer edad, String email, String nombre, Integer telefono){
        this.carrera = null;
        this.codUnico = null;
        this.direccion = null;
        this.edad = null;
        this.email = null;
        this.nombre = null;
        this.telefono = null;
    }

    public String getCarrera() {
        return carrera;
    }

    public Integer getCodUnico() {
        return codUnico;
    }

    public String getDireccion() {
        return direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + ", codUnico=" 
                + codUnico + ", direccion=" + direccion + ", edad=" + edad 
                + ", email=" + email + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
}
