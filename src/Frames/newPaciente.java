
package Ventanas;

import Clases.CondicionMigratoria;
import Clases.Derivacion;
import Clases.Generos;
import Clases.GrupoVulnerable;
import Clases.IndiceBienestar;
import Clases.ListaEspera;
import Clases.Mail;
import Clases.NivelEducativo;
import Clases.Paciente;
import Clases.RegistroPaciente;
import Clases.SRQ18;
import Clases.ScrollSens;
import Clases.Usuario;
import Clases.tools;
import Panels.RnpDatosPersonales;
import Panels.RnpFinalizar;
import Panels.RnpInfoVulnerabilidad;
import Panels.RnpObservaciones;
import Panels.panelNewPaciente;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import rojeru_san.complementos.RSUtilities;
import rojerusan.RSNotifyFade;


public class newPaciente extends javax.swing.JFrame {

    public int pagina = 1;
    Paciente paciente;
    public String tipo = "nuevo";
    public RnpDatosPersonales RnpPag1 = new RnpDatosPersonales(this);
    public RnpInfoVulnerabilidad RnpPag2 = new RnpInfoVulnerabilidad();
    public RnpObservaciones RnpPag3;
    public RnpFinalizar RnpPag4;
    public SRQ18 srq18 = new SRQ18();
    public IndiceBienestar indice = new IndiceBienestar();
    String codigoPaciente = "";
    static int resultadoSRQIngreso = 0;
    static Usuario terapeutaAsignado = new Usuario();
    ArrayList<Paciente> pacientes = new ArrayList();
    panelNewPaciente pnp;
    JPanel pp = new JPanel();
    Index index;

    public newPaciente() {
        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        setExtendedState(MAXIMIZED_BOTH);
        
        //max();
        changeIcon();
        iniciar();
    }

    public newPaciente(Index index,panelNewPaciente pnp) {
        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        setExtendedState(MAXIMIZED_BOTH);
        RnpPag3 = new RnpObservaciones(index,this);
        RnpPag4 = new RnpFinalizar(index,this);
        this.pnp=pnp;
        this.index =index;
        //max();
        changeIcon();
        iniciar();
    }

    public newPaciente(Index index,Paciente paciente, String tipo) {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        setExtendedState(MAXIMIZED_BOTH);
        //max();
        this.tipo = tipo;
        this.paciente = paciente;
        this.index =index;
        RnpPag3 = new RnpObservaciones(index,this);
        RnpPag4 = new RnpFinalizar(index,this);
        changeIcon();
        
        
        
        
        iniciar();
    }

    public newPaciente(Index index,Paciente paciente, String tipo, panelNewPaciente pnp) {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        setExtendedState(MAXIMIZED_BOTH);
        //max();
        this.tipo = tipo;
        this.paciente = paciente;
        this.pnp = pnp;
        RnpPag3 = new RnpObservaciones(index,this);
        RnpPag4 = new RnpFinalizar(index,this);
        changeIcon();
        iniciar();
    }
    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        grupo1 = new javax.swing.ButtonGroup();
        Orientacion = new javax.swing.ButtonGroup();
        panelCentral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scrollContenido = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();
        barra = new javax.swing.JProgressBar();
        separador1 = new javax.swing.JLabel();
        separador2 = new javax.swing.JLabel();
        separador3 = new javax.swing.JLabel();
        separador4 = new javax.swing.JLabel();
        siguienteBtn = new RSMaterialComponent.RSButtonIconDos();
        titulo3 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        atrasBtn = new RSMaterialComponent.RSButtonIconDos();
        panelLateral = new javax.swing.JPanel();
        panelCoincidencia = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        infoButton = new rojeru_san.rsbutton.RSButtonRoundEffect();
        passwordTxt = new rojeru_san.rsfield.RSPassViewBD();
        jPanel3 = new javax.swing.JPanel();
        RbVertical = new rojerusan.RSRadioButton();
        RbHorizontal = new rojerusan.RSRadioButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Nuevo Paciente");
        setMaximumSize(new java.awt.Dimension(1369, 2147483647));

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btnSalir.setBackground(new java.awt.Color(59, 59, 59));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_close_window_32px.png"))); // NOI18N
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Nuevo Paciente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        barra.setBackground(new java.awt.Color(0, 153, 0));
        barra.setForeground(new java.awt.Color(0, 153, 0));

        separador1.setText("_______________________");

        separador2.setText("__________________________");

        separador3.setText("______________________________________");

        separador4.setText("_________________________________");

        siguienteBtn.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ARROW_FORWARD);
        siguienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteBtnActionPerformed(evt);
            }
        });

        titulo3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        titulo3.setText("4. SRQ Inicial y Observaciones");
        titulo3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titulo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titulo3MouseClicked(evt);
            }
        });

        titulo2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        titulo2.setText("3. Información de Vulnerabilidad");
        titulo2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titulo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titulo2MouseClicked(evt);
            }
        });

        titulo1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        titulo1.setText("2. Datos Personales");
        titulo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titulo1MouseClicked(evt);
            }
        });

        titulo4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        titulo4.setText("1. Modalidad y Fin.");
        titulo4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titulo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titulo4MouseClicked(evt);
            }
        });

        atrasBtn.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ARROW_BACK);
        atrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(atrasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(titulo4)
                        .addGap(15, 15, 15)
                        .addComponent(titulo1)
                        .addGap(22, 22, 22)
                        .addComponent(titulo2)
                        .addGap(23, 23, 23)
                        .addComponent(titulo3))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(separador4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(siguienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador3)
                            .addComponent(separador1)
                            .addComponent(separador2)
                            .addComponent(separador4))
                        .addGap(6, 6, 6)
                        .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atrasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siguienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelLateral.setBackground(new java.awt.Color(255, 255, 255));

        panelCoincidencia.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Coincidencias del Paciente");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Completo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setBackgoundHead(new java.awt.Color(62, 62, 62));
        tabla.setColorBorderHead(new java.awt.Color(59, 59, 59));
        tabla.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tabla.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tabla.setColorSecondary(new java.awt.Color(255, 255, 255));
        tabla.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tabla.setGridColor(new java.awt.Color(0, 0, 0));
        tabla.setPositionText(rojerusan.RSTableMetro.POSITION_TEXT.LEFT);
        tabla.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(80);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(80);
            tabla.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        infoButton.setBackground(new java.awt.Color(230, 230, 230));
        infoButton.setForeground(new java.awt.Color(51, 51, 51));
        infoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_info_32px.png"))); // NOI18N
        infoButton.setText("Ver Info");
        infoButton.setColorHover(new java.awt.Color(0, 180, 255));
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        passwordTxt.setBackground(new java.awt.Color(164, 184, 172));
        passwordTxt.setForeground(new java.awt.Color(246, 219, 212));
        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTxt.setBordeColorFocus(new java.awt.Color(246, 219, 212));
        passwordTxt.setBotonColor(new java.awt.Color(246, 219, 212));
        passwordTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passwordTxt.setPlaceholder("Contraseña");

        javax.swing.GroupLayout panelCoincidenciaLayout = new javax.swing.GroupLayout(panelCoincidencia);
        panelCoincidencia.setLayout(panelCoincidenciaLayout);
        panelCoincidenciaLayout.setHorizontalGroup(
            panelCoincidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCoincidenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCoincidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addGroup(panelCoincidenciaLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(infoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelCoincidenciaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        panelCoincidenciaLayout.setVerticalGroup(
            panelCoincidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCoincidenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(infoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Visualización del Contenido", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        Orientacion.add(RbVertical);
        RbVertical.setSelected(true);
        RbVertical.setText("Vertical");
        RbVertical.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RbVerticalItemStateChanged(evt);
            }
        });

        Orientacion.add(RbHorizontal);
        RbHorizontal.setText("Horizontal");
        RbHorizontal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RbHorizontalItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(RbVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RbHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RbVertical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(RbHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLateralLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelCoincidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLateralLayout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(panelCoincidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setContentAreaFilled(true);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setContentAreaFilled(false);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Cerrar ventana?") == 0) {
            this.dispose();
        }

    }//GEN-LAST:event_btnSalirActionPerformed

    private void atrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBtnActionPerformed
        cambiarPagina(-1);
    }//GEN-LAST:event_atrasBtnActionPerformed

    private void siguienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteBtnActionPerformed
        cambiarPagina(1);
    }//GEN-LAST:event_siguienteBtnActionPerformed

    private void titulo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titulo1MouseClicked
        pagina = 2;
        cambiarPagina(0);
    }//GEN-LAST:event_titulo1MouseClicked

    private void titulo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titulo2MouseClicked
        pagina = 3;
        cambiarPagina(0);
    }//GEN-LAST:event_titulo2MouseClicked

    private void titulo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titulo3MouseClicked
        pagina = 4;
        cambiarPagina(0);
    }//GEN-LAST:event_titulo3MouseClicked

    private void titulo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titulo4MouseClicked
        pagina = 1;
        cambiarPagina(0);
    }//GEN-LAST:event_titulo4MouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        String id = fila >= 0 ? tabla.getValueAt(fila, 0).toString() : "-";
        if (fila >= 0) {
            int idint = Integer.valueOf(id);

        } else {
            new rojerusan.RSNotifyFade("¡¡No hay Selección!! ", "Seleccione un valor en la tabla valido para editar!", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

        }
    }//GEN-LAST:event_tablaMouseClicked

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            int idx = Integer.valueOf(tabla.getValueAt(fila, 0).toString());
            for (Paciente paciente : pacientes) {
                if (Float.compare(idx, paciente.getId()) == 0) {
                    new VerHistorialPaciente(index,paciente).setVisible(true);
                    break;
                }
            }
        } else {
            new rojerusan.RSNotifyFade("¡¡No hay Selección!! ", "Seleccione un valor en la tabla valido para visualizar!", 5, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

        }
    }//GEN-LAST:event_infoButtonActionPerformed

    private void RbVerticalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RbVerticalItemStateChanged
        if (RbVertical.isSelected()) {
            verVertical();
        }
    }//GEN-LAST:event_RbVerticalItemStateChanged

    private void RbHorizontalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RbHorizontalItemStateChanged
        if (RbHorizontal.isSelected()) {
            verHorizontal();
        }
    }//GEN-LAST:event_RbHorizontalItemStateChanged

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
            java.util.logging.Logger.getLogger(newPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

                new newPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Orientacion;
    private rojerusan.RSRadioButton RbHorizontal;
    private rojerusan.RSRadioButton RbVertical;
    private RSMaterialComponent.RSButtonIconDos atrasBtn;
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup grupo1;
    private rojeru_san.rsbutton.RSButtonRoundEffect infoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelCoincidencia;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelMenu;
    private rojeru_san.rsfield.RSPassViewBD passwordTxt;
    private javax.swing.JScrollPane scrollContenido;
    private javax.swing.JLabel separador1;
    private javax.swing.JLabel separador2;
    private javax.swing.JLabel separador3;
    private javax.swing.JLabel separador4;
    private RSMaterialComponent.RSButtonIconDos siguienteBtn;
    private rojerusan.RSTableMetro tabla;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    // End of variables declaration//GEN-END:variables

    
    /*
    public void max() {

        GraphicsEnvironment env
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

    }
    */
    
    
    public static String cambiarFormatoFecha(String fecha) {
        // Crear un objeto LocalDate con la fecha recibida
        LocalDate fechaOriginal = LocalDate.parse(fecha);
         // Definir el formato deseado para la fecha
        DateTimeFormatter formatoDeseado = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         // Formatear la fecha al formato deseado
        String fechaFormateada = fechaOriginal.format(formatoDeseado);
         // Retornar la fecha formateada
        return fechaFormateada;
    }
    
 public static int a=0;
 
    private void iniciar() {
        setExtendedState(MAXIMIZED_BOTH);
        pp.setLayout(new BoxLayout(pp, BoxLayout.Y_AXIS));
        pp.setAlignmentX(Component.LEFT_ALIGNMENT);
       
        
        new ScrollSens(scrollContenido, 50);
       
        if(tipo.equalsIgnoreCase("nuevo")){
            RnpPag4.rbListaEspera.setSelected(true);
            RnpPag4.rbNothing.setVisible(false);
        }else{
            RnpPag4.rbNothing.setSelected(true);
        }
        if(index.user.getCargo().equalsIgnoreCase("terapeuta") || index.user.getCargo().equalsIgnoreCase("psiquiatra")){
            RnpPag4.rbDerivarToTerapeuta.setVisible(false);
        }
        try {
            
            new Thread(this::setValorBarra).start();
            atrasBtn.setEnabled(false);
            separador1.setForeground(new Color(0, 153, 0));
            separador2.setForeground(new Color(0, 0, 0));
            separador3.setForeground(new Color(0, 0, 0));
            separador4.setForeground(new Color(0, 0, 0));

            new Thread(new Runnable() {
                @Override
                public void run() {
                    ArrayList<Generos> generos = (ArrayList) new Generos().Listar("").clone();
                    RnpPag1.generoCombo.removeAllItems();
                    ArrayList<String> tmp = new ArrayList();
                    for (Generos genero : generos) {
                        if (genero.getEstado().equalsIgnoreCase("activo") && !tmp.contains(genero.getNombre())) {
                            RnpPag1.generoCombo.addItem(genero.getNombre());
                            tmp.add(genero.getNombre());
                        }
                    }

                }
            }).start();

           
            
                    ArrayList<GrupoVulnerable> grupos = (ArrayList) new GrupoVulnerable().Listar("").clone();
                    RnpPag2.grupoVulnerableCombo.removeAllItems();
                    ArrayList<String> tmp = new ArrayList();
                    for (GrupoVulnerable grupo : grupos) {
                        if (grupo.getEstado().equalsIgnoreCase("activo") && !tmp.contains(grupo.getNombre())) {
                            RnpPag2.grupoVulnerableCombo.addItem(grupo.getNombre());
                            tmp.add(grupo.getNombre());
                        }
                    }
            
            
            new Thread(new Runnable() {
                @Override
                public void run() {
                    pacientes = (ArrayList) new Paciente().ListarPacienteconRegistros().clone();
                    ArrayList<String> docs = new ArrayList();
                    ArrayList<String> nacs = new ArrayList();
                    
                    RnpPag1.nacionalidadTxt.removeAllItems();
                    
                    /*
                    RnpPag1.otroDocumentoTxt.removeAllItems();
                    for (Paciente paciente : pacientes) {

                        if (!paciente.getTipoDocumentoxdni().toLowerCase().contains("rsitem")
                                && !paciente.getTipoDocumentoxdni().isEmpty()
                                && !docs.contains(paciente.getTipoDocumentoxdni().toLowerCase())) {

                            docs.add(paciente.getTipoDocumentoxdni().toLowerCase());
                            RnpPag1.otroDocumentoTxt.addItem(paciente.getTipoDocumentoxdni());
                        }
                    }
                    */
                    
                    
                    RnpPag1.nacionalidadTxt.addItem("Argentina");
                    RnpPag1.nacionalidadTxt.addItem("Brasil");
                    RnpPag1.nacionalidadTxt.addItem("Bolivia");
                    RnpPag1.nacionalidadTxt.addItem("Chile");
                    RnpPag1.nacionalidadTxt.addItem("Colombia");
                    RnpPag1.nacionalidadTxt.addItem("Perú");
                    RnpPag1.nacionalidadTxt.addItem("Venezuela");
                    

                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    ArrayList<CondicionMigratoria> condiciones = (ArrayList) new CondicionMigratoria().Listar("").clone();
                    RnpPag2.condicionMigratoriaCombo.removeAllItems();
                    ArrayList<String> tmp = new ArrayList();
                    for (CondicionMigratoria condicion : condiciones) {
                        if (condicion.getEstado().equalsIgnoreCase("activo") && !tmp.contains(condicion.getNombre())) {
                            RnpPag2.condicionMigratoriaCombo.addItem(condicion.getNombre());
                            tmp.add(condicion.getNombre());
                        }
                    }
                }
            }).start();

            //otro doc

            new Thread(new Runnable() {
                @Override
                public void run() {
                    RnpPag4.derivadoCombo.removeAllItems();
                    ArrayList<Derivacion> derivaciones = (ArrayList) new Derivacion().Listar("").clone();
                    //RnpPag2.condicionMigratoriaCombo.removeAllItems();
                    ArrayList<String> tmp = new ArrayList();
                    for (Derivacion derivacion : derivaciones) {
                        if (derivacion.getEstado().equalsIgnoreCase("activo") && !tmp.contains(derivacion.getNombre())) {
                            RnpPag4.derivadoCombo.addItem(derivacion.getNombre());
                            tmp.add(derivacion.getNombre());
                        }
                    }
                }
            }).start();

            
                    RnpPag2.comboNivelEducativo.removeAllItems();
                    ArrayList<NivelEducativo> niveles = (ArrayList) new NivelEducativo().Listar("").clone();
                    //RnpPag2.condicionMigratoriaCombo.removeAllItems();
                    ArrayList<String> tmpx = new ArrayList();
                    for (NivelEducativo nivelEducativo : niveles) {
                        if (nivelEducativo.getEstado().equalsIgnoreCase("activo") && !tmp.contains(nivelEducativo.getNombre())) {
                            RnpPag2.comboNivelEducativo.addItem(nivelEducativo.getNombre());
                            tmpx.add(nivelEducativo.getNombre());
                        }
                    }
                    a=1;

            RnpPag2.setLlaveInicio(true);

            //****************************************************
            
           // esperar(1500);
            
            if (tipo.equalsIgnoreCase("editar")) {

                // DATOS DE LA PAGINA 1 - DATOS PERSONALES
                RnpPag1.nombresTxt.setText(paciente.getNombres());
                RnpPag1.apellidosTxt.setText(paciente.getApellidos());
                RnpPag1.dniTxt.setText(paciente.getDni());
                
                
                
                RnpPag1.checkDocumento.setSelected(true);
                RnpPag1.otroDocumentoTxt.setSelectedItem(paciente.getTipoDocumentoxdni());
                RnpPag1.otroDocumentoTxt.setVisible(true);
                
                /*
                if (paciente.getTipoDocumento().equalsIgnoreCase("dni")) {
                    //RnpPag1.checkDocumento.setSelected(false);
                    RnpPag1.checkDocumento.setSelected(true);
                    RnpPag1.otroDocumentoTxt.setSelectedItem(paciente.getTipoDocumentoxdni());
                } else {
                    RnpPag1.checkDocumento.setSelected(true);
                    RnpPag1.otroDocumentoTxt.setSelectedItem(paciente.getTipoDocumentoxdni());
                }
                */
                
                
                
                RnpPag1.generoCombo.setSelectedItem(paciente.getGenero());
                RnpPag1.fnac.setDatoFecha(new SimpleDateFormat("dd-MM-yyyy").parse(cambiarFormatoFecha(paciente.getFechaNacimiento())));
                System.out.println("Fnac: "+paciente.getFechaNacimiento());
                System.out.println("F2: "+new SimpleDateFormat("dd-MM-yyyy").parse(paciente.getFechaNacimiento().replace("/", "-")));
                RnpPag1.telefonoTxt.setText(paciente.getTelefono());
                RnpPag1.telefonoOpcionalTxt.setText(paciente.getTelefonoOpcional());
                RnpPag1.correoTxt.setText(paciente.getCorreo());
                RnpPag1.nacionalidadTxt.setSelectedItem(paciente.getNacionalidad());
                RnpPag1.departamentoTxt.setSelectedItem(paciente.getDepartamento());
                RnpPag1.provinviaTxt.setSelectedItem(paciente.getProvincia());
                RnpPag1.distritoTxt.setSelectedItem(paciente.getDistrito());
                RnpPag1.txtDetalleTelefonoOpcional.setText(paciente.getDetalleOtroTelefono());
                

                //DATOS DE LA PAGINA 2 - INFO DE VULNErANIbilidad
                RnpPag2.condicionMigratoriaCombo.setSelectedItem(paciente.getCondicionMigratoria());
                //RnpPag2.grupoVulnerableCombo.setSelectedItem(paciente.getGrupoVulnerable());
                Pattern ptr = Pattern.compile(",");
                String[] strArray = ptr.split(paciente.getGrupoVulnerable());
                DefaultTableModel modelox = (DefaultTableModel) RnpPag2.tabla.getModel();
                modelox.setRowCount(0);
                for (int i = 0; i < strArray.length; i++) {
                    modelox.addRow(new Object[]{strArray[i]});
                }

                System.out.println("Imprimiendo pag2");
                RnpPag2.discapacidadTxt.setText(paciente.getDiscapacidad());
                RnpPag2.txtContactoRedSoporte.setText(paciente.getContactoRedSoporte());
                if (paciente.getRedSoporte().equalsIgnoreCase("no")) {
                    RnpPag2.redCheck.setSelected(false);
                } else {
                    RnpPag2.redCheck.setSelected(true);
                    RnpPag2.redSoporteTxt.setText(paciente.getNombreRedSoporte());
                    RnpPag2.totalSesionesTxt.setText(paciente.getTotalSesiones() + "");
                    RnpPag2.totalSesionesTxt.setEditable(false);
                }
                
               // System.out.println(paciente.toString());
                RnpPag2.txtIntegrantesGrupoFamiliar.setText(paciente.getCantidadGrupoFamiliar());
                if(paciente.getRbSeguro().equalsIgnoreCase("si")){
                    RnpPag2.rbSiSeguro.setSelected(true);
                }else if(paciente.getRbSeguro().equalsIgnoreCase("no")){
                     RnpPag2.rbNoSeguro.setSelected(true);
                }else{
                    RnpPag2.rbOtroSeguro.setSelected(true);
                    RnpPag2.txtOtroSeguro.setEnabled(true);
                    RnpPag2.txtOtroSeguro.setText(paciente.getTxtOtroSeguro());
                }
                
                RnpPag2.txtIngresoPeru.setText(paciente.getIngresoPeru());
                
                if(paciente.getRbTrabajo().equalsIgnoreCase("no")){
                    RnpPag2.rbNoTrabajo.setSelected(true);
                }else{
                    RnpPag2.rbSiTrabajo.setSelected(true);
                    RnpPag2.txtSiTrabajo.setEnabled(true);
                    RnpPag2.txtSiTrabajo.setText(paciente.getTxtTrabajo());
                }
                
                RnpPag2.comboNivelEducativo.setSelectedItem(paciente.getNivelEducativo());
                if(paciente.getNivelEducativo().equalsIgnoreCase("otro")){
                    RnpPag2.txtOtroNivelEducativo.setEnabled(true);
                    RnpPag2.txtOtroNivelEducativo.setText(paciente.getOtroNivelEducativo());
                }
                RnpPag2.txtOcupacion.setText(paciente.getOcupacion());
                RnpPag2.txtSubOcupacion.setText(paciente.getSubOcupacion());
                
                
                

                //DATOS DE LA PAGINA 3 - OBSERVACIONES
                RnpPag3.srqInicialBtn.setEnabled(false);
                RnpPag3.indiceInicialBtn.setEnabled(false);
                RnpPag3.resultadoSRQLabel.setText(paciente.getSrqIngreso());
                RnpPag3.acnurRadio.setEnabled(false);
                RnpPag3.pdafRadio.setEnabled(false);

                if (paciente.getProyecto().equalsIgnoreCase("acnur")) {
                    RnpPag3.acnurRadio.setSelected(true);
                } else {
                    RnpPag3.pdafRadio.setSelected(true);
                }
                RnpPag3.observacionesTxt.setText(paciente.getObservacion());
                RnpPag3.preocupacionTxt.setText(paciente.getMotivoConsulta());
                RnpPag3.accionesTxt.setText(paciente.getAcciones());
                

                //DATOS DE LA PAGINA 4
                actualizarResumen();
                RnpPag4.resumenLabel.setText(RnpPag4.resumenLabel.getText().toUpperCase());
                if (RnpPag4.modalidadCombo.getSelectedIndex() == 1) {
                    RnpPag4.derivadoCombo.setSelectedItem(paciente.getDetalleDerivado());
                    RnpPag4.modalidadCombo.setSelectedIndex(1);
                    RnpPag4.derivadoCombo.setVisible(true);
                } else {
                    RnpPag4.modalidadCombo.setSelectedIndex(0);
                    RnpPag4.derivadoCombo.setVisible(false);
                }

//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        paciente.setRegistros(
//                                (ArrayList) new RegistroPaciente().getRegistroxPaciente(paciente.getId()).clone());
//
//                        for (RegistroPaciente rp : paciente.getRegistros()) {
//                            if (rp.getAccionRP().contains("Lista de Espera")) {
//                                RnpPag4.rbListaEspera.setSelected(true);
//                                RnpPag4.terapeutaTxt.setVisible(false);
//                                RnpPag4.nombreTerapeutaTxt.setVisible(false);
//                                RnpPag4.fechaCitaTxt.setVisible(false);
//                                break;
//                            } else if (rp.getAccionRP().contains("Agregado a Cita con Terapeuta")) {
//                                RnpPag4.rbDerivarToTerapeuta.setSelected(true);
//                                RnpPag4.terapeutaTxt.setVisible(true);
//                                RnpPag4.nombreTerapeutaTxt.setVisible(true);
//                                RnpPag4.fechaCitaTxt.setVisible(false);
//                                new Thread(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        Usuario terapeuta = new Usuario().buscarUsuarioxID(rp.getIdUsuarioAsignado());
//                                        RnpPag4.terapeutaTxt.setText(terapeuta.getCodigo());
//                                        RnpPag4.nombreTerapeutaTxt.setText(terapeuta.getNombre());
//                                        try {
//                                            RnpPag4.fechaCitaTxt.setDatoFecha(new SimpleDateFormat("dd-MM-yyyy").parse(rp.getFechaAsignada().replace("-", "/")));
//                                        } catch (ParseException ex) {
//                                            Logger.getLogger(newPaciente.class.getName()).log(Level.SEVERE, null, ex);
//                                            JOptionPane.showMessageDialog(rootPane, ex);
//                                        }
//
//                                    }
//                                }).start();
//                                RnpPag4.finalizarBtn.setText("Actualizar Datos.");
//                                break;
//                            }
//                        }
//                    }
//                }).start();

            }
        } catch (ParseException ex) {
            Logger.getLogger(newPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(!tipo.equalsIgnoreCase("nuevo")){
           codigoPaciente = paciente.getCodigo(); 
        }
        
        verVertical();
    }

    private void cambiarPagina(int i) {
        pagina += i;
        actualizarResumen();
        switch (pagina) {
            case 1:
                new Thread(this::setValorBarra).start();
                siguienteBtn.setEnabled(true);
                atrasBtn.setEnabled(false);
                separador1.setForeground(new Color(0, 153, 0));
                separador2.setForeground(new Color(0, 153, 0));
                separador3.setForeground(new Color(0, 153, 0));
                separador4.setForeground(new Color(0, 153, 0));
                scrollContenido.setViewportView(RnpPag4);
                panelCoincidencia.setVisible(false);
                actualizarResumen();

                break;

            case 2:
                new Thread(this::setValorBarra).start();
                atrasBtn.setEnabled(true);
                siguienteBtn.setEnabled(true);
                separador1.setForeground(new Color(0, 153, 0));
                separador2.setForeground(new Color(0, 0, 0));
                separador3.setForeground(new Color(0, 0, 0));
                separador4.setForeground(new Color(0, 0, 0));
                scrollContenido.setViewportView(RnpPag1);
                if (tipo.equalsIgnoreCase("nuevo")) {
                    panelCoincidencia.setVisible(true);
                }

                break;

            case 3:
                new Thread(this::setValorBarra).start();
                siguienteBtn.setEnabled(true);
                atrasBtn.setEnabled(true);
                separador1.setForeground(new Color(0, 153, 0));
                separador2.setForeground(new Color(0, 153, 0));
                separador3.setForeground(new Color(0, 0, 0));
                separador4.setForeground(new Color(0, 0, 0));
                scrollContenido.setViewportView(RnpPag2);
                panelCoincidencia.setVisible(false);

                break;

            case 4:
                new Thread(this::setValorBarra).start();
                atrasBtn.setEnabled(true);
                siguienteBtn.setEnabled(false);
                separador1.setForeground(new Color(0, 153, 0));
                separador2.setForeground(new Color(0, 153, 0));
                separador3.setForeground(new Color(0, 153, 0));
                separador4.setForeground(new Color(0, 0, 0));
                scrollContenido.setViewportView(RnpPag3);
                panelCoincidencia.setVisible(false);
                break;
        }

        this.repaint();
    }

    private void setValorBarra() {

        int valor = 0;
        if (pagina == 1) {
            valor = 20;
        } else if (pagina == 2) {
            valor = 40;
        } else if (pagina == 3) {
            valor = 75;
        } else if (pagina == 4) {
            valor = 100;
        }

        if (valor > barra.getValue()) {
            for (int i = barra.getValue(); i <= valor; i++) {
                barra.setValue(i);
                esperar();
            }
        } else {
            for (int i = barra.getValue(); i >= valor; i--) {
                barra.setValue(i);
                esperar();
            }
        }
    }

    private void esperar() {
        try {
            Thread.sleep(15);
            barra.repaint();
            barra.revalidate();
        } catch (InterruptedException ex) {
            Logger.getLogger(newPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     private void esperar(int valor) {
        try {
            Thread.sleep(valor);
            barra.repaint();
            barra.revalidate();
        } catch (InterruptedException ex) {
            Logger.getLogger(newPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registrarPaciente() {
        String tipoDoc = "DNI";
        actualizarResumen();
        
        tipoDoc = RnpPag1.otroDocumentoTxt.getSelectedItem().toString().trim();
      
        String redSoporte = "No";
        String nombreRedSoporte = "";
        if (RnpPag2.redCheck.isSelected()) {
            redSoporte = "Si";
            nombreRedSoporte = RnpPag2.redSoporteTxt.getText();
        }

        int totalSesiones = Integer.parseInt(RnpPag2.totalSesionesTxt.getText());
        String proyecto = "ACNUR";
        if (RnpPag3.pdafRadio.isSelected()) {
            proyecto = "PDAF";
        }
        String fechaNacx = new SimpleDateFormat("yyyy-MM-dd").format(RnpPag1.fnac.getDatoFecha());

        String hoy = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String modalidad = RnpPag4.modalidadCombo.getSelectedItem().toString();
        String detalleDerivadox = RnpPag4.modalidadCombo.getSelectedIndex() > 0
                ? RnpPag4.derivadoCombo.getSelectedItem().toString()
                : "sin detalle";
        if (RnpPag4.modalidadCombo.getSelectedIndex() > 0) {

        }

        String grupoVulnerable = "";
        DefaultTableModel mod = (DefaultTableModel) RnpPag2.tabla.getModel();
        for (int i = 0; i < mod.getRowCount(); i++) {
            if (i == (mod.getRowCount() - 1)) {
                grupoVulnerable += RnpPag2.tabla.getValueAt(i, 0).toString();
            } else {
                grupoVulnerable += RnpPag2.tabla.getValueAt(i, 0).toString() + ",";
            }

        }
        
        String  cantidadGrupoFamiliar, rbSeguro, txtOtroSeguro, ingresoPeru, rbTrabajo, txtTrabajo, nivelEducativo,
        otroNivelEducativo, ocupacion,subOcupacion;
       
        cantidadGrupoFamiliar = RnpPag2.txtIntegrantesGrupoFamiliar.getText();
        
        rbSeguro = RnpPag2.rbSiSeguro.isSelected()
                ?"Si"
                : RnpPag2.rbNoSeguro.isSelected()
                ?"No"
                :"Otro";
        txtOtroSeguro = RnpPag2.txtOtroSeguro.getText();
        ingresoPeru=RnpPag2.txtIngresoPeru.getText();
        rbTrabajo = RnpPag2.rbNoTrabajo.isSelected()
                ? "No"
                :"Si";
        txtTrabajo = RnpPag2.txtSiTrabajo.getText();
        nivelEducativo = RnpPag2.comboNivelEducativo.getSelectedItem().toString();
        otroNivelEducativo = RnpPag2.txtOtroNivelEducativo.getText();
        ocupacion = RnpPag2.txtOcupacion.getText();
        subOcupacion=RnpPag2.txtSubOcupacion.getText();
        
        
        

        if (tipo.equalsIgnoreCase("nuevo")) {
            String nombreCompleto = RnpPag1.nombresTxt.getText() + " " + RnpPag1.apellidosTxt.getText();
            int idPacientex = new Paciente().newPaciente(RnpPag1.nombresTxt.getText(), RnpPag1.apellidosTxt.getText(), tipoDoc, RnpPag1.dniTxt.getText(),
                    RnpPag1.generoCombo.getSelectedItem().toString(), fechaNacx, totalSesiones, RnpPag1.telefonoTxt.getText(), RnpPag1.telefonoOpcionalTxt.getText(),
                    RnpPag1.correoTxt.getText(), RnpPag1.nacionalidadTxt.getSelectedItem().toString(), RnpPag2.condicionMigratoriaCombo.getSelectedItem().toString(),
                    RnpPag1.departamentoTxt.getSelectedItem().toString(), RnpPag1.provinviaTxt.getSelectedItem().toString(),
                    RnpPag1.distritoTxt.getSelectedItem().toString(), grupoVulnerable,
                    RnpPag2.discapacidadTxt.getText(), redSoporte, nombreRedSoporte,
                    resultadoSRQIngreso + "", RnpPag3.observacionesTxt.getText(), proyecto,
                    RnpPag3.preocupacionTxt.getText(), RnpPag3.accionesTxt.getText(), codigoPaciente, modalidad, detalleDerivadox,
                    RnpPag1.txtDetalleTelefonoOpcional.getText(),RnpPag2.txtContactoRedSoporte.getText(),
                    cantidadGrupoFamiliar, rbSeguro, txtOtroSeguro, ingresoPeru, rbTrabajo, txtTrabajo, nivelEducativo,
                    otroNivelEducativo, ocupacion,subOcupacion,terapeutaAsignado.getId(),index.getUser().getId());

            if (srq18.getIdsrq() >= 0) {
                int evsr = new SRQ18().newSRQ18(idPacientex, index.getUser().getId(), srq18.getLugar(),
                        srq18.getPuntajeSi(), "Inicial", srq18.getRespuestas(), srq18.getSumatoria(), srq18.getObservacionx());
                new RegistroPaciente().newRegistro(idPacientex, index.getUser().getId(), index.getUser().getId(), "Nuevo SRQ - Inicial",
                        srq18.getObservacionx(), hoy, "Activo");
            }
            if (indice.getId() >= 0) {
                indice.newIndice(idPacientex, index.getUser().getId(), indice.getObservacion(),
                        indice.getEstado(), indice.getQ1(), indice.getQ2(), indice.getQ3(),
                        indice.getQ4(), indice.getQ5());
                new RegistroPaciente().newRegistro(idPacientex, index.getUser().getId(), index.getUser().getId(), "Nuevo Indice Bienestar - Inicial",
                        indice.getObservacion(), hoy, "Activo");
            }

            new Thread(new Runnable() {
                @Override
                public void run() {
                    if (RnpPag4.rbListaEspera.isSelected()) {
                        new ListaEspera().insert(
                                idPacientex,
                                index.user.getId()
                        );
                        new RegistroPaciente().newRegistro(
                                idPacientex,
                                index.getUser().getId(),
                                index.getUser().getId(),
                                "Agregado a Lista de Espera",
                                RnpPag3.observacionesTxt.getText(),
                                hoy,
                                "Activo"
                        );
                    } else {
                        String fechaAsignadax = new SimpleDateFormat("yyyy-MM-dd").format(RnpPag4.fechaCitaTxt.getDatoFecha());
                        int idTerapeutaAsignado = Integer.parseInt(RnpPag4.terapeutaTxt.getText().substring(0, 2));

                        new RegistroPaciente().newRegistro(idPacientex, index.getUser().getId(), idTerapeutaAsignado, "Agregado a Cita con Terapeuta",
                                RnpPag3.observacionesTxt.getText(), fechaAsignadax, "Activo");
                        String datos = " Saludos, se le informa que se le ha asignado una cita con el paciente " + nombreCompleto + " para la fecha: " + fechaAsignadax;
                        new Mail().enviarCorreo(terapeutaAsignado.getCorreo(), "Cita Asignada", datos);
                    }

                }
            }).start();

            new rojerusan.RSNotifyFade("Registro Exitoso", "Se agrego correctamente el paciente.", 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
            pnp.resetearBusqueda();
            this.dispose();

        } else {
            int respuesta = paciente.updatePaciente(
                    paciente.getId(),
                    RnpPag1.nombresTxt.getText(),
                    RnpPag1.apellidosTxt.getText(),
                    tipoDoc,
                    RnpPag1.dniTxt.getText(),
                    RnpPag1.generoCombo.getSelectedItem().toString(),
                    fechaNacx,
                    totalSesiones,
                    RnpPag1.telefonoTxt.getText(),
                    RnpPag1.telefonoOpcionalTxt.getText(),
                    RnpPag1.correoTxt.getText(),
                    RnpPag1.nacionalidadTxt.getSelectedItem().toString(),
                    RnpPag2.condicionMigratoriaCombo.getSelectedItem().toString(),
                    RnpPag1.departamentoTxt.getSelectedItem().toString(),
                    RnpPag1.provinviaTxt.getSelectedItem().toString(),
                    RnpPag1.distritoTxt.getSelectedItem().toString(),
                    grupoVulnerable,
                    RnpPag2.discapacidadTxt.getText(),
                    redSoporte, nombreRedSoporte,
                    resultadoSRQIngreso + "",
                    RnpPag3.observacionesTxt.getText(),
                    proyecto,
                    RnpPag3.preocupacionTxt.getText(),
                    RnpPag3.accionesTxt.getText(),
                    codigoPaciente,
                    modalidad,
                    detalleDerivadox,
                    RnpPag1.txtDetalleTelefonoOpcional.getText(),
                    RnpPag2.txtContactoRedSoporte.getText(),
                    cantidadGrupoFamiliar,
                    rbSeguro,
                    txtOtroSeguro,
                    ingresoPeru,
                    rbTrabajo,
                    txtTrabajo,
                    nivelEducativo,
                    otroNivelEducativo,
                    ocupacion,
                    subOcupacion,
                    terapeutaAsignado.getId()
            );
            
            if (respuesta > 0) {
                new Thread(new Runnable() {
                @Override
                public void run() {
                    if (RnpPag4.rbListaEspera.isSelected()) {
                        new ListaEspera().insert(
                                paciente.getId(),
                                index.user.getId()
                        );
                        
                        new RegistroPaciente().newRegistro(
                                paciente.getId(),
                                index.getUser().getId(),
                                index.getUser().getId(),
                                "Agregado a Lista de Espera",
                                RnpPag3.observacionesTxt.getText(),
                                hoy, "Activo"
                        );
                    } else {
                        String fechaAsignadax = new SimpleDateFormat("yyyy-MM-dd").format(RnpPag4.fechaCitaTxt.getDatoFecha());
                        int idTerapeutaAsignado = Integer.parseInt(RnpPag4.terapeutaTxt.getText().substring(0, 2));

                        new RegistroPaciente().newRegistro(
                                paciente.getId(),
                                index.getUser().getId(),
                                idTerapeutaAsignado,
                                "Agregado a Cita con Terapeuta",
                                RnpPag3.observacionesTxt.getText(),
                                fechaAsignadax, "Activo"
                        );
                        String datos = " Saludos, se le informa que se le ha asignado una cita con el paciente " + paciente.getNombreCompleto() + " para la fecha: " + fechaAsignadax;
                        new Mail().enviarCorreo(terapeutaAsignado.getCorreo(), "Cita Asignada", datos);
                    }

                }
            }).start();
                new RegistroPaciente().newRegistro(paciente.getId(), index.getUser().getId(), index.getUser().getId(), "Actualización de Datos",
                        RnpPag3.observacionesTxt.getText(), hoy, "Activo");
                new rojerusan.RSNotifyFade(
                        "Actualización Exitosa",
                        "Datos actualizados correctamentes.",
                        5,
                        RSNotifyFade.PositionNotify.BottomRight,
                        RSNotifyFade.TypeNotify.SUCCESS
                ).setVisible(true);
                
                pnp.resetearBusqueda();
                this.dispose();
            } else {
                new rojerusan.RSNotifyFade("Oops. Algo Salió Mal", "No pudimos agregar el paciente , verifique la conexión de internet o contacte con el adm", 5,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);

            }
        }

    }

    public void setResultadoSRQ(SRQ18 srq) {
        srq18 = srq;
        resultadoSRQIngreso = srq18.getSumatoria();
        RnpPag3.setResultadoSRQ(resultadoSRQIngreso);
        if (srq18.getRespuestas().get(16).equalsIgnoreCase("si")) {
            RnpPag3.alertaIcon1.setVisible(true);
            RnpPag3.alertaMensaje1.setVisible(true);
        }
        if (srq18.getSumatoria() >= 9) {
            RnpPag3.alertaIcon2.setVisible(true);
            RnpPag3.alertaMensaje2.setVisible(true);
        }
    }

    public void setResultadoIndiceBienestar(IndiceBienestar indice) {
        this.indice = indice;
        //resultadoSRQIngreso = indice.getSumatoria();
        RnpPag3.resultadoIndiceLabel.setText(indice.getSumatoria() + "");
       // RnpPag3.btnVerIndice.setVisible(true);
        if (indice.getSumatoria() < 13) {
            RnpPag3.alertaIcon3.setVisible(true);
            RnpPag3.alertaMensaje3.setVisible(true);
        }
    }

    public String validarDatos() {
        String llave = "";
        llave += RnpPag1.validarCompleto() + RnpPag2.validar() + RnpPag3.validar() + RnpPag4.validar();
        return llave;
    }

    public void actualizarResumen() {
        String fnac = "2022/06/01";
        String hoy = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        String hoy2 = new SimpleDateFormat("yy-MM-dd").format(new Date());
        fnac = RnpPag1.fnac.getDatoFecha().toString().isEmpty()
                ? hoy
                : new SimpleDateFormat("dd-MM-yyyy").format(RnpPag1.fnac.getDatoFecha());
        String edad = new tools().obtenerEdad(fnac) + "";
        hoy2 = hoy2.replace("-", "");
        String name = RnpPag1.nombresTxt.getText().length() <= 1
                ? "(ingrese nombre)"
                : RnpPag1.nombresTxt.getText().substring(0, 2);

        String apellido = RnpPag1.apellidosTxt.getText().isEmpty()
                ? "(ingrese apellido)"
                : RnpPag1.apellidosTxt.getText().substring(0, 1);
        
        codigoPaciente = codigoPaciente.length()<1
                ?codigoPaciente = edad + hoy2 + " - " + name + apellido
                :codigoPaciente;
            
        
        
        codigoPaciente = codigoPaciente.toUpperCase();
/*
        if (tipo.equalsIgnoreCase("nuevo")) {
            codigoPaciente = edad + hoy2 + " - " + name + apellido;
            codigoPaciente = codigoPaciente.toUpperCase();
            RnpPag4.resumenLabel.setText("Código: " + codigoPaciente + "       Nombres: " + RnpPag1.nombresTxt.getText()
                    + "       Apellidos: " + RnpPag1.apellidosTxt.getText() + "       Edad: " + edad);
        } else if(tipo.equalsIgnoreCase("editar") && paciente.getCodigo().equalsIgnoreCase("vacio")){
            
        }
        */
        
        codigoPaciente = codigoPaciente.toUpperCase();
        System.out.println("Obteniendo Codigo: "+codigoPaciente);
    }

    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public static void setTerapeutaCita(Usuario terapeuta) {
        terapeutaAsignado = terapeuta;
    }

    public void actualizarCoincidencias() {
        String nombre = RnpPag1.nombresTxt.getText().isEmpty() ? "/" : RnpPag1.nombresTxt.getText().toLowerCase();
        String apellido = RnpPag1.apellidosTxt.getText().isEmpty() ? "/" : RnpPag1.apellidosTxt.getText().toLowerCase();
        String dni = RnpPag1.dniTxt.getText().isEmpty() ? "/" : RnpPag1.dniTxt.getText();
        String fnac = RnpPag1.fnac.getDatoFecha().toString().isEmpty() ? "/" : RnpPag1.fnac.getDatoFecha().toString();
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        for (Paciente paciente : pacientes) {
            if (paciente.getNombres().toLowerCase().contains(nombre) || paciente.getNombres().toLowerCase().equalsIgnoreCase(nombre)
                    || paciente.getNombreCompleto().toLowerCase().contains(nombre) || paciente.getNombreCompleto().toLowerCase().equalsIgnoreCase(nombre)
                    || paciente.getNombreCompleto().toLowerCase().contains(apellido) || paciente.getNombreCompleto().toLowerCase().equalsIgnoreCase(apellido)
                    || paciente.getDni().toLowerCase().contains(dni)
                    || paciente.getFechaNacimiento().equalsIgnoreCase(fnac)
                    || paciente.getApellidos().toLowerCase().contains(apellido)  || paciente.getApellidos().toLowerCase().equalsIgnoreCase(apellido)) {
                modelo.addRow(new Object[]{
                    "  "+paciente.getId(), paciente.getNombreCompleto().toUpperCase()
                });
            }
        }
    }
    
private void verVertical() {
        pp.removeAll();
        pp.add(RnpPag4);
        pp.add(RnpPag1);
        pp.add(RnpPag2);
        pp.add(RnpPag3);
                
      
        panelMenu.setVisible(false);
        scrollContenido.setViewportView(pp);

    }

    private void verHorizontal() {
        
        panelMenu.setVisible(true);
        scrollContenido.setViewportView(RnpPag4);
    }

}
