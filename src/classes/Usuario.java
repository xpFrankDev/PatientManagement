
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Usuario {
     int id=-1,idJefe;
    String dni,nombre,username,codigo,clave,priv,estado,cargo,fechaCreacion,correo,srqCheck,indiceCheck;
   
    
    static String sql;
    static PreparedStatement pst;
    static ResultSet rs;
    
    public Usuario(){
        
    }

    public Usuario(int id,int idJefe, String dni, String nombre, String username, String codigo, String clave, String priv, String estado, String cargo, String fechaCreacion, String correo, String srqCheck,String indiceCheck) {
        this.id = id;
        this.idJefe=idJefe;
        this.dni = dni;
        this.nombre = nombre;
        this.username = username;
        this.codigo = codigo;
        this.clave = clave;
        this.priv = priv;
        this.estado = estado;
        this.cargo = cargo;
        this.fechaCreacion = fechaCreacion;
        this.correo=correo;
        this.srqCheck=srqCheck;
        this.indiceCheck=indiceCheck;
    }
    
    public static void main(String[] args) {
        Paciente p = new Paciente();
        p.ListarPacienteconRegistros();
    }
    
     public Usuario getUsuario(String usernamex){
        Usuario usuario = new Usuario();
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            
            sql = "call `sp.getUsuario`(?)";
            pst = con.prepareCall(sql);
            pst.setString(1, usernamex);
            rs = pst.executeQuery();
            while(rs.next()){
                usuario.setId(rs.getInt("id"));
                usuario.setIdJefe(rs.getInt("idJefe"));
                usuario.setDni(rs.getString("dni"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCodigo(rs.getString("codigo"));
                usuario.setClave(new EncriptadorAES().desencriptar(rs.getString("clave")));
                usuario.setUsername(rs.getString("username"));
                usuario.setPriv(rs.getString("cargo"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setFechaCreacion(rs.getString("fechaCreacion"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setSrqCheck(rs.getString("srqCheck"));
                usuario.setIndiceCheck(rs.getString("indiceCheck"));
            }
           
           
        } catch (Exception e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "xError con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return usuario;
    }
      public Usuario buscarUsuarioxID(int idx){
        Usuario usuario = new Usuario();
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            
            sql = "call `sp.getUsuarioxID`(?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, idx);
            rs = pst.executeQuery();
            while(rs.next()){
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
                usuario.setSrqCheck(rs.getString("srqCheck"));
                usuario.setIndiceCheck(rs.getString("indiceCheck"));
            }
           
           
        } catch (Exception e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "xError con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return usuario;
    }
     
     public ArrayList<Usuario> getUsuarioxJefe(int idJefex, String valorx){
        Usuario usuario = new Usuario();
        ArrayList<Usuario> lista = new ArrayList();
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            
            sql = "call `sp.getUsuarioxJefe`(?,?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, idJefex);
            pst.setString(2, valorx);
            rs = pst.executeQuery();
            while(rs.next()){
                usuario = new Usuario();
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
                usuario.setSrqCheck(rs.getString("srqCheck"));
                usuario.setIndiceCheck(rs.getString("indiceCheck"));
                lista.add(usuario);
            }
        } catch (Exception e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
     
     
     
       public static ArrayList<Usuario> getUsuarioxCodigo(String valorx){
        Usuario usuario = new Usuario();
        ArrayList<Usuario> lista = new ArrayList();
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            
            sql = "call `sp.getUsuarioxCodigo`(?)";
            pst = con.prepareCall(sql);
            pst.setString(1, valorx);
            rs = pst.executeQuery();
            while(rs.next()){
                usuario = new Usuario();
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
                usuario.setSrqCheck(rs.getString("srqCheck"));
                usuario.setIndiceCheck(rs.getString("indiceCheck"));
                lista.add(usuario);
            }
            
        } catch (Exception e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
     
       public int updateUsuario(){
        int respuestaUPDATE = 0;
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            String claveEncriptada = new EncriptadorAES().encriptar(clave);
                    
            sql = " call `sp.UpdateUsuario`(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, id);
            pst.setInt(2, idJefe);
            pst.setString(3, dni);
            pst.setString(4, nombre);
            pst.setString(5, username);
            pst.setString(6, codigo);
            pst.setString(7, claveEncriptada);
            pst.setString(8, priv);
            pst.setString(9, cargo);
            pst.setString(10, estado);
            pst.setString(11, correo);
            pst.setString(12, srqCheck);
            pst.setString(13, indiceCheck);
            respuestaUPDATE = pst.executeUpdate();
            
        } catch (Exception e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return respuestaUPDATE;
    }
     public int DeleteUsuario(){
        int respuestaUPDATE = 0;
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            sql = " call `sp.DeleteUsuario`(?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, id);
            respuestaUPDATE = pst.executeUpdate();
            
        } catch (Exception e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return respuestaUPDATE;
    }
       public int newUsuario(int idJefex,String dnix, String nombrex,
               String usernamex, String codigox, String clavex,
               String privx, String cargox, String correox, String srqCheckx, String indiceCheckx){
        int idUsuarioCreado = -1;
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            String clavezx = new EncriptadorAES().encriptar(clavex);
            sql = " call `sp.newUsuario`(?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareCall(sql);
            pst.setInt(1,idJefex);
            pst.setString(2,dnix);
            pst.setString(3,nombrex);
            pst.setString(4,usernamex);
            pst.setString(5,codigox);
            pst.setString(6,clavezx);
            pst.setString(7,privx);
            pst.setString(8,cargox);
            pst.setString(9,correox);
            pst.setString(10,srqCheckx);
            pst.setString(11,indiceCheckx);
            rs=pst.executeQuery();
            while(rs.next()){
                idUsuarioCreado = rs.getInt("@newUsuarioIDx");
            }
        } catch (Exception e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return idUsuarioCreado;
    }
    
    
     private static void cerrar() {
        try {
            if (pst != null) {
                pst.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", idJefe=" + idJefe + ", dni=" + dni + ", nombre=" + nombre + ", username=" + username + ", codigo=" + codigo + ", clave=" + clave + ", priv=" + priv + ", estado=" + estado + ", cargo=" + cargo + ", fechaCreacion=" + fechaCreacion + ", correo=" + correo + ", srqCheck=" + srqCheck + ", indiceCheck=" + indiceCheck + '}';
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public String getSrqCheck() {
        return srqCheck;
    }

    public void setSrqCheck(String srqCheck) {
        this.srqCheck = srqCheck;
    }

    public String getIndiceCheck() {
        return indiceCheck;
    }

    public void setIndiceCheck(String indiceCheck) {
        this.indiceCheck = indiceCheck;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPriv() {
        return this.cargo;
    }

    public void setPriv(String priv) {
        this.priv = priv;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }
     
     
}
