/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.NotaEvolucion;
import Clases.Paciente;
import Clases.PlaceHolder;
import Clases.RegistroPaciente;
import Clases.Usuario;
import Clases.tools;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyFade;

/**
 *
 * @author parra
 */
public class newNotaEvolucion extends javax.swing.JFrame {

    Paciente paciente = new Paciente();
    NotaEvolucion nota = new NotaEvolucion();
    Usuario terapeuta = new Usuario();
    String tipo = "";
    DefaultTableModel modelo;
    Index index;

    public newNotaEvolucion() {
        initComponents();
        changeIcon();
        new PlaceHolder("Esperando valores", txtAlianzaTrabajo);
        new PlaceHolder("Esperando valores", txtAnsiedad);
        new PlaceHolder("Esperando valores", txtFuncionalidad);
        new PlaceHolder("Esperando valores", txtLimites);
        new PlaceHolder("Esperando valores", txtManejoAgresion);
        new PlaceHolder("Esperando valores", txtObservacion);
        new PlaceHolder("Esperando valores", txtRelaciones);
        new PlaceHolder("Esperando valores", txtSintomas);
        modelo = (DefaultTableModel) tablaNotas.getModel();
        new Thread(this::iniciarValores).start();
    }

    public newNotaEvolucion(Index index,Paciente paciente, String tipo) {
        initComponents();
        changeIcon();
        new PlaceHolder("Esperando valores", txtAlianzaTrabajo);
        new PlaceHolder("Esperando valores", txtAnsiedad);
        new PlaceHolder("Esperando valores", txtFuncionalidad);
        new PlaceHolder("Esperando valores", txtLimites);
        new PlaceHolder("Esperando valores", txtManejoAgresion);
        new PlaceHolder("Esperando valores", txtObservacion);
        new PlaceHolder("Esperando valores", txtRelaciones);
        new PlaceHolder("Esperando valores", txtSintomas);
        modelo = (DefaultTableModel) tablaNotas.getModel();
        this.paciente = paciente;
        this.terapeuta = index.getUser();
        this.tipo = tipo;
        this.index =index;
        new Thread(this::iniciarValores).start();
    }

    public newNotaEvolucion(Index index,Paciente paciente, Usuario terapeuta, NotaEvolucion nota, String tipo) {
        initComponents();
        changeIcon();
        new PlaceHolder("Esperando valores", txtAlianzaTrabajo);
        new PlaceHolder("Esperando valores", txtAnsiedad);
        new PlaceHolder("Esperando valores", txtFuncionalidad);
        new PlaceHolder("Esperando valores", txtLimites);
        new PlaceHolder("Esperando valores", txtManejoAgresion);
        new PlaceHolder("Esperando valores", txtObservacion);
        new PlaceHolder("Esperando valores", txtRelaciones);
        new PlaceHolder("Esperando valores", txtSintomas);
        modelo = (DefaultTableModel) tablaNotas.getModel();
        this.nota = nota;
        this.paciente = paciente;
        this.index =index;
        this.terapeuta = index.getUser();
        this.tipo = tipo;

        iniciarValores();
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
        jLabel2 = new javax.swing.JLabel();
        nombrePacienteLabel = new javax.swing.JLabel();
        edadPacienteLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSintomas = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtManejoAgresion = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAnsiedad = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtRelaciones = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtFuncionalidad = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtAlianzaTrabajo = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtLimites = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotas = new rojerusan.RSTableMetro();
        tituloTablaLabel = new javax.swing.JLabel();
        registrarBtn = new rojeru_san.rsbutton.RSButtonRound();
        jLabel4 = new javax.swing.JLabel();
        terapeutaLabel = new javax.swing.JLabel();
        anularBtn = new rojeru_san.rsbutton.RSButtonRound();
        cambiarPacienteBtn = new rojeru_san.rsbutton.RSButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nota de Evolución - Caps");
        setResizable(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("Nueva Nota de Evolución del Paciente");
        tituloLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tituloLabelPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Paciente:");

        nombrePacienteLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        nombrePacienteLabel.setText("sdf");

        edadPacienteLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        edadPacienteLabel.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Edad:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nota de Evolución (Campo Obligatorio)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtObservacion.setColumns(20);
        txtObservacion.setLineWrap(true);
        txtObservacion.setRows(4);
        txtObservacion.setTabSize(2);
        txtObservacion.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtObservacion);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sintomas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtSintomas.setColumns(20);
        txtSintomas.setLineWrap(true);
        txtSintomas.setRows(4);
        txtSintomas.setTabSize(2);
        txtSintomas.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtSintomas);

        jScrollPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manejo de la Agresión", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtManejoAgresion.setColumns(20);
        txtManejoAgresion.setLineWrap(true);
        txtManejoAgresion.setRows(4);
        txtManejoAgresion.setTabSize(2);
        txtManejoAgresion.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txtManejoAgresion);

        jScrollPane6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ansiedad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtAnsiedad.setColumns(20);
        txtAnsiedad.setLineWrap(true);
        txtAnsiedad.setRows(4);
        txtAnsiedad.setTabSize(2);
        txtAnsiedad.setWrapStyleWord(true);
        jScrollPane6.setViewportView(txtAnsiedad);

        jScrollPane8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relaciones Interpersonales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtRelaciones.setColumns(20);
        txtRelaciones.setLineWrap(true);
        txtRelaciones.setRows(4);
        txtRelaciones.setTabSize(2);
        txtRelaciones.setWrapStyleWord(true);
        jScrollPane8.setViewportView(txtRelaciones);

        jScrollPane9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funcionalidad laboral/académica", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtFuncionalidad.setColumns(20);
        txtFuncionalidad.setLineWrap(true);
        txtFuncionalidad.setRows(4);
        txtFuncionalidad.setTabSize(2);
        txtFuncionalidad.setWrapStyleWord(true);
        jScrollPane9.setViewportView(txtFuncionalidad);

        jScrollPane10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alianza trabajo terapeútico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtAlianzaTrabajo.setColumns(20);
        txtAlianzaTrabajo.setLineWrap(true);
        txtAlianzaTrabajo.setRows(4);
        txtAlianzaTrabajo.setTabSize(2);
        txtAlianzaTrabajo.setWrapStyleWord(true);
        jScrollPane10.setViewportView(txtAlianzaTrabajo);

        jScrollPane11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Limites y/o Otro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtLimites.setColumns(20);
        txtLimites.setLineWrap(true);
        txtLimites.setRows(4);
        txtLimites.setTabSize(2);
        txtLimites.setWrapStyleWord(true);
        jScrollPane11.setViewportView(txtLimites);

        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaNotas.setBackgoundHead(new java.awt.Color(0, 102, 102));
        tablaNotas.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaNotas.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tablaNotas.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaNotas.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tablaNotas.setEffectHover(true);
        tablaNotas.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tablaNotas.setFontHead(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaNotas.setFontRowHover(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tablaNotas.setFontRowSelect(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tablaNotas.setGridColor(new java.awt.Color(0, 0, 0));
        tablaNotas.setHighHead(25);
        tablaNotas.setMaximumSize(new java.awt.Dimension(300, 0));
        tablaNotas.setRowHeight(19);
        tablaNotas.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tablaNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaNotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaNotas);
        if (tablaNotas.getColumnModel().getColumnCount() > 0) {
            tablaNotas.getColumnModel().getColumn(0).setMinWidth(80);
            tablaNotas.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablaNotas.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        tituloTablaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloTablaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloTablaLabel.setText("Notas de Evolución Registradas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jScrollPane8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloTablaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloTablaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        registrarBtn.setBackground(new java.awt.Color(0, 102, 102));
        registrarBtn.setText("Registrar Nota Evolc.");
        registrarBtn.setColorHover(new java.awt.Color(0, 153, 153));
        registrarBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Terapeuta:");

        terapeutaLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        terapeutaLabel.setText("jLabel3");

        anularBtn.setBackground(new java.awt.Color(204, 100, 100));
        anularBtn.setText("Anular Nota");
        anularBtn.setColorHover(new java.awt.Color(255, 51, 51));
        anularBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        anularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anularBtnActionPerformed(evt);
            }
        });

        cambiarPacienteBtn.setText("Cambiar Paciente");
        cambiarPacienteBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cambiarPacienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPacienteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(cambiarPacienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 416, Short.MAX_VALUE))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(29, 29, 29)
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCentralLayout.createSequentialGroup()
                                        .addComponent(edadPacienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(terapeutaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nombrePacienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(55, 55, 55)))))
                .addContainerGap())
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrePacienteLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edadPacienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terapeutaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambiarPacienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void tituloLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tituloLabelPropertyChange

    }//GEN-LAST:event_tituloLabelPropertyChange

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed

        if (validar()) {
            String observacionx = txtObservacion.getText();
            String valor2 = txtSintomas.getText();
            String valor3 = txtRelaciones.getText();
            String valor4 = txtLimites.getText();
            String valor5 = txtAnsiedad.getText();
            String valor6 = txtManejoAgresion.getText();
            String valor7 = txtFuncionalidad.getText();
            String valor8 = txtAlianzaTrabajo.getText();
            String hoy = new SimpleDateFormat("yyyy/MM/dd").format(new Date());

            if (tipo.equalsIgnoreCase("nuevo") || tipo.equalsIgnoreCase("estandar") || tipo.equalsIgnoreCase("Primera Sesión") || tipo.equalsIgnoreCase("proceso") || tipo.equalsIgnoreCase("final")) {//Si nos encontramos generando una Nueva Nota
                int respuesta = new NotaEvolucion().newNota(paciente.getId(), terapeuta.getId(), observacionx,
                        valor2, valor3, valor4, valor5, valor6, valor7, valor8);
                if (respuesta > 0) { //En caso de que se agregue la nota de evolución sin problemas
                    new rojerusan.RSNotifyFade("Registro Exitoso", "La nota de Evolución fue agregada correctamente", 5,
                            RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            for (RegistroPaciente rp : paciente.getRegistros()) {
                                if (rp.getAccionRP().contains("Lista de Espera") && rp.getEstadoRP().equalsIgnoreCase("activo")) {
                                    rp.setEstadoRP("Atendida");
                                    rp.UpdateRegistro();
                                    break;
                                }
                            }
                            new RegistroPaciente().newRegistro(paciente.getId(), index.getUser().getId(),
                                    index.getUser().getId(), "Nota de Evaluación", observacionx, hoy, "Activo");

                            dispose();
                        }
                    }).start();
                } else {//En caso que surja algún error mientras se graba la nota de evolución
                    new rojerusan.RSNotifyFade("Error Agregando Nota", "Verifique su conexión a internet e intentelo nuevamente, si el problema persiste contacte con el administrador.", 5,
                            RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
                }
            } else if (tipo.equalsIgnoreCase("editar")) {
                nota.setObservacion(observacionx);
                nota.setSintomas(valor2);
                nota.setRelaciones(valor3);
                nota.setLimites(valor4);
                nota.setAnsiedad(valor5);
                nota.setManejoAgresion(valor6);
                nota.setFuncionalidad(valor7);
                nota.setTrabajoTerapeutico(valor8);
                int respuesta = nota.updateNota();
                if (respuesta > 0) {//En caso de que se actualice la nota de evolución sin problemas
                    new rojerusan.RSNotifyFade("ACtualización Exitosa", "La nota de Evolución fue actualizada correctamente", 5,
                            RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);

                } else {
                    new rojerusan.RSNotifyFade("Error Actualizando Nota", "Verifique su conexión a internet e intentelo nuevamente, si el problema persiste contacte con el administrador.", 5,
                            RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);

                }
            }
        }


    }//GEN-LAST:event_registrarBtnActionPerformed

    private void anularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anularBtnActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea ANULAR la Actual Nota de Evolución del paciente: ?" + paciente.getNombreCompleto()) == 0) {
            if (nota.changeEstado("Anulada") > 0) {
                new rojerusan.RSNotifyFade("Anulación con éxito", "La nota de evolución actual ha sido anulada y no contará para las estadisticas o indicadores.", 5,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                this.dispose();
            } else {
                new rojerusan.RSNotifyFade("Ops! Hubo un problema", "No pudimos anular la nota de evolución, recomendamos revisar la conexión a internet o contactar con el administrador.", 5,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
            }

        }
    }//GEN-LAST:event_anularBtnActionPerformed

    private void cambiarPacienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPacienteBtnActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea asignar la Actual Nota de Evolución a otro Paciente?") == 0) {
            new ListarPacientes(index,this, "Cambiar paciente notaEvolucion").setVisible(true);
        }
    }//GEN-LAST:event_cambiarPacienteBtnActionPerformed

    private void tablaNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNotasMouseClicked
        int fila = tablaNotas.getSelectedRow();
        if (fila >= 0 && evt.getClickCount() == 2) {

            int valor = Integer.parseInt(tablaNotas.getValueAt(fila, 0).toString());
            for (NotaEvolucion nota : paciente.getNotas()) {
                if (Float.compare(valor, nota.getIdNota()) == 0) {
                    new newNotaEvolucion(index,paciente, terapeuta, nota, "ver").setVisible(true);
                    break;
                }
            }
        }
    }//GEN-LAST:event_tablaNotasMouseClicked

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
            java.util.logging.Logger.getLogger(newNotaEvolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newNotaEvolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newNotaEvolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newNotaEvolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newNotaEvolucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonRound anularBtn;
    private rojeru_san.rsbutton.RSButtonRound cambiarPacienteBtn;
    public javax.swing.JLabel edadPacienteLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JLabel nombrePacienteLabel;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rsbutton.RSButtonRound registrarBtn;
    private rojerusan.RSTableMetro tablaNotas;
    private javax.swing.JLabel terapeutaLabel;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel tituloTablaLabel;
    private javax.swing.JTextArea txtAlianzaTrabajo;
    private javax.swing.JTextArea txtAnsiedad;
    private javax.swing.JTextArea txtFuncionalidad;
    private javax.swing.JTextArea txtLimites;
    private javax.swing.JTextArea txtManejoAgresion;
    private javax.swing.JTextArea txtObservacion;
    private javax.swing.JTextArea txtRelaciones;
    private javax.swing.JTextArea txtSintomas;
    // End of variables declaration//GEN-END:variables

    private void iniciarValores() {
       cambiarPacienteBtn.setVisible(false);
       anularBtn.setVisible(false);
        
        
        
        nombrePacienteLabel.setText(this.paciente.getNombreCompleto());

        edadPacienteLabel.setText(new tools().obtenerEdad2(this.paciente.getFechaNacimiento()) + "");
        terapeutaLabel.setText(terapeuta.getNombre());
        System.out.println("x0");
        if (tipo.equalsIgnoreCase("nuevo") || tipo.equalsIgnoreCase("estandar") || tipo.equalsIgnoreCase("Primera Sesión")) {
            jLabel4.setVisible(false);
            terapeutaLabel.setVisible(false);
            cambiarPacienteBtn.setVisible(false);
            anularBtn.setVisible(false);

        } else {
            new Thread(new Runnable() {
                @Override
                public void run() {

                    buscarNotas();
                    for (NotaEvolucion nota : paciente.getNotas()) {
                        modelo.addRow(new Object[]{
                            nota.getIdNota(), nota.getFechaNota(), nota.getEstado()
                        });

                    }
                }
            }).start();
            if (tipo.equalsIgnoreCase("ver")) {

                txtAlianzaTrabajo.setEditable(false);
                txtAnsiedad.setEditable(false);
                txtFuncionalidad.setEditable(false);
                txtLimites.setEditable(false);
                txtManejoAgresion.setEditable(false);
                txtObservacion.setEditable(false);
                txtRelaciones.setEditable(false);
                txtSintomas.setEditable(false);
                txtObservacion.setEditable(false);

                registrarBtn.setVisible(false);
                tablaNotas.setVisible(false);
                tituloTablaLabel.setVisible(false);

                tituloLabel.setText("Visualizar - Nota de Evolución del Paciente");
                terapeutaLabel.setText(terapeuta.getNombre());
                tablaNotas.setVisible(false);
                tituloTablaLabel.setVisible(false);
                registrarBtn.setVisible(false);
                anularBtn.setVisible(false);
                cambiarPacienteBtn.setVisible(false);

                txtObservacion.setText(this.nota.getObservacion());
                txtSintomas.setText(this.nota.getSintomas());
                txtRelaciones.setText(nota.getRelaciones());
                txtLimites.setText(nota.getLimites());
                txtAnsiedad.setText(nota.getAnsiedad());
                txtManejoAgresion.setText(nota.getManejoAgresion());
                txtFuncionalidad.setText(nota.getFuncionalidad());
                txtAlianzaTrabajo.setText(nota.getTrabajoTerapeutico());

                tablaNotas.setVisible(false);

            } else if (tipo.equalsIgnoreCase("editar")) {
                tituloLabel.setText("Modificar - Nota de Evolución del Paciente");

                terapeutaLabel.setVisible(false);
                jLabel4.setVisible(false);
                tablaNotas.setVisible(false);
                tituloTablaLabel.setVisible(false);

                txtObservacion.setText(nota.getObservacion());
                txtSintomas.setText(nota.getSintomas());
                txtRelaciones.setText(nota.getRelaciones());
                txtLimites.setText(nota.getLimites());
                txtAnsiedad.setText(nota.getAnsiedad());
                txtManejoAgresion.setText(nota.getManejoAgresion());
                txtFuncionalidad.setText(nota.getFuncionalidad());
                txtAlianzaTrabajo.setText(nota.getTrabajoTerapeutico());

            }
        }

    }

    private boolean validar() {
        boolean llave = false;
        if (tipo.equalsIgnoreCase("editar")) {
            if (JOptionPane.showConfirmDialog(rootPane, "Seguro que desea modificar la Nota de evolución para el Paciente: " + paciente.getNombreCompleto()) == 0) {
                if (txtObservacion.getText().isEmpty()) {
                    new rojerusan.RSNotifyFade("Observación en Blanco", "El campo de observación no puede quedar vacio, debe ingresar datos para continuar.", 5,
                            RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
                } else {
                    llave = true;
                }
            }
        } else if (txtObservacion.getText().isEmpty()) {
            new rojerusan.RSNotifyFade("Observación en Blanco", "El campo de observación no puede quedar vacio, debe ingresar datos para continuar.", 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
        } else {
            llave = true;
        }

        return llave;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
        nombrePacienteLabel.setText(paciente.getNombreCompleto());
        edadPacienteLabel.setText(new tools().obtenerEdad(paciente.getFechaNacimiento()) + "");

    }

    public void buscarNotas() {
        ArrayList<Paciente> pacientes = (ArrayList) new NotaEvolucion().ListarxPaciente().clone();
        for (Paciente p : pacientes) {
            if (Float.compare(p.getId(), paciente.getId()) == 0) {
                paciente = p;
            }
        }
    }
}
