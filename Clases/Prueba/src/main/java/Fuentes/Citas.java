package Fuentes;

public class Citas {
  private String descripcion;
  private String estado;
  private final Integer idCita;
  private final Integer codUnico;
  private final Integer idMedico;

    public Citas(String descripcion, String estado, Integer idCita, Integer codUnico, Integer idMedico) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.idCita = idCita;
        this.codUnico = codUnico;
        this.idMedico = idMedico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public Integer getCodUnico() {
        return codUnico;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
