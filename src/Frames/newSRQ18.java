/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;


import Clases.Paciente;
import Clases.RegistroPaciente;
import Clases.SRQ18;
import Clases.ScrollSens;
import Panels.SRQ18Preguntas;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import rojeru_san.complementos.RSUtilities;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyFade;


public class newSRQ18 extends javax.swing.JFrame {

    SRQ18Preguntas preguntas; 
     int  total =0;
     Paciente paciente = new Paciente();
    String tipo="";
     static ArrayList<String> respuestas = new ArrayList();
    newPaciente ventanaAnterior;
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate fnac;
    LocalDate ahora = LocalDate.now();
    public SRQ18 mySRQ ;
    Index index;
    
    
    public newSRQ18() {
        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
         
        //max();
        changeIcon();
        scrollContenido.setViewportView(preguntas);
        ScrollSens ss = new ScrollSens(scrollContenido);
        preguntas = new SRQ18Preguntas(this);
    }
    
    public newSRQ18(Index index,Paciente paciente, String tipo) {
        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        //max();
        changeIcon();
        preguntas = new SRQ18Preguntas(this);
        scrollContenido.setViewportView(preguntas);
        ScrollSens ss = new ScrollSens(scrollContenido);
        this.paciente=paciente;
        this.tipo=tipo;
        this.index =index;
        fnac = LocalDate.parse(paciente.getFechaNacimiento(),fmt);
        Period periodo = Period.between(fnac, ahora);
        
        pacienteLabel.setText(paciente.getNombreCompleto());
        edadLabel.setText(periodo.getYears()+" Años");
        fechaLabel.setText(ahora+"");
        this.setTitle("Nueva Evaluación SRQ18( "+tipo+" ) para "+paciente.getNombreCompleto());
        generoLabel.setText(paciente.getGenero());
        lugarTxt.setText(paciente.getDepartamento()+", "+paciente.getProvincia()+", "+paciente.getDistrito());
        ini();
    }
    
    public newSRQ18(Index index,newPaciente pc,String nombrePaciente,String fechaNac,String tipo) {
        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        //max();
        changeIcon();
        preguntas = new SRQ18Preguntas(this);
        scrollContenido.setViewportView(preguntas);
        this.index =index;
        this.tipo=tipo;
        this.ventanaAnterior=pc;
        this.setTitle("Nueva Evaluación SRQ18( "+tipo+" ) para "+paciente.getNombreCompleto());
        ScrollSens ss = new ScrollSens(scrollContenido);
        
        fnac = LocalDate.parse(fechaNac,fmt);
        Period periodo = Period.between(fnac, ahora);
       
        pacienteLabel.setText(nombrePaciente);
        edadLabel.setText(periodo.getYears()+" Años");
        fechaLabel.setText(ahora+"");
        
        lugarTxt.setText(pc.RnpPag1.departamentoTxt.getSelectedItem().toString()+", "+pc.RnpPag1.provinviaTxt.getSelectedItem().toString()+", "+pc.RnpPag1.distritoTxt.getSelectedItem().toString());
        generoLabel.setText(paciente.getGenero());
        ini();
    }
    public newSRQ18(Index index,newPaciente pc,String nombrePaciente,String fechaNac,String tipo,SRQ18 srq18) {
        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        //max();
        changeIcon();
        this.tipo=tipo;
        this.index =index;
        this.ventanaAnterior=pc;
        this.setTitle("Nueva Evaluación SRQ18( "+tipo+" ) para "+paciente.getNombreCompleto());
        preguntas = new SRQ18Preguntas(this);
        mySRQ=srq18;
        if(!mySRQ.getRespuestas().isEmpty()){
            mySRQ.setRespuestas(srq18.getRespuestas());
            preguntas = new SRQ18Preguntas(mySRQ,this);
        }
        observacionTxt.setText(mySRQ.getObservacionx());
        scrollContenido.setViewportView(preguntas);
        ScrollSens ss = new ScrollSens(scrollContenido);
        
        
        fnac = LocalDate.parse(fechaNac,fmt);
        Period periodo = Period.between(fnac, ahora);
        
        pacienteLabel.setText(nombrePaciente);
        edadLabel.setText(periodo.getYears()+" Años");
        fechaLabel.setText(ahora+"");
        lugarTxt.setText(pc.RnpPag1.departamentoTxt.getSelectedItem().toString()+", "+pc.RnpPag1.provinviaTxt.getSelectedItem().toString()+", "+pc.RnpPag1.distritoTxt.getSelectedItem().toString());
        generoLabel.setText(paciente.getGenero());
        ini();
    }
public newSRQ18(Index index,Paciente paciente,SRQ18 srqx, String tipo) {
        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        //max();
        changeIcon();
        this.paciente=paciente;
        this.tipo=tipo;
        this.index =index;
        mySRQ=srqx;
        preguntas = new SRQ18Preguntas(mySRQ,this);
        preguntas = new SRQ18Preguntas(this);
        tituloLabel.setText("Visualización de Evaluación SRQ (No Editable)");
        scrollContenido.setViewportView(preguntas);
        ScrollSens ss = new ScrollSens(scrollContenido);
        fnac = LocalDate.parse(paciente.getFechaNacimiento(),fmt);
        Period periodo = Period.between(fnac, ahora);
        pacienteLabel.setText(paciente.getNombreCompleto());
        edadLabel.setText(periodo.getYears()+" Años");
        fechaLabel.setText(mySRQ.getFechaSrq());
        this.setTitle("Revisar Evaluación SRQ18 del Paciente: "+paciente.getNombreCompleto());
        //valorSiTxt.setText(mySRQ.getPuntajeSi()+"");
        totalPuntajeLabel.setText(mySRQ.getSumatoria()+"");
        lugarTxt.setText(mySRQ.getLugar());
        
        //valorSiTxt.setEditable(false);
        lugarTxt.setEditable(false);
        rSButtonRound1.setVisible(false);
        observacionTxt.setText(mySRQ.getObservacionx());
        observacionTxt.setEditable(false);
        lugarTxt.setText(paciente.getDepartamento()+", "+paciente.getProvincia()+", "+paciente.getDistrito());
        generoLabel.setText(paciente.getGenero());
        ini();
}
    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        fondoPanel = new javax.swing.JPanel();
        fechaLabel6 = new javax.swing.JLabel();
        rSButtonRound1 = new rojeru_san.rsbutton.RSButtonRound();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacionTxt = new javax.swing.JTextArea();
        fechaLabel8 = new javax.swing.JLabel();
        panelTitulo = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        scrollContenido = new javax.swing.JScrollPane();
        panelDetalle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pacienteLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edadLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lugarTxt = new rojeru_san.rsfield.RSTextFullRound();
        generoLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fechaLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechaLabel5 = new javax.swing.JLabel();
        fechaLabel7 = new javax.swing.JLabel();
        totalPuntajeLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaSRQ = new rojerusan.RSTableMetro();

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
        setResizable(false);

        fondoPanel.setBackground(new java.awt.Color(255, 255, 255));

        fechaLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fechaLabel6.setText("Marcar donde corresponda: ");

        rSButtonRound1.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonRound1.setText("Terminar SRQ");
        rSButtonRound1.setColorHover(new java.awt.Color(0, 102, 102));
        rSButtonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Instrucciones:");

        observacionTxt.setColumns(20);
        observacionTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        observacionTxt.setRows(2);
        observacionTxt.setTabSize(3);
        jScrollPane1.setViewportView(observacionTxt);

        fechaLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fechaLabel8.setText("   * Si usted ha tenido esa dificultad responda SI. ");

        panelTitulo.setBackground(new java.awt.Color(0, 102, 102));

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

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("Nueva evaluación SRQ18");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel7.setText("Valor de  respuestas \"SI\" = 1");

        panelDetalle.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Fecha:");

        fechaLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fechaLabel.setText("@fecha");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Paciente:");

        pacienteLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pacienteLabel.setText("@paciente");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Edad:");

        edadLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        edadLabel.setText("@edad");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Lugar:");

        lugarTxt.setForeground(new java.awt.Color(0, 0, 0));
        lugarTxt.setBorderColor(new java.awt.Color(102, 102, 102));
        lugarTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lugarTxt.setPhColor(new java.awt.Color(0, 0, 0));
        lugarTxt.setPlaceholder("");

        generoLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        generoLabel.setText("@genero");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("Genero:");

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(pacienteLabel)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(edadLabel)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addComponent(generoLabel))
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lugarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaLabel)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pacienteLabel)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edadLabel)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generoLabel))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lugarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        fechaLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fechaLabel3.setText("Las siguientes preguntas describen problemas que pueden haber estado molestándole en el último mes: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Observación:");

        fechaLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fechaLabel5.setText("   * Si  no se le ha presentado esa dificultad o problema en el último mes, responda NO.");

        fechaLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        fechaLabel7.setText("Sumatoria del Puntaje:");

        totalPuntajeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalPuntajeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPuntajeLabel.setText("@");

        tablaSRQ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Sumatoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            tablaSRQ.getColumnModel().getColumn(0).setMinWidth(70);
            tablaSRQ.getColumnModel().getColumn(0).setPreferredWidth(70);
            tablaSRQ.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1)
                        .addGap(49, 49, 49)
                        .addComponent(rSButtonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fechaLabel5)
                            .addComponent(fechaLabel3)
                            .addComponent(jLabel8)
                            .addComponent(fechaLabel8)
                            .addComponent(panelDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                        .addComponent(fechaLabel6)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(fechaLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPuntajeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(scrollContenido)))
                .addGap(22, 22, 22))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(fechaLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(fechaLabel5))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaLabel7)
                    .addComponent(totalPuntajeLabel))
                .addGap(18, 18, 18)
                .addComponent(scrollContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setContentAreaFilled(true);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setContentAreaFilled(false);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "¿Cerrar ventana?","Cerrar Ventana",JOptionPane.YES_NO_OPTION) == 0){
            this.dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rSButtonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound1ActionPerformed
        if(validar()){
            int valorSi = 1;//Integer.parseInt(valorSiTxt.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String hoy = sdf.format(new Date());
            String observacionx = observacionTxt.getText();
            if(tipo.equalsIgnoreCase("Inicial")){
                ArrayList<String> respuestas = new ArrayList();
                respuestas.add(preguntas.respuestas.get(0));respuestas.add(preguntas.respuestas.get(1));
                respuestas.add(preguntas.respuestas.get(2));respuestas.add(preguntas.respuestas.get(3));
                respuestas.add(preguntas.respuestas.get(4));respuestas.add(preguntas.respuestas.get(5));
                respuestas.add(preguntas.respuestas.get(6));respuestas.add(preguntas.respuestas.get(7));
                respuestas.add(preguntas.respuestas.get(8));respuestas.add(preguntas.respuestas.get(9));
                respuestas.add(preguntas.respuestas.get(10));respuestas.add(preguntas.respuestas.get(11));
                respuestas.add(preguntas.respuestas.get(12));respuestas.add(preguntas.respuestas.get(13));
                respuestas.add(preguntas.respuestas.get(14));respuestas.add(preguntas.respuestas.get(15));
                respuestas.add(preguntas.respuestas.get(16));respuestas.add(preguntas.respuestas.get(17));
                
                SRQ18 srq18x = new SRQ18(
                0,0,index.getUser().getId(),hoy,valorSi,lugarTxt.getText(),"Activo",tipo,respuestas,
                total,observacionx
                );
                srq18x.setRespuestas(respuestas);
                ventanaAnterior.setResultadoSRQ(srq18x);
                new rojerusan.RSNotifyFade("SRQ Inicial REGISRADO", "Los datos fueron registrados con éxito, Continue con el registro del pacienrte", 5,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    this.dispose();
            }else{
                int rsp = new SRQ18().newSRQ18(paciente.getId(),index.getUser().getId(), lugarTxt.getText(), valorSi, tipo, respuestas,total,observacionx);
            
            if(rsp>0){
                 int rsp2 = new RegistroPaciente().newRegistro(paciente.getId(), index.getUser().getId(), index.getUser().getId(), "Nuevo SRQ18 - "+tipo,
                        observacionTxt.getText(), index.fechaServidor, "Activo");
                if( rsp2>0){
                    new rojerusan.RSNotifyFade("SRQ REGISRADO", "Los datos fueron registrados con éxito", 5,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    this.dispose();
                }
            }else{
                new rojerusan.RSNotifyFade("UPS. Algo Salió Mal", "No hemos podido registrar la evaluación SRQ, intente nuevamente o contacte con el administrador", 5,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            }
            }
            
        }
    }//GEN-LAST:event_rSButtonRound1ActionPerformed

    private void tablaSRQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSRQMouseClicked
        int fila = tablaSRQ.getSelectedRow();
        if (evt.getClickCount() == 2 && fila >= 0) {
            int srqID = Integer.parseInt(tablaSRQ.getValueAt(fila, 0).toString());
            for (SRQ18 sr : paciente.getSrq18s()) {
                if (Float.compare(srqID, sr.getId()) == 0) {
                    new newSRQ18(index,paciente, sr, "ver").setVisible(true);
                }
            }

        }
    }//GEN-LAST:event_tablaSRQMouseClicked

       

        

    

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
            java.util.logging.Logger.getLogger(newSRQ18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newSRQ18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newSRQ18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newSRQ18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

                new newSRQ18().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel fechaLabel3;
    private javax.swing.JLabel fechaLabel5;
    private javax.swing.JLabel fechaLabel6;
    private javax.swing.JLabel fechaLabel7;
    private javax.swing.JLabel fechaLabel8;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private static rojeru_san.rsfield.RSTextFullRound lugarTxt;
    private javax.swing.JTextArea observacionTxt;
    private javax.swing.JLabel pacienteLabel;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelTitulo;
    private static rojeru_san.rsbutton.RSButtonRound rSButtonRound1;
    private javax.swing.JScrollPane scrollContenido;
    private rojerusan.RSTableMetro tablaSRQ;
    private javax.swing.JLabel tituloLabel;
    static javax.swing.JLabel totalPuntajeLabel;
    // End of variables declaration//GEN-END:variables

    public void max() {

        GraphicsEnvironment env
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

    }
   public  void Sumar(int preSuma){
       
       int valorSi = 1;
       /*
       if(!valorSiTxt.getText().isEmpty()){
           valorSi = Integer.parseInt(valorSiTxt.getText());
       }
       */
       
       total = preSuma*valorSi;
       totalPuntajeLabel.setText(total+"");
       
   }

    private boolean validar() {
        boolean llave=false;
        
        
        
        if(lugarTxt.getText().isEmpty()){
             new rojerusan.RSNotifyFade("Ingrese los datos del Lugar", "debe ingresar desde que Lugar se realiza la evaluación", 5,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
            
        }else{
            llave=true;
        }
        return llave;
    }
    
    public static void setRespuestas(ArrayList respuestasx){
        respuestas.clear();
        respuestas = (ArrayList) respuestasx.clone();
    }

    private void ini() {
       // this.setExtendedState(MAXIMIZED_BOTH);
        if(tipo.equalsIgnoreCase("inicial")){
            tablaSRQ.setVisible(false);
        }else{
             new Thread(new Runnable() {
            @Override
            public void run() {
                DefaultTableModel modeloSRQ = (DefaultTableModel) tablaSRQ.getModel();
                //Llenado Tabla de SRQ
                if (paciente.getSrq18s().isEmpty()) {
                    paciente.setSrq18s(new SRQ18().getSRQ18xPaciente(paciente.getId()));
                }
                for (SRQ18 srq : paciente.getSrq18s()) {
                    modeloSRQ.addRow(new Object[]{
                        srq.getId(), srq.getFechaSrq(), srq.getSumatoria()
                    });
                    
                }
               
            }
        }).start();
        }
        
    }

   
}
