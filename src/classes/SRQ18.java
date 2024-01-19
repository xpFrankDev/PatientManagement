package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SRQ18 {

    int idsrq=-1, idPacienteSrq, idTerapeutaSrq, puntajeSi;
    String lugar, estado, tipo, fechaSrq;
    String q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18;
    ArrayList<String> respuestas = new ArrayList();
    int sumatoria = -1;
    Paciente paciente;
    Usuario terapeuta;
    String observacionx;
    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public SRQ18() {
    }

    public SRQ18(int id, int idPaciente, int idTerapeuta, String fechaSrq, int puntajeSi, String lugar, String estado, String tipo, String q1, String q2, String q3, String q4, String q5, String q6, String q7, String q8, String q9, String q10, String q11, String q12, String q13, String q14, String q15, String q16, String q17, String q18, int sumatoria,String observacionx) {
        this.idsrq = id;
        this.idPacienteSrq = idPaciente;
        this.idTerapeutaSrq = idTerapeuta;
        this.fechaSrq = fechaSrq;
        this.puntajeSi = puntajeSi;
        this.lugar = lugar;
        this.estado = estado;
        this.tipo = tipo;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
        this.q6 = q6;
        this.q7 = q7;
        this.q8 = q8;
        this.q9 = q9;
        this.q10 = q10;
        this.q11 = q11;
        this.q12 = q12;
        this.q13 = q13;
        this.q14 = q14;
        this.q15 = q15;
        this.q16 = q16;
        this.q17 = q17;
        this.q18 = q18;
        this.sumatoria = sumatoria;
        this.observacionx=observacionx;
    }
    public SRQ18(int id, int idPaciente, int idTerapeuta, String fechaSrq, int puntajeSi, String lugar, String estado, String tipo, ArrayList respuestas, int sumatoria,String observacionx) {
        this.idsrq = id;
        this.idPacienteSrq = idPaciente;
        this.idTerapeutaSrq = idTerapeuta;
        this.fechaSrq = fechaSrq;
        this.puntajeSi = puntajeSi;
        this.lugar = lugar;
        this.estado = estado;
        this.tipo = tipo;
        this.respuestas=respuestas;
        
        this.sumatoria = sumatoria;
        this.observacionx=observacionx;
    }
    @Override
    public int hashCode() {
        return Objects.hash(idPacienteSrq, idTerapeutaSrq, puntajeSi,
                lugar, estado, tipo, fechaSrq, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, sumatoria);
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

        SRQ18 p = (SRQ18) obj;

        return Float.compare(idPacienteSrq, p.idPacienteSrq) == 0 && Float.compare(idTerapeutaSrq, p.idTerapeutaSrq) == 0 && Float.compare(puntajeSi, p.puntajeSi) == 0
                && lugar.equals(p.lugar) && estado.equals(p.estado) && tipo.equals(p.tipo) && fechaSrq.equals(p.fechaSrq)
                && q1.equals(p.q1) && q2.equals(p.q2) && q3.equals(p.q3) && q4.equals(p.q4)
                && q5.equals(p.q5) && q6.equals(p.q6) && q7.equals(p.q7) && q8.equals(p.q8) && q9.equals(p.q9) && q10.equals(p.q10)
                && q11.equals(p.q11) && q12.equals(p.q12) && q13.equals(p.q13) && q14.equals(p.q14)
                && q15.equals(p.q15) && q16.equals(p.q16) && q17.equals(p.q17) && q18.equals(p.q18) && Float.compare(sumatoria, p.sumatoria) == 0 && observacionx.equals(p.observacionx);
    }

    public ArrayList Listar() {
        ArrayList<SRQ18> lista = new ArrayList();

        sql = "call `sp.getSRQ18` ()";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new SRQ18(rs.getInt("idsrq"),
                        rs.getInt("idPacienteSrq"), rs.getInt("idTerapeutaSrq"), rs.getString("fechaSrq"), rs.getInt("puntajeSi"), rs.getString("lugar"), rs.getString("estadoSrq"),
                        rs.getString("tipo"), rs.getString("q1"), rs.getString("q2"), rs.getString("q3"), rs.getString("q4"),
                        rs.getString("q5"), rs.getString("q6"), rs.getString("q7"), rs.getString("q8"), rs.getString("q9"),
                        rs.getString("q10"), rs.getString("q11"), rs.getString("q12"), rs.getString("q13"), rs.getString("q14"),
                        rs.getString("q15"), rs.getString("q16"), rs.getString("q17"), rs.getString("q18"), rs.getInt("sumatoria"),rs.getString("observacionSrq")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public int newSRQ18(int idPacientex, int idTerapeutax, String lugarx, int puntajeSix, String tipox,
            ArrayList<String> respuestas, int sumatoria, String observacionx) {
        int valor = 0;
        sql = "call  `sp.newSRQ18` (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idPacientex);
            pst.setInt(2, idTerapeutax);
            pst.setString(3, lugarx);
            pst.setInt(4, puntajeSix);
            pst.setString(5, tipox);
            pst.setString(6, respuestas.get(0));
            pst.setString(7, respuestas.get(1));
            pst.setString(8, respuestas.get(2));
            pst.setString(9, respuestas.get(3));
            pst.setString(10, respuestas.get(4));
            pst.setString(11, respuestas.get(5));
            pst.setString(12, respuestas.get(6));
            pst.setString(13, respuestas.get(7));
            pst.setString(14, respuestas.get(8));
            pst.setString(15, respuestas.get(9));
            pst.setString(16, respuestas.get(10));
            pst.setString(17, respuestas.get(11));
            pst.setString(18, respuestas.get(12));
            pst.setString(19, respuestas.get(13));
            pst.setString(20, respuestas.get(14));
            pst.setString(21, respuestas.get(15));
            pst.setString(22, respuestas.get(16));
            pst.setString(23, respuestas.get(17));
            pst.setInt(24, sumatoria);
            pst.setString(25, observacionx);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public int updateSRQ18(int idx, int idPacientex, String lugarx, int puntajeSix, String tipox,
            String q1x, String q2x, String q3x, String q4x, String q5x, String q6x, String q7x, String q8x, String q9x,
            String q10x, String q11x, String q12x, String q13x, String q14x, String q15x, String q16x, String q17x, String q18x) {
        int valor = 0;
        sql = "call  `sp.UpdateSRQ18` (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idx);
            pst.setInt(2, idPacientex);
            pst.setString(3, lugarx);
            pst.setInt(4, puntajeSix);
            pst.setString(5, tipox);
            pst.setString(6, q1x);
            pst.setString(7, q2x);
            pst.setString(8, q3x);
            pst.setString(9, q4x);
            pst.setString(10, q5x);
            pst.setString(11, q6x);
            pst.setString(12, q7x);
            pst.setString(13, q8x);
            pst.setString(14, q9x);
            pst.setString(15, q10x);
            pst.setString(16, q11x);
            pst.setString(17, q12x);
            pst.setString(18, q13x);
            pst.setString(19, q14x);
            pst.setString(20, q15x);
            pst.setString(21, q16x);
            pst.setString(22, q17x);
            pst.setString(23, q18x);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public int deleteSRQ18(int idx) {
        int valor = 0;
        sql = "call  `sp.DeleteSRQ18` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idx);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public ArrayList getSRQ18xPaciente(int idPacientex) {
        ArrayList<SRQ18> lista = new ArrayList();

        sql = "call `sp.getSRQ18xPaciente` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idPacientex);
            rs = pst.executeQuery();
            while (rs.next()) {
                SRQ18 temp = new SRQ18(rs.getInt("idsrq"),
                        rs.getInt("idPacientesrq"), rs.getInt("idTerapeutasrq"), rs.getString("fechaSrq"), rs.getInt("puntajeSi"), rs.getString("lugar"), rs.getString("estadosrq"),
                        rs.getString("tipo"), rs.getString("q1"), rs.getString("q2"), rs.getString("q3"), rs.getString("q4"),
                        rs.getString("q5"), rs.getString("q6"), rs.getString("q7"), rs.getString("q8"), rs.getString("q9"),
                        rs.getString("q10"), rs.getString("q11"), rs.getString("q12"), rs.getString("q13"), rs.getString("q14"),
                        rs.getString("q15"), rs.getString("q16"), rs.getString("q17"), rs.getString("q18"), rs.getInt("sumatoria"),rs.getString("observacionSrq")
                );
                temp.getRespuestas().add(temp.q1);temp.getRespuestas().add(temp.q2);temp.getRespuestas().add(temp.q3);
                temp.getRespuestas().add(temp.q4);temp.getRespuestas().add(temp.q5);temp.getRespuestas().add(temp.q6);
                temp.getRespuestas().add(temp.q7);temp.getRespuestas().add(temp.q8);temp.getRespuestas().add(temp.q9);
                temp.getRespuestas().add(temp.q10);temp.getRespuestas().add(temp.q11);temp.getRespuestas().add(temp.q12);
                temp.getRespuestas().add(temp.q13);temp.getRespuestas().add(temp.q14);temp.getRespuestas().add(temp.q15);
                temp.getRespuestas().add(temp.q16);temp.getRespuestas().add(temp.q17);temp.getRespuestas().add(temp.q18);
                lista.add(temp);
            }
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList getSRQ18xTerapeuta(int idTerapeutax) {
        ArrayList<SRQ18> lista = new ArrayList();

        sql = "call `sp.getSRQ18xTerapeuta` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idTerapeutax);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new SRQ18(rs.getInt("idsrq"),
                        rs.getInt("idPacientesrq"), rs.getInt("idTerapeutasrq"), rs.getString("fechaSrq"), rs.getInt("puntajeSi"), rs.getString("lugar"), rs.getString("estadosrq"),
                        rs.getString("tipo"), rs.getString("q1"), rs.getString("q2"), rs.getString("q3"), rs.getString("q4"),
                        rs.getString("q5"), rs.getString("q6"), rs.getString("q7"), rs.getString("q8"), rs.getString("q9"),
                        rs.getString("q10"), rs.getString("q11"), rs.getString("q12"), rs.getString("q13"), rs.getString("q14"),
                        rs.getString("q15"), rs.getString("q16"), rs.getString("q17"), rs.getString("q18"), rs.getInt("sumatoria"),rs.getString("observacionSrq")));
            }
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList getSRQ18xFecha(String fecha01, String fecha02) {
        ArrayList<SRQ18> lista = new ArrayList();

        sql = "call `sp.getSRQ18xFecha` (?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, fecha01);
            pst.setString(2, fecha02);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new SRQ18(rs.getInt("idsrq"),
                        rs.getInt("idPacientesrq"), rs.getInt("idTerapeutasrq"), rs.getString("fechaSrq"), rs.getInt("puntajeSi"), rs.getString("lugar"), rs.getString("estadosrq"),
                        rs.getString("tipo"), rs.getString("q1"), rs.getString("q2"), rs.getString("q3"), rs.getString("q4"),
                        rs.getString("q5"), rs.getString("q6"), rs.getString("q7"), rs.getString("q8"), rs.getString("q9"),
                        rs.getString("q10"), rs.getString("q11"), rs.getString("q12"), rs.getString("q13"), rs.getString("q14"),
                        rs.getString("q15"), rs.getString("q16"), rs.getString("q17"), rs.getString("q18"), rs.getInt("sumatoria"),rs.getString("observacionSrq")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList<Paciente> ListarxPaciente() {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getSRQ18` ()";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Paciente p = new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"), rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad"),rs.getString("detalleDerivado"),
                        rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial"));

                SRQ18 srq = new SRQ18(rs.getInt("idsrq"),
                        rs.getInt("idPacientesrq"), rs.getInt("idTerapeutasrq"), rs.getString("fechaSrq"), rs.getInt("puntajeSi"), rs.getString("lugar"), rs.getString("estadosrq"),
                        rs.getString("tipo"), rs.getString("q1"), rs.getString("q2"), rs.getString("q3"), rs.getString("q4"),
                        rs.getString("q5"), rs.getString("q6"), rs.getString("q7"), rs.getString("q8"), rs.getString("q9"),
                        rs.getString("q10"), rs.getString("q11"), rs.getString("q12"), rs.getString("q13"), rs.getString("q14"),
                        rs.getString("q15"), rs.getString("q16"), rs.getString("q17"), rs.getString("q18"), rs.getInt("sumatoria"),rs.getString("observacionSrq"));

                if (lista.isEmpty()) {
                    p.addSRQ18(srq);
                    lista.add(p);
                } else {
                    if (lista.contains(p)) {
                        int index = lista.indexOf(p);
                        if (!lista.get(index).getSrq18s().contains(srq)) {
                            lista.get(index).addSRQ18(srq);
                        }
                    } else {
                        p.addSRQ18(srq);
                        lista.add(p);
                    }
                }

            }
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    public ArrayList<SRQ18> ListaSRQ18conPacienteyTerapeutaxRango(String fecha01, String fecha02) {
        ArrayList<SRQ18> lista = new ArrayList();
        Usuario usuario = new Usuario();
        sql = "call `sp.getSRQ18conPacienteyTerapeutaxRango` (?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1,fecha01);
            pst.setString(2,fecha02);
            rs = pst.executeQuery();
            while (rs.next()) {
                Paciente p = new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"), rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad"),rs.getString("detalleDerivado"),
                        rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial"));
                usuario.setId(rs.getInt("id"));
                usuario.setDni(rs.getString("dni"));
                usuario.setIdJefe(rs.getInt("idJefe"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCodigo(rs.getString("codigo"));
                usuario.setClave(new EncriptadorAES().desencriptar(rs.getString("clave")));
                usuario.setUsername(rs.getString("username"));
                usuario.setPriv(rs.getString("priv"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setFechaCreacion(rs.getString("fechaCreacion"));
                usuario.setCorreo(rs.getString("correo"));
                
                SRQ18 srq = new SRQ18(rs.getInt("idsrq"),
                        rs.getInt("idPacientesrq"), rs.getInt("idTerapeutasrq"), rs.getString("fechaSrq"), rs.getInt("puntajeSi"), rs.getString("lugar"), rs.getString("estadosrq"),
                        rs.getString("tipo"), rs.getString("q1"), rs.getString("q2"), rs.getString("q3"), rs.getString("q4"),
                        rs.getString("q5"), rs.getString("q6"), rs.getString("q7"), rs.getString("q8"), rs.getString("q9"),
                        rs.getString("q10"), rs.getString("q11"), rs.getString("q12"), rs.getString("q13"), rs.getString("q14"),
                        rs.getString("q15"), rs.getString("q16"), rs.getString("q17"), rs.getString("q18"), rs.getInt("sumatoria"),rs.getString("observacionSrq"));
                
                srq.setTerapeuta(usuario);
                srq.setPaciente(p);
                lista.add(srq);

            }
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    

    public ArrayList getSRQ18xEstado(String valorx) {
        ArrayList<SRQ18> lista = new ArrayList();

        sql = "call `sp.getSRQ18xFecha` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, valorx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new SRQ18(rs.getInt("idsrq"),
                        rs.getInt("idPacientesrq"), rs.getInt("idTerapeutasrq"), rs.getString("fechaSrq"), rs.getInt("puntajeSi"), rs.getString("lugar"), rs.getString("estadosrq"),
                        rs.getString("tipo"), rs.getString("q1"), rs.getString("q2"), rs.getString("q3"), rs.getString("q4"),
                        rs.getString("q5"), rs.getString("q6"), rs.getString("q7"), rs.getString("q8"), rs.getString("q9"),
                        rs.getString("q10"), rs.getString("q11"), rs.getString("q12"), rs.getString("q13"), rs.getString("q14"),
                        rs.getString("q15"), rs.getString("q16"), rs.getString("q17"), rs.getString("q18"), rs.getInt("sumatoria1"),rs.getString("observacionSrq")));
            }
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    @Override
    public String toString() {
        return "SRQ18{" + "idsrq=" + idsrq + ", idPacienteSrq=" + idPacienteSrq + ", idTerapeutaSrq=" + idTerapeutaSrq + ", puntajeSi=" + puntajeSi + ", lugar=" + lugar + ", estado=" + estado + ", tipo=" + tipo + ", fechaSrq=" + fechaSrq + ", q1=" + q1 + ", q2=" + q2 + ", q3=" + q3 + ", q4=" + q4 + ", q5=" + q5 + ", q6=" + q6 + ", q7=" + q7 + ", q8=" + q8 + ", q9=" + q9 + ", q10=" + q10 + ", q11=" + q11 + ", q12=" + q12 + ", q13=" + q13 + ", q14=" + q14 + ", q15=" + q15 + ", q16=" + q16 + ", q17=" + q17 + ", q18=" + q18 + ", sumatoria=" + sumatoria + '}';
    }

    public int getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(int sumatoria) {
        this.sumatoria = sumatoria;
    }

    public int getId() {
        return idsrq;
    }

    public void setId(int id) {
        this.idsrq = id;
    }

    public int getIdPaciente() {
        return idPacienteSrq;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPacienteSrq = idPaciente;
    }

    public int getIdTerapeuta() {
        return idTerapeutaSrq;
    }

    public void setIdTerapeuta(int idTerapeuta) {
        this.idTerapeutaSrq = idTerapeuta;
    }

    public int getPuntajeSi() {
        return puntajeSi;
    }

    public void setPuntajeSi(int puntajeSi) {
        this.puntajeSi = puntajeSi;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public String getQ5() {
        return q5;
    }

    public void setQ5(String q5) {
        this.q5 = q5;
    }

    public String getQ6() {
        return q6;
    }

    public void setQ6(String q6) {
        this.q6 = q6;
    }

    public String getQ7() {
        return q7;
    }

    public void setQ7(String q7) {
        this.q7 = q7;
    }

    public String getQ8() {
        return q8;
    }

    public void setQ8(String q8) {
        this.q8 = q8;
    }

    public String getQ9() {
        return q9;
    }

    public void setQ9(String q9) {
        this.q9 = q9;
    }

    public String getQ10() {
        return q10;
    }

    public void setQ10(String q10) {
        this.q10 = q10;
    }

    public String getQ11() {
        return q11;
    }

    public void setQ11(String q11) {
        this.q11 = q11;
    }

    public String getQ12() {
        return q12;
    }

    public void setQ12(String q12) {
        this.q12 = q12;
    }

    public String getQ13() {
        return q13;
    }

    public void setQ13(String q13) {
        this.q13 = q13;
    }

    public String getQ14() {
        return q14;
    }

    public void setQ14(String q14) {
        this.q14 = q14;
    }

    public String getQ15() {
        return q15;
    }

    public void setQ15(String q15) {
        this.q15 = q15;
    }

    public String getQ16() {
        return q16;
    }

    public void setQ16(String q16) {
        this.q16 = q16;
    }

    public String getQ17() {
        return q17;
    }

    public void setQ17(String q17) {
        this.q17 = q17;
    }

    public String getQ18() {
        return q18;
    }

    public void setQ18(String q18) {
        this.q18 = q18;
    }

    public PreparedStatement getPst() {
        return pst;
    }

    public int getIdsrq() {
        return idsrq;
    }

    public void setIdsrq(int idsrq) {
        this.idsrq = idsrq;
    }

    public int getIdPacienteSrq() {
        return idPacienteSrq;
    }

    public void setIdPacienteSrq(int idPacienteSrq) {
        this.idPacienteSrq = idPacienteSrq;
    }

    public int getIdTerapeutaSrq() {
        return idTerapeutaSrq;
    }

    public void setIdTerapeutaSrq(int idTerapeutaSrq) {
        this.idTerapeutaSrq = idTerapeutaSrq;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaSrq() {
        return fechaSrq;
    }

    public void setFechaSrq(String fechaSrq) {
        this.fechaSrq = fechaSrq;
    }

    public ArrayList<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<String> respuestas) {
        this.respuestas = respuestas;
        int suma=0;
        for(String x :respuestas){
            if(x.equalsIgnoreCase("si")){
                suma+=1;
            }
        }
        this.sumatoria=suma;
    }

    public void setPst(PreparedStatement pst) {
        this.pst = pst;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacionx() {
        return observacionx;
    }

    public void setObservacionx(String observacionx) {
        this.observacionx = observacionx;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Usuario getTerapeuta() {
        return terapeuta;
    }

    public void setTerapeuta(Usuario terapeuta) {
        this.terapeuta = terapeuta;
    }
    
    
    

}
