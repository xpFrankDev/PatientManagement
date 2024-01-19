package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegistroPaciente {

     int idRP,idPaciente,idUsuario,idUsuarioAsignado;
     String fechaRP,accionRP,observacionRP,fechaAsignada,estadoRP;

     String sql;
     PreparedStatement pst;
     ResultSet rs;

    public RegistroPaciente() {
    }

    public RegistroPaciente(int id, int idPaciente, int idUsuario, int idUsuarioAsignado, String fecha, String accion, String observacion, String fechaAsignada, String estado) {
        this.idRP = id;
        this.idPaciente = idPaciente;
        this.idUsuario = idUsuario;
        this.idUsuarioAsignado = idUsuarioAsignado;
        this.fechaRP = fecha;
        this.accionRP = accion;
        this.observacionRP = observacion;
        this.fechaAsignada = fechaAsignada;
        this.estadoRP=estado;
    }

    

    public ArrayList Listar(String valor) {
        ArrayList<RegistroPaciente> lista = new ArrayList();

        sql = "call `sp.getRegistrosPaciente` ()";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                                                                                                                                                                                                                                             
                lista.add(new RegistroPaciente(rs.getInt("idRP"),rs.getInt("idPaciente"),rs.getInt("idUsuario"),rs.getInt("idUsuarioAsignado"),
                rs.getString("fecha"),rs.getString("accion"),rs.getString("observacion"),rs.getString("fechaAsignadaRP"),rs.getString("estado")));
            }
        } catch (Exception e) {
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public int newRegistro(int idPacientex, int idUsuariox, int idUsuarioAsignadox,String accionx,
            String observacionx, String fechaAsignadax,String estadox) {
        int valor = 0;
        sql = "call  `sp.newRegistroPaciente` (?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1,idPacientex);
            pst.setInt(2,idUsuariox);
            pst.setInt(3,idUsuarioAsignadox);
            pst.setString(4, accionx);
            pst.setString(5, observacionx);
            pst.setString(6, fechaAsignadax);
            pst.setString(7, estadox);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public int UpdateRegistro() {
        int valor = 0;
        sql = "call  `sp.UpdateRegistroPacientes` (?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idRP);
            pst.setInt(2, idUsuarioAsignado);
            pst.setString(3, accionRP);
            pst.setString(4, observacionRP);
            pst.setString(5, fechaAsignada);
            pst.setString(6, estadoRP);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }
 public int DeleteRegistro(int idx) {
        int valor = 0;
        sql = "call  `sp.DeleteRegistroPaciente` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idx);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }
     public ArrayList getRegistroxPaciente(int idPacientex) {
        ArrayList<RegistroPaciente> lista = new ArrayList();

        sql = "call `sp.getRegistrosxPaciente` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idPacientex);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new RegistroPaciente(rs.getInt("idRP"),rs.getInt("idPaciente"),rs.getInt("idUsuario"),rs.getInt("idUsuarioAsignado"),
                rs.getString("fecha"),rs.getString("accion"),rs.getString("observacion"),rs.getString("fechaAsignadaRP"),rs.getString("estado")));
            }
        } catch (Exception e) {
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    
     public ArrayList getRegistroxUsuario(int idUsuariox) {
        ArrayList<RegistroPaciente> lista = new ArrayList();

        sql = "call `sp.getRegistrosxUsuario` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idUsuariox);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new RegistroPaciente(rs.getInt("idRP"),rs.getInt("idPaciente"),rs.getInt("idUsuario"),rs.getInt("idUsuarioAsignado"),
                rs.getString("fecha"),rs.getString("accion"),rs.getString("observacion"),rs.getString("fechaAsignadaRP"),rs.getString("estado")));
            }
        } catch (Exception e) {
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
     
    public ArrayList getRegistroxFechas(String fecha01, String fecha02) {
        ArrayList<RegistroPaciente> lista = new ArrayList();

        sql = "call `sp.getRegistrosxFecha` (?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, fecha01);
            pst.setString(2, fecha02);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new RegistroPaciente(rs.getInt("idRP"),rs.getInt("idPaciente"),rs.getInt("idUsuario"),rs.getInt("idUsuarioAsignado"),
                rs.getString("fecha"),rs.getString("accion"),rs.getString("observacion"),rs.getString("fechaAsignadaRP"),rs.getString("estado")));
            }
        } catch (Exception e) {
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    
     public ArrayList getRegistroxEstado(String estadox) {
        ArrayList<RegistroPaciente> lista = new ArrayList();

        sql = "call `sp.getRegistrosxEstado` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, estadox);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new RegistroPaciente(rs.getInt("idRP"),rs.getInt("idPaciente"),rs.getInt("idUsuario"),rs.getInt("idUsuarioAsignado"),
                rs.getString("fecha"),rs.getString("accion"),rs.getString("observacion"),rs.getString("fechaAsignadaRP"),rs.getString("estado")));
            }
        } catch (Exception e) {
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    
    @Override
    public String toString() {
        return "RegistroPaciente{" + "id=" + idRP + ", idPaciente=" + idPaciente + ", idUsuario=" + idUsuario + ", idUsuarioAsignado=" + idUsuarioAsignado + ", fecha=" + fechaRP + ", accion=" + accionRP + ", observacion=" + observacionRP + ", fechaAsignada=" + fechaAsignada + '}';
    }

    public  int getIdRP() {
        return idRP;
    }

    public  void setIdRP(int idRP) {
        this.idRP = idRP;
    }

    public  int getIdPaciente() {
        return idPaciente;
    }

    public  void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public  int getIdUsuario() {
        return idUsuario;
    }

    public  void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public  int getIdUsuarioAsignado() {
        return idUsuarioAsignado;
    }

    public  void setIdUsuarioAsignado(int idUsuarioAsignado) {
        this.idUsuarioAsignado = idUsuarioAsignado;
    }

    public  String getFechaRP() {
        return fechaRP;
    }

    public  void setFechaRP(String fechaRP) {
        this.fechaRP = fechaRP;
    }

    public  String getAccionRP() {
        return accionRP;
    }

    public  void setAccionRP(String accionRP) {
        this.accionRP = accionRP;
    }

    public  String getObservacionRP() {
        return observacionRP;
    }

    public  void setObservacionRP(String observacionRP) {
        this.observacionRP = observacionRP;
    }

    public  String getFechaAsignada() {
        return fechaAsignada;
    }

    public  void setFechaAsignada(String fechaAsignada) {
        this.fechaAsignada = fechaAsignada;
    }

    public  String getEstadoRP() {
        return estadoRP;
    }

    public void setEstadoRP(String estadoRP) {
        this.estadoRP = estadoRP;
    }

    
    
   

    private  void cerrar() {
        try {
            if (pst != null) {
                pst.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
