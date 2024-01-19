/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Panels;

import Clases.Usuario;
import Ventanas.Index;
import Ventanas.ListarTerapeutas;
import Ventanas.newPaciente;
import javax.swing.JOptionPane;

/**
 *
 * @author parra
 */
public class RnpFinalizar extends javax.swing.JPanel {

    /**
     * Creates new form DatosPersonales
     */
    public static Usuario terapeuta = new Usuario();
    static newPaciente ventanaOriginal;
    Index index;
    public RnpFinalizar() {
        initComponents();
        rbListaEspera.setSelected(true);
        terapeutaBtn.setVisible(false);
        terapeutaTxt.setVisible(false);
        nombreTerapeutaTxt.setVisible(false);
        fechaCitaTxt.setVisible(false);
        derivadoCombo.setVisible(false);
    }
    public RnpFinalizar(Index index,newPaciente p) {
        initComponents();
        rbListaEspera.setSelected(true);
        terapeutaBtn.setVisible(false);
        terapeutaTxt.setVisible(false);
        nombreTerapeutaTxt.setVisible(false);
        fechaCitaTxt.setVisible(false);
        derivadoCombo.setVisible(false);
        this.ventanaOriginal=p;
        this.index=index;
        
        
        
    }
    private void validarOpciones(){
        if(index.getUser().getCargo().equalsIgnoreCase("terapeuta") || index.getUser().getCargo().equalsIgnoreCase("psiquiatra") ){
            rbDerivarToTerapeuta.setVisible(false);
            terapeutaBtn.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        resumenLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbListaEspera = new RSMaterialComponent.RSRadioButtonMaterial();
        rbDerivarToTerapeuta = new RSMaterialComponent.RSRadioButtonMaterial();
        terapeutaBtn = new rojeru_san.rsbutton.RSButtonRound();
        terapeutaTxt = new javax.swing.JLabel();
        finalizarBtn = new rojeru_san.rsbutton.RSButtonRound();
        nombreTerapeutaTxt = new javax.swing.JLabel();
        fechaCitaTxt = new rojeru_san.rsdate.RSDateChooser();
        jLabel3 = new javax.swing.JLabel();
        modalidadCombo = new rojerusan.RSComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        derivadoCombo = new rojerusan.RSComboBox();
        rbNothing = new RSMaterialComponent.RSRadioButtonMaterial();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resumen y Fin de Registro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        setPreferredSize(new java.awt.Dimension(864, 418));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Resumen");

        resumenLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        resumenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Deseo:");

        grupo1.add(rbListaEspera);
        rbListaEspera.setText("Enviar Paciente a Lista de Espera");
        rbListaEspera.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        rbListaEspera.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbListaEsperaStateChanged(evt);
            }
        });

        grupo1.add(rbDerivarToTerapeuta);
        rbDerivarToTerapeuta.setText("Derivarlo directamente con un Terapeuta");
        rbDerivarToTerapeuta.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        rbDerivarToTerapeuta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbDerivarToTerapeutaStateChanged(evt);
            }
        });

        terapeutaBtn.setText("Seleccionar Terapeuta");
        terapeutaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terapeutaBtnActionPerformed(evt);
            }
        });

        terapeutaTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        terapeutaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        finalizarBtn.setBackground(new java.awt.Color(0, 102, 51));
        finalizarBtn.setText("Finalizar Registro");
        finalizarBtn.setColorHover(new java.awt.Color(0, 153, 0));
        finalizarBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        finalizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarBtnActionPerformed(evt);
            }
        });

        nombreTerapeutaTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        fechaCitaTxt.setToolTipText("Ingrese fecha de la cita con el terapeuta");
        fechaCitaTxt.setFormatoFecha("dd-MM-yyyy");
        fechaCitaTxt.setFuente(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        fechaCitaTxt.setPlaceholder("   Fecha Cita");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Modalidad:");

        modalidadCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Directo", "Derivado" }));
        modalidadCombo.setDisabledIdex("");
        modalidadCombo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        modalidadCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modalidadComboItemStateChanged(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        derivadoCombo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        derivadoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                derivadoComboItemStateChanged(evt);
            }
        });

        grupo1.add(rbNothing);
        rbNothing.setSelected(true);
        rbNothing.setText("Solo actualizar Datos");
        rbNothing.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        rbNothing.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbNothingStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(resumenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(rbDerivarToTerapeuta, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(terapeutaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(terapeutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(nombreTerapeutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(fechaCitaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modalidadCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(derivadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(finalizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbNothing, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbListaEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(resumenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbListaEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNothing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbDerivarToTerapeuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(terapeutaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaCitaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terapeutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTerapeutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modalidadCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(derivadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbDerivarToTerapeutaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbDerivarToTerapeutaStateChanged
        terapeutaBtn.setVisible(rbDerivarToTerapeuta.isSelected());
        terapeutaTxt.setVisible(rbDerivarToTerapeuta.isSelected());
        nombreTerapeutaTxt.setVisible(rbDerivarToTerapeuta.isSelected());
        
    }//GEN-LAST:event_rbDerivarToTerapeutaStateChanged

    private void rbListaEsperaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbListaEsperaStateChanged
        
    }//GEN-LAST:event_rbListaEsperaStateChanged

    private void finalizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarBtnActionPerformed
       String validacion = ventanaOriginal.validarDatos();
        if(validacion.equals("")){
            ventanaOriginal.actualizarResumen();
           ventanaOriginal.registrarPaciente();
       }else{
           JOptionPane.showMessageDialog(finalizarBtn, "Faltan agregar algunos datos para finalizar el registro:\n"+validacion);
       }
    }//GEN-LAST:event_finalizarBtnActionPerformed

    private void terapeutaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terapeutaBtnActionPerformed
       new ListarTerapeutas(index,"newPaciente").setVisible(true);
    }//GEN-LAST:event_terapeutaBtnActionPerformed

    private void modalidadComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modalidadComboItemStateChanged
        if(modalidadCombo.getSelectedIndex() == 0){
            derivadoCombo.setVisible(false);
        }else{
            derivadoCombo.setVisible(true);
        }
    }//GEN-LAST:event_modalidadComboItemStateChanged
boolean otro=false;
    private void derivadoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_derivadoComboItemStateChanged
       if(otro==false && Float.compare(derivadoCombo.getItemCount(),0)>0 && derivadoCombo.getSelectedItem().toString().equalsIgnoreCase("   Otro Doc.")){
          otro=true;
            String tmp = "x";
             tmp = JOptionPane.showInputDialog(derivadoCombo, "", "Ingrese un nuevo valor", JOptionPane.QUESTION_MESSAGE);
            if(!tmp.equalsIgnoreCase("x")){
                derivadoCombo.addItem(tmp);
                derivadoCombo.setSelectedItem(tmp);
            }
            
            otro=false;
      }
    }//GEN-LAST:event_derivadoComboItemStateChanged

    private void rbNothingStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbNothingStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNothingStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rojerusan.RSComboBox derivadoCombo;
    public static rojeru_san.rsdate.RSDateChooser fechaCitaTxt;
    public rojeru_san.rsbutton.RSButtonRound finalizarBtn;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    public rojerusan.RSComboBox modalidadCombo;
    public static javax.swing.JLabel nombreTerapeutaTxt;
    public static RSMaterialComponent.RSRadioButtonMaterial rbDerivarToTerapeuta;
    public static RSMaterialComponent.RSRadioButtonMaterial rbListaEspera;
    public static RSMaterialComponent.RSRadioButtonMaterial rbNothing;
    public javax.swing.JLabel resumenLabel;
    private rojeru_san.rsbutton.RSButtonRound terapeutaBtn;
    public static javax.swing.JLabel terapeutaTxt;
    // End of variables declaration//GEN-END:variables

    public static String validar(){
    String resultado="";
    
    if(rbDerivarToTerapeuta.isSelected() && terapeuta.getId()<0){
        resultado="\nDatos Faltantes en Pagina#4:\n-Seleccionar el Terapeuta al cual será designado el paciente o seleccione la opción de <Enviar Paciente a Lista de Espera>";
    }
    
    return resultado="";
}


    
    public static void setTerapeuta(Usuario usuarioSeleccionado){
        terapeuta=usuarioSeleccionado;
        terapeutaTxt.setText(terapeuta.getId()+"/"+terapeuta.getCodigo());
        nombreTerapeutaTxt.setText(terapeuta.getNombre());
        fechaCitaTxt.setVisible(true);
        ventanaOriginal.setTerapeutaCita(usuarioSeleccionado);
        
    }
    public static Usuario getTerapeuta(){
        return terapeuta;
    }
}
