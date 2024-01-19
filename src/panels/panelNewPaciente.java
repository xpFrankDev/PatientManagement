/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Panels;

import Clases.Paciente;
import Clases.RegistroPaciente;
import Clases.exportarExcel;
import Clases.tools;
import Ventanas.Index;
import Ventanas.VerHistorialPaciente;
import Ventanas.newPaciente;
import Ventanas.tipoSRQ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parra
 */
public class panelNewPaciente extends javax.swing.JPanel {

    DefaultTableModel modelo;
    ArrayList<Paciente> pacientes = new ArrayList();
    String fecha01 = "1990/01/01", fecha02 = "2100/12/31";
    ArrayList<String> pacs = new ArrayList();
    ArrayList<RegistroPaciente> registros = new ArrayList();
    newPaciente np;
    Index index;
    public panelNewPaciente() {
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
        tituloBoton.setVisible(false);
        //new Thread(this::iniciar).start();
        iniciar();
    }
    public panelNewPaciente(Index index) {
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
        tituloBoton.setVisible(false);
        this.index=index;
        //new Thread(this::iniciar).start();
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCiclo = new javax.swing.ButtonGroup();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        pacientesListaEsperaLabel = new rojeru_san.rslabel.RSLabelBorderRound();
        pacientesRegistradosLabel = new rojeru_san.rslabel.RSLabelBorderRound();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buscarTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        buscarBtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        tituloBoton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        barra = new rojeru_san.rsprogress.RSProgressBarAnimated();

        setBackground(new java.awt.Color(230, 230, 230));

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_32px.png"))); // NOI18N
        jButton10.setText("Indice B.");
        jButton10.setToolTipText("Agregar nueva Evaluación de Indice Bienestar");
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_32px.png"))); // NOI18N
        jButton9.setText(" SRQ18");
        jButton9.setToolTipText("Agregar nueva Evaluación SRQ18");
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        tabla.setBackground(new java.awt.Color(165, 185, 173));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Código", "Nombre", "Tipo Doc", "Num Doc", "Edad", "Telefono", "Correo", "Sesiones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setToolTipText("Resumen de mis pacientes");
        tabla.setBackgoundHead(new java.awt.Color(138, 128, 155));
        tabla.setBackgoundHover(new java.awt.Color(138, 128, 155));
        tabla.setColorBorderRows(new java.awt.Color(165, 185, 172));
        tabla.setColorPrimary(new java.awt.Color(165, 185, 172));
        tabla.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tabla.setColorSecondary(new java.awt.Color(221, 226, 218));
        tabla.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tabla.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tabla.setFontHead(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tabla.setFontRowHover(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tabla.setFontRowSelect(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tabla.setForegroundHover(new java.awt.Color(0, 0, 0));
        tabla.setGridColor(new java.awt.Color(0, 0, 0));
        tabla.setHighHead(25);
        tabla.setSelectionBackground(new java.awt.Color(138, 128, 155));
        tabla.setShowGrid(true);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(90);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(0).setMaxWidth(90);
            tabla.getColumnModel().getColumn(1).setMinWidth(130);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(130);
            tabla.getColumnModel().getColumn(1).setMaxWidth(130);
            tabla.getColumnModel().getColumn(8).setMinWidth(90);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(8).setMaxWidth(90);
        }

        pacientesListaEsperaLabel.setBackground(new java.awt.Color(0, 0, 0));
        pacientesListaEsperaLabel.setForeground(new java.awt.Color(0, 0, 0));
        pacientesListaEsperaLabel.setText("Pacientes en lista de espera:");
        pacientesListaEsperaLabel.setBgBorde(new java.awt.Color(204, 204, 204));
        pacientesListaEsperaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pacientesListaEsperaLabel.setIconTextGap(6);
        pacientesListaEsperaLabel.setPaddingLeft(15);
        pacientesListaEsperaLabel.setRound(20);

        pacientesRegistradosLabel.setBackground(new java.awt.Color(0, 0, 0));
        pacientesRegistradosLabel.setForeground(new java.awt.Color(0, 0, 0));
        pacientesRegistradosLabel.setText("Pacientes registrados:");
        pacientesRegistradosLabel.setBgBorde(new java.awt.Color(204, 204, 204));
        pacientesRegistradosLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pacientesRegistradosLabel.setIconTextGap(6);
        pacientesRegistradosLabel.setPaddingLeft(15);
        pacientesRegistradosLabel.setRound(20);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nuevos Pacientes");

        jPanel1.setOpaque(false);

        buscarTxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        buscarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTxtActionPerformed(evt);
            }
        });
        buscarTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarTxtKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buscar Paciente");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_edit_32px_3.png"))); // NOI18N
        jButton2.setToolTipText("Editar Datos del paciente");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_info_32px.png"))); // NOI18N
        jButton3.setToolTipText("Detalle del paciente");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_microsoft_excel_32px.png"))); // NOI18N
        jButton4.setToolTipText("Exportar Info de los pacientes a Excel");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_remove_32px_1.png"))); // NOI18N
        jButton5.setToolTipText("Eliminar Paciente");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        buscarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_search_32px.png"))); // NOI18N
        buscarBtn.setToolTipText("Buscar paciente");
        buscarBtn.setContentAreaFilled(false);
        buscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_restore_32px_1.png"))); // NOI18N
        jButton7.setToolTipText("Actualizar valores");
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_32px.png"))); // NOI18N
        jButton8.setToolTipText("Agregar nuevo paciente");
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        tituloBoton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloBoton.setText("Atender Paciente de Lista de Espera o Mis Pacientes Citados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(buscarTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tituloBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(0, 0, 0))
        );

        barra.setForeground(new java.awt.Color(0, 102, 102));
        barra.setToolTipText("");
        barra.setColorBorde(new java.awt.Color(0, 102, 102));
        barra.setColorSelBackground(new java.awt.Color(0, 102, 102));
        barra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        barra.setGrosorBorde(1);
        barra.setString("Actualizando y Sincronizando registos con la base de Datos");
        barra.setVelocidad(40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pacientesListaEsperaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pacientesRegistradosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 166, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32))
                            .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pacientesListaEsperaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pacientesRegistradosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        llenarTabla();
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea volver a sincronizar con la base de datos?") == 0) {
            resetearBusqueda();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea Marcar como Eliminado al Paciente?") == 0) {

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        if(np == null){
             np = new newPaciente(index,this);
        }
        
        if( !np.isShowing() || !np.isVisible()){
            np = new newPaciente(index,this);
            np.setVisible(true);
        }else{
            np.setExtendedState(0);
        }
                
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            int idx = Integer.valueOf(tabla.getValueAt(fila, 0).toString());
            for (Paciente paciente : pacientes) {
                if (Float.compare(idx, paciente.getId()) == 0) {
                    new VerHistorialPaciente(index,paciente).setVisible(true);
                    break;
                }
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JTable tablax = new JTable();
        modelo = (DefaultTableModel) tablax.getModel();

        new Thread(panelMonitoreo::verBarra).start();
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
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

                    int cont = 1;
                    for (Paciente paciente : pacientes) {
                        modelo.addRow(new Object[]{cont++,
                            paciente.getId(), paciente.getCodigo(), paciente.getNombres(), paciente.getApellidos(), paciente.getTipoDocumento(), paciente.getDni(), paciente.getGenero(),
                            paciente.getFechaCreacion(), paciente.getFechaNacimiento(), paciente.getTotalSesiones(), paciente.getTelefono(),paciente.getTelefonoOpcional(), paciente.getCorreo(), paciente.getNacionalidad(),
                            paciente.getCondicionMigratoria(), paciente.getDepartamento(), paciente.getProvincia(), paciente.getDistrito(), paciente.getGrupoVulnerable(), paciente.getDiscapacidad(), paciente.getRedSoporte(), paciente.getNombreRedSoporte(),
                            paciente.getSrqIngreso(), paciente.getObservacion(), paciente.getProyecto(), paciente.getMotivoConsulta(), paciente.getAcciones()
                        });
                    }
                    new exportarExcel().exportarExcel(tablax, "Pacientes");
                    new Thread(panelMonitoreo::ocultarBarra).start();

                } catch (IOException ex) {
                    Logger.getLogger(panelMonitoreo.class.getName()).log(Level.SEVERE, null, ex);

                }

            }
        }).start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (tabla.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un paciente dentro de la tabla");
        } else {
            for (Paciente p : pacientes) {
                if (Float.compare(p.getId(), Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString())) == 0) {
                     new tipoSRQ(index,p,"indice").setVisible(true);
                    break;
                }
            }

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (tabla.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un paciente dentro de la tabla");
        } else {
            for (Paciente p : pacientes) {
                if (p.getId() == Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString())) {
                    //for (RegistroPaciente rp : p.getRegistros()) {
                        //if (rp.getAccionRP().toLowerCase().contains("srq")) {
                            
                        //}
                    //}
                    new tipoSRQ(index,p,"srq").setVisible(true);
                            break;
                    //new newSRQ18(p, "Inicial").setVisible(true);
                    //break;
                    
                }
            }

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void buscarTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarTxtKeyTyped
        llenarTabla();
    }//GEN-LAST:event_buscarTxtKeyTyped

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        tituloBoton.setText("Registrar Nuevo Paciente");
        tituloBoton.setVisible(true);
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        tituloBoton.setVisible(false);
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        tituloBoton.setText("Editar Información del Paciente");
        tituloBoton.setVisible(true);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        tituloBoton.setVisible(false);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        tituloBoton.setText("Ver información detallada del paciente (Hoja de vida)");
        tituloBoton.setVisible(true);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        tituloBoton.setVisible(false);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        tituloBoton.setText("Exportar a Excel información detallada de los pacientes en la tabla");
        tituloBoton.setVisible(true);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        tituloBoton.setVisible(false);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if (tabla.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un paciente dentro de la tabla");
        } else {
            for (Paciente p : pacientes) {
                int idTomado = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                if (Float.compare(p.getId(), idTomado) == 0) {
                    new newPaciente(index,p, "editar",this).setVisible(true);
                    break;
                }
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
         int fila = tabla.getSelectedRow();
        if (evt.getClickCount() == 2 && fila >= 0) {
            int idx = Integer.valueOf(tabla.getValueAt(fila, 0).toString());
            for (Paciente paciente : pacientes) {
                if (Float.compare(idx, paciente.getId()) == 0) {
                    new VerHistorialPaciente(index,paciente).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void buscarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    static rojeru_san.rsprogress.RSProgressBarAnimated barra;
    static javax.swing.JButton buscarBtn;
    static javax.swing.JTextField buscarTxt;
    private javax.swing.ButtonGroup grupoCiclo;
    private static javax.swing.JButton jButton10;
    static javax.swing.JButton jButton2;
    static javax.swing.JButton jButton3;
    static javax.swing.JButton jButton4;
    static javax.swing.JButton jButton5;
    static javax.swing.JButton jButton7;
    static javax.swing.JButton jButton8;
    private static javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.rslabel.RSLabelBorderRound pacientesListaEsperaLabel;
    private rojeru_san.rslabel.RSLabelBorderRound pacientesRegistradosLabel;
    private rojerusan.RSTableMetro tabla;
    private javax.swing.JLabel tituloBoton;
    // End of variables declaration//GEN-END:variables

    public void iniciar() {
        barra.setVisible(false);
        resetearBusqueda();
         
    }

    public  void resetearBusqueda() {
        pacientes.clear();
        pacs.clear();
        barra.setVisible(true);

        new Thread(new Runnable() {
            @Override
            public void run() {
                pacientes = (ArrayList) new Paciente().ListarPacienteconRegistros().clone();
                if (index.user.getCargo().equalsIgnoreCase("terapeuta") || index.user.getCargo().equalsIgnoreCase("psiquiatra")) {
                    pacientes = (ArrayList) pacientes.stream()
                            .filter(
                                    t -> Float.compare(
                                            t.getIdTerapeuta(),
                                            index.user.getId()
                                    ) == 0
                            ).collect(Collectors.toList());
                }if (index.user.getCargo().equalsIgnoreCase("trabajador social//BorrarLuego")) {
                    pacientes = (ArrayList) pacientes.stream()
                            .filter(
                                    t -> Float.compare(
                                            t.getIdTrabajadorSocial(),
                                            index.user.getId()
                                    ) == 0
                            ).collect(Collectors.toList());
                }
                llenarTabla();
                    setIndicadores();
            }
        }).start();
    }

    public void llenarTabla() {
        modelo.setRowCount(0);

        String txt2 = buscarTxt.getText().isEmpty() ? "" : buscarTxt.getText().toLowerCase();
        for (Paciente paciente : pacientes) {
            if ((paciente.getCodigo().toLowerCase().contains(txt2) 
                    || paciente.getNombreCompleto().toLowerCase().contains(txt2) 
                    || paciente.getDni().contains(txt2))) {//validarPaciente(paciente)
                modelo.addRow(new Object[]{
                    paciente.getId(), paciente.getCodigo(), paciente.getNombreCompleto(),paciente.getTipoDocumento(),paciente.getDni(),
                    new tools().obtenerEdad2(paciente.getFechaNacimiento()),paciente.getTelefono(),paciente.getCorreo(), paciente.getNotas().size()
                });
            }
        }

        barra.setVisible(false);
    }

    private boolean validarPaciente(Paciente paciente) {
        boolean llave = false;
        boolean temp = false;

        for (String p : pacs) {
            if (paciente.getCodigo().equals(p)) {
                temp = true;
            }
        }
        if (temp == false) {
            pacs.add(paciente.getCodigo());
            llave = true;
        }

        return llave;
    }

    public void setIndicadores() {
        pacientesRegistradosLabel.setText("Pacientes registrados: "+pacientes.size() + "");
        
        ArrayList<Paciente> listaEspera = (ArrayList) new Paciente().getPacienteWithListaEspera().clone();
        

        pacientesListaEsperaLabel.setText("Pacientes en lista de espera: "+listaEspera.size()+"");

    }
}
