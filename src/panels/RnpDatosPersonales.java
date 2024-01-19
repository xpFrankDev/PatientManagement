/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Panels;

import Clases.Departamento;
import Clases.TipoDocumento;
import Clases.tools;
import Ventanas.newPaciente;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
/**
 *
 * @author parra
 */
public class RnpDatosPersonales extends javax.swing.JPanel {

    
    public ArrayList<Departamento> distritos = new ArrayList();
    boolean dep=false;
    boolean pro=false;
    boolean otro=false;
    newPaciente ventanaAnterior;
    int tamanoFecha=0;
    public RnpDatosPersonales() {
        initComponents();
        fnac.setDatoFecha(new Date());
        iniciar();
       
    }

    public RnpDatosPersonales(newPaciente ventana) {
        initComponents();
        this.ventanaAnterior=ventana;
        fnac.setDatoFecha(new Date());
        iniciar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apellidosTxt = new RSComponentShade.RSTextFieldShade();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fnac = new rojeru_san.rsdate.RSDateChooser();
        jLabel4 = new javax.swing.JLabel();
        generoCombo = new rojerusan.RSComboBox();
        jLabel5 = new javax.swing.JLabel();
        telefonoTxt = new RSComponentShade.RSTextFieldShade();
        correoTxt = new RSComponentShade.RSTextFieldShade();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dniTxt = new RSComponentShade.RSTextFieldShade();
        checkDocumento = new rojerusan.RSCheckBox();
        nombresTxt = new RSComponentShade.RSTextFieldShade();
        jLabel11 = new javax.swing.JLabel();
        otroDocumentoTxt = new rojerusan.RSComboBox();
        nacionalidadTxt = new rojerusan.RSComboBox();
        departamentoTxt = new rojerusan.RSComboBox();
        provinviaTxt = new rojerusan.RSComboBox();
        distritoTxt = new rojerusan.RSComboBox();
        jLabel12 = new javax.swing.JLabel();
        telefonoOpcionalTxt = new RSComponentShade.RSTextFieldShade();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDetalleTelefonoOpcional = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        apellidosTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellidosTxt.setBgShade(new java.awt.Color(153, 0, 0));
        apellidosTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        apellidosTxt.setPlaceholder("");
        apellidosTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidosTxtFocusLost(evt);
            }
        });
        apellidosTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidosTxtKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apellidos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("N° de Identificación");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha Nacimiento");

        fnac.setColorBackground(new java.awt.Color(153, 153, 153));
        fnac.setColorButtonHover(new java.awt.Color(153, 0, 0));
        fnac.setColorForeground(new java.awt.Color(0, 0, 0));
        fnac.setFormatoFecha("dd-MM-yyyy");
        fnac.setFuente(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fnac.setPlaceholder("(DD-MM-YYYY)");
        fnac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnacFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnacFocusLost(evt);
            }
        });
        fnac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fnacMouseExited(evt);
            }
        });
        fnac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnacKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnacKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnacKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Genero");

        generoCombo.setDisabledIdex("");
        generoCombo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Teléfono");

        telefonoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefonoTxt.setBgShadeHover(new java.awt.Color(0, 0, 0));
        telefonoTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        telefonoTxt.setPlaceholder("");
        telefonoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoTxtKeyReleased(evt);
            }
        });

        correoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correoTxt.setBgShadeHover(new java.awt.Color(0, 0, 0));
        correoTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        correoTxt.setPlaceholder("");
        correoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                correoTxtKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Correo Eléctronico");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Teléfono Opcional");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Departamento");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Provincia");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Distrito");

        dniTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dniTxt.setBgShadeHover(new java.awt.Color(0, 0, 0));
        dniTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        dniTxt.setPlaceholder("");

        checkDocumento.setForeground(new java.awt.Color(0, 0, 0));
        checkDocumento.setSelected(true);
        checkDocumento.setText("Tipo de documento");
        checkDocumento.setEnabled(false);
        checkDocumento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkDocumento.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkDocumentoStateChanged(evt);
            }
        });

        nombresTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombresTxt.setBgShade(new java.awt.Color(153, 0, 0));
        nombresTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        nombresTxt.setPlaceholder("");
        nombresTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombresTxtFocusLost(evt);
            }
        });
        nombresTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombresTxtKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nombres");

        otroDocumentoTxt.setEditable(true);
        otroDocumentoTxt.setToolTipText("Puede Editar Manualmente este campo");
        otroDocumentoTxt.setColorBorde(new java.awt.Color(204, 204, 204));
        otroDocumentoTxt.setConBorde(true);
        otroDocumentoTxt.setDisabledIdex("");
        otroDocumentoTxt.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        otroDocumentoTxt.setItemHeight(40);
        otroDocumentoTxt.setOpaque(false);
        otroDocumentoTxt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                otroDocumentoTxtItemStateChanged(evt);
            }
        });
        otroDocumentoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otroDocumentoTxtActionPerformed(evt);
            }
        });

        nacionalidadTxt.setDisabledIdex("");
        nacionalidadTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        departamentoTxt.setDisabledIdex("");
        departamentoTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        departamentoTxt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departamentoTxtItemStateChanged(evt);
            }
        });

        provinviaTxt.setDisabledIdex("");
        provinviaTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        provinviaTxt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                provinviaTxtItemStateChanged(evt);
            }
        });

        distritoTxt.setDisabledIdex("");
        distritoTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nacionalidad");

        telefonoOpcionalTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefonoOpcionalTxt.setBgShadeHover(new java.awt.Color(0, 0, 0));
        telefonoOpcionalTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        telefonoOpcionalTxt.setPlaceholder("");
        telefonoOpcionalTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoOpcionalTxtKeyReleased(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Detalle Teléfono Opcional");

        txtDetalleTelefonoOpcional.setColumns(12);
        txtDetalleTelefonoOpcional.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtDetalleTelefonoOpcional.setLineWrap(true);
        txtDetalleTelefonoOpcional.setRows(1);
        txtDetalleTelefonoOpcional.setTabSize(3);
        txtDetalleTelefonoOpcional.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(txtDetalleTelefonoOpcional);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(apellidosTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(otroDocumentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dniTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(generoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(fnac, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(telefonoOpcionalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nacionalidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departamentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(provinviaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(distritoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(120, 120, 120)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dniTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(checkDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(otroDocumentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(apellidosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(generoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(fnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(telefonoOpcionalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nacionalidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(7, 7, 7)
                        .addComponent(provinviaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(departamentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(7, 7, 7)
                        .addComponent(distritoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkDocumentoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkDocumentoStateChanged
      otroDocumentoTxt.setVisible(checkDocumento.isSelected());
    }//GEN-LAST:event_checkDocumentoStateChanged

    private void nombresTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombresTxtFocusLost
     
    }//GEN-LAST:event_nombresTxtFocusLost

    private void apellidosTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidosTxtFocusLost
      
    }//GEN-LAST:event_apellidosTxtFocusLost

    private void fnacFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnacFocusLost
        ventanaAnterior.actualizarResumen();
    }//GEN-LAST:event_fnacFocusLost

    private void nombresTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombresTxtKeyReleased
        ventanaAnterior.actualizarCoincidencias();
        ventanaAnterior.actualizarResumen();
        nombresTxt.setText(nombresTxt.getText().toUpperCase());
    }//GEN-LAST:event_nombresTxtKeyReleased

    private void apellidosTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidosTxtKeyReleased
       ventanaAnterior.actualizarCoincidencias();
       ventanaAnterior.actualizarResumen();
        apellidosTxt.setText(apellidosTxt.getText().toUpperCase());
    }//GEN-LAST:event_apellidosTxtKeyReleased

    private void fnacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnacKeyPressed
       
    }//GEN-LAST:event_fnacKeyPressed

    private void departamentoTxtItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departamentoTxtItemStateChanged
       if(dep==false && Float.compare(departamentoTxt.getItemCount(),0)>0){
           pro=true;
        provinviaTxt.removeAllItems();
        distritoTxt.removeAllItems();
        
        distritoTxt.addItem("Selec. Pro.");
        
        String dx = departamentoTxt.getSelectedItem().toString().toLowerCase();
        
        for(Departamento dep : distritos){
            if(dep.getTipo().equalsIgnoreCase("departamento") && dep.getNombre().equalsIgnoreCase(dx)){
                for(Departamento depx : distritos){
                    if(depx.getTipo().equalsIgnoreCase("provincia") 
                            && Float.compare(depx.getPadre(),dep.getId())==0){
                        provinviaTxt.addItem(depx.getNombre());
                    }
                }
            }
        }
        pro=false;
       }
        
        
    }//GEN-LAST:event_departamentoTxtItemStateChanged

    private void provinviaTxtItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_provinviaTxtItemStateChanged
        
        if((pro==false || dep==false) && Float.compare(provinviaTxt.getItemCount(),0)>0){
            distritoTxt.removeAllItems();
        
        String px = provinviaTxt.getSelectedItem().toString().toLowerCase();
        
        for(Departamento dep : distritos){
            if(dep.getTipo().equalsIgnoreCase("provincia") && dep.getNombre().equalsIgnoreCase(px)){
                for(Departamento depx : distritos){
                    if(depx.getTipo().equalsIgnoreCase("distrito") 
                            && Float.compare(depx.getPadre(),dep.getId())==0){
                        distritoTxt.addItem(depx.getNombre());
                    }
                }
            }
        }
        }
        
    }//GEN-LAST:event_provinviaTxtItemStateChanged
int index=0;
    private void otroDocumentoTxtItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_otroDocumentoTxtItemStateChanged
      
        if(otro==false && Float.compare(otroDocumentoTxt.getItemCount(),0)>0 && otroDocumentoTxt.getSelectedItem().toString().equalsIgnoreCase("   Otro Doc.")){
          otro=true;
            String tmp = "x";
             tmp = JOptionPane.showInputDialog(generoCombo, "", "Ingrese un nuevo tipo de documento", JOptionPane.QUESTION_MESSAGE);
            if(!tmp.equalsIgnoreCase("x")){
                otroDocumentoTxt.addItem(tmp);
                otroDocumentoTxt.setSelectedItem(tmp);
            }
            
            otro=false;
      }
    }//GEN-LAST:event_otroDocumentoTxtItemStateChanged

    private void telefonoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoTxtKeyReleased
      new tools().soloNumerosyCantidadDigitos(evt, telefonoTxt, 10);
    }//GEN-LAST:event_telefonoTxtKeyReleased

    private void telefonoOpcionalTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoOpcionalTxtKeyReleased
       new tools().soloNumerosyCantidadDigitos(evt, telefonoTxt, 10);
    }//GEN-LAST:event_telefonoOpcionalTxtKeyReleased

    private void correoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoTxtKeyReleased
      correoTxt.setText(correoTxt.getText().toLowerCase());
      if(!validarCorreo(correoTxt.getText())){
          correoTxt.setBgShade(Color.red);
      }else{
          correoTxt.setBgShade(Color.black);
      }
    }//GEN-LAST:event_correoTxtKeyReleased

    private void otroDocumentoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otroDocumentoTxtActionPerformed
        
    }//GEN-LAST:event_otroDocumentoTxtActionPerformed

    private void fnacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnacMouseExited
       ventanaAnterior.actualizarResumen();
    }//GEN-LAST:event_fnacMouseExited

    private void fnacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnacKeyReleased
    
        
   
    }//GEN-LAST:event_fnacKeyReleased

    private void fnacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnacKeyTyped
        System.out.println(fnac.getDatoFecha().toString());
        if(fnac.getDatoFecha().toString().length()>9){
         ventanaAnterior.actualizarResumen();
    }
    }//GEN-LAST:event_fnacKeyTyped

    private void fnacFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnacFocusGained
       ventanaAnterior.actualizarResumen();
    }//GEN-LAST:event_fnacFocusGained
public static boolean validarCorreo (String correo){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        mat = pat.matcher(correo);
        if(mat.find()){
            return true;
        }else{
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static RSComponentShade.RSTextFieldShade apellidosTxt;
    public static rojerusan.RSCheckBox checkDocumento;
    public static RSComponentShade.RSTextFieldShade correoTxt;
    public static rojerusan.RSComboBox departamentoTxt;
    public static rojerusan.RSComboBox distritoTxt;
    public static RSComponentShade.RSTextFieldShade dniTxt;
    public static rojeru_san.rsdate.RSDateChooser fnac;
    public static rojerusan.RSComboBox generoCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    public static rojerusan.RSComboBox nacionalidadTxt;
    public static RSComponentShade.RSTextFieldShade nombresTxt;
    public static rojerusan.RSComboBox otroDocumentoTxt;
    public static rojerusan.RSComboBox provinviaTxt;
    public static RSComponentShade.RSTextFieldShade telefonoOpcionalTxt;
    public static RSComponentShade.RSTextFieldShade telefonoTxt;
    public static javax.swing.JTextArea txtDetalleTelefonoOpcional;
    // End of variables declaration//GEN-END:variables

public static String validarCompleto(){
    String resultado="";
    if(nombresTxt.getText().isEmpty()){
        resultado = "\nDatos Faltantes en Pagina#1:\n-Nombres del Paciente";
    }
    if(apellidosTxt.getText().isEmpty()){
        resultado+= resultado.isEmpty()?"\nDatos Faltantes en Pagina#1:\n-Apellidos del Paciente":"\n-Apellidos del Paciente";
    }
    if(fnac.getDatoFecha().toString().isEmpty()){
        resultado+= resultado.isEmpty()?"\nDatos Faltantes en Pagina#1:\n-Fecha de Nacimiento del Paciente":"\n-Fecha de Nacimiento del Paciente";
   
    }
    /*
     String texto = correoTxt.getText();
    if(!validarCorreo(texto)){
        resultado+= resultado.isEmpty()?"\nDatos Faltantes en Pagina#1:\n-Correo Electronico":"\n-Correo Electrónico";
    }
    */
   
    
    return resultado;
}
public static String validarparaSRQ(){
    String resultado="";
    if(nombresTxt.getText().isEmpty()){
        resultado = "\nDatos Faltantes en Pagina#1:\n-Nombres del Paciente";
    }
    if(apellidosTxt.getText().isEmpty()){
        resultado+= resultado.isEmpty()?"\nDatos Faltantes en Pagina#1:\n-Apellidos del Paciente":"\n-Apellidos del Paciente";
    }
    if(fnac.getDatoFecha().toString().isEmpty()){
        resultado+= resultado.isEmpty()?"\nDatos Faltantes en Pagina#1:\n-Fecha de Nacimiento del Paciente":"\n-Fecha de Nacimiento del Paciente";
   
    }
    
    
    return resultado;
}
    private void iniciar() {
        

/*
        // Configurar el borde redondeado
        Border border = BorderFactory.createLineBorder(Color.GRAY);
        Border margin = new EmptyBorder(10,10,10,10);
        Border compound = BorderFactory.createCompoundBorder(border, margin);
        txtDetalleTelefonoOpcional.setBorder(BorderFactory.createCompoundBorder(compound,
                BorderFactory.createLineBorder(Color.WHITE, 5)));

        */



//dep=true;
        departamentoTxt.removeAllItems();
        provinviaTxt.removeAllItems();
        distritoTxt.removeAllItems();
        
      //  new Thread(new Runnable() {
        //    @Override
        //    public void run() {
                
                distritos = (ArrayList) new Departamento().Listar().clone();
                
                for(Departamento dep : distritos){
                    if(dep.getTipo().equalsIgnoreCase("departamento")){
                        departamentoTxt.addItem(dep.getNombre());
                    }
                }
                //provinviaTxt.addItem("Selec.. Dep.");
                distritoTxt.addItem("Selec. Pro.");
                dep=false;
    // }
       // }).start();
    
    
    
    //otroDocumentoTxt
            ArrayList<TipoDocumento> documentos = (ArrayList) new TipoDocumento().Listar("").clone();
            otro=true;
            otroDocumentoTxt.removeAllItems();
            otroDocumentoTxt.addItem("   DNI");
            ArrayList<String> tmp = new ArrayList();
            for (TipoDocumento doc : documentos) {
                if (doc.getEstado().equalsIgnoreCase("activo") && !tmp.contains(doc.getNombre())) {
                    otroDocumentoTxt.addItem("   "+doc.getNombre());
                    tmp.add(doc.getNombre());
                }
            }
            otroDocumentoTxt.addItem("   Calidad Migratoria");
            otroDocumentoTxt.addItem("   Otro Doc.");
            otro=false;
    
    checkDocumento.setSelected(true);
    //txtDetalleTelefonoOpcional.setBorder(correoTxt.getBorder());
    
    txtDetalleTelefonoOpcional.setOpaque(false);

Border border = BorderFactory.createLineBorder(Color.white, 2);
Border margin = new EmptyBorder(1, 1, 1, 1);
CompoundBorder comp = new CompoundBorder(border, margin);
txtDetalleTelefonoOpcional.setBorder(comp);

// Para establecer un radio en el borde, puede utilizar BorderFactory
txtDetalleTelefonoOpcional.setBorder(BorderFactory.createCompoundBorder(comp,
            BorderFactory.createLineBorder(Color.gray, 1, true)));
    }

    
    
   
    
}
