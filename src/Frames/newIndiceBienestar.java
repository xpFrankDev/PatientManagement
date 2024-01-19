package Ventanas;

import Clases.IndiceBienestar;
import Clases.Paciente;
import Clases.PlaceHolder;
import Clases.RegistroPaciente;
import Clases.Usuario;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;

public class newIndiceBienestar extends javax.swing.JFrame {

    ArrayList<Integer> respuestas = new ArrayList();
    int sumatoria = 0;
    String error = "";
    Usuario terapeuta;
    Paciente paciente;
    String tipo;
    IndiceBienestar ib;
    newPaciente ventanaAnterior;
    Index index;
    public newIndiceBienestar() {
        initComponents();
        changeIcon();
        new PlaceHolder("Ingrese una observación si la requiere (campo opcional)", observacionTxt);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
    }

    public newIndiceBienestar(Index index,Paciente paciente, String tipo) {
        initComponents();
        changeIcon();
        new PlaceHolder("Ingrese una observación si la requiere (campo opcional)", observacionTxt);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        this.paciente = paciente;
        this.index =index;
        this.terapeuta = index.getUser();
        this.tipo = tipo;
        nombrePacienteLabel.setText(paciente.getNombreCompleto());
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
    }
    public newIndiceBienestar(Index index,Paciente paciente, String tipo,newPaciente np,IndiceBienestar ib) {
        initComponents();
        changeIcon();
        new PlaceHolder("Ingrese una observación si la requiere (campo opcional)", observacionTxt);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        this.paciente = paciente;
        this.terapeuta = index.getUser();
        this.tipo = tipo;
        this.ib=ib;
        this.index =index;
        this.ventanaAnterior=np;
        nombrePacienteLabel.setText(paciente.getNombreCompleto());
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        llenarIndice();
    }
public newIndiceBienestar(Index index,Paciente paciente, Usuario terapeuta, IndiceBienestar ib) {
        initComponents();
        changeIcon();
        new PlaceHolder("Ingrese una observación si la requiere (campo opcional)", observacionTxt);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        this.index =index;
        this.paciente = paciente;
        this.terapeuta = terapeuta;
        this.tipo = tipo;
        this.ib=ib;
        nombrePacienteLabel.setText(paciente.getNombreCompleto());
        registrarBtn.setVisible(false);
        observacionTxt.setEditable(false);
        llenarIndice();
    }
public newIndiceBienestar(Index index,Paciente paciente,IndiceBienestar ib) {
        initComponents();
        changeIcon();
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        respuestas.add(0);
        this.ib=ib;
        this.paciente=paciente;
        nombrePacienteLabel.setText(paciente.getNombreCompleto());
        registrarBtn.setVisible(false);
        observacionTxt.setEditable(false);
        llenarIndice();
    }
    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        grupo2 = new javax.swing.ButtonGroup();
        grupo3 = new javax.swing.ButtonGroup();
        grupo4 = new javax.swing.ButtonGroup();
        grupo5 = new javax.swing.ButtonGroup();
        panelCentral = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        p1Radio4 = new javax.swing.JRadioButton();
        p2Radio4 = new javax.swing.JRadioButton();
        p3Radio4 = new javax.swing.JRadioButton();
        p4Radio4 = new javax.swing.JRadioButton();
        p5Radio4 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        p1Radio3 = new javax.swing.JRadioButton();
        p2Radio3 = new javax.swing.JRadioButton();
        p3Radio3 = new javax.swing.JRadioButton();
        p4Radio3 = new javax.swing.JRadioButton();
        p5Radio3 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        p1Radio2 = new javax.swing.JRadioButton();
        p2Radio2 = new javax.swing.JRadioButton();
        p3Radio2 = new javax.swing.JRadioButton();
        p4Radio2 = new javax.swing.JRadioButton();
        p5Radio2 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        p1Radio1 = new javax.swing.JRadioButton();
        p2Radio1 = new javax.swing.JRadioButton();
        p3Radio1 = new javax.swing.JRadioButton();
        p4Radio1 = new javax.swing.JRadioButton();
        p5Radio1 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        p1Radio0 = new javax.swing.JRadioButton();
        p2Radio0 = new javax.swing.JRadioButton();
        p3Radio0 = new javax.swing.JRadioButton();
        p4Radio0 = new javax.swing.JRadioButton();
        p5Radio0 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        nombrePacienteLabel = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        p1Radio5 = new javax.swing.JRadioButton();
        p2Radio5 = new javax.swing.JRadioButton();
        p3Radio5 = new javax.swing.JRadioButton();
        p4Radio5 = new javax.swing.JRadioButton();
        p5Radio5 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacionTxt = new javax.swing.JTextArea();
        registrarBtn = new rojeru_san.rsbutton.RSButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OMS (cinco) Índice de Bienestar (versión 1998)");
        setResizable(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));

        panelSuperior.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nueva Evaluación de Indice de Bienestar");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelContenido.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Durante las últimas dos semanas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(715, 715, 715))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("1. Me he sentido alegre y de buen humor");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("5. Mi vida cotidiana ha estado llena de");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("2. Me he sentido tranquilo y relajado");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("3. Me he sentido activo y enérgico");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("4. Me he despertado fresco y descansado");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("    cosas que me interesan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addGap(34, 34, 34)
                .addComponent(jLabel16)
                .addGap(34, 34, 34)
                .addComponent(jLabel17)
                .addGap(34, 34, 34)
                .addComponent(jLabel19)
                .addGap(34, 34, 34)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("La Mayor parte");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("del tiempo");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("(4)");

        p1Radio4.setBackground(new java.awt.Color(255, 255, 255));
        grupo1.add(p1Radio4);
        p1Radio4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p1Radio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1Radio4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p1Radio4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p1Radio4StateChanged(evt);
            }
        });
        p1Radio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1Radio4ActionPerformed(evt);
            }
        });

        p2Radio4.setBackground(new java.awt.Color(255, 255, 255));
        grupo2.add(p2Radio4);
        p2Radio4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p2Radio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2Radio4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p2Radio4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p2Radio4StateChanged(evt);
            }
        });
        p2Radio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2Radio4ActionPerformed(evt);
            }
        });

        p3Radio4.setBackground(new java.awt.Color(255, 255, 255));
        grupo3.add(p3Radio4);
        p3Radio4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p3Radio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3Radio4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p3Radio4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p3Radio4StateChanged(evt);
            }
        });
        p3Radio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3Radio4ActionPerformed(evt);
            }
        });

        p4Radio4.setBackground(new java.awt.Color(255, 255, 255));
        grupo4.add(p4Radio4);
        p4Radio4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p4Radio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4Radio4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p4Radio4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p4Radio4StateChanged(evt);
            }
        });
        p4Radio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4Radio4ActionPerformed(evt);
            }
        });

        p5Radio4.setBackground(new java.awt.Color(255, 255, 255));
        grupo5.add(p5Radio4);
        p5Radio4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5Radio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5Radio4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p5Radio4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p5Radio4StateChanged(evt);
            }
        });
        p5Radio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5Radio4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p1Radio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2Radio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p3Radio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p4Radio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p5Radio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1Radio4)
                .addGap(26, 26, 26)
                .addComponent(p2Radio4)
                .addGap(36, 36, 36)
                .addComponent(p3Radio4)
                .addGap(32, 32, 32)
                .addComponent(p4Radio4)
                .addGap(41, 41, 41)
                .addComponent(p5Radio4)
                .addGap(107, 107, 107))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Más de la mitad ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("del tiempo");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("(3)");

        p1Radio3.setBackground(new java.awt.Color(255, 255, 255));
        grupo1.add(p1Radio3);
        p1Radio3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p1Radio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1Radio3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p1Radio3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p1Radio3StateChanged(evt);
            }
        });
        p1Radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1Radio3ActionPerformed(evt);
            }
        });

        p2Radio3.setBackground(new java.awt.Color(255, 255, 255));
        grupo2.add(p2Radio3);
        p2Radio3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p2Radio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2Radio3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p2Radio3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p2Radio3StateChanged(evt);
            }
        });
        p2Radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2Radio3ActionPerformed(evt);
            }
        });

        p3Radio3.setBackground(new java.awt.Color(255, 255, 255));
        grupo3.add(p3Radio3);
        p3Radio3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p3Radio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3Radio3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p3Radio3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p3Radio3StateChanged(evt);
            }
        });
        p3Radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3Radio3ActionPerformed(evt);
            }
        });

        p4Radio3.setBackground(new java.awt.Color(255, 255, 255));
        grupo4.add(p4Radio3);
        p4Radio3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p4Radio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4Radio3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p4Radio3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p4Radio3StateChanged(evt);
            }
        });
        p4Radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4Radio3ActionPerformed(evt);
            }
        });

        p5Radio3.setBackground(new java.awt.Color(255, 255, 255));
        grupo5.add(p5Radio3);
        p5Radio3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5Radio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5Radio3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p5Radio3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p5Radio3StateChanged(evt);
            }
        });
        p5Radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5Radio3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p1Radio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2Radio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p3Radio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p4Radio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p5Radio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1Radio3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p2Radio3)
                .addGap(36, 36, 36)
                .addComponent(p3Radio3)
                .addGap(32, 32, 32)
                .addComponent(p4Radio3)
                .addGap(41, 41, 41)
                .addComponent(p5Radio3)
                .addGap(108, 108, 108))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Menos de la mitad");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("del tiempo");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("(2)");

        p1Radio2.setBackground(new java.awt.Color(255, 255, 255));
        grupo1.add(p1Radio2);
        p1Radio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p1Radio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1Radio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p1Radio2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p1Radio2StateChanged(evt);
            }
        });
        p1Radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1Radio2ActionPerformed(evt);
            }
        });

        p2Radio2.setBackground(new java.awt.Color(255, 255, 255));
        grupo2.add(p2Radio2);
        p2Radio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p2Radio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2Radio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p2Radio2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p2Radio2StateChanged(evt);
            }
        });
        p2Radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2Radio2ActionPerformed(evt);
            }
        });

        p3Radio2.setBackground(new java.awt.Color(255, 255, 255));
        grupo3.add(p3Radio2);
        p3Radio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p3Radio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3Radio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p3Radio2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p3Radio2StateChanged(evt);
            }
        });
        p3Radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3Radio2ActionPerformed(evt);
            }
        });

        p4Radio2.setBackground(new java.awt.Color(255, 255, 255));
        grupo4.add(p4Radio2);
        p4Radio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p4Radio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4Radio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p4Radio2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p4Radio2StateChanged(evt);
            }
        });
        p4Radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4Radio2ActionPerformed(evt);
            }
        });

        p5Radio2.setBackground(new java.awt.Color(255, 255, 255));
        grupo5.add(p5Radio2);
        p5Radio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5Radio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5Radio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p5Radio2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p5Radio2StateChanged(evt);
            }
        });
        p5Radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5Radio2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1Radio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2Radio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p3Radio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p4Radio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p5Radio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1Radio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p2Radio2)
                .addGap(35, 35, 35)
                .addComponent(p3Radio2)
                .addGap(34, 34, 34)
                .addComponent(p4Radio2)
                .addGap(41, 41, 41)
                .addComponent(p5Radio2)
                .addGap(108, 108, 108))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("De vez ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("en cuando");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("(1)");

        p1Radio1.setBackground(new java.awt.Color(255, 255, 255));
        grupo1.add(p1Radio1);
        p1Radio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p1Radio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1Radio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p1Radio1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p1Radio1StateChanged(evt);
            }
        });
        p1Radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1Radio1ActionPerformed(evt);
            }
        });

        p2Radio1.setBackground(new java.awt.Color(255, 255, 255));
        grupo2.add(p2Radio1);
        p2Radio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p2Radio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2Radio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p2Radio1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p2Radio1StateChanged(evt);
            }
        });
        p2Radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2Radio1ActionPerformed(evt);
            }
        });

        p3Radio1.setBackground(new java.awt.Color(255, 255, 255));
        grupo3.add(p3Radio1);
        p3Radio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p3Radio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3Radio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p3Radio1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p3Radio1StateChanged(evt);
            }
        });
        p3Radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3Radio1ActionPerformed(evt);
            }
        });

        p4Radio1.setBackground(new java.awt.Color(255, 255, 255));
        grupo4.add(p4Radio1);
        p4Radio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p4Radio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4Radio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p4Radio1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p4Radio1StateChanged(evt);
            }
        });
        p4Radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4Radio1ActionPerformed(evt);
            }
        });

        p5Radio1.setBackground(new java.awt.Color(255, 255, 255));
        grupo5.add(p5Radio1);
        p5Radio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5Radio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5Radio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p5Radio1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p5Radio1StateChanged(evt);
            }
        });
        p5Radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5Radio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p5Radio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p4Radio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p3Radio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2Radio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p1Radio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1Radio1)
                .addGap(26, 26, 26)
                .addComponent(p2Radio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p3Radio1)
                .addGap(35, 35, 35)
                .addComponent(p4Radio1)
                .addGap(37, 37, 37)
                .addComponent(p5Radio1)
                .addGap(111, 111, 111))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nunca");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("(0)");

        p1Radio0.setBackground(new java.awt.Color(255, 255, 255));
        grupo1.add(p1Radio0);
        p1Radio0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p1Radio0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1Radio0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p1Radio0.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p1Radio0StateChanged(evt);
            }
        });
        p1Radio0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1Radio0ActionPerformed(evt);
            }
        });

        p2Radio0.setBackground(new java.awt.Color(255, 255, 255));
        grupo2.add(p2Radio0);
        p2Radio0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p2Radio0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2Radio0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p2Radio0.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p2Radio0StateChanged(evt);
            }
        });
        p2Radio0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2Radio0ActionPerformed(evt);
            }
        });

        p3Radio0.setBackground(new java.awt.Color(255, 255, 255));
        grupo3.add(p3Radio0);
        p3Radio0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p3Radio0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3Radio0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p3Radio0.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p3Radio0StateChanged(evt);
            }
        });
        p3Radio0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3Radio0ActionPerformed(evt);
            }
        });

        p4Radio0.setBackground(new java.awt.Color(255, 255, 255));
        grupo4.add(p4Radio0);
        p4Radio0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p4Radio0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4Radio0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p4Radio0.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p4Radio0StateChanged(evt);
            }
        });
        p4Radio0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4Radio0ActionPerformed(evt);
            }
        });

        p5Radio0.setBackground(new java.awt.Color(255, 255, 255));
        grupo5.add(p5Radio0);
        p5Radio0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5Radio0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5Radio0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p5Radio0.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p5Radio0StateChanged(evt);
            }
        });
        p5Radio0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5Radio0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p5Radio0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p4Radio0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p3Radio0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2Radio0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p1Radio0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1Radio0)
                .addGap(26, 26, 26)
                .addComponent(p2Radio0)
                .addGap(37, 37, 37)
                .addComponent(p3Radio0)
                .addGap(36, 36, 36)
                .addComponent(p4Radio0)
                .addGap(37, 37, 37)
                .addComponent(p5Radio0)
                .addGap(112, 112, 112))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setTabSize(1);
        jTextArea1.setText("Por favor, indique para cada una de las cinco afirmaciones cómo se ha sentido durante las últimas dos semanas. Observe que puntuaciones mayores significan mayor bienestar. Ejemplo: Si se ha sentido alegre y de buen humor más de la mitad del tiempo durante las últimas dos semanas, seleccione el circulo número 3 en la esquina superior derecha.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextArea1.setMinimumSize(new java.awt.Dimension(5, 24));
        jScrollPane2.setViewportView(jTextArea1);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Paciente:");

        nombrePacienteLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombrePacienteLabel.setText("jLabel22");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Encargado de la Evaluación:");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("@");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombrePacienteLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(nombrePacienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Todo");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("el Tiempo");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("(5)");

        p1Radio5.setBackground(new java.awt.Color(255, 255, 255));
        grupo1.add(p1Radio5);
        p1Radio5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p1Radio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1Radio5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p1Radio5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p1Radio5StateChanged(evt);
            }
        });
        p1Radio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1Radio5ActionPerformed(evt);
            }
        });

        p2Radio5.setBackground(new java.awt.Color(255, 255, 255));
        grupo2.add(p2Radio5);
        p2Radio5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p2Radio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2Radio5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p2Radio5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p2Radio5StateChanged(evt);
            }
        });
        p2Radio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2Radio5ActionPerformed(evt);
            }
        });

        p3Radio5.setBackground(new java.awt.Color(255, 255, 255));
        grupo3.add(p3Radio5);
        p3Radio5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p3Radio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3Radio5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p3Radio5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p3Radio5StateChanged(evt);
            }
        });
        p3Radio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3Radio5ActionPerformed(evt);
            }
        });

        p4Radio5.setBackground(new java.awt.Color(255, 255, 255));
        grupo4.add(p4Radio5);
        p4Radio5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p4Radio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4Radio5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p4Radio5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p4Radio5StateChanged(evt);
            }
        });
        p4Radio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4Radio5ActionPerformed(evt);
            }
        });

        p5Radio5.setBackground(new java.awt.Color(255, 255, 255));
        grupo5.add(p5Radio5);
        p5Radio5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5Radio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5Radio5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p5Radio5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                p5Radio5StateChanged(evt);
            }
        });
        p5Radio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5Radio5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p1Radio5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2Radio5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p3Radio5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p5Radio5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p4Radio5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1Radio5)
                .addGap(26, 26, 26)
                .addComponent(p2Radio5)
                .addGap(36, 36, 36)
                .addComponent(p3Radio5)
                .addGap(33, 33, 33)
                .addComponent(p4Radio5)
                .addGap(37, 37, 37)
                .addComponent(p5Radio5)
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Observación:");

        observacionTxt.setColumns(20);
        observacionTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        observacionTxt.setLineWrap(true);
        observacionTxt.setRows(2);
        jScrollPane1.setViewportView(observacionTxt);

        registrarBtn.setText("Registrar Datos");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(31, 31, 31)
                .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void p1Radio0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1Radio0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1Radio0ActionPerformed

    private void p1Radio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1Radio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1Radio5ActionPerformed

    private void p1Radio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1Radio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1Radio4ActionPerformed

    private void p1Radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1Radio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1Radio3ActionPerformed

    private void p1Radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1Radio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1Radio2ActionPerformed

    private void p1Radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1Radio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1Radio1ActionPerformed

    private void p2Radio0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2Radio0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2Radio0ActionPerformed

    private void p2Radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2Radio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2Radio1ActionPerformed

    private void p2Radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2Radio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2Radio2ActionPerformed

    private void p2Radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2Radio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2Radio3ActionPerformed

    private void p2Radio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2Radio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2Radio4ActionPerformed

    private void p2Radio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2Radio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2Radio5ActionPerformed

    private void p3Radio0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3Radio0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3Radio0ActionPerformed

    private void p3Radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3Radio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3Radio1ActionPerformed

    private void p3Radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3Radio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3Radio2ActionPerformed

    private void p3Radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3Radio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3Radio3ActionPerformed

    private void p3Radio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3Radio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3Radio4ActionPerformed

    private void p3Radio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3Radio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3Radio5ActionPerformed

    private void p4Radio0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4Radio0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4Radio0ActionPerformed

    private void p4Radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4Radio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4Radio1ActionPerformed

    private void p4Radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4Radio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4Radio2ActionPerformed

    private void p4Radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4Radio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4Radio3ActionPerformed

    private void p4Radio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4Radio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4Radio4ActionPerformed

    private void p4Radio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4Radio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4Radio5ActionPerformed

    private void p5Radio0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5Radio0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5Radio0ActionPerformed

    private void p5Radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5Radio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5Radio1ActionPerformed

    private void p5Radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5Radio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5Radio2ActionPerformed

    private void p5Radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5Radio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5Radio3ActionPerformed

    private void p5Radio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5Radio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5Radio4ActionPerformed

    private void p5Radio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5Radio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5Radio5ActionPerformed

    private void p1Radio5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p1Radio5StateChanged
        if (p1Radio5.isSelected() == true) {
            respuestas.set(0, 5);
        }
    }//GEN-LAST:event_p1Radio5StateChanged

    private void p1Radio4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p1Radio4StateChanged
        if (p1Radio4.isSelected() == true) {
            respuestas.set(0, 4);
        }
    }//GEN-LAST:event_p1Radio4StateChanged

    private void p1Radio3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p1Radio3StateChanged
        if (p1Radio3.isSelected() == true) {
            respuestas.set(0, 3);
        }
    }//GEN-LAST:event_p1Radio3StateChanged

    private void p1Radio2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p1Radio2StateChanged
        if (p1Radio2.isSelected() == true) {
            respuestas.set(0, 2);
        }
    }//GEN-LAST:event_p1Radio2StateChanged

    private void p1Radio1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p1Radio1StateChanged
        if (p1Radio1.isSelected() == true) {
            respuestas.set(0, 1);
        }
    }//GEN-LAST:event_p1Radio1StateChanged

    private void p1Radio0StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p1Radio0StateChanged
        if (p1Radio0.isSelected() == true) {
            respuestas.set(0, 0);
        }
    }//GEN-LAST:event_p1Radio0StateChanged

    private void p2Radio5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p2Radio5StateChanged
        if (p2Radio5.isSelected() == true) {
            respuestas.set(1, 5);
        }
    }//GEN-LAST:event_p2Radio5StateChanged

    private void p2Radio4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p2Radio4StateChanged
        if (p2Radio4.isSelected() == true) {
            respuestas.set(1, 4);
        }
    }//GEN-LAST:event_p2Radio4StateChanged

    private void p2Radio3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p2Radio3StateChanged
        if (p2Radio3.isSelected() == true) {
            respuestas.set(1, 3);
        }
    }//GEN-LAST:event_p2Radio3StateChanged

    private void p2Radio2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p2Radio2StateChanged
        if (p2Radio2.isSelected() == true) {
            respuestas.set(1, 2);
        }
    }//GEN-LAST:event_p2Radio2StateChanged

    private void p2Radio1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p2Radio1StateChanged
        if (p2Radio1.isSelected() == true) {
            respuestas.set(1, 1);
        }
    }//GEN-LAST:event_p2Radio1StateChanged

    private void p2Radio0StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p2Radio0StateChanged
        if (p2Radio0.isSelected() == true) {
            respuestas.set(1, 0);
        }
    }//GEN-LAST:event_p2Radio0StateChanged

    private void p3Radio5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p3Radio5StateChanged
        if (p3Radio5.isSelected() == true) {
            respuestas.set(2, 5);
        }
    }//GEN-LAST:event_p3Radio5StateChanged

    private void p3Radio4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p3Radio4StateChanged
        if (p3Radio4.isSelected() == true) {
            respuestas.set(2, 4);
        }
    }//GEN-LAST:event_p3Radio4StateChanged

    private void p3Radio3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p3Radio3StateChanged
        if (p3Radio3.isSelected() == true) {
            respuestas.set(2, 3);
        }
    }//GEN-LAST:event_p3Radio3StateChanged

    private void p3Radio2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p3Radio2StateChanged
        if (p3Radio2.isSelected() == true) {
            respuestas.set(2, 2);
        }
    }//GEN-LAST:event_p3Radio2StateChanged

    private void p3Radio1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p3Radio1StateChanged
        if (p3Radio1.isSelected() == true) {
            respuestas.set(2, 1);
        }
    }//GEN-LAST:event_p3Radio1StateChanged

    private void p3Radio0StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p3Radio0StateChanged
        if (p3Radio0.isSelected() == true) {
            respuestas.set(2, 0);
        }
    }//GEN-LAST:event_p3Radio0StateChanged

    private void p4Radio5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p4Radio5StateChanged
        if (p4Radio5.isSelected() == true) {
            respuestas.set(3, 5);
        }
    }//GEN-LAST:event_p4Radio5StateChanged

    private void p4Radio4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p4Radio4StateChanged
        if (p4Radio4.isSelected() == true) {
            respuestas.set(3, 4);
        }
    }//GEN-LAST:event_p4Radio4StateChanged

    private void p4Radio3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p4Radio3StateChanged
        if (p4Radio3.isSelected() == true) {
            respuestas.set(3, 3);
        }
    }//GEN-LAST:event_p4Radio3StateChanged

    private void p4Radio2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p4Radio2StateChanged
        if (p4Radio2.isSelected() == true) {
            respuestas.set(3, 2);
        }
    }//GEN-LAST:event_p4Radio2StateChanged

    private void p4Radio1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p4Radio1StateChanged
        if (p4Radio1.isSelected() == true) {
            respuestas.set(3, 1);
        }
    }//GEN-LAST:event_p4Radio1StateChanged

    private void p4Radio0StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p4Radio0StateChanged
        if (p4Radio0.isSelected() == true) {
            respuestas.set(3, 0);
        }
    }//GEN-LAST:event_p4Radio0StateChanged

    private void p5Radio5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p5Radio5StateChanged
        if (p5Radio5.isSelected() == true) {
            respuestas.set(4, 5);
        }
    }//GEN-LAST:event_p5Radio5StateChanged

    private void p5Radio4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p5Radio4StateChanged
        if (p5Radio4.isSelected() == true) {
            respuestas.set(4, 4);
        }
    }//GEN-LAST:event_p5Radio4StateChanged

    private void p5Radio3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p5Radio3StateChanged
        if (p5Radio3.isSelected() == true) {
            respuestas.set(4, 3);
        }
    }//GEN-LAST:event_p5Radio3StateChanged

    private void p5Radio2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p5Radio2StateChanged
        if (p5Radio2.isSelected() == true) {
            respuestas.set(4, 2);
        }
    }//GEN-LAST:event_p5Radio2StateChanged

    private void p5Radio1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p5Radio1StateChanged
        if (p5Radio1.isSelected() == true) {
            respuestas.set(4, 1);
        }
    }//GEN-LAST:event_p5Radio1StateChanged

    private void p5Radio0StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_p5Radio0StateChanged
        if (p5Radio0.isSelected() == true) {
            respuestas.set(4, 0);
        }
    }//GEN-LAST:event_p5Radio0StateChanged

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
        error = "";
        sumar();
        if (validarCampos()) {
             String obs = observacionTxt.getText();
            if(tipo.equalsIgnoreCase("inicial")){
                IndiceBienestar indice = new IndiceBienestar(
                0,0,0,"19",obs,"Activo",((respuestas.get(0)+respuestas.get(1)+respuestas.get(2)+respuestas.get(3)+respuestas.get(4))),
                        respuestas.get(0),respuestas.get(1),respuestas.get(2),respuestas.get(3),respuestas.get(4)
                );
                ventanaAnterior.setResultadoIndiceBienestar(indice);
                new rojerusan.RSNotifyFade("Registro Indice Inicial", "Se tomaron los datos con éxito del Indice de Bienestar.", 5,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                        dispose();
            }else{
            int respuesta = new IndiceBienestar().newIndice(paciente.getId(), index.getUser().getId(),
                    obs, "Activo", respuestas.get(0), respuestas.get(1), respuestas.get(2),
                    respuestas.get(3), respuestas.get(4));
            if (respuesta > 0) {
                
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int rsp2 = new RegistroPaciente().newRegistro(paciente.getId(), index.getUser().getId(), index.getUser().getId(), "Nuevo Indice Bienestar - " + tipo,
                        observacionTxt.getText(), index.fechaServidor, "Activo");
                        
                        new rojerusan.RSNotifyFade("Registro Exitoso", "Indice de Bienestar registrado correctamente.", 5,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                        dispose();
                    }
                }).start();
            }
            }
            
            
           
            

        } else {
            JOptionPane.showMessageDialog(panelContenido, "Hay respuestas sin responder, complete las faltantes para terminar:\n" + error);
        }
    }//GEN-LAST:event_registrarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(newIndiceBienestar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newIndiceBienestar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newIndiceBienestar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newIndiceBienestar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newIndiceBienestar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.ButtonGroup grupo2;
    private javax.swing.ButtonGroup grupo3;
    private javax.swing.ButtonGroup grupo4;
    private javax.swing.ButtonGroup grupo5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nombrePacienteLabel;
    private javax.swing.JTextArea observacionTxt;
    private javax.swing.JRadioButton p1Radio0;
    private javax.swing.JRadioButton p1Radio1;
    private javax.swing.JRadioButton p1Radio2;
    private javax.swing.JRadioButton p1Radio3;
    private javax.swing.JRadioButton p1Radio4;
    private javax.swing.JRadioButton p1Radio5;
    private javax.swing.JRadioButton p2Radio0;
    private javax.swing.JRadioButton p2Radio1;
    private javax.swing.JRadioButton p2Radio2;
    private javax.swing.JRadioButton p2Radio3;
    private javax.swing.JRadioButton p2Radio4;
    private javax.swing.JRadioButton p2Radio5;
    private javax.swing.JRadioButton p3Radio0;
    private javax.swing.JRadioButton p3Radio1;
    private javax.swing.JRadioButton p3Radio2;
    private javax.swing.JRadioButton p3Radio3;
    private javax.swing.JRadioButton p3Radio4;
    private javax.swing.JRadioButton p3Radio5;
    private javax.swing.JRadioButton p4Radio0;
    private javax.swing.JRadioButton p4Radio1;
    private javax.swing.JRadioButton p4Radio2;
    private javax.swing.JRadioButton p4Radio3;
    private javax.swing.JRadioButton p4Radio4;
    private javax.swing.JRadioButton p4Radio5;
    private javax.swing.JRadioButton p5Radio0;
    private javax.swing.JRadioButton p5Radio1;
    private javax.swing.JRadioButton p5Radio2;
    private javax.swing.JRadioButton p5Radio3;
    private javax.swing.JRadioButton p5Radio4;
    private javax.swing.JRadioButton p5Radio5;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelSuperior;
    private rojeru_san.rsbutton.RSButtonRound registrarBtn;
    // End of variables declaration//GEN-END:variables

    public String validarPregunta1() {

        if (p1Radio5.isSelected() || p1Radio4.isSelected() || p1Radio3.isSelected()
                || p1Radio2.isSelected() || p1Radio1.isSelected() || p1Radio0.isSelected()) {
            return "";
        } else {
            error += "Pregunta #1 no ha sido respondida.\n";
            return "Pregunta #1 no ha sido respondida.\n";
        }
    }

    public String validarPregunta2() {
        if (p2Radio5.isSelected() || p2Radio4.isSelected() || p2Radio3.isSelected()
                || p2Radio2.isSelected() || p2Radio1.isSelected() || p2Radio0.isSelected()) {
            return "";
        } else {

            error += "Pregunta #2 no ha sido respondida.\n";
            return "Pregunta #2 no ha sido respondida.\n";
        }
    }

    public String validarPregunta3() {
        if (p3Radio5.isSelected() || p3Radio4.isSelected() || p3Radio3.isSelected()
                || p3Radio2.isSelected() || p3Radio1.isSelected() || p3Radio0.isSelected()) {
            return "";
        } else {

            error += "Pregunta #3 no ha sido respondida.\n";
            return "Pregunta #3 no ha sido respondida.\n";
        }
    }

    public String validarPregunta4() {
        if (p4Radio5.isSelected() || p4Radio4.isSelected() || p4Radio3.isSelected()
                || p4Radio2.isSelected() || p4Radio1.isSelected() || p4Radio0.isSelected()) {
            return "";
        } else {
            error += "Pregunta #4 no ha sido respondida.\n";
            return "Pregunta #4 no ha sido respondida.\n";
        }
    }

    public String validarPregunta5() {
        if (p5Radio5.isSelected() || p5Radio4.isSelected() || p5Radio3.isSelected()
                || p5Radio2.isSelected() || p5Radio1.isSelected() || p5Radio0.isSelected()) {
            return "";
        } else {
            error += "Pregunta #5 no ha sido respondida.\n";
            return "Pregunta #5 no ha sido respondida.\n";

        }
    }

    private void sumar() {
        sumatoria = 0;
        sumatoria += respuestas.get(0);
        sumatoria += respuestas.get(1);
        sumatoria += respuestas.get(2);
        sumatoria += respuestas.get(3);
        sumatoria += respuestas.get(4);
    }

    public boolean validarCampos() {
        boolean resultado = false;
        sumar();
        String temp = validarPregunta1() + validarPregunta2() + validarPregunta3() + validarPregunta4() + validarPregunta5();
        if (temp.isEmpty()) {
            resultado = true;
        }

        return resultado;
    }

    private void llenarIndice() {
        jLabel23.setText(terapeuta.getNombre());
        if(ib.getQ1() == 5)p1Radio5.setSelected(true);else
        if(ib.getQ1() == 4)p1Radio4.setSelected(true);else
        if(ib.getQ1() == 3)p1Radio3.setSelected(true);else
        if(ib.getQ1() == 2)p1Radio2.setSelected(true);else
        if(ib.getQ1() == 1)p1Radio1.setSelected(true);else
        p1Radio0.setSelected(true);
        
        if(ib.getQ2() == 5)p2Radio5.setSelected(true);else
        if(ib.getQ2() == 4)p2Radio4.setSelected(true);else
        if(ib.getQ2() == 3)p2Radio3.setSelected(true);else
        if(ib.getQ2() == 2)p2Radio2.setSelected(true);else
        if(ib.getQ2() == 1)p2Radio1.setSelected(true);else
        p2Radio0.setSelected(true);
        
        if(ib.getQ3() == 5)p3Radio5.setSelected(true);else
        if(ib.getQ3() == 4)p3Radio4.setSelected(true);else
        if(ib.getQ3() == 3)p3Radio3.setSelected(true);else
        if(ib.getQ3() == 2)p3Radio2.setSelected(true);else
        if(ib.getQ3() == 1)p3Radio1.setSelected(true);else
        p3Radio0.setSelected(true);
        
        if(ib.getQ4() == 5)p4Radio5.setSelected(true);else
        if(ib.getQ4() == 4)p4Radio4.setSelected(true);else
        if(ib.getQ4() == 3)p4Radio3.setSelected(true);else
        if(ib.getQ4() == 2)p4Radio2.setSelected(true);else
        if(ib.getQ4() == 1)p4Radio1.setSelected(true);else
        p4Radio0.setSelected(true);
        
        if(ib.getQ5() == 5)p5Radio5.setSelected(true);else
        if(ib.getQ5() == 4)p5Radio4.setSelected(true);else
        if(ib.getQ5() == 3)p5Radio3.setSelected(true);else
        if(ib.getQ5() == 2)p5Radio2.setSelected(true);else
        if(ib.getQ5() == 1)p5Radio1.setSelected(true);else
        p5Radio0.setSelected(true);
        
        observacionTxt.setText(ib.getObservacion());
        
        boolean editar=true;
        if(tipo.equalsIgnoreCase("editar")){
            editar=false;
        }
        p5Radio0.setEnabled(editar);
        p5Radio1.setEnabled(editar);
        p5Radio2.setEnabled(editar);
        p5Radio3.setEnabled(editar);
        p5Radio4.setEnabled(editar);
        p5Radio5.setEnabled(editar);
        
        p4Radio0.setEnabled(editar);
        p4Radio1.setEnabled(editar);
        p4Radio2.setEnabled(editar);
        p4Radio3.setEnabled(editar);
        p4Radio4.setEnabled(editar);
        p4Radio5.setEnabled(editar);
        
        p3Radio0.setEnabled(editar);
        p3Radio1.setEnabled(editar);
        p3Radio2.setEnabled(editar);
        p3Radio3.setEnabled(editar);
        p3Radio4.setEnabled(editar);
        p3Radio5.setEnabled(editar);
        
        p2Radio0.setEnabled(editar);
        p2Radio1.setEnabled(editar);
        p2Radio2.setEnabled(editar);
        p2Radio3.setEnabled(editar);
        p2Radio4.setEnabled(editar);
        p2Radio5.setEnabled(editar);
        
        p1Radio0.setEnabled(editar);
        p1Radio1.setEnabled(editar);
        p1Radio2.setEnabled(editar);
        p1Radio3.setEnabled(editar);
        p1Radio4.setEnabled(editar);
        p1Radio5.setEnabled(editar);
    }
}
