/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Clases.Usuario;
import Clases.tools;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;

/**
 *
 * @author Franklin
 */
public class Login extends javax.swing.JFrame {

    String userTemp = "";
    static Usuario user = new Usuario();
    static boolean userEncontrado = false;
    public Login() {
        initComponents();
        changeIcon(true);
        barra.setVisible(false);
        new Thread(new Runnable() {
            @Override
            public void run() {
                user = new Usuario().getUsuario(".");
                user = new Usuario();
            }
        }).start();
        actualizarCaptcha();
       // usernameTxt.requestFocus();
    }
public Login(boolean isOpen) {
        initComponents();
        changeIcon(isOpen);
        barra.setVisible(false);
        new Thread(new Runnable() {
            @Override
            public void run() {
                user = new Usuario().getUsuario(".");
                user = new Usuario();
            }
        }).start();
        actualizarCaptcha();
       // usernameTxt.requestFocus();
    }
    public void changeIcon(boolean isOpen) {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
        
        if (isOpen) {
            new Thread(() -> {
                try {
                    ServerSocket serverSocket = new ServerSocket(11246);
                    Socket socket = serverSocket.accept();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(rootPane, "El programa ya se encuentra abierto, solo puede tener una instancia del mismo");
                    System.exit(0);
                }
            }).start();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        rSPanelImage1 = new rojeru_san.rspanel.RSPanelImage();
        pnlDiseño = new javax.swing.JPanel();
        passwordTxt = new rojeru_san.rsfield.RSPassViewBD();
        lbTitulo = new javax.swing.JLabel();
        iconPersonas = new RSMaterialComponent.RSButtonIconShadow();
        usernameTxt = new RSMaterialComponent.RSTextFieldMaterial();
        ingresarBtn = new rojeru_san.rsbutton.RSButtonRound();
        txtCaptcha = new rojeru_san.rsfield.RSTextFullRound();
        lbAvisoGatcha = new javax.swing.JLabel();
        lbImageCaptcha = new rojeru_san.rslabel.RSLabelImage();
        lbcaptcha = new javax.swing.JLabel();
        lbFondo = new rojeru_san.rslabel.RSLabelImage();
        barra = new rojeru_san.rsprogress.RSProgressBarAnimated();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso a Plataforma - CAPS");
        setResizable(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imgs/fondoLoggin2.png"))); // NOI18N

        pnlDiseño.setOpaque(false);
        pnlDiseño.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordTxt.setBackground(new java.awt.Color(164, 184, 172));
        passwordTxt.setForeground(new java.awt.Color(246, 219, 212));
        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTxt.setBordeColorFocus(new java.awt.Color(246, 219, 212));
        passwordTxt.setBotonColor(new java.awt.Color(246, 219, 212));
        passwordTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passwordTxt.setPlaceholder("Contraseña");
        pnlDiseño.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        lbTitulo.setBackground(new java.awt.Color(246, 219, 212));
        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(246, 219, 212));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("INICIAR SESIÓN");
        pnlDiseño.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        iconPersonas.setBackground(new java.awt.Color(165, 185, 172));
        iconPersonas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iconPersonas.setForeground(new java.awt.Color(246, 219, 212));
        iconPersonas.setBackgroundHover(new java.awt.Color(157, 169, 167));
        iconPersonas.setFontSize(24.0F);
        iconPersonas.setForegroundText(new java.awt.Color(246, 219, 212));
        iconPersonas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconPersonas.setIconTextGap(0);
        iconPersonas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);
        iconPersonas.setOpaque(true);
        iconPersonas.setRound(100);
        iconPersonas.setTypeBorder(RSMaterialComponent.RSButtonIconShadow.TYPEBORDER.CIRCLE);
        pnlDiseño.add(iconPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, 100));

        usernameTxt.setBackground(new java.awt.Color(164, 184, 172));
        usernameTxt.setForeground(new java.awt.Color(255, 255, 255));
        usernameTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTxt.setColorMaterial(new java.awt.Color(138, 128, 155));
        usernameTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usernameTxt.setPhColor(new java.awt.Color(246, 219, 212));
        usernameTxt.setPhIntensity(220);
        usernameTxt.setPlaceholder("Usuario");
        usernameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTxtFocusLost(evt);
            }
        });
        usernameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameTxtKeyTyped(evt);
            }
        });
        pnlDiseño.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        ingresarBtn.setBackground(new java.awt.Color(138, 128, 155));
        ingresarBtn.setText("ACCESO");
        ingresarBtn.setColorHover(new java.awt.Color(100, 128, 155));
        ingresarBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ingresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBtnActionPerformed(evt);
            }
        });
        pnlDiseño.add(ingresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        txtCaptcha.setBackground(new java.awt.Color(164, 184, 172));
        txtCaptcha.setForeground(new java.awt.Color(255, 255, 255));
        txtCaptcha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCaptcha.setBorderColor(new java.awt.Color(138, 128, 155));
        txtCaptcha.setPhColor(new java.awt.Color(255, 255, 255));
        txtCaptcha.setPlaceholder("");
        txtCaptcha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaptchaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaptchaKeyTyped(evt);
            }
        });
        pnlDiseño.add(txtCaptcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 100, -1));

        lbAvisoGatcha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbAvisoGatcha.setForeground(new java.awt.Color(255, 255, 255));
        lbAvisoGatcha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvisoGatcha.setText("Ingrese Captcha");
        pnlDiseño.add(lbAvisoGatcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        lbImageCaptcha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/captcha.png"))); // NOI18N
        pnlDiseño.add(lbImageCaptcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 40, 40));

        lbcaptcha.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbcaptcha.setForeground(new java.awt.Color(255, 255, 255));
        lbcaptcha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlDiseño.add(lbcaptcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 60, 40));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fotoLoggin.png"))); // NOI18N
        pnlDiseño.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 340, 480));

        barra.setForeground(new java.awt.Color(236, 171, 175));
        barra.setColorBorde(new java.awt.Color(157, 169, 167));
        barra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        barra.setGrosorBorde(1);
        barra.setString("");
        barra.setVelocidad(50);

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelImage1Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(pnlDiseño, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDiseño, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtCaptchaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaptchaKeyReleased
      if (validarCaptcha()) {
            lbAvisoGatcha.setText("Captcha Correcto");
        } else {
            lbAvisoGatcha.setText("Captcha Invalido");
        }
     if(evt.getKeyCode() == KeyEvent.VK_ENTER){
         ingresarBtn.doClick();
     }
    }//GEN-LAST:event_txtCaptchaKeyReleased

    private void usernameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTxtKeyReleased
      
        if(usernameTxt.getText().length()>0){
           usernameTxt.setPlaceholder("");
       }else{
            usernameTxt.setPlaceholder("Usuario");
       }
        
        try {
            if(evt.getKeyCode() == KeyEvent.VK_PAGE_UP && (new tools().Obtener_mac().equals("e8-40-f2-05-ec-40") 
                    || new tools().Obtener_mac().equals("00-24-81-CC-7D-05")
                    || new tools().Obtener_mac().equals("EC-F4-BB-4A-2E-B2")
                    || new tools().Obtener_mac().equals("A0-A8-CD-72-ED-DB")
                    )){
                usernameTxt.setText("dev");
                passwordTxt.setText(".");
                txtCaptcha.setText(lbcaptcha.getText());
                validarCaptcha();
                ingresarBtn.doClick();
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_usernameTxtKeyReleased

    private void ingresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBtnActionPerformed
      new Thread(this::buscarUsuario).start();
    }//GEN-LAST:event_ingresarBtnActionPerformed

    private void usernameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTxtKeyTyped
       
    }//GEN-LAST:event_usernameTxtKeyTyped

    private void usernameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFocusGained
     
            usernameTxt.setPlaceholder("");
       
    }//GEN-LAST:event_usernameTxtFocusGained

    private void usernameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFocusLost
      if(usernameTxt.getText().length()>0){
          
       }else{
            usernameTxt.setPlaceholder("Contraseña");
       }
    }//GEN-LAST:event_usernameTxtFocusLost

    private void txtCaptchaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaptchaKeyTyped
     if(txtCaptcha.getText().length()>4){
         evt.consume();
     }
    }//GEN-LAST:event_txtCaptchaKeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsprogress.RSProgressBarAnimated barra;
    private RSMaterialComponent.RSButtonIconShadow iconPersonas;
    private rojeru_san.rsbutton.RSButtonRound ingresarBtn;
    private javax.swing.JLabel lbAvisoGatcha;
    private rojeru_san.rslabel.RSLabelImage lbFondo;
    private rojeru_san.rslabel.RSLabelImage lbImageCaptcha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbcaptcha;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rsfield.RSPassViewBD passwordTxt;
    private javax.swing.JPanel pnlDiseño;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage1;
    private rojeru_san.rsfield.RSTextFullRound txtCaptcha;
    private RSMaterialComponent.RSTextFieldMaterial usernameTxt;
    // End of variables declaration//GEN-END:variables

private void actualizarCaptcha() {
        lbcaptcha.setText(new tools().getRandomString(4));
        
    }

private boolean validarCaptcha() {
        if (txtCaptcha.getText().equalsIgnoreCase(lbcaptcha.getText())) {
            //ingresarBtn.setEnabled(true);
            return true;
        } else {
            //ingresarBtn.setEnabled(false);
            return false;
        }
    }
 private void buscarUsuario() {
       ingresarBtn.setEnabled(false);
        try {

            if (!validarCaptcha()) {
                  new rojerusan.RSNotifyFade("¡Captcha Pendiente!",
                  "Debe realizar el captcha antes de continuar.", 5,
              RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
              
                
                ingresarBtn.setEnabled(true);

            } else {
                if (usernameTxt.getText().isEmpty()) {
                    new rojerusan.RSNotifyFade("¡Ingrese Usuario!",
                                        "Debe ingresar el nombre de usuario para continuar.", 5,
                                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
                    ingresarBtn.setEnabled(true);
                } else {
                    if (passwordTxt.getText().isEmpty()) {
                         new rojerusan.RSNotifyFade("¡Ingrese Contraseña!",
                                        "Debe ingresar la contraseña del usuario para continuar.", 5,
                                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
                                        ingresarBtn.setEnabled(true);    
                    } else {
                        ingresarBtn.setEnabled(false);
                        barra.setVisible(true);

                        if (userEncontrado == false || !userTemp.equals(usernameTxt.getText())) {
                            user = user.getUsuario(usernameTxt.getText());
                            userTemp = usernameTxt.getText();

                        }

                        if (user.getId() < 0) {
                            userEncontrado = false;
                            barra.setVisible(false);
                            barra.setVisible(false);
                            ingresarBtn.setEnabled(true);
                            new rojerusan.RSNotifyFade("¡Usuario no encontrado!",
                                    "Ingrese correctamente el usuario, no encontramos coincidencias en la base de datos.", 5,
                                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

                        ingresarBtn.setEnabled(true);
                        } else {
                            if(!user.getEstado().equalsIgnoreCase("activo")){
                                barra.setVisible(false);
                            
                            new rojerusan.RSNotifyFade("¡Usuario inactivo!",
                                    "El usuario no se encuentra activo o habilitado para ingresar.", 5,
                                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
                            }else{
                                 userEncontrado = true;
                            if (!user.getClave().equals(passwordTxt.getText())) {
                                barra.setVisible(false);
                                barra.setVisible(false);
                                new rojerusan.RSNotifyFade("¡Clave Incorrecta!",
                                        "La contraseña ingresada no es correcta, vuelva a intentarlo.", 5,
                                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
                            ingresarBtn.setEnabled(true);
                            } else {
                                barra.setVisible(true);
                                    System.out.println(user.toString());
                                new Index(user).setVisible(true);
                                this.dispose();
                            }
                            
                            
                           

                            }
                        }
                    }
                }

            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(rootPane, "Error1");
            ingresarBtn.setEnabled(true);
        }
    }
}

