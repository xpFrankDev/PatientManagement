package Clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class Paciente {

    int id = -1,idTerapeuta,idTrabajadorSocial;
    String codigo,nombreTerapeuta, nombres, apellidos, tipoDocumento,dni, genero, fechaCreacion, fechaNacimiento, telefono,telefonoOpcional, correo, nacionalidad, condicionMigratoria,
            departamento, provincia, distrito, grupoVulnerable, discapacidad, redSoporte, nombreRedSoporte, srqIngreso, observacion, proyecto, motivoConsulta, acciones;
    String modalidad, detalleDerivado, detalleOtroTelefono, contactoRedSoporte, cantidadGrupoFamiliar,
            rbSeguro,
            txtOtroSeguro,
            ingresoPeru,
            rbTrabajo,
            txtTrabajo,
            nivelEducativo,
            otroNivelEducativo,
            ocupacion,
            subOcupacion;
    
    int totalSesiones;
    String sql;
    PreparedStatement pst;
    ResultSet rs;
    
    ArrayList<RegistroPaciente> registros = new ArrayList();
    ArrayList<SRQ18> srq18s = new ArrayList();
    ArrayList<IndiceBienestar> indices = new ArrayList();
    ArrayList<NotaEvolucion> notas = new ArrayList();
    ListaEspera myLista = new ListaEspera();
    
    public Paciente() {

    }

    public Paciente(int id, String codigo, String nombres, String apellidos,String dni, String tipoDocumentoxdni, String genero,
            String fechaCreacion, String fechaNacimiento, String telefono,String telefonoOpcional, String correo, String nacionalidad,
            String condicionMigratoria, String departamento, String provincia, String distrito, String grupoVulnerable, String discapacidad,
            String reSoporte, String nombreRedSoporte, String srqIngreso, String observacion, String proyecto, String motivoConsulta,
            String acciones, int totalSesiones, String modalidad,String detalleDerivado,String detalleOtroTelefono,String contactoRedSoporte ,
            String cantidadGrupoFamiliar,String rbSeguro,String txtOtroSeguro,String ingresoPeru,String rbTrabajo,String txtTrabajo,String nivelEducativo,
            String otroNivelEducativo,String ocupacion,String subOcupacion,String nombreTerapeuta,int idTerapeuta , int trabajadorSocial  
    ) {
        this.id = id;
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni=dni;
        this.tipoDocumento = tipoDocumentoxdni;
        this.genero = genero;
        this.fechaCreacion = fechaCreacion;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.telefonoOpcional=telefonoOpcional;
        this.correo = correo;
        this.nacionalidad = nacionalidad;
        this.condicionMigratoria = condicionMigratoria;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.grupoVulnerable = grupoVulnerable;
        this.discapacidad = discapacidad;
        this.redSoporte = reSoporte;
        this.nombreRedSoporte = nombreRedSoporte;
        this.srqIngreso = srqIngreso;
        this.observacion = observacion;
        this.proyecto = proyecto;
        this.motivoConsulta = motivoConsulta;
        this.acciones = acciones;
        this.totalSesiones = totalSesiones;
        this.modalidad=modalidad;
        this.detalleDerivado=detalleDerivado;
        this.detalleOtroTelefono=detalleOtroTelefono;
        this.contactoRedSoporte=contactoRedSoporte;
        this.cantidadGrupoFamiliar=cantidadGrupoFamiliar;
        this.rbSeguro=rbSeguro;
        this.txtOtroSeguro=txtOtroSeguro;
        this.ingresoPeru=ingresoPeru;
        this.rbTrabajo=rbTrabajo;
        this.txtTrabajo=txtTrabajo;
        this.nivelEducativo=nivelEducativo;
        this.otroNivelEducativo=otroNivelEducativo;
        this.ocupacion=ocupacion;
        this.subOcupacion=subOcupacion;
        this.nombreTerapeuta = nombreTerapeuta;
        this.idTerapeuta=idTerapeuta;
        this.idTrabajadorSocial=trabajadorSocial;
    }

   
 public ArrayList getPacienteWithListaEspera(){
        ArrayList<Paciente> lista = new ArrayList();
        
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            sql = "call `sp.getListarEspera` ()";
            pst=con.prepareCall(sql);
            rs=pst.executeQuery();
            Paciente temp = new Paciente();
            ListaEspera listaEspera = new ListaEspera();
            while(rs.next()){
                temp = new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),
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
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")
                );
                
                ListaEspera tempLista = new ListaEspera(
                        rs.getInt("idLista"),
                        rs.getInt("idPaciente"),
                        rs.getInt("idTrabajadorSocial"),
                        rs.getString("fechaModificacion"),
                        rs.getInt("usuarioModificacion"),
                        rs.getString("estado")
                        
                );
                
                if(!lista.contains(temp)){
                    temp.setMyLista(tempLista);
                    lista.add(temp);
                }else{
                    int index = lista.indexOf(temp);
                    lista.get(index).setMyLista(myLista);
                }
            }
            
            
            
        }catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        
        return lista;
    }
 
 public ArrayList getPacienteWithListaEspera(int idTrabajadorSocialx){
        ArrayList<Paciente> lista = new ArrayList();
        
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            sql = "call `sp.getListaEsperaByTrabajadorSocial` (?)";
            pst=con.prepareCall(sql);
            pst.setInt(1,idTrabajadorSocialx);
            rs=pst.executeQuery();
            Paciente temp = new Paciente();
            ListaEspera listaEspera = new ListaEspera();
            while(rs.next()){
                temp = new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),
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
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")
                );
                
                ListaEspera tempLista = new ListaEspera(
                        rs.getInt("idLista"),
                        rs.getInt("idPaciente"),
                        rs.getInt("idTrabajadorSocial"),
                        rs.getString("fechaModificacion"),
                        rs.getInt("usuarioModificacion"),
                        rs.getString("estado")
                        
                );
                
                if(!lista.contains(temp)){
                    temp.setMyLista(tempLista);
                    lista.add(temp);
                }else{
                    int index = lista.indexOf(temp);
                    lista.get(index).setMyLista(myLista);
                }
            }
            
            
            
        }catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        
        return lista;
    }
 
    public ArrayList ListarPacienteconRegistros() {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacientes` ()";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Paciente pacienteTemp = new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),
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
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")
                );
                                                          //rs.getInt("idRP")
                RegistroPaciente rp = new RegistroPaciente(rs.getInt("idRP"), rs.getInt("idPaciente"),
                        rs.getInt("idUsuario"), rs.getInt("idUsuarioAsignado"), rs.getString("fecha"),
                        rs.getString("accion"), rs.getString("observacion"), rs.getString("fechaAsignadaRP"),
                        rs.getString("estado"));

                
                NotaEvolucion nota = new NotaEvolucion(
                rs.getInt("idNota"),rs.getInt("idPacienteNota"),rs.getInt("idTerapeutaNota"),
                        rs.getString("fechaNota"),rs.getString("observacionNota"),rs.getString("sintomas"),
                        rs.getString("relaciones"),rs.getString("limites"),rs.getString("ansiedad"),
                        rs.getString("manejoAgresion"),rs.getString("funcionalidad"),
                        rs.getString("trabajoTerapeutico"),rs.getString("estadoNota")
                );
                
                
                if(lista.isEmpty()){
                   pacienteTemp.addRegistro(rp);
                   
                   if(nota.getIdNota()>0)
                        if(!pacienteTemp.getNotas().contains(nota))
                       pacienteTemp.addNotaEvolucion(nota);
                   
                   lista.add(pacienteTemp);
                }else{
                    if(lista.contains(pacienteTemp)){
                        int  index = lista.indexOf(pacienteTemp);
                        if(!lista.get(index).getRegistros().contains(rp)){
                            
                            if(nota.getIdNota()>0){
                                if(! lista.get(index).getNotas().contains(nota)){
                                    lista.get(index).addNotaEvolucion(nota);
                                }
                                
                            }
                                 
                            
                            lista.get(index).addRegistro(rp);
                        }
                    }else{
                         pacienteTemp.addRegistro(rp);
                         if(nota.getIdNota()>0)
                              if(!pacienteTemp.getNotas().contains(nota))
                       pacienteTemp.addNotaEvolucion(nota);
                         
                         lista.add(pacienteTemp);
                    }
                }
                
            }

        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList ListarPacienteconNotasEvolucion() {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getNotaEvolucion` ()";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Paciente pacienteTemp = new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),
                        rs.getString("dni"),rs.getString("tipoDocumento"), rs.getString("genero"),
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
                   pacienteTemp.addNotaEvolucion(nota);
                   lista.add(pacienteTemp);
                }else{
                    if(lista.contains(pacienteTemp)){
                        int  index = lista.indexOf(pacienteTemp);
                        if(!lista.get(index).getNotas().contains(nota)){
                            lista.get(index).addNotaEvolucion(nota);
                        }
                    }else{
                         pacienteTemp.addNotaEvolucion(nota);
                         lista.add(pacienteTemp);
                    }
                }
                
            }

        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    
     public ArrayList ListarPacienteconNotasEvolucionBYTerapeuta( int idTerapeutax) {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacienteNEByTerapeuta` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1,idTerapeutax);
            rs = pst.executeQuery();
            while (rs.next()) {
                Paciente pacienteTemp = new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),
                        rs.getString("dni"),rs.getString("tipoDocumento"), rs.getString("genero"),
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
                   if(nota.getIdNota()>0)
                        pacienteTemp.addNotaEvolucion(nota);
                   lista.add(pacienteTemp);
                }else{
                    if(lista.contains(pacienteTemp)){
                        int  index = lista.indexOf(pacienteTemp);
                        if(!lista.get(index).getNotas().contains(nota) && nota.getIdNota()>0){
                            lista.get(index).addNotaEvolucion(nota);
                        }
                    }else{
                        if(nota.getIdNota()>0)
                         pacienteTemp.addNotaEvolucion(nota);
                        
                         lista.add(pacienteTemp);
                    }
                }
                
            }

        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
      
    public int newPaciente(String nombrex, String apellidosx, String tipoDocumentox, String dnix, String generox, String fechaNacimientox, int totalSesiones,
            String telefonox,String telefonoOpcionalx, String correox, String nacionalidadx, String condicionMigratoriax, String departamentox, String provinciax, String distritox,
            String grupoVulnerablex, String discapacidadx, String redSoportex, String nombreRedSoportex, String srqIngresox, String observacionx,
            String proyectox, String motivoConsultax, String accionesx, String codigox,String modalidadx,
            String detalleDerivadox,String detalleOtroTelefonox, String contactoRedSoportex,
            
            String cantidadGrupoFamiliar,
            String rbSeguro,
            String txtOtroSeguro,
            String ingresoPeru,
            String rbTrabajo,
            String txtTrabajo,
            String nivelEducativo,
            String otroNivelEducativo,
            String ocupacion,
            String subOcupacion,
            int idTerapeuta,
            int idTrabajadorSocialx
    ) {
        int valor = 0;
        sql = "call  `sp.newPaciente` ("
                + "?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, nombrex);
            pst.setString(2, apellidosx);
            pst.setString(3, tipoDocumentox);
            pst.setString(4, dnix);
            pst.setString(5, generox);
            pst.setString(6, fechaNacimientox);
            pst.setInt(7, totalSesiones);
            pst.setString(8, telefonox);
            pst.setString(9, telefonoOpcionalx);
            pst.setString(10, correox);
            pst.setString(11, nacionalidadx);
            pst.setString(12, condicionMigratoriax);
            pst.setString(13, departamentox);
            pst.setString(14, provinciax);
            pst.setString(15, distritox);
            pst.setString(16, grupoVulnerablex);
            pst.setString(17, discapacidadx);
            pst.setString(18, redSoportex);
            pst.setString(19, nombreRedSoportex);
            pst.setString(20, srqIngresox);
            pst.setString(21, observacionx);
            pst.setString(22, proyectox);
            pst.setString(23, motivoConsultax);
            pst.setString(24, accionesx);
            pst.setString(25, codigox);
            pst.setString(26, modalidadx);
            pst.setString(27, detalleDerivadox);
            pst.setString(28,detalleOtroTelefonox);
            pst.setString(29,contactoRedSoportex);
            
             pst.setString(30,cantidadGrupoFamiliar);
            pst.setString(31,rbSeguro);
            pst.setString(32,txtOtroSeguro);
            pst.setString(33,ingresoPeru);
            pst.setString(34,rbTrabajo);
            pst.setString(35,txtTrabajo);
            pst.setString(36,nivelEducativo);
            pst.setString(37,otroNivelEducativo);
            pst.setString(38,ocupacion);
            pst.setString(39,subOcupacion);
            pst.setInt(40,idTerapeuta);
            pst.setInt(41,idTrabajadorSocialx);
            
            
            rs=pst.executeQuery();
            while(rs.next()){
                valor=rs.getInt("@idInsertado");
            }
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public ChartPanel getGraficoPacientes() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        ArrayList<Paciente> pacientes = (ArrayList) new Paciente().ListarPacienteconNotasEvolucion().clone();
        ArrayList<Integer> meses = new ArrayList();
        meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);
        meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);
        for(Paciente paciente:pacientes){
                int mes = Integer.parseInt(paciente.getFechaCreacion().substring(5, 7));
                int valor = meses.get(mes-1)+1;
                meses.add(mes-1,valor);
        }
        for(int i=0; i<meses.size();i++){
            dataset.setValue(meses.get(i), "Pacientes Registrados",new tools().getMes(i+1));
        }
        
        
        JFreeChart chart = ChartFactory.createBarChart3D("Cantidad de Pacientes Registrados por Mes",
                "Meses del año " , "Número de Pacientes",
                dataset, PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 20));
        chart.getTitle().setPaint(Color.BLACK);

        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        p.setRangeGridlinesVisible(true);
        p.setRangeGridlinePaint(Color.BLACK);
        BarRenderer renderer =(BarRenderer) p.getRenderer();
        renderer.setDrawBarOutline(false);
        GradientPaint gp0 = new GradientPaint(0.0f,0.0f,Color.blue,0.0f,0.0f,new Color(51,51,64));

        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;

    }
    
    public ChartPanel getGraficoSesiones() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        ArrayList<NotaEvolucion> notas = (ArrayList) new NotaEvolucion().ListarxNota().clone();
        ArrayList<Integer> meses = new ArrayList();
        meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);
        meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);
        for(NotaEvolucion nota:notas){
                int mes = Integer.parseInt(nota.getFechaNota().substring(5, 7));
                int valor = meses.get(mes-1)+1;
                meses.add(mes-1,valor);
        }
        for(int i=0; i<meses.size();i++){
            dataset.setValue(meses.get(i), "Sesiones Realizadas",new tools().getMes(i+1));
        }
        
        
        JFreeChart chart = ChartFactory.createBarChart3D("Cantidad de sesiones realizadas por mes",
                "Meses del año " , "Número de sesiones",
                dataset, PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 20));
        chart.getTitle().setPaint(Color.BLACK);

        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        p.setRangeGridlinesVisible(true);
        p.setRangeGridlinePaint(Color.BLACK);
        BarRenderer renderer =(BarRenderer) p.getRenderer();
        renderer.setDrawBarOutline(false);
        GradientPaint gp0 = new GradientPaint(0.0f,0.0f,Color.blue,0.0f,0.0f,new Color(51,51,64));
        
        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;

    }
    
    public ChartPanel getGraficoPacientexGeneroyAno(String generox, String fecha01, String fecha02) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

       
        
        ArrayList<Paciente> pacientes
       = (ArrayList) new Paciente().getPacientexFechaCreacionyGenero(generox,fecha01, fecha02).clone();
        
        ArrayList<Integer> meses = new ArrayList();
        meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);
        meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);
        
        ArrayList<String> generos = new ArrayList();
        for(Paciente paciente:pacientes){
                if(!generos.contains(paciente.getGenero())){
                    generos.add(paciente.getGenero());
                }
            }
       
                
        for(int i=0; i<meses.size();i++){
            int contador=0;
            for(String genero:generos){
                contador=0;
                for(Paciente paciente:pacientes){
                    int mes = Integer.parseInt(paciente.getFechaCreacion().substring(5, 7));
                        if(paciente.getGenero().equalsIgnoreCase(genero) && 
                           Float.compare((i+1),mes)==0 ){
                            contador++;
                        }
                 }
                dataset.setValue(contador, genero,new tools().getMes(i+1));
            }
        }
        JFreeChart chart = ChartFactory.createBarChart3D("Registro de Pacientes por Mes y Genero",
                "Meses del año " , "Cantidad de Pacientes por Genero",
                dataset, PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 20));
        chart.getTitle().setPaint(Color.BLACK);

        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        p.setRangeGridlinesVisible(true);
        p.setRangeGridlinePaint(Color.BLACK);
        BarRenderer renderer =(BarRenderer) p.getRenderer();
        renderer.setDrawBarOutline(false);
        GradientPaint gp0 = new GradientPaint(0.0f,0.0f,Color.blue,0.0f,0.0f,new Color(51,51,64));
        
        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;

    }
    
    public ChartPanel getGraficoPacientexProyectoyAno(String proyectox, String fecha01, String fecha02) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

       
        
        ArrayList<Paciente> pacientes
       = (ArrayList) new Paciente().getPacientexProyecto(proyectox,fecha01, fecha02).clone();
        
        ArrayList<Integer> meses = new ArrayList();
        meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);
        meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);
        
        ArrayList<String> proyectos = new ArrayList();
        for(Paciente paciente:pacientes){
                if(!proyectos.contains(paciente.getProyecto())){
                    proyectos.add(paciente.getProyecto());
                }
            }
       
                
        for(int i=0; i<meses.size();i++){
            int contador=0;
            for(String genero:proyectos){
                contador=0;
                for(Paciente paciente:pacientes){
                    int mes = Integer.parseInt(paciente.getFechaCreacion().substring(5, 7));
                        if(paciente.getGenero().equalsIgnoreCase(genero) && 
                           Float.compare((i+1),mes)==0 ){
                            contador++;
                        }
                 }
                dataset.setValue(contador, genero,new tools().getMes(i+1));
            }
        }
        JFreeChart chart = ChartFactory.createBarChart3D("Registro de Pacientes por Mes y Genero",
                "Meses del año " , "Cantidad de Pacientes por Genero",
                dataset, PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 20));
        chart.getTitle().setPaint(Color.BLACK);

        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        p.setRangeGridlinesVisible(true);
        p.setRangeGridlinePaint(Color.BLACK);
        BarRenderer renderer =(BarRenderer) p.getRenderer();
        renderer.setDrawBarOutline(false);
        GradientPaint gp0 = new GradientPaint(0.0f,0.0f,Color.blue,0.0f,0.0f,new Color(51,51,64));
        
        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;

    }
    
    public ChartPanel getGraficoPacienteConIntencionSuicida( String fecha01, String fecha02) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        ArrayList<SRQ18> srqs
       = (ArrayList) new SRQ18().ListaSRQ18conPacienteyTerapeutaxRango(fecha01, fecha02).clone();
        
        ArrayList<Integer> meses = new ArrayList();
        meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);
        meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);
        
        for(int i=0; i<meses.size();i++){
            int contador=0;
                for(SRQ18 srq:srqs){
                    int mes = Integer.parseInt(srq.getFechaSrq().substring(5, 7));
                        if(srq.getQ17().equalsIgnoreCase("si") && 
                           Float.compare((i+1),mes)==0){
                            contador++;
                        }
                 }
                dataset.setValue(contador, "Pacientes",new tools().getMes(i+1));
        }
        JFreeChart chart = ChartFactory.createBarChart3D("Pacientes con intencion suicida",
                "Meses del año " , "Cantidad de Pacientes",
                dataset, PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 20));
        chart.getTitle().setPaint(Color.BLACK);

        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        p.setRangeGridlinesVisible(true);
        p.setRangeGridlinePaint(Color.BLACK);
        BarRenderer renderer =(BarRenderer) p.getRenderer();
        renderer.setDrawBarOutline(false);
        GradientPaint gp0 = new GradientPaint(0.0f,0.0f,Color.blue,0.0f,0.0f,new Color(51,51,64));
        
        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;

    }

    public ChartPanel getGraficoPacientexGrupoVulnerableyAno(String grupox, String fecha01, String fecha02) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

       
        
        ArrayList<Paciente> pacientes
       = (ArrayList) new Paciente().getPacientexGrupoVulnerable(grupox,fecha01, fecha02).clone();
        
        ArrayList<Integer> meses = new ArrayList();
        meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);
        meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);meses.add(0);
        
        ArrayList<String> grupos = new ArrayList();
        for(Paciente paciente:pacientes){
                if(!grupos.contains(paciente.getProyecto())){
                    grupos.add(paciente.getProyecto());
                }
            }
       
                
        for(int i=0; i<meses.size();i++){
            int contador=0;
            for(String grupo:grupos){
                contador=0;
                for(Paciente paciente:pacientes){
                    int mes = Integer.parseInt(paciente.getFechaCreacion().substring(5, 7));
                        if(paciente.getGenero().equalsIgnoreCase(grupo) && 
                           Float.compare((i+1),mes)==0 ){
                            contador++;
                        }
                 }
                dataset.setValue(contador, grupo,new tools().getMes(i+1));
            }
        }
        JFreeChart chart = ChartFactory.createBarChart3D("Registro de Pacientes por Mes y Grupo Vulnerable",
                "Meses del año " , "Cantidad de Pacientes por Genero",
                dataset, PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 20));
        chart.getTitle().setPaint(Color.BLACK);

        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        p.setRangeGridlinesVisible(true);
        p.setRangeGridlinePaint(Color.BLACK);
        BarRenderer renderer =(BarRenderer) p.getRenderer();
        renderer.setDrawBarOutline(false);
        GradientPaint gp0 = new GradientPaint(0.0f,0.0f,Color.blue,0.0f,0.0f,new Color(51,51,64));
        
        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;

    }
    
    public ArrayList getPacientexFechaCreacion(String fechax) {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacientexFechaCreacion` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, fechax);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad"),
                        rs.getString("detalleDerivado"),rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")));
            }
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    
    public ArrayList getPacientexFechaCreacion(String fecha01, String fecha02) {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacientesxRangoFecha` (?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, fecha01);
            pst.setString(2, fecha02);
            rs = pst.executeQuery();
            while (rs.next()) {
                Paciente pacienteTemp = new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad")
                        ,rs.getString("detalleDerivado"),rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
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
                   pacienteTemp.addNotaEvolucion(nota);
                   lista.add(pacienteTemp);
                }else{
                    if(lista.contains(pacienteTemp)){
                        int  index = lista.indexOf(pacienteTemp);
                        if(!lista.get(index).getNotas().contains(nota)){
                            lista.get(index).addNotaEvolucion(nota);
                        }
                    }else{
                         pacienteTemp.addNotaEvolucion(nota);
                         lista.add(pacienteTemp);
                    }
                }
            
            
            
            
            }
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }
    
    public ArrayList getPacientexFechaCreacionyGenero(String generox,String fecha01, String fecha02) {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacientesxRangoySexo` (?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, generox);
            pst.setString(2, fecha01);
            pst.setString(3, fecha02);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad")
                        ,rs.getString("detalleDerivado"),rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")));
            }
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList getPacientexNombre(String valorx) {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacientexNombre` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, valorx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad")
                        ,rs.getString("detalleDerivado"),rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")));
            }
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList getPacientexGenero(String generox) {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacientexGenero` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, generox);
            rs = pst.executeQuery();
            while (rs.next()) {

                lista.add(new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad")
                        ,rs.getString("detalleDerivado"),rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")));
            }
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList getPacientexGrupoVulnerable(String grupox, String fecha01,String fecha02) {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacientexGrupoVulnerable` (?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, grupox);
            pst.setString(2, grupox);
            pst.setString(3, grupox);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad")
                        ,rs.getString("detalleDerivado"),rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")));
            }
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList getPacientexFechaNacimiento(String fechax) {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacientexFechaNacimiento` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, fechax);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad")
                        ,rs.getString("detalleDerivado"),rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")));
            }
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList getPacientexFechaNacimientoRango(String fecha01, String fecha02) {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacientexFechaNacimientoRango` (?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, fecha01);
            pst.setString(2, fecha02);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad")
                        ,rs.getString("detalleDerivado"),rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")));
            }
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList getPacientexProyecto(String proyectox,String fecha01, String fecha02) {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacientexProyecto` (?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, proyectox);
            pst.setString(2, fecha01);
            pst.setString(3, fecha02);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad")
                        ,rs.getString("detalleDerivado"),rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")));
            }
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList getPacientexRedSoporte(String redSoportex) {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacientexRedSoporte` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, redSoportex);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad")
                        ,rs.getString("detalleDerivado"),rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")));
            }
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList getPacientexTotalSesiones(int total01, int total02) {
        ArrayList<Paciente> lista = new ArrayList();

        sql = "call `sp.getPacientexTotalSesiones` (?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, total01);
            pst.setInt(2, total02);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad")
                        ,rs.getString("detalleDerivado"),rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion")
                        ,rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial")));
            }
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }


    public int updatePaciente(
            int idx,
            String nombrex,
            String apellidosx,
            String tipoDocumentox,
            String dnix,
            String generox,
            String fechaNacimientox,
            int totalSesiones,
            String telefonox,
            String telefonoOpcionalx,
            String correox,
            String nacionalidadx,
            String condicionMigratoriax,
            String departamentox,
            String provinciax,
            String distritox,
            String grupoVulnerablex,
            String discapacidadx,
            String redSoportex,
            String nombreRedSoportex,
            String srqIngresox,
            String observacionx,
            String proyectox,
            String motivoConsultax,
            String accionesx,
            String codigox,
            String modalidadx,
            String detalleDerivadox,
            String detalleOtroTelefonox,
            String contactoRedSoportex,
            String cantidadGrupoFamiliar,
            String rbSeguro,
            String txtOtroSeguro,
            String ingresoPeru,
            String rbTrabajo,
            String txtTrabajo,
            String nivelEducativo,
            String otroNivelEducativo,
            String ocupacion,
            String subOcupacion,
            int idTerapeutax
    ) {
        int valor = 0;
        sql = "call  `sp.UpdatePaciente` (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idx);
            pst.setString(2, nombrex);
            pst.setString(3, apellidosx);
            pst.setString(4, tipoDocumentox);
            pst.setString(5, dnix);
            pst.setString(6, generox);
            pst.setString(7, fechaNacimientox);
            pst.setInt(8, totalSesiones);
            pst.setString(9, telefonox);
            pst.setString(10, telefonox);
            pst.setString(11, correox);
            pst.setString(12, nacionalidadx);
            pst.setString(13, condicionMigratoriax);
            pst.setString(14, departamentox);
            pst.setString(15, provinciax);
            pst.setString(16, distritox);
            pst.setString(17, grupoVulnerablex);
            pst.setString(18, discapacidadx);
            pst.setString(19, redSoportex);
            pst.setString(20, nombreRedSoportex);
            pst.setString(21, srqIngresox);
            pst.setString(22, observacionx);
            pst.setString(23, proyectox);
            pst.setString(24, motivoConsultax);
            pst.setString(25, accionesx);
            pst.setString(26, codigox);
            pst.setString(27, modalidadx);
            pst.setString(28, detalleDerivadox);
            pst.setString(29,detalleOtroTelefonox);
            pst.setString(30,contactoRedSoportex);
            
            pst.setString(31,cantidadGrupoFamiliar);
            pst.setString(32,rbSeguro);
            pst.setString(33,txtOtroSeguro);
            pst.setString(34,ingresoPeru);
            pst.setString(35,rbTrabajo);
            pst.setString(36,txtTrabajo);
            pst.setString(37,nivelEducativo);
            pst.setString(38,otroNivelEducativo);
            pst.setString(39,ocupacion);
            pst.setString(40,subOcupacion);
            pst.setInt(41,idTerapeutax);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }
    
    public boolean updateTerapeuta(int idTerapeuta, int idPaciente){
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            sql = "call `sp.UpdateTerapeutaPaciente` (?,?)";
            pst=con.prepareCall(sql);
            pst.setInt(1,idTerapeuta);
            pst.setInt(2, idPaciente);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
            return false;
        } finally {
            cerrar();
        }
        
    }
public int updatePaciente2() {
        int valor = 0;
        sql = "call  `sp.UpdatePaciente` (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"+ "?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, id);
            pst.setString(2, nombres);
            pst.setString(3, apellidos);
            pst.setString(4, tipoDocumento);
            pst.setString(5, dni);
            pst.setString(6, genero);
            pst.setString(7, fechaNacimiento);
            pst.setInt(8, totalSesiones);
            pst.setString(9, telefono);
            pst.setString(10, telefonoOpcional);
            pst.setString(11, correo);
            pst.setString(12, nacionalidad);
            pst.setString(13, condicionMigratoria);
            pst.setString(14, departamento);
            pst.setString(15, provincia);
            pst.setString(16, distrito);
            pst.setString(17, grupoVulnerable);
            pst.setString(18, discapacidad);
            pst.setString(19, redSoporte);
            pst.setString(20, nombreRedSoporte);
            pst.setString(21, srqIngreso);
            pst.setString(22, observacion);
            pst.setString(23, proyecto);
            pst.setString(24, motivoConsulta);
            pst.setString(25, acciones);
            pst.setString(26, codigo);
            pst.setString(27, modalidad);
            pst.setString(28, detalleDerivado);
            pst.setString(29,detalleOtroTelefono);
            pst.setString(30,contactoRedSoporte);
            pst.setString(31,cantidadGrupoFamiliar);
            pst.setString(32,rbSeguro);
            pst.setString(33,txtOtroSeguro);
            pst.setString(34,ingresoPeru);
            pst.setString(35,rbTrabajo);
            pst.setString(36,txtTrabajo);
            pst.setString(37,nivelEducativo);
            pst.setString(38,otroNivelEducativo);
            pst.setString(39,ocupacion);
            pst.setString(40,subOcupacion);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public ArrayList getPacientedeTerapeuta(int idTerapeutax, String valorx, String fecha01, String fecha02) {
        ArrayList<Paciente> listax = new ArrayList();
        listax.clear();

        sql = "call `sp.getPacientexTerapeuta` (?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idTerapeutax);
            pst.setString(2, valorx);
            pst.setString(3, fecha01);
            pst.setString(4, fecha02);

            rs = pst.executeQuery();
            while (rs.next()) {
                Paciente p = new Paciente(rs.getInt("id"), rs.getString("codigo"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("dni"), rs.getString("tipoDocumento"), rs.getString("genero"),
                        rs.getString("fechaCreacion"), rs.getString("fechaNacimiento"), rs.getString("telefono"),
                        rs.getString("telefonoOpcional"),rs.getString("correo"), rs.getString("nacionalidad"),
                        rs.getString("condicionMigratoria"), rs.getString("departamento"), rs.getString("provincia"), rs.getString("distrito"),
                        rs.getString("grupoVulnerable"), rs.getString("discapacidad"), rs.getString("redSoporte"), rs.getString("nombreRedSoporte"),
                        rs.getString("srqIngreso"), rs.getString("observacion"), rs.getString("proyecto"), rs.getString("motivoConsulta"), rs.getString("acciones"),
                        rs.getInt("totalSesiones"),rs.getString("modalidad")
                        ,rs.getString("detalleDerivado"),rs.getString("detalleOtroTelefono"),rs.getString("contactoRedSoporte"),
                        rs.getString("cantidadGrupoFamiliar"),rs.getString("rbSeguro"),rs.getString("txtOtroSeguro"),rs.getString("ingresoPeru"),
                        rs.getString("rbTrabajo"),rs.getString("txtTrabajo"),rs.getString("nivelEducativo"),rs.getString("otroNivelEducativo"),
                        rs.getString("ocupacion"),rs.getString("subOcupacion"),
                        rs.getString("nombre"),rs.getInt("idTerapeutaAsignado"),rs.getInt("idTrabajdorSocial"));
                        
                listax.add(p);
            }

        } catch (Exception e) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return listax;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", codigo=" + codigo + ", nombres=" + nombres + ", apellidos=" + apellidos + ", tipoDocumento=" + tipoDocumento + ", dni=" + dni + ", genero=" + genero + ", fechaCreacion=" + fechaCreacion + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", telefonoOpcional=" + telefonoOpcional + ", correo=" + correo + ", nacionalidad=" + nacionalidad + ", condicionMigratoria=" + condicionMigratoria + ", departamento=" + departamento + ", provincia=" + provincia + ", distrito=" + distrito + ", grupoVulnerable=" + grupoVulnerable + ", discapacidad=" + discapacidad + ", redSoporte=" + redSoporte + ", nombreRedSoporte=" + nombreRedSoporte + ", srqIngreso=" + srqIngreso + ", observacion=" + observacion + ", proyecto=" + proyecto + ", motivoConsulta=" + motivoConsulta + ", acciones=" + acciones + ", modalidad=" + modalidad + ", detalleDerivado=" + detalleDerivado + ", detalleOtroTelefono=" + detalleOtroTelefono + ", contactoRedSoporte=" + contactoRedSoporte + ", cantidadGrupoFamiliar=" + cantidadGrupoFamiliar + ", rbSeguro=" + rbSeguro + ", txtOtroSeguro=" + txtOtroSeguro + ", ingresoPeru=" + ingresoPeru + ", rbTrabajo=" + rbTrabajo + ", txtTrabajo=" + txtTrabajo + ", nivelEducativo=" + nivelEducativo + ", otroNivelEducativo=" + otroNivelEducativo + ", ocupacion=" + ocupacion + ", subOcupacion=" + subOcupacion + ", totalSesiones=" + totalSesiones + '}';
    }

    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<IndiceBienestar> getIndices() {
        return indices;
    }
    public void addNotaEvolucion(NotaEvolucion nota){
        notas.add(nota);
    }
    public ArrayList<NotaEvolucion> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<NotaEvolucion> notas) {
        this.notas = notas;
    }

    public void setIndices(ArrayList<IndiceBienestar> indices) {
        this.indices = indices;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getRedSoporte() {
        return redSoporte;
    }

    public void setRedSoporte(String redSoporte) {
        this.redSoporte = redSoporte;
    }

    public String getNombres() {
        return nombres;
    }

    public String getNombreCompleto() {
        return nombres + "  " + apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoDocumentoxdni() {
        return tipoDocumento;
    }

    public void setTipoDocumentoxdni(String tipoDocumentoxdni) {
        this.tipoDocumento = tipoDocumentoxdni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public ArrayList<SRQ18> getSrq18s() {
        return srq18s;
    }

    public void setSrq18s(ArrayList<SRQ18> srq18s) {
        this.srq18s = srq18s;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCondicionMigratoria() {
        return condicionMigratoria;
    }

    public void setCondicionMigratoria(String condicionMigratoria) {
        this.condicionMigratoria = condicionMigratoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void addSRQ18(SRQ18 srq){
        srq18s.add(srq);
    }
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getGrupoVulnerable() {
        return grupoVulnerable;
    }

    public void setGrupoVulnerable(String grupoVulnerable) {
        this.grupoVulnerable = grupoVulnerable;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getReSoporte() {
        return redSoporte;
    }

    public void setReSoporte(String reSoporte) {
        this.redSoporte = reSoporte;
    }

    public String getNombreRedSoporte() {
        return nombreRedSoporte;
    }

    public String getContactoRedSoporte() {
        return contactoRedSoporte;
    }

    public void setContactoRedSoporte(String contactoRedSoporte) {
        this.contactoRedSoporte = contactoRedSoporte;
    }

    public void setNombreRedSoporte(String nombreRedSoporte) {
        this.nombreRedSoporte = nombreRedSoporte;
    }

    public String getSrqIngreso() {
        return srqIngreso;
    }

    public void setSrqIngreso(String srqIngreso) {
        this.srqIngreso = srqIngreso;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getAcciones() {
        return acciones;
    }

    public void setAcciones(String acciones) {
        this.acciones = acciones;
    }

    public int getTotalSesiones() {
        return totalSesiones;
    }

    public void setTotalSesiones(int totalSesiones) {
        this.totalSesiones = totalSesiones;
    }

    public String getTelefonoOpcional() {
        return telefonoOpcional;
    }

    public void setTelefonoOpcional(String telefonoOpcional) {
        this.telefonoOpcional = telefonoOpcional;
    }

    public ArrayList<RegistroPaciente> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<RegistroPaciente> registros) {
        this.registros = registros;
    }

    public void addRegistro(RegistroPaciente rp) {
        registros.add(rp);
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getDetalleDerivado() {
        return detalleDerivado;
    }

    public String getDetalleOtroTelefono() {
        return detalleOtroTelefono;
    }

    public void setDetalleOtroTelefono(String detalleOtroTelefono) {
        this.detalleOtroTelefono = detalleOtroTelefono;
    }

    public void setDetalleDerivado(String detalleDerivado) {
        this.detalleDerivado = detalleDerivado;
    }

    public String getCantidadGrupoFamiliar() {
        return cantidadGrupoFamiliar;
    }

    public void setCantidadGrupoFamiliar(String cantidadGrupoFamiliar) {
        this.cantidadGrupoFamiliar = cantidadGrupoFamiliar;
    }

    public String getRbSeguro() {
        return rbSeguro;
    }

    public void setRbSeguro(String rbSeguro) {
        this.rbSeguro = rbSeguro;
    }

    public String getTxtOtroSeguro() {
        return txtOtroSeguro;
    }

    public void setTxtOtroSeguro(String txtOtroSeguro) {
        this.txtOtroSeguro = txtOtroSeguro;
    }

    public String getIngresoPeru() {
        return ingresoPeru;
    }

    public void setIngresoPeru(String ingresoPeru) {
        this.ingresoPeru = ingresoPeru;
    }

    public String getRbTrabajo() {
        return rbTrabajo;
    }

    public void setRbTrabajo(String rbTrabajo) {
        this.rbTrabajo = rbTrabajo;
    }

    public String getTxtTrabajo() {
        return txtTrabajo;
    }

    public void setTxtTrabajo(String txtTrabajo) {
        this.txtTrabajo = txtTrabajo;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public String getOtroNivelEducativo() {
        return otroNivelEducativo;
    }

    public void setOtroNivelEducativo(String otroNivelEducativo) {
        this.otroNivelEducativo = otroNivelEducativo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getNombreTerapeuta() {
        return nombreTerapeuta;
    }

    public void setNombreTerapeuta(String nombreTerapeuta) {
        this.nombreTerapeuta = nombreTerapeuta;
    }
    

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getSubOcupacion() {
        return subOcupacion;
    }

    public void setSubOcupacion(String subOcupacion) {
        this.subOcupacion = subOcupacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + this.idTerapeuta;
        hash = 97 * hash + this.idTrabajadorSocial;
        hash = 97 * hash + Objects.hashCode(this.codigo);
        hash = 97 * hash + Objects.hashCode(this.nombreTerapeuta);
        hash = 97 * hash + Objects.hashCode(this.nombres);
        hash = 97 * hash + Objects.hashCode(this.apellidos);
        hash = 97 * hash + Objects.hashCode(this.tipoDocumento);
        hash = 97 * hash + Objects.hashCode(this.dni);
        hash = 97 * hash + Objects.hashCode(this.genero);
        hash = 97 * hash + Objects.hashCode(this.fechaCreacion);
        hash = 97 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 97 * hash + Objects.hashCode(this.telefono);
        hash = 97 * hash + Objects.hashCode(this.telefonoOpcional);
        hash = 97 * hash + Objects.hashCode(this.correo);
        hash = 97 * hash + Objects.hashCode(this.nacionalidad);
        hash = 97 * hash + Objects.hashCode(this.condicionMigratoria);
        hash = 97 * hash + Objects.hashCode(this.departamento);
        hash = 97 * hash + Objects.hashCode(this.provincia);
        hash = 97 * hash + Objects.hashCode(this.distrito);
        hash = 97 * hash + Objects.hashCode(this.grupoVulnerable);
        hash = 97 * hash + Objects.hashCode(this.discapacidad);
        hash = 97 * hash + Objects.hashCode(this.redSoporte);
        hash = 97 * hash + Objects.hashCode(this.nombreRedSoporte);
        hash = 97 * hash + Objects.hashCode(this.srqIngreso);
        hash = 97 * hash + Objects.hashCode(this.observacion);
        hash = 97 * hash + Objects.hashCode(this.proyecto);
        hash = 97 * hash + Objects.hashCode(this.motivoConsulta);
        hash = 97 * hash + Objects.hashCode(this.acciones);
        hash = 97 * hash + Objects.hashCode(this.modalidad);
        hash = 97 * hash + Objects.hashCode(this.detalleDerivado);
        hash = 97 * hash + Objects.hashCode(this.detalleOtroTelefono);
        hash = 97 * hash + Objects.hashCode(this.contactoRedSoporte);
        hash = 97 * hash + Objects.hashCode(this.cantidadGrupoFamiliar);
        hash = 97 * hash + Objects.hashCode(this.rbSeguro);
        hash = 97 * hash + Objects.hashCode(this.txtOtroSeguro);
        hash = 97 * hash + Objects.hashCode(this.ingresoPeru);
        hash = 97 * hash + Objects.hashCode(this.rbTrabajo);
        hash = 97 * hash + Objects.hashCode(this.txtTrabajo);
        hash = 97 * hash + Objects.hashCode(this.nivelEducativo);
        hash = 97 * hash + Objects.hashCode(this.otroNivelEducativo);
        hash = 97 * hash + Objects.hashCode(this.ocupacion);
        hash = 97 * hash + Objects.hashCode(this.subOcupacion);
        hash = 97 * hash + this.totalSesiones;
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
        final Paciente other = (Paciente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idTerapeuta != other.idTerapeuta) {
            return false;
        }
        if (this.idTrabajadorSocial != other.idTrabajadorSocial) {
            return false;
        }
        if (this.totalSesiones != other.totalSesiones) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nombreTerapeuta, other.nombreTerapeuta)) {
            return false;
        }
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.tipoDocumento, other.tipoDocumento)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.fechaCreacion, other.fechaCreacion)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.telefonoOpcional, other.telefonoOpcional)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.condicionMigratoria, other.condicionMigratoria)) {
            return false;
        }
        if (!Objects.equals(this.departamento, other.departamento)) {
            return false;
        }
        if (!Objects.equals(this.provincia, other.provincia)) {
            return false;
        }
        if (!Objects.equals(this.distrito, other.distrito)) {
            return false;
        }
        if (!Objects.equals(this.grupoVulnerable, other.grupoVulnerable)) {
            return false;
        }
        if (!Objects.equals(this.discapacidad, other.discapacidad)) {
            return false;
        }
        if (!Objects.equals(this.redSoporte, other.redSoporte)) {
            return false;
        }
        if (!Objects.equals(this.nombreRedSoporte, other.nombreRedSoporte)) {
            return false;
        }
        if (!Objects.equals(this.srqIngreso, other.srqIngreso)) {
            return false;
        }
        if (!Objects.equals(this.observacion, other.observacion)) {
            return false;
        }
        if (!Objects.equals(this.proyecto, other.proyecto)) {
            return false;
        }
        if (!Objects.equals(this.motivoConsulta, other.motivoConsulta)) {
            return false;
        }
        if (!Objects.equals(this.acciones, other.acciones)) {
            return false;
        }
        if (!Objects.equals(this.modalidad, other.modalidad)) {
            return false;
        }
        if (!Objects.equals(this.detalleDerivado, other.detalleDerivado)) {
            return false;
        }
        if (!Objects.equals(this.detalleOtroTelefono, other.detalleOtroTelefono)) {
            return false;
        }
        if (!Objects.equals(this.contactoRedSoporte, other.contactoRedSoporte)) {
            return false;
        }
        if (!Objects.equals(this.cantidadGrupoFamiliar, other.cantidadGrupoFamiliar)) {
            return false;
        }
        if (!Objects.equals(this.rbSeguro, other.rbSeguro)) {
            return false;
        }
        if (!Objects.equals(this.txtOtroSeguro, other.txtOtroSeguro)) {
            return false;
        }
        if (!Objects.equals(this.ingresoPeru, other.ingresoPeru)) {
            return false;
        }
        if (!Objects.equals(this.rbTrabajo, other.rbTrabajo)) {
            return false;
        }
        if (!Objects.equals(this.txtTrabajo, other.txtTrabajo)) {
            return false;
        }
        if (!Objects.equals(this.nivelEducativo, other.nivelEducativo)) {
            return false;
        }
        if (!Objects.equals(this.otroNivelEducativo, other.otroNivelEducativo)) {
            return false;
        }
        if (!Objects.equals(this.ocupacion, other.ocupacion)) {
            return false;
        }
        return Objects.equals(this.subOcupacion, other.subOcupacion);
    }

    public ListaEspera getMyLista() {
        return myLista;
    }

    public void setMyLista(ListaEspera myLista) {
        this.myLista = myLista;
    }
    
    
    
    


//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//
//        Paciente p = (Paciente) obj;
//
//        return Float.compare(id, p.id) == 0 && codigo.equals(p.codigo) && nombres.equals(p.nombres) && apellidos.equals(p.apellidos) && tipoDocumento.equals(p.tipoDocumento)
//                && genero.equals(p.genero) && fechaCreacion.equals(p.fechaCreacion) && fechaNacimiento.equals(p.fechaNacimiento) && telefono.equals(p.telefono) && correo.equals(p.correo) && nacionalidad.equals(p.nacionalidad) && condicionMigratoria.equals(p.condicionMigratoria)
//                && departamento.equals(p.departamento) && provincia.equals(p.provincia) && distrito.equals(p.distrito) && grupoVulnerable.equals(p.grupoVulnerable)
//                && discapacidad.equals(p.discapacidad) && redSoporte.equals(p.redSoporte) && nombreRedSoporte.equals(p.nombreRedSoporte) && srqIngreso.equals(p.srqIngreso) && observacion.equals(p.observacion) && proyecto.equals(p.proyecto)
//                && motivoConsulta.equals(p.motivoConsulta) && acciones.equals(p.acciones) && detalleOtroTelefono.equals(p.detalleOtroTelefono)
//                
//                && cantidadGrupoFamiliar.equals(p.cantidadGrupoFamiliar) && rbSeguro.equals(p.rbSeguro) && txtOtroSeguro.equals(p.txtOtroSeguro)
//                && ingresoPeru.equals(p.ingresoPeru) && rbTrabajo.equals(p.rbTrabajo) && txtTrabajo.equals(p.txtTrabajo) && nivelEducativo.equals(p.nivelEducativo)
//                && otroNivelEducativo.equals(p.otroNivelEducativo) && ocupacion.equals(p.ocupacion) && subOcupacion.equals(p.subOcupacion)
//                
//                ;
//    }

    

    public int getIdTerapeuta() {
        return idTerapeuta;
    }

    public void setIdTerapeuta(int idTerapeuta) {
        this.idTerapeuta = idTerapeuta;
    }

    public int getIdTrabajadorSocial() {
        return idTrabajadorSocial;
    }

    public void setIdTrabajadorSocial(int idTrabajadorSocial) {
        this.idTrabajadorSocial = idTrabajadorSocial;
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
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
