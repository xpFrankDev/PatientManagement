package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TipoDocumento {

    int id;
    String valor, estado;

    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public TipoDocumento() {
    }

    public TipoDocumento(int id, String nombre, String estado) {
        this.id = id;
        this.valor = nombre;
        this.estado = estado;
    }

    public static void main(String[] args) {
       
        
    }
    
    public ArrayList Listar(String valor) {
        ArrayList<TipoDocumento> lista = new ArrayList();

        sql = "call `sp.getDocumentos` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_siscaps").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, valor);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new TipoDocumento(rs.getInt("id"), rs.getString("valor"), rs.getString("estado")));
            }
        } catch (Exception e) {
            Logger.getLogger(TipoDocumento.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public int newDocumento(String nombrex) {
        int valor = 0;
        sql = "call  `sp.newDocumento` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_siscaps").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, nombrex);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(TipoDocumento.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public int updateDocumento(int idx, String nombrex, String estadox) {
        int valor = 0;
        sql = "call  `sp.UpdateDocumento` (?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_siscaps").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idx);
            pst.setString(2, nombrex);
            pst.setString(3, estadox);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(TipoDocumento.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
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
            Logger.getLogger(TipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
