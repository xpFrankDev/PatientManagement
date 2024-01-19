
package Panels;

import Clases.ListaEspera;
import Clases.Paciente;
import Ventanas.Index;
import Ventanas.ListarTerapeutas;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parra
 */
public class panelListaEspera extends javax.swing.JPanel {

    static DefaultTableModel modelo;
    static ArrayList<ListaEspera> lista = new ArrayList();
    Index index;
    public panelListaEspera() {
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
        new Thread(this::iniciar).start();
    }
    public panelListaEspera(Index index) {
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
        this.index=index;
        new Thread(this::iniciar).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCiclo = new javax.swing.ButtonGroup();
        panelDato01 = new rojeru_san.rspanel.RSPanelRound();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        pacientesListaEsperaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        buscarTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        barra = new rojeru_san.rsprogress.RSProgressBarAnimated();

        setBackground(new java.awt.Color(230, 230, 230));

        panelDato01.setBackground(new java.awt.Color(230, 230, 230));
        panelDato01.setColorBackground(new java.awt.Color(230, 230, 230));
        panelDato01.setColorBorde(new java.awt.Color(51, 51, 51));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Total en Espera");

        pacientesListaEsperaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pacientesListaEsperaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pacientesListaEsperaLabel.setText("xxxxxx");
        pacientesListaEsperaLabel.setToolTipText("Muestra la cantidad de Pacientes Atendidos en el ciclo actual");
        pacientesListaEsperaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelDato01Layout = new javax.swing.GroupLayout(panelDato01);
        panelDato01.setLayout(panelDato01Layout);
        panelDato01Layout.setHorizontalGroup(
            panelDato01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDato01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDato01Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addComponent(pacientesListaEsperaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
        );
        panelDato01Layout.setVerticalGroup(
            panelDato01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pacientesListaEsperaLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Paciente", "Nombre de Paciente", "DNI", "Ingreso en Lista"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setBackgoundHead(new java.awt.Color(0, 102, 102));
        tabla.setBackgoundHover(new java.awt.Color(0, 153, 153));
        tabla.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tabla.setColorPrimaryText(new java.awt.Color(102, 102, 102));
        tabla.setColorSecundaryText(new java.awt.Color(102, 102, 102));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(110);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(110);
            tabla.getColumnModel().getColumn(0).setMaxWidth(110);
            tabla.getColumnModel().getColumn(2).setMinWidth(130);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(130);
            tabla.getColumnModel().getColumn(2).setMaxWidth(130);
            tabla.getColumnModel().getColumn(3).setMinWidth(150);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        buscarTxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        buscarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_search_32px.png"))); // NOI18N
        buscarBtn.setToolTipText("Buscar Usuario");
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
        jButton8.setText("Asignar a Terapeuta");
        jButton8.setToolTipText("Agregar Usuario");
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buscar Paciente");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(panelDato01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buscarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jButton8)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDato01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        if (evt.getClickCount() == 2 && fila >= 0) {
            int idPaciente = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            
            Paciente pacienteElejido = lista.stream()
                    .filter(
                            t-> Float.compare(
                                    t.getPaciente().get(0).getId()
                                    ,idPaciente)==0
                    ).findFirst()
                    .get()
                    .getPaciente().get(0);
            
             new ListarTerapeutas(index,"asignarTerapeuta",pacienteElejido).setVisible(true);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        llenarTabla();
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (JOptionPane.showConfirmDialog(panelDato01, "¿Desea volver a sincronizar con la base de datos?") == 0) {
            resetearBusqueda();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       int row = tabla.getSelectedRow();
       if(row >= 0){
           int idPaciente = Integer.parseInt(tabla.getValueAt(row, 0).toString());
           Paciente pacienteElejido = lista.stream()
                    .filter(
                            t-> Float.compare(
                                    t.getPaciente().get(0).getId()
                                    ,idPaciente)==0
                    ).findFirst()
                    .get()
                    .getPaciente().get(0);
            new ListarTerapeutas(index,"asignarTerapeuta",pacienteElejido).setVisible(true);
       }else{
           JOptionPane.showMessageDialog(panelDato01, "Seleccione al paciente");
       }
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    static rojeru_san.rsprogress.RSProgressBarAnimated barra;
    static javax.swing.JButton buscarBtn;
    static javax.swing.JTextField buscarTxt;
    private javax.swing.ButtonGroup grupoCiclo;
    static javax.swing.JButton jButton7;
    static javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JLabel pacientesListaEsperaLabel;
    private rojeru_san.rspanel.RSPanelRound panelDato01;
    static rojerusan.RSTableMetro tabla;
    // End of variables declaration//GEN-END:variables

    public void iniciar() {
        barra.setVisible(false);
        resetearBusqueda();
    }

    public static void resetearBusqueda() {
        barra.setVisible(true);

        new Thread(new Runnable() {
            @Override
            public void run() {
                lista = (ArrayList) new ListaEspera().Listar().clone();
                lista =(ArrayList) lista.stream().filter(t-> t.getEstado().equalsIgnoreCase("activo")).collect(Collectors.toList());
                llenarTabla();
                pacientesListaEsperaLabel.setText(lista.size() + "");
            }
        }).start();

    }

    public static void llenarTabla() {
        modelo.setRowCount(0);

        String txt2 = buscarTxt.getText().isEmpty() ? "" : buscarTxt.getText().toLowerCase();
        for (ListaEspera listado  : lista) {
            if ((listado.getPaciente().get(0). getCodigo().toLowerCase().contains(txt2) 
                    || listado.getPaciente().get(0).getNombreCompleto().toLowerCase().contains(txt2)) 
                    
               ){//validarPaciente(paciente)
                modelo.addRow(new Object[]{
                    listado.getPaciente().get(0).getId(),
                    listado.getPaciente().get(0).getNombreCompleto(),
                    listado.getPaciente().get(0).getDni(),
                    listado.getFechaModificacion()
                });
            }
        }

        barra.setVisible(false);
    }

}
