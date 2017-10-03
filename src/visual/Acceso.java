/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import DAO.Coneccion;
import controladores.Acceso.ControladorAccesoAceptar;
import controladores.Acceso.ControladorAccesoCancelar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Acceso extends javax.swing.JFrame {

    /**
     * Creates new form Seguridad
     */
    public Acceso() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("ACCESO");
        
        //controladorEntrar = new ControladorAccesoAceptar(txtUsu, passContra);
        controladorEntrar = new ControladorAccesoAceptar();
        botAceptar.addMouseListener(controladorEntrar);
       
        controladorCancelar = new ControladorAccesoCancelar();
        botCancelar.addMouseListener(controladorCancelar);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsu = new javax.swing.JTextField();
        passContra = new javax.swing.JPasswordField();
        botAceptar = new javax.swing.JButton();
        botCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        opcPaciente = new javax.swing.JRadioButton();
        opcSecretaria = new javax.swing.JRadioButton();
        opcMedico = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/fondo_verde.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("CONTRASEÑA  : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("USUARIO : ");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 110, 20));

        txtUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 120, 20));

        passContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passContraActionPerformed(evt);
            }
        });
        getContentPane().add(passContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 120, 20));

        botAceptar.setText("ACEPTAR");
        botAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(botAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, -1));

        botCancelar.setText("CANCELAR");
        botCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/Banned User.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 130, 120));

        opcPaciente.setText("PACIENTE");
        getContentPane().add(opcPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        opcSecretaria.setText("SECRETARIA");
        getContentPane().add(opcSecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        opcMedico.setText("MEDICO");
        getContentPane().add(opcMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel5.setText("¿ vos sos ?, selecione su opción :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAceptarActionPerformed

    }//GEN-LAST:event_botAceptarActionPerformed

    private void txtUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuActionPerformed
       
        txtUsu.transferFocus();
        
    }//GEN-LAST:event_txtUsuActionPerformed

    private void passContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passContraActionPerformed

        passContra.transferFocus();
        
    }//GEN-LAST:event_passContraActionPerformed

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
       
    }//GEN-LAST:event_botCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAceptar;
    private javax.swing.JButton botCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton opcMedico;
    private javax.swing.JRadioButton opcPaciente;
    private javax.swing.JRadioButton opcSecretaria;
    private javax.swing.JPasswordField passContra;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables

  
    
    private ControladorAccesoAceptar controladorEntrar;
    private ControladorAccesoCancelar controladorCancelar;
}
 




