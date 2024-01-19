package Panels;

import Clases.Generos;
import Clases.GrupoVulnerable;
import Clases.NotaEvolucion;
import Clases.Paciente;
import Clases.SRQ18;
import Clases.ScrollSens;
import Clases.exportarExcel;
import Clases.tools;
import Ventanas.verGrafico;
import java.awt.Color;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;
import rojerusan.RSNotifyFade;

public class panelMonitoreo extends javax.swing.JPanel {

    ChartPanel graficoUsuarios;
    ChartPanel graficoSesiones;
    int ano = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()).toString());
    String fecha01 = new SimpleDateFormat("yyyy-MM-dd").format(new tools().getCurrYearFirst(ano)).toString();
    String fecha02 = new SimpleDateFormat("yyyy-MM-dd").format(new tools().getCurrYearLast(ano)).toString();
    JTable tabla = new JTable();
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    ArrayList<Integer> meses = new ArrayList();
    String temp = "";

    public panelMonitoreo() {
        initComponents();
        //new ScrollSens(scrollPacientes);
        //new ScrollSens(scrollSesiones);
        new Thread(new Runnable() {
            @Override
            public void run() {
                llenarValores();
            }
        }).start();
        barra.setVisible(false);
        scrollFiltros.setViewportView(new panelFiltrosMonitoreo());
        new ScrollSens(scrollFiltros);
        new ScrollSens(scrollGraficaPrincipal);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCiclo = new javax.swing.ButtonGroup();
        scrollGraficaPrincipal = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        swtichP = new rojerusan.RSSwitch();
        barra = new rojeru_san.rsprogress.RSProgressBarAnimated();
        scrollFiltros = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(230, 230, 230));

        scrollGraficaPrincipal.setAutoscrolls(true);
        scrollGraficaPrincipal.setMaximumSize(new java.awt.Dimension(32767, 310));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_microsoft_excel_32px.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_futures_24px.png"))); // NOI18N
        jButton3.setToolTipText("Agrandar Gráfica");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        swtichP.setBackground(new java.awt.Color(249, 182, 48));
        swtichP.setToolTipText("Cambiar Entre Sesiones / Pacientes");
        swtichP.setColorFondoActivado(new java.awt.Color(144, 104, 175));
        swtichP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                swtichPMouseClicked(evt);
            }
        });

        barra.setForeground(new java.awt.Color(170, 170, 170));
        barra.setBorderPainted(false);
        barra.setGrosorBorde(1);
        barra.setStringPainted(false);
        barra.setVelocidad(25);

        scrollFiltros.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(230, 230, 230)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollFiltros, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(swtichP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollGraficaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollGraficaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(swtichP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (swtichP.isActivado()) {
            new verGrafico(graficoUsuarios, "Gráfica de pacientes nuevos.").setVisible(true);
        } else {
           new verGrafico(graficoSesiones, "Gráfica de sesiones realizadas.").setVisible(true);
        }
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void swtichPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_swtichPMouseClicked
        mostrarGrafico();
    }//GEN-LAST:event_swtichPMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new Thread(panelMonitoreo::verBarra).start();
        meses.clear();
        tabla = new JTable();
        modelo = (DefaultTableModel) tabla.getModel();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (swtichP.isActivado()) {
                        modelo.addColumn("#");
                        modelo.addColumn("ID");
                        modelo.addColumn("Código");
                        modelo.addColumn("Nombres");
                        modelo.addColumn("apellidos");
                        modelo.addColumn("Tipo de Documento");
                        modelo.addColumn("N° DNI");
                        modelo.addColumn("Genero");
                        modelo.addColumn("Fecha Creación");
                        modelo.addColumn("Fecha Nacimiento");
                        modelo.addColumn("Total Sesiones");
                        modelo.addColumn("Telefono");
                        modelo.addColumn("TelefonoOpcional");
                        modelo.addColumn("Correo");
                        modelo.addColumn("Nacionalidad");
                        modelo.addColumn("Condición Migratoria");
                        modelo.addColumn("Departamento");
                        modelo.addColumn("Provincia");
                        modelo.addColumn("Distrito");
                        modelo.addColumn("Grupo Vulnerable");
                        modelo.addColumn("Discapacidad");
                        modelo.addColumn("¿Red Soporte?");
                        modelo.addColumn("Nombre red Soporte");
                        modelo.addColumn("SRQ Inicial");
                        modelo.addColumn("Observación");
                        modelo.addColumn("Proyecto");
                        modelo.addColumn("Motivo Consulta");
                        modelo.addColumn("Acciones");

                        ArrayList<Paciente> pacientes
                                = (ArrayList) new Paciente().getPacientexFechaCreacion(fecha01, fecha02).clone();
                        int cont=1;
                        for (Paciente paciente : pacientes) {
                            modelo.addRow(new Object[]{cont++,
                                paciente.getId(), paciente.getCodigo(), paciente.getNombres(), paciente.getApellidos(), paciente.getTipoDocumento(), paciente.getDni(), paciente.getGenero(),
                                paciente.getFechaCreacion(), paciente.getFechaNacimiento(), paciente.getTotalSesiones(), paciente.getTelefono(),paciente.getTelefonoOpcional(), paciente.getCorreo(), paciente.getNacionalidad(),
                                paciente.getCondicionMigratoria(), paciente.getDepartamento(), paciente.getProvincia(), paciente.getDistrito(), paciente.getGrupoVulnerable(), paciente.getDiscapacidad(), paciente.getRedSoporte(), paciente.getNombreRedSoporte(),
                                paciente.getSrqIngreso(), paciente.getObservacion(), paciente.getProyecto(), paciente.getMotivoConsulta(), paciente.getAcciones()
                            });
                        }
                        new exportarExcel().exportarExcel(tabla, "Resumen Pacientes 2022");
                        ocultarBarra();
                    } else { //SESIONES
                        modelo.addColumn("#");
                        modelo.addColumn("ID");
                        modelo.addColumn("Paciente");
                        modelo.addColumn("Terapeuta");
                        modelo.addColumn("Fecha Emisión");
                        modelo.addColumn("Observación");
                        modelo.addColumn("Sintomas");
                        modelo.addColumn("Relaciones");
                        modelo.addColumn("Limites");
                        modelo.addColumn("Ansiedad");
                        modelo.addColumn("manejo Agresion");
                        modelo.addColumn("Funcionalidad");
                        modelo.addColumn("Trabajo Terapeutico");
                        modelo.addColumn("Estado");

                        ArrayList<NotaEvolucion> notas
                                = (ArrayList) new NotaEvolucion().getNotasdePacientexRangoFecha(fecha01, fecha02).clone();
                        int cont=1;
                        for (NotaEvolucion nota : notas) {
                            modelo.addRow(new Object[]{cont++,
                                nota.getIdNota(), nota.getPaciente().getNombreCompleto(), nota.getTerapeuta().getNombre(),
                                nota.getFechaNota(), nota.getObservacion(), nota.getSintomas(), nota.getRelaciones(),
                                nota.getLimites(), nota.getAnsiedad(), nota.getManejoAgresion(), nota.getFuncionalidad(),
                                nota.getTrabajoTerapeutico(), nota.getEstado()
                            });
                        }
                        new exportarExcel().exportarExcel(tabla, "Resumen Sesiones 2022");
                        ocultarBarra();
                    }
                } catch (IOException ex) {
                    ocultarBarra();
                    Logger.getLogger(panelMonitoreo.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(graficoSesiones, "Error Exportando Excel\n" + ex);
                }

            }
        }).start();


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static rojeru_san.rsprogress.RSProgressBarAnimated barra;
    private javax.swing.ButtonGroup grupoCiclo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane scrollFiltros;
    private javax.swing.JScrollPane scrollGraficaPrincipal;
    private rojerusan.RSSwitch swtichP;
    // End of variables declaration//GEN-END:variables

    private void llenarValores() {
        graficoUsuarios = new Paciente().getGraficoPacientes();
        graficoSesiones = new Paciente().getGraficoSesiones();
        mostrarGrafico();
    }

    private void mostrarGrafico() {
        if (swtichP.isActivado()) {
            scrollGraficaPrincipal.setViewportView(graficoUsuarios);
            swtichP.setColorBoton(new Color(255, 255, 255));
           // tituloLabel.setText("Gráfica de Pacientes Nuevos");
        } else {
            scrollGraficaPrincipal.setViewportView(graficoSesiones);
            swtichP.setColorBoton(new Color(249,182,48));
           // tituloLabel.setText("Gráfica de Sesiones Realizadas");
        }
    }

    public static void verBarra() {
        barra.setVisible(true);
    }

    public static void ocultarBarra() {
        barra.setVisible(false);
    }

    

}
