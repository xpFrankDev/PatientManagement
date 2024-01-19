/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.ListaEspera;
import Clases.Mail;
import Clases.Paciente;
import Clases.RegistroPaciente;
import Clases.Usuario;
import Panels.panelListaEspera;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import rojerusan.RSNotifyFade;

/**
 *
 * @author parra
 */
public class AsignarCita extends javax.swing.JFrame {

    RegistroPaciente rp;
    Usuario terapeuta= new Usuario();
    Paciente paciente;

    Index index;
    public AsignarCita() {
        initComponents();
        changeIcon();
    }

    public AsignarCita(Index index,RegistroPaciente rp, Paciente paciente) {
        initComponents();
        this.rp = rp;
        this.paciente = paciente;
        this.index =index;
        changeIcon();
        iniciarDatos();
    }
    public AsignarCita(Index index,Usuario terapeuta, Paciente paciente) {
        initComponents();
        this.terapeuta = terapeuta;
        cancelarBtn.setVisible(false);
        this.paciente = paciente;
        this.index =index;
        changeIcon();
        iniciarDatos();
    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombrePacienteLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fechaCita = new rojeru_san.rsdate.RSDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        justificacionTxt = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        posponerBtn = new rojeru_san.rsbutton.RSButtonRoundEffect();
        cancelarBtn = new rojeru_san.rsbutton.RSButtonRoundEffect();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Posponer / Asignar Cita a Paciente");
        setResizable(false);

        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulo.setBackground(new java.awt.Color(0, 102, 102));
        panelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reasignar  o Cancelar cita del Paciente");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        panelCentral.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 513, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Paciente:");
        panelCentral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 73, -1, 30));

        nombrePacienteLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        nombrePacienteLabel.setText("jLabel3");
        panelCentral.add(nombrePacienteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 73, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Fecha a Asignar");
        panelCentral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelCentral.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 50, 50));

        fechaCita.setFormatoFecha("dd-MM-yyyy");
        fechaCita.setFuente(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        fechaCita.setPlaceholder("Formato (DD-MM-YYYY)");
        panelCentral.add(fechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, 32));

        justificacionTxt.setColumns(20);
        justificacionTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        justificacionTxt.setRows(3);
        justificacionTxt.setTabSize(2);
        justificacionTxt.setWrapStyleWord(true);
        jScrollPane1.setViewportView(justificacionTxt);

        panelCentral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 460, 110));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Justificación / Observación");
        panelCentral.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, -1));

        posponerBtn.setText("Colocar / Posponer cita");
        posponerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posponerBtnActionPerformed(evt);
            }
        });
        panelCentral.add(posponerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        cancelarBtn.setBackground(new java.awt.Color(220, 51, 51));
        cancelarBtn.setText("Cancelar Cita");
        cancelarBtn.setColorHover(new java.awt.Color(190, 51, 51));
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });
        panelCentral.add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        if (validar()) {
            if (rp.getAccionRP().toLowerCase().contains("Asignación de Cita")) {//Cancelamos cita
                rp.setEstadoRP("Cancelado");
                rp.setObservacionRP(rp.getObservacionRP() + " Motivo Cancelación: " + justificacionTxt.getText());

                if (rp.UpdateRegistro() > 0) {
                    new rojerusan.RSNotifyFade("Cita Cancelada", " Los datos fueron suministrados y la cita con el paciente fue cancelda", 5,
                            RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    this.dispose();
                } else {
                    new rojerusan.RSNotifyFade("Oops! algo salió mal", "No pudimos eliminar la Cita, verifique su conexión a internet o en caso de persistir contacte al adm", 5,
                            RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);

                }
            } else {//eliminamos de lista de espera
                rp.setEstadoRP("Cancelado");
                if (rp.UpdateRegistro() > 0) {
                    new rojerusan.RSNotifyFade("Eliminado de Lista Espera", "el Usuario ya no se encuentra en la Listade Espera", 5,
                            RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    this.dispose();
                }
            }
        } else {
            new rojerusan.RSNotifyFade("Justificación Vacia", "Debe agregar una justificación a la acción realizada", 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
        }


    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void posponerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posponerBtnActionPerformed
String observacionx = justificacionTxt.getText();
        String fechaAsignada = new SimpleDateFormat("yyyy-MM-dd").format(fechaCita.getDatoFecha());
        if(paciente.getId()>0){
            
             new RegistroPaciente().newRegistro(
                                paciente.getId(),
                                index.getUser().getId(),
                                terapeuta.getId(),
                                "Agregado a Cita con Terapeuta",
                                observacionx,
                                fechaAsignada, "Activo"
                        );
            
            if(new ListaEspera().liberarLista(paciente.getId(), terapeuta.getId())){
                 String datos = " Saludos, se le informa que se le ha asignado una cita con el paciente " + paciente.getNombreCompleto() + " para la fecha: " + fechaAsignada;
                 new Mail().enviarCorreo(
                         terapeuta.getCorreo(),
                         "Cita Asignada",
                         datos
                 );
                 new rojerusan.RSNotifyFade(
                        "Asignación Exitosa",
                        "Se ha liberado de la lista de espera al paciente "+paciente.getNombreCompleto() + " y asignado a "+terapeuta.getNombre()+" como su "+terapeuta.getCargo(),
                        5,
                        RSNotifyFade.PositionNotify.BottomRight,
                        RSNotifyFade.TypeNotify.SUCCESS
                ).setVisible(true);
                 
                 this.dispose();
                 panelListaEspera.resetearBusqueda();
            }
            
        }else{
           rp.setEstadoRP("Pospuesta");
        rp.setObservacionRP(rp.getObservacionRP() + " Motivo Cancelación: " + justificacionTxt.getText());
        
        if (rp.UpdateRegistro() > 0) {
            int rsp = new RegistroPaciente().newRegistro(paciente.getId(), index.getUser().getId(),
                    index.getUser().getId(), "Asignación de Cita", observacionx, fechaAsignada, "Activo");
            if (rsp > 0) {

                new rojerusan.RSNotifyFade("Cita Asignada", " La cita fue asignada a la fecha asignada", 5,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                this.dispose();
            }

        } else {
            new rojerusan.RSNotifyFade("Oops! algo salió mal", "No pudimos eliminar la Cita, verifique su conexión a internet o en caso de persistir contacte al adm", 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
        } 
        }
        
        
        
        
        
    }//GEN-LAST:event_posponerBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AsignarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonRoundEffect cancelarBtn;
    private rojeru_san.rsdate.RSDateChooser fechaCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea justificacionTxt;
    private javax.swing.JLabel nombrePacienteLabel;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelTitulo;
    private rojeru_san.rsbutton.RSButtonRoundEffect posponerBtn;
    // End of variables declaration//GEN-END:variables

    public void iniciarDatos() {
        nombrePacienteLabel.setText(paciente.getNombreCompleto());
        

        if (rp.getAccionRP().toLowerCase().contains("Lista de Espera")) {
            cancelarBtn.setText("Elim. de Lista");
        } else {
            cancelarBtn.setText("Cancelar Cita");
        }
    }

    private boolean validar() {
        if (justificacionTxt.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
