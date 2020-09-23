package Fuentes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Fuentes.Citas;

public class Citas_servicio {
    private final String tabla = "citas";
    public void guardar(Connection conexion, Citas citas) throws SQLException{
      try{
         PreparedStatement consulta;
         if(citas.getIdCita() == null){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla 
                    + "(titulo, descripcion, nivel_de_prioridad) VALUES(?, ?, ?)");
            consulta.setString(1, citas.getDescripcion());
            consulta.setString(2, citas.getEstado());
            consulta.setInt(3, citas.getIdCita());
            consulta.setInt(4, citas.getCodUnico());
            consulta.setInt(5, citas.getIdMedico());
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla 
                    + " SET titulo = ?, descripcion = ?, nivel_de_prioridad = ? WHERE id_tarea = ?");
            consulta.setString(1, citas.getDescripcion());
            consulta.setString(2, citas.getEstado());
            consulta.setInt(3, citas.getIdCita());
            consulta.setInt(4, citas.getCodUnico());
            consulta.setInt(5, citas.getIdMedico());
         }
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
   public Citas recuperarPorId(Connection conexion, int id_tarea) throws SQLException {
      Citas citas = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT titulo, descripcion, nivel_de_prioridad FROM " 
                 + this.tabla + " WHERE id_tarea = ?" );
         consulta.setInt(1, id_tarea);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            citas = new Citas(resultado.getString("descripción"), resultado.getString("estado"), resultado.getInt("idCita"), resultado.getInt("codUnico"),resultado.getInt("codMedico"));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return citas;
   }
   public void eliminar(Connection conexion, Citas citas) throws SQLException{
      try{
         PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla + " WHERE id_tarea = ?");
            consulta.setString(1, citas.getDescripcion());
            consulta.setString(2, citas.getEstado());
            consulta.setInt(3, citas.getIdCita());
            consulta.setInt(4, citas.getCodUnico());
            consulta.setInt(5, citas.getIdMedico());
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
   public List<Citas> recuperarTodas(Connection conexion) throws SQLException{
      List<Citas> citas = new ArrayList<>();
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT id_tarea, titulo, descripcion, nivel_de_prioridad FROM " 
                 + this.tabla + " ORDER BY nivel_de_prioridad");
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            citas.add(new Citas(resultado.getString("descripción"), resultado.getString("estado"), resultado.getInt("idCita"), resultado.getInt("codUnico"),resultado.getInt("codMedico")));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return citas;
   }
}

