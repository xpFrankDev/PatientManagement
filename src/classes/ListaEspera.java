
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ListaEspera {
    int id=-1,idPaciente,idTrabajadorSocial,terapeutaAsignado,usuarioModificacion;
    String estado,fechaModificacion,sql;
    ArrayList<Paciente> paciente = new ArrayList();
//    Paciente paciente = new Paciente();
    PreparedStatement pst;
    java.sql.ResultSet rs;

    public ListaEspera() {
    }

    public ListaEspera(int id, int idPaciente, int idTrabajadorSocial, String fechaModificacion, int usuarioModificacion,String estado) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.idTrabajadorSocial = idTrabajadorSocial;
        this.estado = estado;
        this.fechaModificacion=fechaModificacion;
        this.usuarioModificacion=usuarioModificacion;
        
    }

    
    public boolean insert(int idPaciente, int idTrabajadorSocial){
         try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
             sql = " call `sp.sp.InsertListaEspera` (?,?)";
             pst = con.prepareCall(sql);
             pst.setInt(1,idPaciente);
             pst.setInt(2,idTrabajadorSocial);
             pst.executeUpdate();
             return true;
         }catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
            return false;
        } finally {
            cerrar();
        }
    }
    public boolean liberarLista(int idPaciente, int idTrabajadorSocial){
         try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
             sql = " call `sp.sp.LiberarListaEspera` (?,?)";
             pst = con.prepareCall(sql);
             pst.setInt(1,idPaciente);
             pst.setInt(2,idTrabajadorSocial);
             pst.executeUpdate();
             return true;
         }catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
            return false;
        } finally {
            cerrar();
        }
    }
     public ListaEspera get(int idPaciente){
         try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
             sql = " call `sp.sp.getListaEspera` (?)";
             pst = con.prepareCall(sql);
             pst.setInt(1,idPaciente);
             rs = pst.executeQuery();
             ListaEspera resultado = new ListaEspera();
             while(rs.next()){
                 resultado = new ListaEspera(
                        rs.getInt("idLista"),
                        rs.getInt("idPaciente"),
                        rs.getInt("idTrabajadorSocial"),
                        rs.getString("fechaModificacion"),
                        rs.getInt("usuarioModificacion"),
                        rs.getString("estado")
                        
                );
             }
             return resultado;
         }catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
            return new ListaEspera();
        } finally {
            cerrar();
        }
    }
     public ArrayList<ListaEspera> Listar(){
        ArrayList<ListaEspera> lista = new ArrayList();
         try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
             sql = " call `sp.sp.getListarEspera` ()";
             pst = con.prepareCall(sql);
             rs = pst.executeQuery();
             ListaEspera resultado = new ListaEspera();
             while(rs.next()){
                 resultado = new ListaEspera(
                        rs.getInt("idLista"),
                        rs.getInt("idPaciente"),
                        rs.getInt("idTrabajadorSocial"),
                        rs.getString("fechaModificacion"),
                        rs.getInt("usuarioModificacion"),
                        rs.getString("estado")
                        
                );
                 resultado.addPaciente(new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),
                        rs.getString("dni"),rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                       rs.getString("telefonoOpcional"), rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad"),rs.getString("detalleDerivado"),
                        rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                         rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajadorSocial")
                ));
                 lista.add(resultado);
             }
            
         }catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
          return lista;
    }

     private void cerrar() {
        try {
            if (pst != null) {
                pst.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public int getId() {
        return id;
    }

    public int getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public ArrayList<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(ArrayList<Paciente> paciente) {
        this.paciente = paciente;
    }
 
    public void setUsuarioModificacion(int usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public void addPaciente(Paciente p){
        paciente.add(p);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdTrabajadorSocial() {
        return idTrabajadorSocial;
    }

    public void setIdTrabajadorSocial(int idTrabajadorSocial) {
        this.idTrabajadorSocial = idTrabajadorSocial;
    }

    public int getTerapeutaAsignado() {
        return terapeutaAsignado;
    }

    public void setTerapeutaAsignado(int terapeutaAsignado) {
        this.terapeutaAsignado = terapeutaAsignado;
    }

   

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + this.idPaciente;
        hash = 67 * hash + this.idTrabajadorSocial;
        hash = 67 * hash + this.terapeutaAsignado;
        hash = 67 * hash + Objects.hashCode(this.estado);
        hash = 67 * hash + Objects.hashCode(this.fechaModificacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListaEspera other = (ListaEspera) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        if (this.idTrabajadorSocial != other.idTrabajadorSocial) {
            return false;
        }
        if (this.terapeutaAsignado != other.terapeutaAsignado) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return Objects.equals(this.fechaModificacion, other.fechaModificacion);
    }

    

    @Override
    public String toString() {
        return "ListaEspera{" + "id=" + id + ", idPaciente=" + idPaciente + ", idTrabajadorSocial=" + idTrabajadorSocial + ", estado=" + estado + '}';
    }
    
    
}
