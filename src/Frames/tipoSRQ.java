/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Paciente;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author parra
 */
public class tipoSRQ extends javax.swing.JFrame {

    Paciente paciente;
    String tipo="";
    Index index;
    public tipoSRQ() {
        initComponents();
        changeIcon();
    }
public tipoSRQ(Index index,Paciente paciente, String tipo) {
        initComponents();
        changeIcon();
        this.paciente=paciente;
        this.tipo=tipo;
        this.index=index;
        
        tituloLabel.setText(tipo.equalsIgnoreCase("srq")
                ?"Seleccione el tipo de SRQ"
                :tipo.equalsIgnoreCase("indice")
                ?"Seleccione el tipo de Indice Bienestar"
                :"Seleccione el tipo de Nota de Evolución");
        
        this.setTitle(tipo.equalsIgnoreCase("srq")
                ?"Seleccione el tipo de SRQ"
                :tipo.equalsIgnoreCase("indice")
                ?"Seleccione el tipo de Indice Bienestar"
                :"Seleccione el tipo de Nota de Evolución");
    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        rSButtonRoundEffect1 = new rojeru_san.rsbutton.RSButtonRoundEffect();
        rSButtonRoundEffect2 = new rojeru_san.rsbutton.RSButtonRoundEffect();
        rSButtonRoundEffect3 = new rojeru_san.rsbutton.RSButtonRoundEffect();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seleccione Tipo SRQ");
        setResizable(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("Seleccione el tipo de SRQ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        rSButtonRoundEffect1.setText("Proceso");
        rSButtonRoundEffect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRoundEffect1ActionPerformed(evt);
            }
        });

        rSButtonRoundEffect2.setText("Final");
        rSButtonRoundEffect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRoundEffect2ActionPerformed(evt);
            }
        });

        rSButtonRoundEffect3.setText("Inicio");
        rSButtonRoundEffect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRoundEffect3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSButtonRoundEffect3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonRoundEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(rSButtonRoundEffect2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonRoundEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRoundEffect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRoundEffect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRoundEffect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRoundEffect1ActionPerformed
        if(tipo.equalsIgnoreCase("srq")){
            new newSRQ18(index,paciente, "Proceso").setVisible(true);
        this.dispose();
       }else if(tipo.equalsIgnoreCase("indice")){
           new newIndiceBienestar(index,paciente, "Proceso").setVisible(true);
           this.dispose();  
       }else if(tipo.equalsIgnoreCase("nota")){
           new newNotaEvolucion(index,paciente,  "Proceso").setVisible(true);
            this.dispose();
       }
        
        
    }//GEN-LAST:event_rSButtonRoundEffect1ActionPerformed

    private void rSButtonRoundEffect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRoundEffect2ActionPerformed
       if(tipo.equalsIgnoreCase("srq")){
         new newSRQ18(index,paciente, "Final").setVisible(true);
        this.dispose();  
       }else if(tipo.equalsIgnoreCase("indice")){
           new newIndiceBienestar(index,paciente,  "Final").setVisible(true);
           this.dispose();  
       }else if(tipo.equalsIgnoreCase("nota")){
           new newNotaEvolucion(index,paciente,  "Final").setVisible(true);
            this.dispose();
       }
        
    }//GEN-LAST:event_rSButtonRoundEffect2ActionPerformed

    private void rSButtonRoundEffect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRoundEffect3ActionPerformed
         if(tipo.equalsIgnoreCase("srq")){
         new newSRQ18(index,paciente, "Inicio").setVisible(true);
        this.dispose();  
       }else if(tipo.equalsIgnoreCase("indice")){
           new newIndiceBienestar(index,paciente, "Inicio").setVisible(true);
           this.dispose();  
       }else if(tipo.equalsIgnoreCase("nota")){
           new newNotaEvolucion(index,paciente,  "Inicio").setVisible(true);
            this.dispose();
       }
    }//GEN-LAST:event_rSButtonRoundEffect3ActionPerformed

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
            java.util.logging.Logger.getLogger(tipoSRQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tipoSRQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tipoSRQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tipoSRQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tipoSRQ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rsbutton.RSButtonRoundEffect rSButtonRoundEffect1;
    private rojeru_san.rsbutton.RSButtonRoundEffect rSButtonRoundEffect2;
    private rojeru_san.rsbutton.RSButtonRoundEffect rSButtonRoundEffect3;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
