
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

/**
 *
 * @author parra
 */
public class NotaEvolucion {
    
    int idNota,idPacienteNota,idTerapeutaNota;
    String fechaNota,observacion,sintomas,relaciones,limites,ansiedad,manejoAgresion,funcionalidad,trabajoTerapeutico,estado;
    
    Usuario terapeuta;
    Paciente paciente;
    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public NotaEvolucion() {
    }

    public NotaEvolucion(int idNota, int idPacienteNota, int idTerapeutaNota, String fechaNota, String observacion, String sintomas, String relaciones, String limites, String ansiedad, String manejoAgresion, String funcionalidad, String trabajoTerapeutico, String estado) {
        this.idNota = idNota;
        this.idPacienteNota = idPacienteNota;
        this.idTerapeutaNota = idTerapeutaNota;
        this.fechaNota = fechaNota;
        this.observacion = observacion;
        this.sintomas = sintomas;
        this.relaciones = relaciones;
        this.limites = limites;
        this.ansiedad = ansiedad;
        this.manejoAgresion = manejoAgresion;
        this.funcionalidad = funcionalidad;
        this.trabajoTerapeutico = trabajoTerapeutico;
        this.estado = estado;
    }

    public ArrayList<NotaEvolucion> ListarxNota() {
        ArrayList<NotaEvolucion> lista = new ArrayList();

        sql = "call `sp.getNotaEvolucion` ()";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                NotaEvolucion nota = new NotaEvolucion(
                rs.getInt("idNota"),rs.getInt("idPacienteNota"),rs.getInt("idTerapeutaNota"),
                        rs.getString("fechaNota"),rs.getString("observacionNota"),rs.getString("sintomas"),
                        rs.getString("relaciones"),rs.getString("limites"),rs.getString("ansiedad"),
                        rs.getString("manejoAgresion"),rs.getString("funcionalidad"),
                        rs.getString("trabajoTerapeutico"),rs.getString("estadoNota")
                );
                lista.add(nota);
            }
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    
    public ArrayList<NotaEvolucion> getNotasdePaciente(int idPacientex) {
        ArrayList<NotaEvolucion> lista = new ArrayList();

        sql = "call `sp.getNotasdePaciente` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1,idPacientex);
            rs = pst.executeQuery();
            while (rs.next()) {
                NotaEvolucion nota = new NotaEvolucion(
                rs.getInt("idNota"),rs.getInt("idPacienteNota"),rs.getInt("idTerapeutaNota"),
                        rs.getString("fechaNota"),rs.getString("observacionNota"),rs.getString("sintomas"),
                        rs.getString("relaciones"),rs.getString("limites"),rs.getString("ansiedad"),
                        rs.getString("manejoAgresion"),rs.getString("funcionalidad"),
                        rs.getString("trabajoTerapeutico"),rs.getString("estadoNota")
                );
                lista.add(nota);
            }
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    
     public ArrayList<NotaEvolucion> getNotasdePacientexRangoFecha(String fecha01x, String fecha02x) {
        ArrayList<NotaEvolucion> lista = new ArrayList();

        sql = "call `sp.getNotaEvolucionxRangoFecha` (?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1,fecha01x);
            pst.setString(2,fecha02x);
            rs = pst.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                NotaEvolucion nota = new NotaEvolucion(
                rs.getInt("idNota"),rs.getInt("idPacienteNota"),rs.getInt("idTerapeutaNota"),
                        rs.getString("fechaNota"),rs.getString("observacionNota"),rs.getString("sintomas"),
                        rs.getString("relaciones"),rs.getString("limites"),rs.getString("ansiedad"),
                        rs.getString("manejoAgresion"),rs.getString("funcionalidad"),
                        rs.getString("trabajoTerapeutico"),rs.getString("estadoNota")
                );
                
                nota.setPaciente(new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
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
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")));
                
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
                
                nota.setTerapeuta(usuario);
                lista.add(nota);
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

        sql = "call `sp.getNotaEvolucion` ()";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Paciente p = new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
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
                
                NotaEvolucion nota = new NotaEvolucion(
                rs.getInt("idNota"),rs.getInt("idPacienteNota"),rs.getInt("idTerapeutaNota"),
                        rs.getString("fechaNota"),rs.getString("observacionNota"),rs.getString("sintomas"),
                        rs.getString("relaciones"),rs.getString("limites"),rs.getString("ansiedad"),
                        rs.getString("manejoAgresion"),rs.getString("funcionalidad"),
                        rs.getString("trabajoTerapeutico"),rs.getString("estadoNota")
                );
                
                if(lista.isEmpty()){
                    p.addNotaEvolucion(nota);
                    lista.add(p);
                }else{
                    if(lista.contains(p)){
                        int  index = lista.indexOf(p);
                        if(!lista.get(index).getNotas().contains(nota)){
                            lista.get(index).addNotaEvolucion(nota);
                        }
                    }else{
                         p.addNotaEvolucion(nota);
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
     
     public  int newNota(int idPacientex, int idTerapeutax,String observacionx,String sintomax,
             String relacionesx, String limitex, String ansiedadx, String manejoAgresionx,
             String funcionalidadx, String trabajoTerapeutax) {
        int valor = 0;
        sql = "call  `sp.newNotaEvolucion` (?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idPacientex);
            pst.setInt(2, idTerapeutax);
            pst.setString(3,observacionx);
            pst.setString(4,sintomax);
            pst.setString(5,relacionesx);
            pst.setString(6,limitex);
            pst.setString(7,ansiedadx);
            pst.setString(8,manejoAgresionx);
            pst.setString(9,funcionalidadx);
            pst.setString(10,trabajoTerapeutax);
            
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }
    
     public  int updateNota() {
        int valor = 0;
        sql = "call  `sp.UpdateNotaEvolucion` (?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idNota);
            pst.setString(2, observacion);
            pst.setString(3,sintomas);
            pst.setString(4,relaciones);
            pst.setString(5,limites);
            pst.setString(6,ansiedad);
            pst.setString(7,manejoAgresion);
            pst.setString(8,funcionalidad);
            pst.setString(9,trabajoTerapeutico);
            
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }
     
     public  int changePaciente(int idPacienteNotax) {
        int valor = 0;
        sql = "call  `sp.ChangePacientexNota` (?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idNota);
            pst.setInt(2, idPacienteNotax);
            
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }
     public  int changeEstado(String estadox) {
        int valor = 0;
        sql = "call  `sp.ChangeEstadoxNota` (?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idNota);
            pst.setString(2, estadox);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(SRQ18.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
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
            Logger.getLogger(NotaEvolucion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "NotaEvolucion{" + "idNota=" + idNota + ", idPacienteNota=" + idPacienteNota + ", idTerapeutaNota=" + idTerapeutaNota + ", fechaNota=" + fechaNota + ", observacion=" + observacion + ", sintomas=" + sintomas + ", relaciones=" + relaciones + ", limites=" + limites + ", ansiedad=" + ansiedad + ", manejoAgresion=" + manejoAgresion + ", funcionalidad=" + funcionalidad + ", trabajoTerapeutico=" + trabajoTerapeutico + ", estado=" + estado + '}';
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getIdPacienteNota() {
        return idPacienteNota;
    }

    public void setIdPacienteNota(int idPacienteNota) {
        this.idPacienteNota = idPacienteNota;
    }

    public int getIdTerapeutaNota() {
        return idTerapeutaNota;
    }

    public void setIdTerapeutaNota(int idTerapeutaNota) {
        this.idTerapeutaNota = idTerapeutaNota;
    }

    public String getFechaNota() {
        return fechaNota;
    }

    public void setFechaNota(String fechaNota) {
        this.fechaNota = fechaNota;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getRelaciones() {
        return relaciones;
    }

    public void setRelaciones(String relaciones) {
        this.relaciones = relaciones;
    }

    public String getLimites() {
        return limites;
    }

    public void setLimites(String limites) {
        this.limites = limites;
    }

    public String getAnsiedad() {
        return ansiedad;
    }

    public void setAnsiedad(String ansiedad) {
        this.ansiedad = ansiedad;
    }

    public String getManejoAgresion() {
        return manejoAgresion;
    }

    public void setManejoAgresion(String manejoAgresion) {
        this.manejoAgresion = manejoAgresion;
    }

    public String getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(String funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public String getTrabajoTerapeutico() {
        return trabajoTerapeutico;
    }

    public void setTrabajoTerapeutico(String trabajoTerapeutico) {
        this.trabajoTerapeutico = trabajoTerapeutico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getTerapeuta() {
        return terapeuta;
    }

    public void setTerapeuta(Usuario terapeuta) {
        this.terapeuta = terapeuta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.idNota;
        hash = 73 * hash + this.idPacienteNota;
        hash = 73 * hash + this.idTerapeutaNota;
        hash = 73 * hash + Objects.hashCode(this.fechaNota);
        hash = 73 * hash + Objects.hashCode(this.observacion);
        hash = 73 * hash + Objects.hashCode(this.sintomas);
        hash = 73 * hash + Objects.hashCode(this.relaciones);
        hash = 73 * hash + Objects.hashCode(this.limites);
        hash = 73 * hash + Objects.hashCode(this.ansiedad);
        hash = 73 * hash + Objects.hashCode(this.manejoAgresion);
        hash = 73 * hash + Objects.hashCode(this.funcionalidad);
        hash = 73 * hash + Objects.hashCode(this.trabajoTerapeutico);
        hash = 73 * hash + Objects.hashCode(this.estado);
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
        final NotaEvolucion other = (NotaEvolucion) obj;
        if (this.idNota != other.idNota) {
            return false;
        }
        if (this.idPacienteNota != other.idPacienteNota) {
            return false;
        }
        if (this.idTerapeutaNota != other.idTerapeutaNota) {
            return false;
        }
        if (!Objects.equals(this.fechaNota, other.fechaNota)) {
            return false;
        }
        if (!Objects.equals(this.observacion, other.observacion)) {
            return false;
        }
        if (!Objects.equals(this.sintomas, other.sintomas)) {
            return false;
        }
        if (!Objects.equals(this.relaciones, other.relaciones)) {
            return false;
        }
        if (!Objects.equals(this.limites, other.limites)) {
            return false;
        }
        if (!Objects.equals(this.ansiedad, other.ansiedad)) {
            return false;
        }
        if (!Objects.equals(this.manejoAgresion, other.manejoAgresion)) {
            return false;
        }
        if (!Objects.equals(this.funcionalidad, other.funcionalidad)) {
            return false;
        }
        if (!Objects.equals(this.trabajoTerapeutico, other.trabajoTerapeutico)) {
            return false;
        }
        return Objects.equals(this.estado, other.estado);
    }
    
    
    
}
