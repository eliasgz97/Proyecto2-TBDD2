/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasemigrator;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author EliasGZ
 */
public class Interfaz extends javax.swing.JFrame {

    Connection cn;
    Connection cn2;
    DefaultListModel modelo = new DefaultListModel();
    DefaultListModel modelo1 = new DefaultListModel();
    ArrayList<ConexionMySQL> conexion = new ArrayList();
    ArrayList<ConexionSQLServer> conexion2 = new ArrayList();
    ;
    public Interfaz() {
        try {

        } catch (Exception e) {
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_configuracion = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtf_origen_instancia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_origen_basedatos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_origen_puerto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtf_origen_usuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jftf_origen_pass = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jtf_destino_basedatos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtf_destino_puerto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtf_destino_usuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtf_destino_instancia = new javax.swing.JTextField();
        jftf_destino_pass = new javax.swing.JFormattedTextField();
        jd_replica = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_sinreplicar = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_replicando = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Base de Datos Origen");

        jLabel3.setText("Nombre Instancia");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Configuracion de Base de Datos");

        jLabel5.setText("Nombre Base Datos");

        jLabel6.setText("Puerto");

        jLabel7.setText("Nombre Usuario");

        jLabel8.setText("Password");

        jButton3.setText("Conectar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Nombre Base Datos");

        jButton4.setText("Conectar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setText("Puerto");

        jLabel11.setText("Nombre Usuario");

        jLabel12.setText("Password");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Base de Datos Destino");

        jLabel14.setText("Nombre Instancia");

        javax.swing.GroupLayout jd_configuracionLayout = new javax.swing.GroupLayout(jd_configuracion.getContentPane());
        jd_configuracion.getContentPane().setLayout(jd_configuracionLayout);
        jd_configuracionLayout.setHorizontalGroup(
            jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_configuracionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(jd_configuracionLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_configuracionLayout.createSequentialGroup()
                        .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jd_configuracionLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_configuracionLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtf_destino_instancia, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jd_configuracionLayout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtf_destino_puerto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jd_configuracionLayout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtf_destino_basedatos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jd_configuracionLayout.createSequentialGroup()
                                            .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel12))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jtf_destino_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jftf_destino_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_configuracionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_configuracionLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_configuracionLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_configuracionLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_origen_instancia, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jd_configuracionLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtf_origen_puerto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jd_configuracionLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_origen_basedatos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jd_configuracionLayout.createSequentialGroup()
                                    .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtf_origen_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addComponent(jftf_origen_pass)))))
                        .addGap(42, 42, 42))))
            .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_configuracionLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel4)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );
        jd_configuracionLayout.setVerticalGroup(
            jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_configuracionLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_origen_instancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_origen_basedatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_origen_puerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_origen_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jftf_origen_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtf_destino_instancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtf_destino_basedatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtf_destino_puerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtf_destino_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jftf_destino_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_configuracionLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel4)
                    .addContainerGap(639, Short.MAX_VALUE)))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Tablas BD Origen");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Sin Replicar");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Replicando");

        jl_sinreplicar.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_sinreplicar);

        jScrollPane2.setViewportView(jl_replicando);

        jButton5.setText(">>");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("<<");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Guardar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Cancelar");

        javax.swing.GroupLayout jd_replicaLayout = new javax.swing.GroupLayout(jd_replica.getContentPane());
        jd_replica.getContentPane().setLayout(jd_replicaLayout);
        jd_replicaLayout.setHorizontalGroup(
            jd_replicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_replicaLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(79, 79, 79))
            .addGroup(jd_replicaLayout.createSequentialGroup()
                .addGroup(jd_replicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_replicaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jd_replicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jd_replicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jd_replicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_replicaLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_replicaLayout.setVerticalGroup(
            jd_replicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_replicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(42, 42, 42)
                .addGroup(jd_replicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_replicaLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGroup(jd_replicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_replicaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_replicaLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton5)
                                .addGap(31, 31, 31)
                                .addComponent(jButton6))))
                    .addGroup(jd_replicaLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jd_replicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(37, 37, 37))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema Integrador de Base de Datos");

        jButton1.setText("Configuración");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Replicar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ConexionMySQL con = new ConexionMySQL(jtf_origen_basedatos.getText(), jtf_origen_usuario.getText(), jftf_origen_pass.getText(), jtf_origen_puerto.getText(), jtf_origen_instancia.getText());
        
        try {
            cn = con.conexion();
            JOptionPane.showMessageDialog(this, "Conexión Exitosa");
            conexion.add(con);
            System.out.println(conexion.get(0).getUrl());
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ConexionSQLServer con2 = new ConexionSQLServer(jtf_destino_instancia.getText(), jtf_destino_basedatos.getText(), jtf_destino_usuario.getText(), jftf_destino_pass.getText(), jtf_destino_puerto.getText());
        try {
            cn2 = con2.conexion();
            JOptionPane.showMessageDialog(this, "Conexión Exitosa");
            conexion2.add(con2);
            System.out.println(conexion2.get(0).getSqlserverurl());
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        modelo.addElement(jl_sinreplicar.getSelectedValue());
        jl_replicando.setModel(modelo);
        modelo1 = (DefaultListModel) jl_sinreplicar.getModel();
        modelo1.remove(jl_sinreplicar.getSelectedIndex());


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        modelo1.addElement(jl_replicando.getSelectedValue());
        jl_sinreplicar.setModel(modelo1);
        modelo = (DefaultListModel) jl_replicando.getModel();
        modelo.remove(jl_replicando.getSelectedIndex());

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jd_configuracion.setModal(true);
        jd_configuracion.pack();
        jd_configuracion.setLocationRelativeTo(this);
        jd_configuracion.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        jd_replica.setModal(true);
        jd_replica.pack();
        jd_replica.setLocationRelativeTo(this);
        jd_replica.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultListModel modelo1 = (DefaultListModel) jl_sinreplicar.getModel();
        modelo1.removeAllElements();
        modelo1.addElement("Soldado");
        modelo1.addElement("Historial_Ejercito");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        PreparedStatement loadStatement;
        DefaultListModel modelo1 = (DefaultListModel) jl_replicando.getModel();
        if (jl_replicando.getModel().getSize() == 2) {
            if (modelo1.getElementAt(0).equals("Soldado")) {
                try {
                    loadStatement = cn.prepareStatement("SELECT * FROM Soldado");
                    PreparedStatement storeStatement = cn2.prepareStatement("INSERT INTO Soldado (idSoldado, Nombre_operador, Escuadron) VALUES (?, ?, ?)");
                    ResultSet loadedData = loadStatement.executeQuery();
                    while (loadedData.next()) {
                        storeStatement.setString(1, loadedData.getString(1));
                        storeStatement.setString(2, loadedData.getString(2));
                        storeStatement.setString(3, loadedData.getString(3));
                        storeStatement.executeUpdate();
                    }
                    JOptionPane.showMessageDialog(this, "Datos replicados con éxito");
                } catch (SQLException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (modelo1.getElementAt(0).equals("Historial_Ejercito")) {
                try {
                    loadStatement = cn.prepareStatement("SELECT * FROM Historial_Ejercito");
                    PreparedStatement storeStatement = cn2.prepareStatement("INSERT INTO Historial_Ejercito (idSoldadoActual, Estado, id_Previo, Fecha) VALUES (?, ?, ?, ?)");
                    ResultSet loadedData = loadStatement.executeQuery();
                    while (loadedData.next()) {
                        storeStatement.setString(1, loadedData.getString(1));
                        storeStatement.setString(2, loadedData.getString(2));
                        storeStatement.setString(3, loadedData.getString(3));
                        storeStatement.setString(4, loadedData.getString(4));
                        storeStatement.executeUpdate();
                    }
                    JOptionPane.showMessageDialog(this, "Datos replicados con éxito");
                } catch (SQLException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "Datos replicados con éxito");
            }  
            if (modelo1.getElementAt(1).equals("Soldado")) {
                try {
                    loadStatement = cn.prepareStatement("SELECT * FROM Soldado");
                    PreparedStatement storeStatement = cn2.prepareStatement("INSERT INTO Soldado (idSoldado, Nombre_operador, Escuadron) VALUES (?, ?, ?)");
                    ResultSet loadedData = loadStatement.executeQuery();
                    while (loadedData.next()) {
                        storeStatement.setString(1, loadedData.getString(1));
                        storeStatement.setString(2, loadedData.getString(2));
                        storeStatement.setString(3, loadedData.getString(3));
                        storeStatement.executeUpdate();
                    }
                    JOptionPane.showMessageDialog(this, "Datos replicados con éxito");
                } catch (SQLException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "Datos replicados con éxito");
            } 
            if (modelo1.getElementAt(1).equals("Historial_Ejercito")) {
                try {
                    loadStatement = cn.prepareStatement("SELECT * FROM Historial_Ejercito");
                    PreparedStatement storeStatement = cn2.prepareStatement("INSERT INTO Historial_Ejercito (idSoldadoActual, Estado, id_Previo, Fecha) VALUES (?, ?, ?, ?)");
                    ResultSet loadedData = loadStatement.executeQuery();
                    while (loadedData.next()) {
                        storeStatement.setString(1, loadedData.getString(1));
                        storeStatement.setString(2, loadedData.getString(2));
                        storeStatement.setString(3, loadedData.getString(3));
                        storeStatement.setString(4, loadedData.getString(4));
                        storeStatement.executeUpdate();
                    }
                    JOptionPane.showMessageDialog(this, "Datos replicados con éxito");
                } catch (SQLException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (jl_replicando.getModel().getSize() == 1) {
            if (modelo1.getElementAt(0).equals("Historial_Ejercito")) {
                try {
                    loadStatement = cn.prepareStatement("SELECT * FROM Historial_Ejercito");
                    PreparedStatement storeStatement = cn2.prepareStatement("INSERT INTO Historial_Ejercito (idSoldadoActual, Estado, id_Previo, Fecha) VALUES (?, ?, ?, ?)");
                    ResultSet loadedData = loadStatement.executeQuery();
                    while (loadedData.next()) {
                        storeStatement.setString(1, loadedData.getString(1));
                        storeStatement.setString(2, loadedData.getString(2));
                        storeStatement.setString(3, loadedData.getString(3));
                        storeStatement.setString(4, loadedData.getString(4));
                        storeStatement.executeUpdate();
                    }
                    JOptionPane.showMessageDialog(this, "Datos replicados con éxito");
                } catch (SQLException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    loadStatement = cn.prepareStatement("SELECT * FROM Soldado");
                    PreparedStatement storeStatement = cn2.prepareStatement("INSERT INTO Soldado (idSoldado, Nombre_operador, Escuadron) VALUES (?, ?, ?)");
                    ResultSet loadedData = loadStatement.executeQuery();
                    while (loadedData.next()) {
                        storeStatement.setString(1, loadedData.getString(1));
                        storeStatement.setString(2, loadedData.getString(2));
                        storeStatement.setString(3, loadedData.getString(3));
                        storeStatement.executeUpdate();
                    }
                    JOptionPane.showMessageDialog(this, "Datos replicados con éxito");
                } catch (SQLException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe agregar una tabla a la segunda lista para poder replicar");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_configuracion;
    private javax.swing.JDialog jd_replica;
    private javax.swing.JFormattedTextField jftf_destino_pass;
    private javax.swing.JFormattedTextField jftf_origen_pass;
    private javax.swing.JList<String> jl_replicando;
    private javax.swing.JList<String> jl_sinreplicar;
    private javax.swing.JTextField jtf_destino_basedatos;
    private javax.swing.JTextField jtf_destino_instancia;
    private javax.swing.JTextField jtf_destino_puerto;
    private javax.swing.JTextField jtf_destino_usuario;
    private javax.swing.JTextField jtf_origen_basedatos;
    private javax.swing.JTextField jtf_origen_instancia;
    private javax.swing.JTextField jtf_origen_puerto;
    private javax.swing.JTextField jtf_origen_usuario;
    // End of variables declaration//GEN-END:variables
}
