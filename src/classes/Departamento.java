package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Departamento {

    int id,idPadre;
    String valor,tipo, estado;

    String sql;
    PreparedStatement pst;
    ResultSet rs;

    ArrayList<Departamento> distritos = new ArrayList();
    public Departamento() {
    }

    public Departamento(int id, int idPadre, String valor, String tipo, String estado) {
        this.id = id;
        this.idPadre = idPadre;
        this.valor = valor;
        this.tipo = tipo;
        this.estado = estado;
    }

    

    public ArrayList Listar() {
        ArrayList<Departamento> lista = new ArrayList();
        sql = "call `sp.getDepartamentos` ()";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Departamento(rs.getInt("id"),rs.getInt("idPadre"), rs.getString("valor"), 
                        rs.getString("tipo"),rs.getString("estado")));
            }
        } catch (Exception e) {
            Logger.getLogger(Departamento.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public int newDepartamento(String nombrex, int idPadrex, String tipox) {
        int valor = 0;
        sql = "call  `sp.newDepartamento` (?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, nombrex);
            pst.setInt(2, idPadrex);
            pst.setString(3, tipox);
            rs = pst.executeQuery();
            while(rs.next()){
                valor = rs.getInt("newId");
            }
        } catch (Exception e) {
            Logger.getLogger(Departamento.class.getName()).log(Level.SEVERE, null, e);
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

    public int getPadre() {
        return idPadre;
    }

    public void setPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public String getNombre() {
        return valor;
    }

    public void setNombre(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   

    public ArrayList<Departamento> getDistritos() {
        return distritos;
    }

    public void setDistritos(ArrayList<Departamento> distritos) {
        this.distritos = distritos;
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
            Logger.getLogger(Departamento.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
