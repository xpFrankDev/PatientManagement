
package Ventanas;

import Clases.IndiceBienestar;
import Clases.NotaEvolucion;
import Clases.Paciente;
import Clases.SRQ18;
import Clases.Usuario;
import Clases.tools;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import rojerusan.RSNotifyFade;

/**
 *
 * @author parra
 */
public class VerHistorialPaciente extends javax.swing.JFrame {

    static Paciente paciente = new Paciente();
    static Usuario terapeuta = new Usuario();
    DefaultTableModel modeloSRQ;
    DefaultTableModel modeloIndiceBienestar;
    DefaultTableModel modeloNotaEvolucion;
    Index index;

    public VerHistorialPaciente() {
        initComponents();
        changeIcon();

        modeloSRQ = (DefaultTableModel) tablaSRQ.getModel();
        modeloIndiceBienestar = (DefaultTableModel) tablaIndiceBienestar.getModel();
        modeloNotaEvolucion = (DefaultTableModel) tablaNotaEvolucion.getModel();
        
        ocultarAlertas();

    }

    public VerHistorialPaciente(Index index,Paciente p) {
        initComponents();
        changeIcon();
        this.paciente = p;
        this.terapeuta = index.getUser();
        this.index=index;
        modeloSRQ = (DefaultTableModel) tablaSRQ.getModel();
        modeloIndiceBienestar = (DefaultTableModel) tablaIndiceBienestar.getModel();
        modeloNotaEvolucion = (DefaultTableModel) tablaNotaEvolucion.getModel();
        nombreLabel.setText("Nombre: "+p.getNombreCompleto());
        dniLabel.setText("DNI: " + p.getDni());
        codigoLabel.setText("Código: " + p.getCodigo());
        edadLabel.setText("Edad: " + new tools().obtenerEdad2(p.getFechaNacimiento()) + " Años");
        fnacPaciente.setText("FNac: "+p.getFechaNacimiento());
        
        
        nombreTerapeutaLabel.setText("Nombre: " + terapeuta.getNombre());
        codigoTerapeutaLabel.setText("Código: " + terapeuta.getCodigo());
        cargoTerapeutaLabel.setText("Cargo: " + terapeuta.getCargo());

        ocultarAlertas();
        
       // setExtendedState(MAXIMIZED_BOTH);
        new Thread(this::llenarTablas).start();
    }

    private void ocultarAlertas(){
       pnAlertaSRQ.setVisible(false);
       pnAlertaIndice.setVisible(false);
       pnAlertaNotaEvolucion.setVisible(false);
        
        alertaIcon.setVisible(false);
        alertaMensaje.setVisible(false);
        alertaIcon1.setVisible(false);
        alertaMensaje1.setVisible(false);
        alertaIcon2.setVisible(false);
        alertaMensaje2.setVisible(false);
        alertaIcon3.setVisible(false);
        alertaMensaje3.setVisible(false);
        alertaIcon4.setVisible(false);
        alertaMensaje4.setVisible(false);
    }
    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSLabelImage3 = new rojeru_san.rslabel.RSLabelImage();
        panelCentral = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSPanelRound1 = new rojeru_san.rspanel.RSPanelRound();
        jLabel2 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        dniLabel = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        edadLabel = new javax.swing.JLabel();
        fnacPaciente = new javax.swing.JLabel();
        rSPanelRound2 = new rojeru_san.rspanel.RSPanelRound();
        jLabel3 = new javax.swing.JLabel();
        nombreTerapeutaLabel = new javax.swing.JLabel();
        codigoTerapeutaLabel = new javax.swing.JLabel();
        cargoTerapeutaLabel = new javax.swing.JLabel();
        lbCambiarTerapeuta = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaNotaEvolucion = new rojerusan.RSTableMetro();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaSRQ = new rojerusan.RSTableMetro();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaIndiceBienestar = new rojerusan.RSTableMetro();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGraficaSrq = new javax.swing.JButton();
        btnGraficaIndice = new javax.swing.JButton();
        rSLabelImage1 = new rojeru_san.rslabel.RSLabelImage();
        rSLabelImage4 = new rojeru_san.rslabel.RSLabelImage();
        pnAlertaNotaEvolucion = new javax.swing.JPanel();
        alertaIcon4 = new RSMaterialComponent.RSButtonIconDos();
        alertaMensaje4 = new javax.swing.JLabel();
        pnAlertaSRQ = new javax.swing.JPanel();
        alertaIcon3 = new RSMaterialComponent.RSButtonIconDos();
        alertaMensaje3 = new javax.swing.JLabel();
        alertaIcon = new RSMaterialComponent.RSButtonIconDos();
        alertaMensaje = new javax.swing.JLabel();
        pnAlertaIndice = new javax.swing.JPanel();
        alertaIcon2 = new RSMaterialComponent.RSButtonIconDos();
        alertaMensaje2 = new javax.swing.JLabel();
        alertaIcon1 = new RSMaterialComponent.RSButtonIconDos();
        alertaMensaje1 = new javax.swing.JLabel();

        rSLabelImage3.setText("rSLabelImage3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resumen de Paciente");

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelTitulo.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Resumen detallado del Paciente");

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
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        rSPanelRound1.setAnchoBorde(1.0F);
        rSPanelRound1.setColorBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos del Paciente");

        nombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreLabel.setText("jLabel4");

        dniLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dniLabel.setText("jLabel4");

        codigoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codigoLabel.setText("jLabel5");

        edadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edadLabel.setText("jLabel4");

        fnacPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fnacPaciente.setText("jLabel7");

        javax.swing.GroupLayout rSPanelRound1Layout = new javax.swing.GroupLayout(rSPanelRound1);
        rSPanelRound1.setLayout(rSPanelRound1Layout);
        rSPanelRound1Layout.setHorizontalGroup(
            rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(nombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rSPanelRound1Layout.createSequentialGroup()
                        .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dniLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fnacPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edadLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        rSPanelRound1Layout.setVerticalGroup(
            rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dniLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(codigoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fnacPaciente))
                .addContainerGap())
        );

        rSPanelRound2.setAnchoBorde(1.0F);
        rSPanelRound2.setColorBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Datos del Terapeuta Asignado");

        nombreTerapeutaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreTerapeutaLabel.setText("jLabel4");

        codigoTerapeutaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codigoTerapeutaLabel.setText("jLabel4");

        cargoTerapeutaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargoTerapeutaLabel.setText("jLabel5");

        lbCambiarTerapeuta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCambiarTerapeuta.setText("Cambiar Terapeuta");
        lbCambiarTerapeuta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbCambiarTerapeuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCambiarTerapeutaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rSPanelRound2Layout = new javax.swing.GroupLayout(rSPanelRound2);
        rSPanelRound2.setLayout(rSPanelRound2Layout);
        rSPanelRound2Layout.setHorizontalGroup(
            rSPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCambiarTerapeuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(nombreTerapeutaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rSPanelRound2Layout.createSequentialGroup()
                        .addComponent(codigoTerapeutaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargoTerapeutaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rSPanelRound2Layout.setVerticalGroup(
            rSPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreTerapeutaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rSPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoTerapeutaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargoTerapeutaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCambiarTerapeuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablaNotaEvolucion.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaNotaEvolucion.setBackgoundHead(new java.awt.Color(0, 102, 102));
        tablaNotaEvolucion.setBackgoundHover(new java.awt.Color(0, 102, 102));
        tablaNotaEvolucion.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaNotaEvolucion.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tablaNotaEvolucion.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaNotaEvolucion.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tablaNotaEvolucion.setEffectHover(true);
        tablaNotaEvolucion.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tablaNotaEvolucion.setFontHead(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaNotaEvolucion.setFontRowHover(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tablaNotaEvolucion.setFontRowSelect(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tablaNotaEvolucion.setPreferredSize(new java.awt.Dimension(279, 100));
        tablaNotaEvolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaNotaEvolucionMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaNotaEvolucion);
        if (tablaNotaEvolucion.getColumnModel().getColumnCount() > 0) {
            tablaNotaEvolucion.getColumnModel().getColumn(0).setMinWidth(100);
            tablaNotaEvolucion.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablaNotaEvolucion.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        tablaSRQ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Sumatoria", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSRQ.setBackgoundHead(new java.awt.Color(0, 102, 102));
        tablaSRQ.setBackgoundHover(new java.awt.Color(0, 102, 102));
        tablaSRQ.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaSRQ.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tablaSRQ.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaSRQ.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tablaSRQ.setEffectHover(true);
        tablaSRQ.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tablaSRQ.setFontHead(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaSRQ.setFontRowHover(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tablaSRQ.setFontRowSelect(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tablaSRQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSRQMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaSRQ);
        if (tablaSRQ.getColumnModel().getColumnCount() > 0) {
            tablaSRQ.getColumnModel().getColumn(0).setMinWidth(80);
            tablaSRQ.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablaSRQ.getColumnModel().getColumn(0).setMaxWidth(80);
            tablaSRQ.getColumnModel().getColumn(1).setMinWidth(100);
            tablaSRQ.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaSRQ.getColumnModel().getColumn(1).setMaxWidth(100);
            tablaSRQ.getColumnModel().getColumn(2).setMinWidth(120);
            tablaSRQ.getColumnModel().getColumn(2).setPreferredWidth(120);
            tablaSRQ.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        tablaIndiceBienestar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Result.", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaIndiceBienestar.setBackgoundHead(new java.awt.Color(0, 102, 102));
        tablaIndiceBienestar.setBackgoundHover(new java.awt.Color(0, 102, 102));
        tablaIndiceBienestar.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaIndiceBienestar.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tablaIndiceBienestar.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaIndiceBienestar.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tablaIndiceBienestar.setEffectHover(true);
        tablaIndiceBienestar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tablaIndiceBienestar.setFontHead(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaIndiceBienestar.setFontRowHover(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tablaIndiceBienestar.setFontRowSelect(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tablaIndiceBienestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaIndiceBienestarMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaIndiceBienestar);
        if (tablaIndiceBienestar.getColumnModel().getColumnCount() > 0) {
            tablaIndiceBienestar.getColumnModel().getColumn(0).setMinWidth(80);
            tablaIndiceBienestar.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablaIndiceBienestar.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Resultados de SRQ18");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Resultados de Indice Bienestar");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Resultado de Notas de Evolución");

        btnGraficaSrq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_increase_32px_1.png"))); // NOI18N
        btnGraficaSrq.setContentAreaFilled(false);
        btnGraficaSrq.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGraficaSrq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaSrqActionPerformed(evt);
            }
        });

        btnGraficaIndice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_increase_32px_1.png"))); // NOI18N
        btnGraficaIndice.setContentAreaFilled(false);
        btnGraficaIndice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGraficaIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaIndiceActionPerformed(evt);
            }
        });

        rSLabelImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_user_115px.png"))); // NOI18N

        rSLabelImage4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSLabelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/manager.png"))); // NOI18N

        pnAlertaNotaEvolucion.setOpaque(false);

        alertaIcon4.setBackground(new java.awt.Color(204, 0, 0));
        alertaIcon4.setBackgroundHover(new java.awt.Color(153, 0, 0));
        alertaIcon4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertaIcon4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);

        alertaMensaje4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        alertaMensaje4.setText("Paciente Posee más de 11 Sesiones SRQ");

        javax.swing.GroupLayout pnAlertaNotaEvolucionLayout = new javax.swing.GroupLayout(pnAlertaNotaEvolucion);
        pnAlertaNotaEvolucion.setLayout(pnAlertaNotaEvolucionLayout);
        pnAlertaNotaEvolucionLayout.setHorizontalGroup(
            pnAlertaNotaEvolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlertaNotaEvolucionLayout.createSequentialGroup()
                .addComponent(alertaIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertaMensaje4, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnAlertaNotaEvolucionLayout.setVerticalGroup(
            pnAlertaNotaEvolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlertaNotaEvolucionLayout.createSequentialGroup()
                .addGroup(pnAlertaNotaEvolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alertaIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertaMensaje4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 130, Short.MAX_VALUE))
        );

        pnAlertaSRQ.setOpaque(false);

        alertaIcon3.setBackground(new java.awt.Color(204, 0, 0));
        alertaIcon3.setBackgroundHover(new java.awt.Color(153, 0, 0));
        alertaIcon3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertaIcon3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);

        alertaMensaje3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        alertaMensaje3.setText("Paciente Posee más de 11 Sesiones SRQ");

        alertaIcon.setBackground(new java.awt.Color(204, 0, 0));
        alertaIcon.setBackgroundHover(new java.awt.Color(153, 0, 0));
        alertaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertaIcon.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);

        alertaMensaje.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        alertaMensaje.setText("Paciente ha tenido Pensamientos Suicidas:");

        javax.swing.GroupLayout pnAlertaSRQLayout = new javax.swing.GroupLayout(pnAlertaSRQ);
        pnAlertaSRQ.setLayout(pnAlertaSRQLayout);
        pnAlertaSRQLayout.setHorizontalGroup(
            pnAlertaSRQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlertaSRQLayout.createSequentialGroup()
                .addGroup(pnAlertaSRQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAlertaSRQLayout.createSequentialGroup()
                        .addComponent(alertaIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alertaMensaje3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnAlertaSRQLayout.createSequentialGroup()
                        .addComponent(alertaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(alertaMensaje)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnAlertaSRQLayout.setVerticalGroup(
            pnAlertaSRQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAlertaSRQLayout.createSequentialGroup()
                .addGroup(pnAlertaSRQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alertaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertaMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAlertaSRQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alertaIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertaMensaje3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pnAlertaIndice.setOpaque(false);

        alertaIcon2.setBackground(new java.awt.Color(204, 0, 0));
        alertaIcon2.setBackgroundHover(new java.awt.Color(153, 0, 0));
        alertaIcon2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertaIcon2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);

        alertaMensaje2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        alertaMensaje2.setText("Paciente con Bajo Bienestar. Posible aplicación de ICD-10");

        alertaIcon1.setBackground(new java.awt.Color(204, 0, 0));
        alertaIcon1.setBackgroundHover(new java.awt.Color(153, 0, 0));
        alertaIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertaIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);

        alertaMensaje1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        alertaMensaje1.setText("Probabilidad de sindrome andioso-depresivo o algún trastorno mental");

        javax.swing.GroupLayout pnAlertaIndiceLayout = new javax.swing.GroupLayout(pnAlertaIndice);
        pnAlertaIndice.setLayout(pnAlertaIndiceLayout);
        pnAlertaIndiceLayout.setHorizontalGroup(
            pnAlertaIndiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlertaIndiceLayout.createSequentialGroup()
                .addGroup(pnAlertaIndiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAlertaIndiceLayout.createSequentialGroup()
                        .addComponent(alertaIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(alertaMensaje2))
                    .addGroup(pnAlertaIndiceLayout.createSequentialGroup()
                        .addComponent(alertaIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(alertaMensaje1)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        pnAlertaIndiceLayout.setVerticalGroup(
            pnAlertaIndiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAlertaIndiceLayout.createSequentialGroup()
                .addGroup(pnAlertaIndiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alertaIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertaMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnAlertaIndiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alertaIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertaMensaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(rSPanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(rSLabelImage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(rSPanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(btnGraficaSrq, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnAlertaNotaEvolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(btnGraficaIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnAlertaIndice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnAlertaSRQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSPanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(rSLabelImage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSPanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnAlertaNotaEvolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGraficaSrq, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnAlertaSRQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGraficaIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnAlertaIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(21, 21, 21))
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

    private void tablaSRQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSRQMouseClicked
        int fila = tablaSRQ.getSelectedRow();
        if (evt.getClickCount() == 2 && fila >= 0) {
            int srqID = Integer.parseInt(tablaSRQ.getValueAt(fila, 0).toString());
            for (SRQ18 srq18 : paciente.getSrq18s()) {
                if (Float.compare(srqID, srq18.getId()) == 0) {
                    new newSRQ18(index,paciente, srq18, "ver").setVisible(true);
                }
            }

        }
    }//GEN-LAST:event_tablaSRQMouseClicked

    private void tablaNotaEvolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNotaEvolucionMouseClicked
        int fila = tablaNotaEvolucion.getSelectedRow();
        if (evt.getClickCount() == 2 && fila >= 0) {
            int idx = Integer.parseInt(tablaNotaEvolucion.getValueAt(fila, 0).toString());
            for (NotaEvolucion nota : paciente.getNotas()) {
                if (Float.compare(idx, nota.getIdNota()) == 0) {
                    new newNotaEvolucion(index,paciente, terapeuta, nota, "ver").setVisible(true);
                    break;
                }
            }

        }
    }//GEN-LAST:event_tablaNotaEvolucionMouseClicked

    private void tablaIndiceBienestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaIndiceBienestarMouseClicked
        int fila = tablaIndiceBienestar.getSelectedRow();
        if (evt.getClickCount() == 2 && fila >= 0) {
            int id = Integer.parseInt(tablaIndiceBienestar.getValueAt(fila, 0).toString());
            for (IndiceBienestar ib : paciente.getIndices()) {
                if (Float.compare(id, ib.getId()) == 0) {
                    new newIndiceBienestar(index,paciente, terapeuta, ib).setVisible(true);
                    break;
                }
            }
        }
    }//GEN-LAST:event_tablaIndiceBienestarMouseClicked
verGrafico vgSrq = new verGrafico();
verGrafico vgIndice = new verGrafico();
    private void btnGraficaSrqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaSrqActionPerformed
       
        ArrayList<Integer> sesiones = new ArrayList();
        sesiones.add(0);sesiones.add(0);sesiones.add(0);
        sesiones.add(0);sesiones.add(0);sesiones.add(0);
        sesiones.add(0);sesiones.add(0);sesiones.add(0);
        sesiones.add(0);sesiones.add(0);sesiones.add(0);
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (SRQ18 srq : paciente.getSrq18s()) {
            int mesInt = Integer.parseInt(srq.getFechaSrq().substring(5, 7));
            String mesString = new tools().getMes(mesInt);
            
            sesiones.set((mesInt-1), (sesiones.get((mesInt-1))+1));
        }
        
        
        for(int i=0; i<sesiones.size();i++){
           dataset.setValue(sesiones.get(i), "Evaluaciones",new tools().getMes(i+1));
        }
       
        
        
        JFreeChart chart = ChartFactory.createBarChart3D("Cantidad de evaluaciones SRQ realizadas por mes",
                "Meses del año " , "Número de Sesiones",
                dataset, PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 20));
        chart.getTitle().setPaint(Color.BLACK);

        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        p.setRangeGridlinesVisible(true);
        p.setRangeGridlinePaint(Color.BLACK);
        BarRenderer renderer =(BarRenderer) p.getRenderer();
        renderer.setDrawBarOutline(false);
        GradientPaint gp0 = new GradientPaint(0.0f,0.0f,Color.blue,0.0f,0.0f,new Color(51,51,64));

        ChartPanel chartPanel = new ChartPanel(chart);
        
       
        
        if(vgSrq.isShowing() || vgSrq.isVisible()){
            vgSrq.setVisible(true);
        }else{
             vgSrq = new verGrafico(chartPanel, "Evaluaciones SRQ del paciente "+paciente.getNombreCompleto());
             vgSrq.setVisible(true);
        }
    }//GEN-LAST:event_btnGraficaSrqActionPerformed

    private void btnGraficaIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaIndiceActionPerformed
        ArrayList<Integer> sesiones = new ArrayList();
        sesiones.add(0);sesiones.add(0);sesiones.add(0);
        sesiones.add(0);sesiones.add(0);sesiones.add(0);
        sesiones.add(0);sesiones.add(0);sesiones.add(0);
        sesiones.add(0);sesiones.add(0);sesiones.add(0);
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (IndiceBienestar indice : paciente.getIndices()) {
            int mesInt = Integer.parseInt(indice.getFecha().substring(5, 7));
            String mesString = new tools().getMes(mesInt);
            
            sesiones.set((mesInt-1), (sesiones.get((mesInt-1))+1));
        }
        
        
        for(int i=0; i<sesiones.size();i++){
           dataset.setValue(sesiones.get(i), "Evaluaciones",new tools().getMes(i+1));
        }
       
        
        
        JFreeChart chart = ChartFactory.createBarChart3D("Cantidad de evaluaciones Indice Bienestar realizadas por mes",
                "Meses del año " , "Número de Sesiones",
                dataset, PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 20));
        chart.getTitle().setPaint(Color.BLACK);

        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        p.setRangeGridlinesVisible(true);
        p.setRangeGridlinePaint(Color.BLACK);
        BarRenderer renderer =(BarRenderer) p.getRenderer();
        renderer.setDrawBarOutline(false);
        GradientPaint gp0 = new GradientPaint(0.0f,0.0f,Color.blue,0.0f,0.0f,new Color(51,51,64));

        ChartPanel chartPanel = new ChartPanel(chart);
        
       
        
        if(vgIndice.isShowing() || vgIndice.isVisible()){
            vgIndice.setVisible(true);
        }else{
             vgIndice = new verGrafico(chartPanel, "Evaluaciones Indice Bienestar del paciente "+paciente.getNombreCompleto());
             vgIndice.setVisible(true);
        }
    }//GEN-LAST:event_btnGraficaIndiceActionPerformed

    private void lbCambiarTerapeutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCambiarTerapeutaMouseClicked
        
        if(JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea Cambiar el Terapeuta?", "Cambiar Terapeuta", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
            new ListarTerapeutas(index,"HistorialPaciente").setVisible(true);
        }
        
    }//GEN-LAST:event_lbCambiarTerapeutaMouseClicked

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
            java.util.logging.Logger.getLogger(VerHistorialPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerHistorialPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerHistorialPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerHistorialPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerHistorialPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconDos alertaIcon;
    private RSMaterialComponent.RSButtonIconDos alertaIcon1;
    private RSMaterialComponent.RSButtonIconDos alertaIcon2;
    private RSMaterialComponent.RSButtonIconDos alertaIcon3;
    private RSMaterialComponent.RSButtonIconDos alertaIcon4;
    private javax.swing.JLabel alertaMensaje;
    private javax.swing.JLabel alertaMensaje1;
    private javax.swing.JLabel alertaMensaje2;
    private javax.swing.JLabel alertaMensaje3;
    private javax.swing.JLabel alertaMensaje4;
    private javax.swing.JButton btnGraficaIndice;
    private javax.swing.JButton btnGraficaSrq;
    private static javax.swing.JLabel cargoTerapeutaLabel;
    private javax.swing.JLabel codigoLabel;
    private static javax.swing.JLabel codigoTerapeutaLabel;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JLabel fnacPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbCambiarTerapeuta;
    private javax.swing.JLabel nombreLabel;
    private static javax.swing.JLabel nombreTerapeutaLabel;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel pnAlertaIndice;
    private javax.swing.JPanel pnAlertaNotaEvolucion;
    private javax.swing.JPanel pnAlertaSRQ;
    private rojeru_san.rslabel.RSLabelImage rSLabelImage1;
    private rojeru_san.rslabel.RSLabelImage rSLabelImage3;
    private rojeru_san.rslabel.RSLabelImage rSLabelImage4;
    private rojeru_san.rspanel.RSPanelRound rSPanelRound1;
    private rojeru_san.rspanel.RSPanelRound rSPanelRound2;
    private rojerusan.RSTableMetro tablaIndiceBienestar;
    private rojerusan.RSTableMetro tablaNotaEvolucion;
    private rojerusan.RSTableMetro tablaSRQ;
    // End of variables declaration//GEN-END:variables

    public void llenarTablas() {

        new Thread(new Runnable() {
            @Override
            public void run() {

                //Llenado Tabla de SRQ
                if (paciente.getSrq18s().isEmpty()) {
                    paciente.setSrq18s(new SRQ18().getSRQ18xPaciente(paciente.getId()));
                }
                
                for (SRQ18 srq : paciente.getSrq18s()) {
                    modeloSRQ.addRow(new Object[]{
                        srq.getId(), srq.getFechaSrq(), srq.getSumatoria(), srq.getEstado()
                    });
                    
                    if (srq.getQ17().equalsIgnoreCase("si")) {
                        pnAlertaSRQ.setVisible(true);
                        alertaIcon.setVisible(true);
                        alertaMensaje.setVisible(true);
                        if(!alertaMensaje.getText().contains("ID:")){
                            alertaMensaje.setText(alertaMensaje.getText()+" ID:"+srq.getId()+",");
                        }else{
                            alertaMensaje.setText(alertaMensaje.getText()+" "+srq.getId()+",");
                        }
                        
                    }
                    if(srq.getSumatoria()>=9){
                        alertaIcon1.setVisible(true);
                        alertaMensaje1.setVisible(true);
                        pnAlertaSRQ.setVisible(true);
                        if(!alertaMensaje1.getText().contains("ID:")){
                            alertaMensaje1.setText(alertaMensaje1.getText()+" ID:"+srq.getId()+",");
                        }else{
                            alertaMensaje1.setText(alertaMensaje1.getText()+" "+srq.getId()+",");
                        }
                    }
                }
                if(paciente.getSrq18s().size()>11){
                    pnAlertaSRQ.setVisible(true);
                     alertaIcon3.setVisible(true);
                     alertaMensaje3.setVisible(true);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //Llenando Tabla Indice Bienestar
                if (paciente.getIndices().isEmpty()) {
                    paciente.setIndices(new IndiceBienestar().getRegistroxPaciente(paciente.getId()));
                }
                for (IndiceBienestar indice : paciente.getIndices()) {
                    modeloIndiceBienestar.addRow(new Object[]{
                        indice.getId(), indice.getFecha(), indice.getSumatoria(), indice.getEstado()
                    });
                    
                    if(indice.getSumatoria()<13){
                        pnAlertaIndice.setVisible(true);
                        alertaIcon2.setVisible(true);
                        alertaMensaje2.setVisible(true);
                        if(!alertaMensaje2.getText().contains("ID:")){
                            alertaMensaje2.setText(alertaMensaje2.getText()+" ID:"+indice.getId()+",");
                        }else{
                            alertaMensaje2.setText(alertaMensaje2.getText()+" "+indice.getId()+",");
                        }
                    }
                    
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //Llenando tabla de Nota Evolucion
                if (paciente.getNotas().isEmpty()) {
                    paciente.setNotas(new NotaEvolucion().getNotasdePaciente(paciente.getId()));
                }
                for (NotaEvolucion nota : paciente.getNotas()) {
                    modeloNotaEvolucion.addRow(new Object[]{
                        nota.getIdNota(), nota.getFechaNota(), nota.getEstado()
                    });
                }

                if(paciente.getNotas().size() > 11){
                    alertaIcon4.setVisible(true);
                    alertaMensaje4.setVisible(true);
                    pnAlertaNotaEvolucion.setVisible(true);
                }
            }
        }).start();

    }

    public static void changeTerapeuta(Usuario nuevoTerapeuta){
        
        boolean resultado = new Paciente().updateTerapeuta(
                nuevoTerapeuta.getId(),
                paciente.getId()
        );
         if(resultado){
            terapeuta=nuevoTerapeuta;
            nombreTerapeutaLabel.setText(terapeuta.getNombre());
            codigoTerapeutaLabel.setText(terapeuta.getCodigo());
            new rojerusan.RSNotifyFade(
                        "Cambio Exitos",
                        "Se ha realizado el cambio de terapeuta.",
                        5,
                        RSNotifyFade.PositionNotify.BottomRight,
                        RSNotifyFade.TypeNotify.SUCCESS
                ).setVisible(true);
         }
    }
}
