package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IndiceBienestar {

    int id=-1,idPaciente,idUsuario;
    String fecha,observacion,estado;
    int sumatoria,q1,q2,q3,q4,q5;

    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public IndiceBienestar() {
    }
    public static void main(String[] args) {
        System.out.println("Días para comerme ese bombom: "+new tools().diferenciaFecha("2022-09-12", "2023-02-18"));
    }
    public IndiceBienestar(int id, int idPaciente, int idUsuario, String fecha, String observacion, String estado, int sumatoria, int q1, int q2, int q3, int q4, int q5) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.observacion = observacion;
        this.estado = estado;
        this.sumatoria = sumatoria;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
    }

    

    

    public ArrayList Listar() {
        ArrayList<IndiceBienestar> lista = new ArrayList();

        sql = "call `sp.getIndiceBienestar ()";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new IndiceBienestar(rs.getInt("id"),rs.getInt("idPaciente"),rs.getInt("idUsuario"),rs.getString("fecha"),
                rs.getString("observacion"),rs.getString("estado"),rs.getInt("sumatoria"),rs.getInt("q1"),rs.getInt("q2")
                ,rs.getInt("q3"),rs.getInt("q4"),rs.getInt("q5")));
            }
        } catch (Exception e) {
            Logger.getLogger(IndiceBienestar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public int newIndice(int idPacientex, int idUsuariox, String observacionx, String estadox, int q1, int q2, int q3, int q4, int q5) {
        int valor = 0;
        sql = "call  `sp.newIndiceBienestar` (?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1,idPacientex);
            pst.setInt(2,idUsuariox);
            pst.setString(3,observacionx);
            pst.setString(4,estadox);
            pst.setInt(5,q1);
            pst.setInt(6,q2);
            pst.setInt(7,q3);
            pst.setInt(8,q4);
            pst.setInt(9,q5);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(IndiceBienestar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    

     public ArrayList getRegistroxPaciente(int idPacientex) {
        ArrayList<IndiceBienestar> lista = new ArrayList();

        sql = "call `sp.getIndicesxPaciente` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idPacientex);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new IndiceBienestar(rs.getInt("id"),rs.getInt("idPaciente"),rs.getInt("idUsuario"),rs.getString("fecha"),
                rs.getString("observacion"),rs.getString("estado"),rs.getInt("sumatoria"),rs.getInt("q1"),rs.getInt("q2")
                ,rs.getInt("q3"),rs.getInt("q4"),rs.getInt("q5")));
            }
        } catch (Exception e) {
            Logger.getLogger(IndiceBienestar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    public ArrayList getRegistroxUsuario(int idPacientex) {
        ArrayList<IndiceBienestar> lista = new ArrayList();

        sql = "call `sp.getIndicesxUsuario` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idPacientex);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new IndiceBienestar(rs.getInt("id"),rs.getInt("idPaciente"),rs.getInt("idUsuario"),rs.getString("fecha"),
                rs.getString("observacion"),rs.getString("estado"),rs.getInt("sumatoria"),rs.getInt("q1"),rs.getInt("q2")
                ,rs.getInt("q3"),rs.getInt("q4"),rs.getInt("q5")));
            }
        } catch (Exception e) {
            Logger.getLogger(IndiceBienestar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    public ArrayList getRegistroxFechas(String fecha01, String fecha02) {
        ArrayList<IndiceBienestar> lista = new ArrayList();

        sql = "call `sp.getIndicesxFecha` (?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, fecha01);
            pst.setString(2, fecha02);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new IndiceBienestar(rs.getInt("id"),rs.getInt("idPaciente"),rs.getInt("idUsuario"),rs.getString("fecha"),
                rs.getString("observacion"),rs.getString("estado"),rs.getInt("sumatoria"),rs.getInt("q1"),rs.getInt("q2")
                ,rs.getInt("q3"),rs.getInt("q4"),rs.getInt("q5")));
            }
        } catch (Exception e) {
            Logger.getLogger(IndiceBienestar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
public ArrayList getRegistroxSumatoria(int sumatoria01, int sumatoria02) {
        ArrayList<IndiceBienestar> lista = new ArrayList();

        sql = "call `sp.getIndicesxFecha` (?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, sumatoria01);
            pst.setInt(2, sumatoria02);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new IndiceBienestar(rs.getInt("id"),rs.getInt("idPaciente"),rs.getInt("idUsuario"),rs.getString("fecha"),
                rs.getString("observacion"),rs.getString("estado"),rs.getInt("sumatoria"),rs.getInt("q1"),rs.getInt("q2")
                ,rs.getInt("q3"),rs.getInt("q4"),rs.getInt("q5")));
            }
        } catch (Exception e) {
            Logger.getLogger(IndiceBienestar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    @Override
    public String toString() {
        return "IndiceBienestar{" + "id=" + id + ", idPaciente=" + idPaciente + ", idUsuario=" + idUsuario + ", fecha=" + fecha + ", observacion=" + observacion + ", estado=" + estado + ", sumatoria=" + sumatoria + ", q1=" + q1 + ", q2=" + q2 + ", q3=" + q3 + ", q4=" + q4 + ", q5=" + q5 + '}';
    }

    public int getId() {
        return id;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(int sumatoria) {
        this.sumatoria = sumatoria;
    }

    public int getQ1() {
        return q1;
    }

    public void setQ1(int q1) {
        this.q1 = q1;
    }

    public int getQ2() {
        return q2;
    }

    public void setQ2(int q2) {
        this.q2 = q2;
    }

    public int getQ3() {
        return q3;
    }

    public void setQ3(int q3) {
        this.q3 = q3;
    }

    public int getQ4() {
        return q4;
    }

    public void setQ4(int q4) {
        this.q4 = q4;
    }

    public int getQ5() {
        return q5;
    }

    public void setQ5(int q5) {
        this.q5 = q5;
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
            Logger.getLogger(IndiceBienestar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
