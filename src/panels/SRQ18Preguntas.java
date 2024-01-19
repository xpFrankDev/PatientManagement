/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Panels;

import Clases.SRQ18;
import Ventanas.newSRQ18;
import java.util.ArrayList;

/**
 *
 * @author parra
 */
public class SRQ18Preguntas extends javax.swing.JPanel {

    int total=0;
    public ArrayList<String> respuestas = new ArrayList();
    newSRQ18 ventanaSRQ18;
    SRQ18 mySRQ;
    public SRQ18Preguntas() {
        initComponents();
        iniciar();
    }
    public SRQ18Preguntas(newSRQ18 srq) {
        initComponents();
        this.ventanaSRQ18=srq;
        iniciar();
    }
    public SRQ18Preguntas(SRQ18 srq,newSRQ18 mySrqx) {
        initComponents();
        this.mySRQ=srq;
        this.ventanaSRQ18=mySrqx;
        iniciar();
        setRespuestas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gPregunta1 = new javax.swing.ButtonGroup();
        gPregunta2 = new javax.swing.ButtonGroup();
        gPregunta3 = new javax.swing.ButtonGroup();
        gPregunta4 = new javax.swing.ButtonGroup();
        gPregunta5 = new javax.swing.ButtonGroup();
        gPregunta6 = new javax.swing.ButtonGroup();
        gPregunta7 = new javax.swing.ButtonGroup();
        gPregunta8 = new javax.swing.ButtonGroup();
        gPregunta9 = new javax.swing.ButtonGroup();
        gPregunta10 = new javax.swing.ButtonGroup();
        gPregunta11 = new javax.swing.ButtonGroup();
        gPregunta12 = new javax.swing.ButtonGroup();
        gPregunta13 = new javax.swing.ButtonGroup();
        gPregunta14 = new javax.swing.ButtonGroup();
        gPregunta15 = new javax.swing.ButtonGroup();
        gPregunta16 = new javax.swing.ButtonGroup();
        gPregunta17 = new javax.swing.ButtonGroup();
        gPregunta18 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        siP1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        siP2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        siP3 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        siP4 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        siP5 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        siP6 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        siP7 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        siP8 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        siP9 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        siP10 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        siP11 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        siP12 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        siP13 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        siP14 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        siP15 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        siP16 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        siP17 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        siP18 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("1. ¿Tiene dolores frecuentes de cabeza?");

        gPregunta1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("NO");
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });

        gPregunta1.add(siP1);
        siP1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP1.setText("SI");
        siP1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP1StateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("2. ¿Tiene mal apetito? ");

        gPregunta2.add(siP2);
        siP2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP2.setText("SI");
        siP2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP2StateChanged(evt);
            }
        });

        gPregunta2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("NO");
        jRadioButton4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton4StateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("3. ¿Duerme mal?");

        gPregunta3.add(siP3);
        siP3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP3.setText("SI");
        siP3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP3StateChanged(evt);
            }
        });

        gPregunta3.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton6.setSelected(true);
        jRadioButton6.setText("NO");
        jRadioButton6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton6StateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("4. ¿Se asusta con facilidad?");

        gPregunta4.add(siP4);
        siP4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP4.setText("SI");
        siP4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP4StateChanged(evt);
            }
        });

        gPregunta4.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton8.setSelected(true);
        jRadioButton8.setText("NO");
        jRadioButton8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton8StateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("5. ¿Sufre temblor en las manos?");

        gPregunta5.add(siP5);
        siP5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP5.setText("SI");
        siP5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP5StateChanged(evt);
            }
        });

        gPregunta5.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton10.setSelected(true);
        jRadioButton10.setText("NO");
        jRadioButton10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton10StateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("6. ¿Se siente nerviosa/o, tensa/o?");

        gPregunta6.add(siP6);
        siP6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP6.setText("SI");
        siP6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP6StateChanged(evt);
            }
        });

        gPregunta6.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton12.setSelected(true);
        jRadioButton12.setText("NO");
        jRadioButton12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton12StateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("7. ¿Sufre de mala digestión?");

        gPregunta7.add(siP7);
        siP7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP7.setText("SI");
        siP7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP7StateChanged(evt);
            }
        });

        gPregunta7.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton14.setSelected(true);
        jRadioButton14.setText("NO");
        jRadioButton14.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton14StateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("8. ¿Es incapaz de pensar con claridad?");

        gPregunta8.add(siP8);
        siP8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP8.setText("SI");
        siP8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP8StateChanged(evt);
            }
        });

        gPregunta8.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton16.setSelected(true);
        jRadioButton16.setText("NO");
        jRadioButton16.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton16StateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("9. ¿Se siente triste?");

        gPregunta9.add(siP9);
        siP9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP9.setText("SI");
        siP9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP9StateChanged(evt);
            }
        });

        gPregunta9.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton18.setSelected(true);
        jRadioButton18.setText("NO");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("10. ¿Llora Ud. con mucha frecuencia?");

        gPregunta10.add(siP10);
        siP10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP10.setText("SI");
        siP10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP10StateChanged(evt);
            }
        });

        gPregunta10.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton20.setSelected(true);
        jRadioButton20.setText("NO");
        jRadioButton20.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton20StateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("11. ¿Tiene dificultad en disfrutar de sus actividades diarias?");

        gPregunta11.add(siP11);
        siP11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP11.setText("SI");
        siP11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP11StateChanged(evt);
            }
        });

        gPregunta11.add(jRadioButton22);
        jRadioButton22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton22.setSelected(true);
        jRadioButton22.setText("NO");
        jRadioButton22.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton22StateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("12. ¿Tiene dificultad para tomar decisiones?");

        gPregunta12.add(siP12);
        siP12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP12.setText("SI");
        siP12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP12StateChanged(evt);
            }
        });

        gPregunta12.add(jRadioButton24);
        jRadioButton24.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton24.setSelected(true);
        jRadioButton24.setText("NO");
        jRadioButton24.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton24StateChanged(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("13. ¿Tiene dificultad en hacer su trabajo?");

        gPregunta13.add(siP13);
        siP13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP13.setText("SI");
        siP13.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP13StateChanged(evt);
            }
        });

        gPregunta13.add(jRadioButton26);
        jRadioButton26.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton26.setSelected(true);
        jRadioButton26.setText("NO");
        jRadioButton26.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton26StateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("14. ¿Es incapaz de desempeñar un papel útil en su vida?");

        gPregunta14.add(siP14);
        siP14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP14.setText("SI");
        siP14.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP14StateChanged(evt);
            }
        });

        gPregunta14.add(jRadioButton28);
        jRadioButton28.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton28.setSelected(true);
        jRadioButton28.setText("NO");
        jRadioButton28.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton28StateChanged(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("15. ¿Ha perdido interés en las cosas?");

        gPregunta15.add(siP15);
        siP15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP15.setText("SI");
        siP15.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP15StateChanged(evt);
            }
        });

        gPregunta15.add(jRadioButton30);
        jRadioButton30.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton30.setSelected(true);
        jRadioButton30.setText("NO");
        jRadioButton30.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton30StateChanged(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("16. ¿Se siente aburrida /o?");

        gPregunta16.add(siP16);
        siP16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP16.setText("SI");
        siP16.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP16StateChanged(evt);
            }
        });

        gPregunta16.add(jRadioButton32);
        jRadioButton32.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton32.setSelected(true);
        jRadioButton32.setText("NO");
        jRadioButton32.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton32StateChanged(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("17. ¿Ha tenido la idea de acabar con su vida?");

        gPregunta17.add(siP17);
        siP17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP17.setText("SI");
        siP17.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP17StateChanged(evt);
            }
        });

        gPregunta17.add(jRadioButton34);
        jRadioButton34.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton34.setSelected(true);
        jRadioButton34.setText("NO");
        jRadioButton34.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton34StateChanged(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setText("18. ¿Se siente cansada/o todo el tiempo?");

        gPregunta18.add(siP18);
        siP18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        siP18.setText("SI");
        siP18.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                siP18StateChanged(evt);
            }
        });

        gPregunta18.add(jRadioButton36);
        jRadioButton36.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton36.setSelected(true);
        jRadioButton36.setText("NO");
        jRadioButton36.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton36StateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(siP18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jRadioButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(siP17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jRadioButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(siP16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jRadioButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(siP15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jRadioButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(siP14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jRadioButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(siP13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(siP12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jRadioButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(siP11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jRadioButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(siP10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(siP9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jRadioButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(siP8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jRadioButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(siP7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(siP6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(siP5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(siP4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(siP3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(siP2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(siP1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siP1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siP2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siP3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siP4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siP5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siP6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siP7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siP8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siP9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siP10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siP11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siP12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siP13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siP14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siP15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siP16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siP17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siP18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void siP1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP1StateChanged
        sumarRespuestas();
    }//GEN-LAST:event_siP1StateChanged

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_jRadioButton1StateChanged

    private void siP2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP2StateChanged
        sumarRespuestas();
    }//GEN-LAST:event_siP2StateChanged

    private void jRadioButton4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton4StateChanged
       sumarRespuestas();
    }//GEN-LAST:event_jRadioButton4StateChanged

    private void siP3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP3StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_siP3StateChanged

    private void jRadioButton6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton6StateChanged
       sumarRespuestas();
    }//GEN-LAST:event_jRadioButton6StateChanged

    private void siP4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP4StateChanged
     sumarRespuestas();
    }//GEN-LAST:event_siP4StateChanged

    private void jRadioButton8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton8StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_jRadioButton8StateChanged

    private void siP5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP5StateChanged
sumarRespuestas();
    }//GEN-LAST:event_siP5StateChanged

    private void jRadioButton10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton10StateChanged
       sumarRespuestas();
    }//GEN-LAST:event_jRadioButton10StateChanged

    private void siP6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP6StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_siP6StateChanged

    private void jRadioButton12StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton12StateChanged
sumarRespuestas();
    }//GEN-LAST:event_jRadioButton12StateChanged

    private void siP7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP7StateChanged
       sumarRespuestas();
    }//GEN-LAST:event_siP7StateChanged

    private void jRadioButton14StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton14StateChanged
sumarRespuestas();
    }//GEN-LAST:event_jRadioButton14StateChanged

    private void siP8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP8StateChanged
        sumarRespuestas();
    }//GEN-LAST:event_siP8StateChanged

    private void jRadioButton16StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton16StateChanged
       sumarRespuestas();
    }//GEN-LAST:event_jRadioButton16StateChanged

    private void siP9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP9StateChanged
        sumarRespuestas();
    }//GEN-LAST:event_siP9StateChanged

    private void siP10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP10StateChanged
     sumarRespuestas();
    }//GEN-LAST:event_siP10StateChanged

    private void jRadioButton20StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton20StateChanged
        sumarRespuestas();
    }//GEN-LAST:event_jRadioButton20StateChanged

    private void siP11StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP11StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_siP11StateChanged

    private void jRadioButton22StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton22StateChanged
       sumarRespuestas();
    }//GEN-LAST:event_jRadioButton22StateChanged

    private void siP12StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP12StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_siP12StateChanged

    private void jRadioButton24StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton24StateChanged
sumarRespuestas();
    }//GEN-LAST:event_jRadioButton24StateChanged

    private void siP13StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP13StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_siP13StateChanged

    private void jRadioButton26StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton26StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_jRadioButton26StateChanged

    private void siP14StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP14StateChanged
       sumarRespuestas();
    }//GEN-LAST:event_siP14StateChanged

    private void jRadioButton28StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton28StateChanged
     sumarRespuestas();
    }//GEN-LAST:event_jRadioButton28StateChanged

    private void siP15StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP15StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_siP15StateChanged

    private void jRadioButton30StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton30StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_jRadioButton30StateChanged

    private void siP16StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP16StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_siP16StateChanged

    private void jRadioButton32StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton32StateChanged
       sumarRespuestas();
    }//GEN-LAST:event_jRadioButton32StateChanged

    private void siP17StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP17StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_siP17StateChanged

    private void jRadioButton34StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton34StateChanged
     sumarRespuestas();
    }//GEN-LAST:event_jRadioButton34StateChanged

    private void siP18StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_siP18StateChanged
      sumarRespuestas();
    }//GEN-LAST:event_siP18StateChanged

    private void jRadioButton36StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton36StateChanged
    sumarRespuestas();
    }//GEN-LAST:event_jRadioButton36StateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup gPregunta1;
    private javax.swing.ButtonGroup gPregunta10;
    private javax.swing.ButtonGroup gPregunta11;
    private javax.swing.ButtonGroup gPregunta12;
    private javax.swing.ButtonGroup gPregunta13;
    private javax.swing.ButtonGroup gPregunta14;
    private javax.swing.ButtonGroup gPregunta15;
    private javax.swing.ButtonGroup gPregunta16;
    private javax.swing.ButtonGroup gPregunta17;
    private javax.swing.ButtonGroup gPregunta18;
    private javax.swing.ButtonGroup gPregunta2;
    private javax.swing.ButtonGroup gPregunta3;
    private javax.swing.ButtonGroup gPregunta4;
    private javax.swing.ButtonGroup gPregunta5;
    private javax.swing.ButtonGroup gPregunta6;
    private javax.swing.ButtonGroup gPregunta7;
    private javax.swing.ButtonGroup gPregunta8;
    private javax.swing.ButtonGroup gPregunta9;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JRadioButton jRadioButton1;
    public static javax.swing.JRadioButton jRadioButton10;
    public static javax.swing.JRadioButton jRadioButton12;
    public static javax.swing.JRadioButton jRadioButton14;
    public static javax.swing.JRadioButton jRadioButton16;
    public static javax.swing.JRadioButton jRadioButton18;
    public static javax.swing.JRadioButton jRadioButton20;
    public static javax.swing.JRadioButton jRadioButton22;
    public static javax.swing.JRadioButton jRadioButton24;
    public static javax.swing.JRadioButton jRadioButton26;
    public static javax.swing.JRadioButton jRadioButton28;
    public static javax.swing.JRadioButton jRadioButton30;
    public static javax.swing.JRadioButton jRadioButton32;
    public static javax.swing.JRadioButton jRadioButton34;
    public static javax.swing.JRadioButton jRadioButton36;
    public static javax.swing.JRadioButton jRadioButton4;
    public static javax.swing.JRadioButton jRadioButton6;
    public static javax.swing.JRadioButton jRadioButton8;
    public static javax.swing.JRadioButton siP1;
    public static javax.swing.JRadioButton siP10;
    public static javax.swing.JRadioButton siP11;
    public static javax.swing.JRadioButton siP12;
    public static javax.swing.JRadioButton siP13;
    public static javax.swing.JRadioButton siP14;
    public static javax.swing.JRadioButton siP15;
    public static javax.swing.JRadioButton siP16;
    public static javax.swing.JRadioButton siP17;
    public static javax.swing.JRadioButton siP18;
    public static javax.swing.JRadioButton siP2;
    public static javax.swing.JRadioButton siP3;
    public static javax.swing.JRadioButton siP4;
    public static javax.swing.JRadioButton siP5;
    public static javax.swing.JRadioButton siP6;
    public static javax.swing.JRadioButton siP7;
    public static javax.swing.JRadioButton siP8;
    public static javax.swing.JRadioButton siP9;
    // End of variables declaration//GEN-END:variables


public int sumarRespuestas(){
    total =0;
    if(siP1.isSelected()){total+=1;}
    if(siP2.isSelected()){total+=1;}
    if(siP3.isSelected()){total+=1;}
    if(siP4.isSelected()){total+=1;}
    if(siP5.isSelected()){total+=1;}
    if(siP6.isSelected()){total+=1;}
    if(siP7.isSelected()){total+=1;}
    if(siP8.isSelected()){total+=1;}
    if(siP9.isSelected()){total+=1;}
    if(siP10.isSelected()){total+=1;}
    if(siP11.isSelected()){total+=1;}
    if(siP12.isSelected()){total+=1;}
    if(siP13.isSelected()){total+=1;}
    if(siP14.isSelected()){total+=1;}
    if(siP15.isSelected()){total+=1;}
    if(siP16.isSelected()){total+=1;}
    if(siP17.isSelected()){total+=1;}
    if(siP18.isSelected()){total+=1;}
    
    ventanaSRQ18.Sumar(total);
    
    if(siP1.isSelected()){respuestas.set(0, "si");}
    if(siP2.isSelected()){respuestas.set(1, "si");}
    if(siP3.isSelected()){respuestas.set(2, "si");}
    if(siP4.isSelected()){respuestas.set(3, "si");}
    if(siP5.isSelected()){respuestas.set(4, "si");}
    if(siP6.isSelected()){respuestas.set(5, "si");}
    if(siP7.isSelected()){respuestas.set(6, "si");}
    if(siP8.isSelected()){respuestas.set(7, "si");}
    if(siP9.isSelected()){respuestas.set(8, "si");}
    if(siP10.isSelected()){respuestas.set(9, "si");}
    if(siP11.isSelected()){respuestas.set(10, "si");}
    if(siP12.isSelected()){respuestas.set(11, "si");}
    if(siP13.isSelected()){respuestas.set(12, "si");}
    if(siP14.isSelected()){respuestas.set(13, "si");}
    if(siP15.isSelected()){respuestas.set(14, "si");}
    if(siP16.isSelected()){respuestas.set(15, "si");}
    if(siP17.isSelected()){respuestas.set(16, "si");}
    if(siP18.isSelected()){respuestas.set(17, "si");}
    
    newSRQ18.setRespuestas(respuestas);
    
    
    return total;
}

    private void iniciar() {
        for(int i=0; i<18;i++){
            respuestas.add("no");
        }
    }
    
    public void setRespuestas(){
        if(mySRQ.getRespuestas().get(0).equalsIgnoreCase("si"))siP1.setSelected(true);
        if(mySRQ.getRespuestas().get(1).equalsIgnoreCase("si"))siP2.setSelected(true);
        if(mySRQ.getRespuestas().get(2).equalsIgnoreCase("si"))siP3.setSelected(true);
        if(mySRQ.getRespuestas().get(3).equalsIgnoreCase("si"))siP4.setSelected(true);
        if(mySRQ.getRespuestas().get(4).equalsIgnoreCase("si"))siP5.setSelected(true);
        if(mySRQ.getRespuestas().get(5).equalsIgnoreCase("si"))siP6.setSelected(true);
        if(mySRQ.getRespuestas().get(6).equalsIgnoreCase("si"))siP7.setSelected(true);
        if(mySRQ.getRespuestas().get(7).equalsIgnoreCase("si"))siP8.setSelected(true);
        if(mySRQ.getRespuestas().get(8).equalsIgnoreCase("si"))siP9.setSelected(true);
        if(mySRQ.getRespuestas().get(9).equalsIgnoreCase("si"))siP10.setSelected(true);
        if(mySRQ.getRespuestas().get(10).equalsIgnoreCase("si"))siP11.setSelected(true);
        if(mySRQ.getRespuestas().get(11).equalsIgnoreCase("si"))siP12.setSelected(true);
        if(mySRQ.getRespuestas().get(12).equalsIgnoreCase("si"))siP13.setSelected(true);
        if(mySRQ.getRespuestas().get(13).equalsIgnoreCase("si"))siP14.setSelected(true);
        if(mySRQ.getRespuestas().get(14).equalsIgnoreCase("si"))siP15.setSelected(true);
        if(mySRQ.getRespuestas().get(15).equalsIgnoreCase("si"))siP16.setSelected(true);
        if(mySRQ.getRespuestas().get(16).equalsIgnoreCase("si"))siP17.setSelected(true);
        if(mySRQ.getRespuestas().get(17).equalsIgnoreCase("si"))siP18.setSelected(true);

        
    }

}
