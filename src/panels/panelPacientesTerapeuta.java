
package Panels;

import Clases.NotaEvolucion;
import Clases.Paciente;
import Clases.SRQ18;
import Clases.exportarExcel;
import Clases.tools;
import Ventanas.Index;
import Ventanas.VerHistorialPaciente;
import Ventanas.newPaciente;
import Ventanas.tipoSRQ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class panelPacientesTerapeuta extends javax.swing.JPanel {

    DefaultTableModel modelo;
    ArrayList<Paciente> pacientes = new ArrayList();
    String fecha01 = "1990/01/01", fecha02 = "2100/12/31";
    ArrayList<Integer> pacs = new ArrayList();
    ArrayList<Paciente> pacientesTemp = new ArrayList();
    Index index;
    
    panelPacientesTerapeuta() {
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
        new Thread(this::iniciar).start();
        
        alertaIcon.setVisible(false);
        alertaMensaje.setVisible(false);
        alertaIcon1.setVisible(false);
        alertaMensaje1.setVisible(false);
        tituloBoton.setVisible(false);
        radioCicloActual.setVisible(false);
        radioTodos.setVisible(false);
        jButton5.setVisible(false);
    }
    panelPacientesTerapeuta(Index index) {
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
        new Thread(this::iniciar).start();
        this.index=index;
        alertaIcon.setVisible(false);
        alertaMensaje.setVisible(false);
        alertaIcon1.setVisible(false);
        alertaMensaje1.setVisible(false);
        tituloBoton.setVisible(false);
        radioCicloActual.setVisible(false);
        radioTodos.setVisible(false);
        jButton5.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCiclo = new javax.swing.ButtonGroup();
        radioCicloActual = new rojerusan.RSRadioButton();
        radioTodos = new rojerusan.RSRadioButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        buscarTxt = new javax.swing.JTextField();
        srqBtn = new javax.swing.JButton();
        indiceBtn = new javax.swing.JButton();
        alertaIcon1 = new RSMaterialComponent.RSButtonIconDos();
        alertaMensaje1 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        totalPacientesLabel = new rojeru_san.rslabel.RSLabelBorderRound();
        tituloBoton = new javax.swing.JLabel();
        totalSesionesLabel = new rojeru_san.rslabel.RSLabelBorderRound();
        alertaIcon = new RSMaterialComponent.RSButtonIconDos();
        alertaMensaje = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        grupoCiclo.add(radioCicloActual);
        radioCicloActual.setForeground(new java.awt.Color(0, 0, 0));
        radioCicloActual.setText("Ciclo Actual");
        radioCicloActual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioCicloActual.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioCicloActualStateChanged(evt);
            }
        });

        grupoCiclo.add(radioTodos);
        radioTodos.setForeground(new java.awt.Color(0, 0, 0));
        radioTodos.setSelected(true);
        radioTodos.setText("Todos");
        radioTodos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_remove_32px_1.png"))); // NOI18N
        jButton5.setToolTipText("Eliminar Paciente");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(220, 226, 218));

        tabla.setBackground(new java.awt.Color(165, 185, 173));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"sdfgsdf", null, null, null, null, null, null, null, null},
                {"4", "sdfg", null, null, null, null, null, null, null},
                {"we", null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Paciente", "Código", "Nombre y Apellido", "Edad", "Teléfono", "Terapeuta Asig.", "SRQ Ingreso", "SVBG", "N° Sesiones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, false, false
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
            tabla.getColumnModel().getColumn(0).setMinWidth(105);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(75);
            tabla.getColumnModel().getColumn(0).setMaxWidth(105);
            tabla.getColumnModel().getColumn(1).setMinWidth(120);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(1).setMaxWidth(120);
            tabla.getColumnModel().getColumn(3).setMinWidth(80);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabla.getColumnModel().getColumn(3).setMaxWidth(80);
            tabla.getColumnModel().getColumn(4).setMinWidth(75);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(75);
            tabla.getColumnModel().getColumn(4).setMaxWidth(75);
            tabla.getColumnModel().getColumn(5).setMinWidth(140);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(140);
            tabla.getColumnModel().getColumn(5).setMaxWidth(140);
            tabla.getColumnModel().getColumn(6).setMinWidth(80);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(80);
            tabla.getColumnModel().getColumn(6).setMaxWidth(80);
            tabla.getColumnModel().getColumn(7).setMinWidth(70);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(7).setMaxWidth(70);
            tabla.getColumnModel().getColumn(8).setMinWidth(75);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(75);
            tabla.getColumnModel().getColumn(8).setMaxWidth(75);
        }

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_32px.png"))); // NOI18N
        jButton1.setText("Nota Evoluc.");
        jButton1.setToolTipText("Nueva Sesión / Nota evolución.");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.setIconTextGap(0);
        jButton1.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_edit_32px_3.png"))); // NOI18N
        jButton2.setToolTipText("Editar datos del paciente");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jButton3.setToolTipText("visualizar detalles del paciente seleccionado");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_restore_32px_1.png"))); // NOI18N
        jButton7.setToolTipText("Actualizar valores");
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        buscarTxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        buscarTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarTxtKeyTyped(evt);
            }
        });

        srqBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_32px.png"))); // NOI18N
        srqBtn.setText(" SRQ18");
        srqBtn.setToolTipText("Agregar nueva Evaluación SRQ18");
        srqBtn.setContentAreaFilled(false);
        srqBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        srqBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        srqBtn.setIconTextGap(0);
        srqBtn.setMargin(new java.awt.Insets(2, 2, 2, 14));
        srqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srqBtnActionPerformed(evt);
            }
        });

        indiceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_32px.png"))); // NOI18N
        indiceBtn.setText("Indice B.");
        indiceBtn.setToolTipText("Agregar nueva Evaluación de Indice Bienestar");
        indiceBtn.setContentAreaFilled(false);
        indiceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        indiceBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        indiceBtn.setIconTextGap(0);
        indiceBtn.setMargin(new java.awt.Insets(2, 2, 2, 14));
        indiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indiceBtnActionPerformed(evt);
            }
        });

        alertaIcon1.setBackground(new java.awt.Color(204, 0, 0));
        alertaIcon1.setToolTipText("Paciente tiene Antecedentes SRQ18 con intención Suicida");
        alertaIcon1.setBackgroundHover(new java.awt.Color(153, 0, 0));
        alertaIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertaIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);
        alertaIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertaIcon1ActionPerformed(evt);
            }
        });

        alertaMensaje1.setText("Paciente >= 8 Sintomas de depresión");

        comboFiltro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Código de Usuario", "Nombre y Apellido del Paciente", "Nombre del Terapeuta" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Filtrando Usando:");

        totalPacientesLabel.setBackground(new java.awt.Color(0, 0, 0));
        totalPacientesLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalPacientesLabel.setText("Total Paciente:");
        totalPacientesLabel.setBgBorde(new java.awt.Color(204, 204, 204));
        totalPacientesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalPacientesLabel.setIconTextGap(6);
        totalPacientesLabel.setPaddingLeft(15);
        totalPacientesLabel.setRound(20);

        tituloBoton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloBoton.setText("Atender Paciente de Lista de Espera o Mis Pacientes Citados");

        totalSesionesLabel.setBackground(new java.awt.Color(0, 0, 0));
        totalSesionesLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalSesionesLabel.setText("Total Sesiones:");
        totalSesionesLabel.setBgBorde(new java.awt.Color(204, 204, 204));
        totalSesionesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalSesionesLabel.setIconTextGap(6);
        totalSesionesLabel.setPaddingLeft(15);
        totalSesionesLabel.setRound(20);

        alertaIcon.setBackground(new java.awt.Color(204, 0, 0));
        alertaIcon.setToolTipText("Paciente tiene Antecedentes SRQ18 con intención Suicida");
        alertaIcon.setBackgroundHover(new java.awt.Color(153, 0, 0));
        alertaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertaIcon.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);
        alertaIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertaIconActionPerformed(evt);
            }
        });

        alertaMensaje.setText("Paciente con intención Suicida");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mis Pacientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(srqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(indiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tituloBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalPacientesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(totalSesionesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alertaIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alertaMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alertaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alertaMensaje)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(totalPacientesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalSesionesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(alertaIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(alertaMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(alertaMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alertaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tituloBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(srqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buscarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(indiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void indiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiceBtnActionPerformed
        if (tabla.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un paciente dentro de la tabla");
        } else {
            for (Paciente p : pacientes) {
                if (Float.compare(p.getId(), Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString())) == 0) {
                    new tipoSRQ(index,p,"indice").setVisible(true);
                    break;
                }
            }

        }
    }//GEN-LAST:event_indiceBtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Desea Desvincular el paciente de su Gestión?") == 0) {

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void srqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srqBtnActionPerformed
        if (tabla.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un paciente dentro de la tabla");
        } else {
            for (Paciente p : pacientes) {
                if (p.getId() == Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString())) {
                    new tipoSRQ(index,p,"srq").setVisible(true);
                    break;
                }
            }

        }
    }//GEN-LAST:event_srqBtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Desea volver a actualizar la info. con la base de datos?") == 0) {
            resetearBusquedas();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void radioCicloActualStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioCicloActualStateChanged

    }//GEN-LAST:event_radioCicloActualStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tabla.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un paciente dentro de la tabla");
        } else {
            for (Paciente p : pacientes) {
                int idTomado = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                if (Float.compare(p.getId(), idTomado) == 0) {
                    new tipoSRQ(index,p,"nota").setVisible(true);
                    break;
                }
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// new ListarPacientes("ver mi lista de espera").setVisible(true);
        if (tabla.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un paciente dentro de la tabla");
        } else {
            for (Paciente p : pacientes) {
                int idTomado = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                if (Float.compare(p.getId(), idTomado) == 0) {
                    new newPaciente(index,p, "editar").setVisible(true);
                    break;
                }
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void buscarTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarTxtKeyTyped
      llenarTabla();
    }//GEN-LAST:event_buscarTxtKeyTyped

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
                    java.util.logging.Logger.getLogger(panelMonitoreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

                }

            }
        }).start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void alertaIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertaIconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alertaIconActionPerformed

    private void alertaIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertaIcon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alertaIcon1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        
        
         int fila = tabla.getSelectedRow();
        if (evt.getClickCount() == 2 && fila >= 0) {
            int idx = Integer.valueOf(tabla.getValueAt(fila, 0).toString());
            for (Paciente paciente : pacientes) {
                if (Float.compare(idx, paciente.getId()) == 0) {
                    new VerHistorialPaciente(index,paciente).setVisible(true);
                }
            }
        }else{
             alertaIcon.setVisible(false);
        alertaMensaje.setVisible(false);
        alertaIcon1.setVisible(false);
        alertaMensaje1.setVisible(false);
       
       
       if(fila>=0){
           int valor = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
           
           for(Paciente paciente:pacientesTemp){
               if(Float.compare(valor,paciente.getId())==0){
                   for(SRQ18 srq:paciente.getSrq18s()){
                   if (srq.getQ17().equalsIgnoreCase("si")) {
                        alertaIcon.setVisible(true);
                        alertaMensaje.setVisible(true);
                        alertaIcon.setToolTipText(alertaMensaje.getText()+" ID:"+srq.getId()+",");
                        alertaMensaje.setText(alertaMensaje.getText()+" ID:"+srq.getId()+",");
                    }
                    if(srq.getSumatoria()>7){
                        alertaIcon1.setVisible(true);
                        alertaMensaje1.setVisible(true);
                        alertaIcon1.setToolTipText(alertaMensaje1.getText()+" ID:"+srq.getId()+",");
                        alertaMensaje1.setText(alertaMensaje1.getText()+" ID:"+srq.getId()+",");
                    }
               }
               }
           }
       }
        }
        
        
        
      
    }//GEN-LAST:event_tablaMouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconDos alertaIcon;
    private RSMaterialComponent.RSButtonIconDos alertaIcon1;
    private javax.swing.JLabel alertaMensaje;
    private javax.swing.JLabel alertaMensaje1;
    private static javax.swing.JTextField buscarTxt;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.ButtonGroup grupoCiclo;
    private static javax.swing.JButton indiceBtn;
    private javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton2;
    private static javax.swing.JButton jButton3;
    private static javax.swing.JButton jButton4;
    private static javax.swing.JButton jButton5;
    private static javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private static rojerusan.RSRadioButton radioCicloActual;
    private static rojerusan.RSRadioButton radioTodos;
    private static javax.swing.JButton srqBtn;
    private rojerusan.RSTableMetro tabla;
    private javax.swing.JLabel tituloBoton;
    private rojeru_san.rslabel.RSLabelBorderRound totalPacientesLabel;
    private rojeru_san.rslabel.RSLabelBorderRound totalSesionesLabel;
    // End of variables declaration//GEN-END:variables

    public void iniciar() {
        resetearBusquedas();
        
        if(index.getUser().getCargo().toLowerCase().contains("terapeuta") && index.getUser().getSrqCheck().equalsIgnoreCase("si")){
            srqBtn.setVisible(true);
        }else{
            srqBtn.setVisible(false);
        }
        
        if(index.getUser().getCargo().toLowerCase().contains("terapeuta") && index.getUser().getIndiceCheck().equalsIgnoreCase("si")){
            indiceBtn.setVisible(true);
        }else{
            indiceBtn.setVisible(false);
        }
    }

    public void resetearBusquedas() {
        pacientes.clear();
        pacs.clear();
        fecha01 = radioCicloActual.isSelected() ? Index.getCiclo().get(0) : "1990/01/01";
        fecha02 = radioCicloActual.isSelected() ? Index.getCiclo().get(1) : "2100/12/31";
        pacientes.clear();
        String namex = buscarTxt.getText().isEmpty() ? "" : buscarTxt.getText();

        new Thread(new Runnable() {
            @Override
            public void run() {
               /*
                 pacientes = Index.getUser().getPriv().equalsIgnoreCase("administrador")||Index.getUser().getPriv().toLowerCase().contains("monitoreo")
                        ? (ArrayList) new Paciente().getPacientexFechaCreacion(fecha01, fecha02).clone()
                        : (ArrayList) new Paciente().getPacientedeTerapeuta(Index.getUser().getId(), "", fecha01, fecha02).clone();

                */
                // pacientes = (ArrayList) new Paciente().getPacientedeTerapeuta(Index.getUser().getId(), "", fecha01, fecha02).clone();
                pacientes = (ArrayList) new Paciente().ListarPacienteconRegistros().clone();
                
                if (index.user.getCargo().equalsIgnoreCase("terapeuta") || index.user.getCargo().equalsIgnoreCase("psiquiatra")) {
                    pacientes = (ArrayList) pacientes.stream()
                            .filter(
                                    t -> Float.compare(
                                            t.getIdTerapeuta(),
                                            index.user.getId()
                                    ) == 0
                            ).collect(Collectors.toList());
                }
                
                llenarTabla();
                actualizarIndicadores();

            }

            
            private void actualizarIndicadores() {
                ArrayList<Paciente> pacientes = (ArrayList) new Paciente().ListarPacienteconNotasEvolucionBYTerapeuta(index.user.getId()).clone();
                
                int contadorSesiones=0;
                for(Paciente paciente:pacientes){
                    contadorSesiones += paciente.getNotas().size();
                }
                 totalSesionesLabel.setText("Total Sesiones: "+contadorSesiones + "");
                 totalPacientesLabel.setText("Total Pacientes: "+pacientes.size() + "");
/*
                ArrayList<NotaEvolucion> notas = (ArrayList) new NotaEvolucion().getNotasdePacientexRangoFecha(fecha01, fecha02).clone();

                if (Index.getUser().getPriv().equalsIgnoreCase("administrador")) {
                    totalSesionesLabel.setText("Total Sesiones: "+notas.size() + "");
                    ArrayList<Integer> idPacientes = new ArrayList();
                    for (NotaEvolucion nota : notas) {
                        if (!idPacientes.contains(nota.getIdPacienteNota())) {
                            idPacientes.add(nota.getIdPacienteNota());
                        }
                    }
                    totalPacientesLabel.setText("Total Paciente: "+idPacientes.size() + "");
                } else {
                    int sesiones = 0;
                    ArrayList<Integer> idPacientes = new ArrayList();
                    for (NotaEvolucion nota : notas) {
                        if (Float.compare(nota.getIdTerapeutaNota(), Index.getUser().getId()) == 0) {
                            sesiones++;
                            if (!idPacientes.contains(nota.getIdPacienteNota())) {
                                idPacientes.add(nota.getIdPacienteNota());
                            }
                        }
                    }
                    totalSesionesLabel.setText("Total Sesiones: "+sesiones + "");
                    totalPacientesLabel.setText("Total Pacientes: "+idPacientes.size() + "");
                }
                */
            }

        }).start();

        
        new Thread(new Runnable() {
            @Override
            public void run() {
                 pacientesTemp = (ArrayList) new SRQ18().ListarxPaciente().clone();

            }
        }).start();
        
    }

    public void llenarTabla() {
        String namex = buscarTxt.getText().isEmpty() 
                ? "" 
                : buscarTxt.getText().toLowerCase();

        int opcionFiltro = comboFiltro.getSelectedIndex();
        
        modelo.setRowCount(0);

        switch (opcionFiltro) {
            case 0:
                for (Paciente paciente : pacientes) {
                    // System.out.println(paciente.toString());
                    String svbg = paciente.getGrupoVulnerable().toLowerCase().contains("svbg")
                            ? "SI"
                            : "NO";
//validarPaciente(paciente)
                    if ( paciente.getNombreCompleto().toLowerCase().contains(namex)
                            || paciente.getNombreTerapeuta().toLowerCase().contains(namex)
                            || paciente.getCodigo().toLowerCase().contains(namex)
                            || paciente.getNombreTerapeuta().toLowerCase().contains(namex)) {
                        modelo.addRow(new Object[]{
                            paciente.getId(),
                            paciente.getCodigo(),
                            paciente.getNombreCompleto(),
                            new tools().obtenerEdad2(paciente.getFechaNacimiento()),
                            paciente.getTelefono(),
                            paciente.getNombreTerapeuta(),
                            paciente.getSrqIngreso(),
                            svbg,
                            paciente.getNotas().size()
                        });
                    }
                }
                break;
                
                case 1:
                for (Paciente paciente : pacientes) {
                    // System.out.println(paciente.toString());
                    String svbg = paciente.getGrupoVulnerable().toLowerCase().contains("svbg")
                            ? "SI"
                            : "NO";

                    if (paciente.getCodigo().toLowerCase().contains(namex)
                            ) {
                        modelo.addRow(new Object[]{
                            paciente.getId(),
                            paciente.getCodigo(),
                            paciente.getNombreCompleto(),
                            new tools().obtenerEdad2(paciente.getFechaNacimiento()),
                            paciente.getTelefono(),
                            paciente.getNombreTerapeuta(),
                            paciente.getSrqIngreso(),
                            svbg,
                            paciente.getTotalSesiones()
                        });
                    }
                }
                break;
                
                case 2:
                for (Paciente paciente : pacientes) {
                    // System.out.println(paciente.toString());
                    String svbg = paciente.getGrupoVulnerable().toLowerCase().contains("svbg")
                            ? "SI"
                            : "NO";

                    if ( paciente.getNombreCompleto().toLowerCase().contains(namex)
                            || paciente.getNombreTerapeuta().toLowerCase().contains(namex)) {
                        modelo.addRow(new Object[]{
                            paciente.getId(),
                            paciente.getCodigo(),
                            paciente.getNombreCompleto(),
                            new tools().obtenerEdad2(paciente.getFechaNacimiento()),
                            paciente.getTelefono(),
                            paciente.getNombreTerapeuta(),
                            paciente.getSrqIngreso(),
                            svbg,
                            paciente.getTotalSesiones()
                        });
                    }
                }
                break;
            case 3:
                for (Paciente paciente : pacientes) {
                    // System.out.println(paciente.toString());
                    String svbg = paciente.getGrupoVulnerable().toLowerCase().contains("svbg")
                            ? "SI"
                            : "NO";

                    if (paciente.getNombreTerapeuta().toLowerCase().contains(namex)) {
                        modelo.addRow(new Object[]{
                            paciente.getId(),
                            paciente.getCodigo(),
                            paciente.getNombreCompleto(),
                            new tools().obtenerEdad2(paciente.getFechaNacimiento()),
                            paciente.getTelefono(),
                            paciente.getNombreTerapeuta(),
                            paciente.getSrqIngreso(),
                            svbg,
                            paciente.getTotalSesiones()
                        });
                    }
                }
                break;
        }
    }

    private boolean validarPaciente(Paciente paciente) {
        boolean llave = false;
        boolean temp = false;

        for (Integer p : pacs) {
            if (paciente.getId() == p) {
                temp = true;
            }
        }
        if (temp == false) {
            pacs.add(paciente.getId());
            llave = true;
        }

        return llave;
    }

}
