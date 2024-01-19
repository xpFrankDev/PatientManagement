/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Cargos;
import Clases.EncriptadorAES;
import Clases.Mail;
import Clases.Privilegios;
import Clases.Usuario;
import Panels.panelVerUsuarios;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojeru_san.complementos.RSUtilities;
import rojerusan.RSNotifyFade;

/**
 *
 * @author Family
 */
public class VerUsuario extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    String tipo;
    ArrayList<Usuario> users = new ArrayList();
    panelVerUsuarios pvu;
    String srqCheck="no",indiceCheck="no";
    public VerUsuario() {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        
        changeIcon();
        usuario = new Usuario().getUsuario("dev2");
        escribirUsuario();
        llenarCombos();
        this.tipo="nuevo";
        privCombo.setVisible(false);
        jLabel15.setVisible(false);
    }

    public VerUsuario(String titulox, panelVerUsuarios pvu) {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        privCombo.setVisible(false);
        jLabel15.setVisible(false);
        
        this.tipo = titulox;
        changeIcon();
        this.pvu = pvu;
        tituloTxt.setText("Gestión de Usuarios ( " + titulox + " )");
        llenarCombos();
    }

    public VerUsuario(Usuario usuario, panelVerUsuarios pvu) {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        
        this.usuario = usuario;
        this.tipo = "editar";
        this.pvu = pvu;
        changeIcon();
        tituloTxt.setText("Gestión de Usuarios ( Editar )");
        colcocarDatos();
        privCombo.setVisible(false);
        jLabel15.setVisible(false);

    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
        
        jLabel10.setVisible(false);
        superiorCombo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        privCombo = new rojerusan.RSComboBox();
        superiorCombo = new rojerusan.RSComboBox();
        jLabel10 = new javax.swing.JLabel();
        fondoPanel = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        tituloTxt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dniTxt = new rojeru_san.rsfield.RSTextFullRound();
        jLabel3 = new javax.swing.JLabel();
        usernameTxt = new rojeru_san.rsfield.RSTextFullRound();
        jLabel6 = new javax.swing.JLabel();
        claveTxt = new rojeru_san.rsfield.RSPassViewRound();
        jLabel8 = new javax.swing.JLabel();
        nombreTxt = new rojeru_san.rsfield.RSTextFullRound();
        jLabel7 = new javax.swing.JLabel();
        codigoTerapeutaTxt = new rojeru_san.rsfield.RSTextFullRound();
        jLabel11 = new javax.swing.JLabel();
        cargoCombo = new rojerusan.RSComboBox();
        jLabel12 = new javax.swing.JLabel();
        estadoCombo = new rojerusan.RSComboBox();
        rSButtonRound1 = new rojeru_san.rsbutton.RSButtonRound();
        jLabel14 = new javax.swing.JLabel();
        correoTxt = new rojeru_san.rsfield.RSTextFullRound();
        srqCheckP = new rojerusan.RSCheckBox();
        indiceCheckP = new rojerusan.RSCheckBox();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Privilegio");

        privCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Privs" }));
        privCombo.setDisabledIdex("");

        superiorCombo.setDisabledIdex("");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Superior");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración de usuarios");
        setResizable(false);

        fondoPanel.setBackground(new java.awt.Color(0, 0, 0));

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));

        panelHeader.setBackground(new java.awt.Color(51, 51, 51));

        tituloTxt.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        tituloTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloTxt.setText("Gestionar Usuarios / Terapeutas.");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DNI");

        dniTxt.setForeground(new java.awt.Color(0, 0, 0));
        dniTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dniTxt.setBorderColor(new java.awt.Color(102, 102, 102));
        dniTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        dniTxt.setPhColor(new java.awt.Color(0, 102, 102));
        dniTxt.setPlaceholder("Esperando Valor");
        dniTxt.setSelectionColor(new java.awt.Color(0, 102, 102));
        dniTxt.setSoloNumeros(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre de Usuario");

        usernameTxt.setForeground(new java.awt.Color(0, 0, 0));
        usernameTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTxt.setBorderColor(new java.awt.Color(102, 102, 102));
        usernameTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usernameTxt.setPhColor(new java.awt.Color(0, 102, 102));
        usernameTxt.setPlaceholder("Esperando Valor");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contraseña de Ingreso");

        claveTxt.setForeground(new java.awt.Color(0, 0, 0));
        claveTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        claveTxt.setBorderColor(new java.awt.Color(102, 102, 102));
        claveTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        claveTxt.setPhColor(new java.awt.Color(0, 102, 102));
        claveTxt.setSelectionColor(new java.awt.Color(0, 102, 102));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nombre y Apellido");

        nombreTxt.setForeground(new java.awt.Color(0, 0, 0));
        nombreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreTxt.setBorderColor(new java.awt.Color(102, 102, 102));
        nombreTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nombreTxt.setPhColor(new java.awt.Color(0, 102, 102));
        nombreTxt.setPlaceholder("Esperando Valor");
        nombreTxt.setSelectionColor(new java.awt.Color(0, 102, 102));
        nombreTxt.setSoloLetras(true);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Código Interno");

        codigoTerapeutaTxt.setForeground(new java.awt.Color(0, 0, 0));
        codigoTerapeutaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codigoTerapeutaTxt.setBorderColor(new java.awt.Color(102, 102, 102));
        codigoTerapeutaTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        codigoTerapeutaTxt.setPhColor(new java.awt.Color(0, 102, 102));
        codigoTerapeutaTxt.setPlaceholder("Esperando Valor");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cargo");

        cargoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargo" }));
        cargoCombo.setDisabledIdex("");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Correo Eléctronico");

        estadoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        estadoCombo.setDisabledIdex("");

        rSButtonRound1.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonRound1.setText("ACEPTAR");
        rSButtonRound1.setColorBorde(new java.awt.Color(51, 51, 51));
        rSButtonRound1.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonRound1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rSButtonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Estado");

        correoTxt.setForeground(new java.awt.Color(0, 0, 0));
        correoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correoTxt.setBorderColor(new java.awt.Color(102, 102, 102));
        correoTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        correoTxt.setPhColor(new java.awt.Color(0, 102, 102));
        correoTxt.setPlaceholder("Esperando Valor");

        srqCheckP.setText("Emitir SRQ18");
        srqCheckP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                srqCheckPItemStateChanged(evt);
            }
        });

        indiceCheckP.setText("Emitir Indice Bienestar");
        indiceCheckP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                indiceCheckPItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargoCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estadoCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(srqCheckP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(indiceCheckP, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelCentralLayout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCentralLayout.createSequentialGroup()
                                        .addComponent(dniTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panelCentralLayout.createSequentialGroup()
                                            .addComponent(claveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(codigoTerapeutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(correoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCentralLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dniTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoTerapeutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(srqCheckP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indiceCheckP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cargoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(rSButtonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound1ActionPerformed
       
            String dni = dniTxt.getText();
            String username = usernameTxt.getText();
            String clave = claveTxt.getText();
            String nombre = nombreTxt.getText();
            String codigo = codigoTerapeutaTxt.getText();
            String priv = privCombo.getSelectedItem().toString();
            String cargo = cargoCombo.getSelectedItem().toString();
            String estado = "Activo";
            String correo = correoTxt.getText();

            if (tipo.equalsIgnoreCase("editar")) {

                if (usernameTxt.getText().isEmpty() || claveTxt.getText().isEmpty()
                        || nombreTxt.getText().isEmpty() || codigoTerapeutaTxt.getText().isEmpty()
                        || correoTxt.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(cargoCombo, "Debe llenar los campos obligatorios, asegurese que estos posean algún dato:\nCampos Obligatorios:\n\n1. Nombre de Usuario\n2.Contraseña\n3.Nombre y Apellido\n4.Código Interno\n5.Correo Electrónico");
                } else {
                    

                    usuario.setDni(dniTxt.getText());
                    usuario.setCorreo(correoTxt.getText());
                    usuario.setUsername(usernameTxt.getText());
                    usuario.setClave(claveTxt.getText());
                    usuario.setNombre(nombreTxt.getText());
                    usuario.setCodigo(codigoTerapeutaTxt.getText());
                    usuario.setPriv(privCombo.getSelectedItem().toString());
                    usuario.setCargo(cargoCombo.getSelectedItem().toString());
                    usuario.setEstado(estadoCombo.getSelectedItem().toString());
                    usuario.setIdJefe(getidJefe());
                    usuario.setSrqCheck(srqCheck);
                    usuario.setIndiceCheck(indiceCheck);
                    
                    
                    String mensajeCorreo = "Saludos, " + usuario.getNombre() + ", se le informa que sus datos dentro del sistema caps fueron actualizados\n"
                            + ". \n Nombre de usuario: " + usuario.getUsername() +  " \n Código de Usuario: " + usuario.getCodigo()
                            + "\n Privilegios: " + usuario.getPriv() + "\n Estado: " + usuario.getEstado();
                    int a = usuario.updateUsuario();
                    if (a > -1) {
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                pvu.resetearBusqueda();
                                new Mail().enviarCorreo(usuario.getCorreo(), "Actualización de Usuario - Sistema Caps", mensajeCorreo);
                            }
                        }).start();
                        new rojerusan.RSNotifyFade("Datos Actualizados", "Los datos se actualizaron correctamente.", 5,
                                RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                        this.dispose();
                    } else {
                        new rojerusan.RSNotifyFade("Ups. Algo Salió Mal", "No se pudo actualizar el registro, intentelo nuevamente o contacte al adm.", 5,
                                RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
                    }

                }

            } else if (validarDatosRepetidos()) {

                String datos = "Saludos, " + nombre + ", se le informa que se ha registrado un nuevo usuario en el sistema caps con los privilegios de: " + priv + ""
                        + ". \n\n Nombre de usuario: " + username + "\n Contraseña: " + clave + " \n Código de Usuario: " + codigo;
                int agregar = new Usuario().newUsuario(getidJefe(), dni, nombre, username, codigo, clave, priv, cargo, correo,srqCheck,indiceCheck);
                if (agregar > 0) {

                    new rojerusan.RSNotifyFade("Datos Agregados", "Los datos se agregaron con exito.", 5,
                            RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            pvu.resetearBusqueda();
                            new Mail().enviarCorreo(correo, "Registro de Usuario - Sistema Caps", datos);
                        }
                    }).start();
                    this.dispose();
                } else {
                    new rojerusan.RSNotifyFade("Ups. Algo Salió Mal", "No se pudo agregar el registro, intentelo nuevamente o contacte al adm.", 5,
                            RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
                }

            }

       
    }//GEN-LAST:event_rSButtonRound1ActionPerformed

    private void srqCheckPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_srqCheckPItemStateChanged
        if(srqCheckP.isSelected()){
            srqCheck="si";
        }else{
            srqCheck="no";
        }
    }//GEN-LAST:event_srqCheckPItemStateChanged

    private void indiceCheckPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_indiceCheckPItemStateChanged
        if(indiceCheckP.isSelected()){
            indiceCheck="si";
        }else{
            indiceCheck="no";
        }
    }//GEN-LAST:event_indiceCheckPItemStateChanged

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
            java.util.logging.Logger.getLogger(VerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new VerUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSComboBox cargoCombo;
    private rojeru_san.rsfield.RSPassViewRound claveTxt;
    private rojeru_san.rsfield.RSTextFullRound codigoTerapeutaTxt;
    private rojeru_san.rsfield.RSTextFullRound correoTxt;
    private rojeru_san.rsfield.RSTextFullRound dniTxt;
    private rojerusan.RSComboBox estadoCombo;
    private javax.swing.JPanel fondoPanel;
    private rojerusan.RSCheckBox indiceCheckP;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.rsfield.RSTextFullRound nombreTxt;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelHeader;
    private rojerusan.RSComboBox privCombo;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound1;
    private rojerusan.RSCheckBox srqCheckP;
    private rojerusan.RSComboBox superiorCombo;
    private javax.swing.JLabel tituloTxt;
    private rojeru_san.rsfield.RSTextFullRound usernameTxt;
    // End of variables declaration//GEN-END:variables

    
    private void borrarCampos() {
        //idTxt.setText("");
        dniTxt.setText("");
        usernameTxt.setText(usuario.getUsername());
        claveTxt.setText("");
        nombreTxt.setText("");
        codigoTerapeutaTxt.setText("");
        //fechaTxt.setText("");
        privCombo.setSelectedIndex(0);
        cargoCombo.setSelectedIndex(0);
        estadoCombo.setSelectedIndex(0);
    }

    private void escribirUsuario() {
        //idTxt.setText(usuario.getId() + "");
        dniTxt.setText(usuario.getDni());
        usernameTxt.setText(usuario.getUsername());
        claveTxt.setText(usuario.getClave());
        nombreTxt.setText(usuario.getNombre());
        codigoTerapeutaTxt.setText(usuario.getCodigo());
        //fechaTxt.setText(usuario.getFechaCreacion());
        
//        if(!usuario.getSrqCheck().equalsIgnoreCase("no"))srqCheckP.setSelected(true);
      //  if(!usuario.getIndiceCheck().equalsIgnoreCase("no"))indiceCheckP.setSelected(true);
    }

    private void iniciarDatos() {
        if (tipo.equalsIgnoreCase("editar")) {
            try {
           //     idTxt.setText(usuario.getId() + "");
                dniTxt.setText(usuario.getDni());
                nombreTxt.setText(usuario.getNombre());
                usernameTxt.setText(usuario.getUsername());
                claveTxt.setText(new EncriptadorAES().desencriptar(usuario.getClave()));
                codigoTerapeutaTxt.setText(usuario.getCodigo());
                estadoCombo.setSelectedItem(usuario.getEstado());
                cargoCombo.setSelectedItem(usuario.getCargo());
                privCombo.setSelectedItem(usuario.getPriv());
              //  fechaTxt.setText(usuario.getFechaCreacion());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(VerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(VerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeyException ex) {
                Logger.getLogger(VerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(VerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
                Logger.getLogger(VerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                Logger.getLogger(VerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                ArrayList<Privilegios> privs = (ArrayList) new Privilegios().Listar("").clone();
                privCombo.removeAllItems();
                for (Privilegios priv : privs) {
                    if (priv.getEstado().equalsIgnoreCase("activo")) {
                        privCombo.addItem(priv.getNombre());
                    }
                }
            }
        }).start();

        ArrayList<Cargos> cargos = (ArrayList) new Cargos().Listar("").clone();
        cargoCombo.removeAllItems();
        for (Cargos cargo : cargos) {
            if (cargo.getEstado().equalsIgnoreCase("activo")) {
                cargoCombo.addItem(cargo.getNombre());
            }
        }
    }

    private void colcocarDatos() {
        llenarCombos();
        
      //  idTxt.setText(usuario.getId() + "");
        dniTxt.setText(usuario.getDni());
        usernameTxt.setText(usuario.getUsername());
        claveTxt.setText(usuario.getClave());
        nombreTxt.setText(usuario.getNombre());
        codigoTerapeutaTxt.setText(usuario.getCodigo());
        privCombo.setSelectedItem(usuario.getPriv());
        System.out.println(usuario.getCargo());
        cargoCombo.setSelectedItem(usuario.getCargo());
        
        estadoCombo.setSelectedItem(usuario.getEstado());
        //fechaTxt.setText(usuario.getFechaCreacion());
        correoTxt.setText(usuario.getCorreo());
        
        
        
        if(!usuario.getSrqCheck().equalsIgnoreCase("no"))srqCheckP.setSelected(true);
        if(!usuario.getIndiceCheck().equalsIgnoreCase("no"))indiceCheckP.setSelected(true);
        
    }

    private void llenarCombos() {

        

        users = (ArrayList) new Usuario().getUsuarioxCodigo("").clone();
        superiorCombo.removeAllItems();
        superiorCombo.addItem("Ninguno");
        for (Usuario user : users) {
            superiorCombo.addItem(user.getUsername());
        }

        
        ArrayList<Cargos> cargos = (ArrayList) new Cargos().Listar("").clone();
                cargoCombo.removeAllItems();
                for (Cargos cargo : cargos) {
                    cargoCombo.addItem(cargo.getNombre());
                }
                
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                
//            }
//        }).start();
    }

    private int getidJefe() {
        int rsp = -1;
        String codx = superiorCombo.getSelectedItem().toString();
        for (Usuario user : users) {
            if (user.getUsername().equalsIgnoreCase(codx)) {
                rsp = user.getId();
            }

        }
        return rsp;
    }

    private boolean validarDatosRepetidos() {
        String error = "Datos encontrados Repetidos:";
        boolean llave = false;

        if (usernameTxt.getText().isEmpty() || claveTxt.getText().isEmpty()
                || nombreTxt.getText().isEmpty() || codigoTerapeutaTxt.getText().isEmpty()
                || correoTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(cargoCombo, "Debe llenar los campos obligatorios, asegurese que estos posean algún dato:\nCampos Obligatorios:\n\n1. Nombre de Usuario\n2.Contraseña\n3.Nombre y Apellido\n4.Código Interno\n5.Correo Electrónico");
        } else {
            if (users.isEmpty()) {
                users = (ArrayList) new Usuario().getUsuarioxCodigo("").clone();
            }
            for (Usuario user : users) {
                if (dniTxt.getText().equalsIgnoreCase(user.getDni()) && !error.contains("-DNI")) {
                    error += "\n -DNI";
                }
                if (usernameTxt.getText().equalsIgnoreCase(user.getUsername()) && !error.contains("-Nombre Usuario")) {
                    error += "\n -Nombre Usuario";
                }
                if (codigoTerapeutaTxt.getText().equalsIgnoreCase(user.getCodigo()) && !error.contains("-Código de usuario")) {
                    error += "\n -Código de usuario";
                }

            }

            if (error.equalsIgnoreCase("Datos encontrados Repetidos:")) {
                llave = true;
            } else {
                JOptionPane.showMessageDialog(cargoCombo, error);
            }
        }

        return llave;
    }
}
