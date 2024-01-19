package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ObsPaciente {

    int id,idPaciente,idTerapeuta;
    String valor, estado,fecha;

    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public ObsPaciente() {
    }

    public ObsPaciente(int id, int idPaciente, int idTerapeuta, String valor, String estado, String fecha) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.idTerapeuta = idTerapeuta;
        this.valor = valor;
        this.estado = estado;
        this.fecha = fecha;
    }

    

    public ArrayList Listar() {
        ArrayList<ObsPaciente> lista = new ArrayList();

        sql = "call `sp.getObsPaciente` ()";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new ObsPaciente(rs.getInt("id"), rs.getInt("idPaciente"),
                        rs.getInt("idTerapeuta"),rs.getString("valor"),rs.getString("estado"),rs.getString("fecha")));
            }
        } catch (Exception e) {
            Logger.getLogger(ObsPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public int newObservacion(String varlox, int idPacientex, int idTerapeutax) {
        int valor = 0;
        sql = "call  `sp.newObsPaciente` (?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, varlox);
             pst.setInt(2,idPacientex);
            pst.setInt(3,idTerapeutax);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(ObsPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public int updateObservacion(int idx,int idPacientex, String valorx, String estadox) {
        int valor = 0;
        sql = "call  `sp.UpdateObsPaciente` (?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idx);
            pst.setInt(2, idPacientex);
            pst.setString(3, valorx);
            pst.setString(4, estadox);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(ObsPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }
public int deleteObservacion(int idx) {
        int valor = 0;
        sql = "call  `sp.DeleteObsPaciente` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idx);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(ObsPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

public ArrayList getObservacionxTerapeuta(int idTerapeutax) {
        ArrayList<ObsPaciente> lista = new ArrayList();

        sql = "call `sp.getObsPacientexTerapeuta` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idTerapeutax);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new ObsPaciente(rs.getInt("id"), rs.getInt("idPaciente"),
                        rs.getInt("idTerapeuta"),rs.getString("valor"),rs.getString("estado"),rs.getString("fecha")));
            }
        } catch (Exception e) {
            Logger.getLogger(ObsPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
public ArrayList getObservacionxPaciente(int idPacientex) {
        ArrayList<ObsPaciente> lista = new ArrayList();

        sql = "call `sp.getObsPacientexPaciente` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idPacientex);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new ObsPaciente(rs.getInt("id"), rs.getInt("idPaciente"),
                        rs.getInt("idTerapeuta"),rs.getString("valor"),rs.getString("estado"),rs.getString("fecha")));
            }
        } catch (Exception e) {
            Logger.getLogger(ObsPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

public ArrayList getObservacionxFecha(String fecha01, String fecha02) {
        ArrayList<ObsPaciente> lista = new ArrayList();

        sql = "call `sp.getObsPacientexFecha` (?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, fecha01);
            pst.setString(2, fecha02);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new ObsPaciente(rs.getInt("id"), rs.getInt("idPaciente"),
                        rs.getInt("idTerapeuta"),rs.getString("valor"),rs.getString("estado"),rs.getString("fecha")));
            }
        } catch (Exception e) {
            Logger.getLogger(ObsPaciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.valor = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
            Logger.getLogger(ObsPaciente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
