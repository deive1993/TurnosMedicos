/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controladores.ControladorVolverMenuPrincipal;
import controladores.Profesionales.ControladorCancelarTurnosProf;
import controladores.Profesionales.ControladorMisTurnosProf;

/**
 *
 * @author Silvia
 */
public class MenuProfesionales extends javax.swing.JFrame {

    /**
     * Creates new form profesionales
     */
    public MenuProfesionales() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("PROFESIONALES");
        
       controladorEstadoTurnoPr =new ControladorMisTurnosProf();
        botEstadoTurnos.addMouseListener(controladorEstadoTurnoPr );
           
        controladorRegresar = new ControladorVolverMenuPrincipal();
        botMenuPrincipal.addMouseListener(controladorRegresar);
        
        controladorCancelarTurno =new ControladorCancelarTurnosProf();
        botCancelarTurnos.addMouseListener(controladorCancelarTurno);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botMenuPrincipal = new javax.swing.JButton();
        botRegProf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botCxE = new javax.swing.JButton();
        botEstadoTurnos = new javax.swing.JButton();
        botCancelarTurnos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botMenuPrincipal.setText("VOLVER A MENU PRINCIPAL");
        botMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(botMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, -1, 30));

        botRegProf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botRegProf.setText("REGISTRO DE PROFESIONALES");
        botRegProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegProfActionPerformed(evt);
            }
        });
        getContentPane().add(botRegProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 400, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 110, 110));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("PROFESIONALES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 330, 60));

        botCxE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCxE.setText("MIS DATOS");
        botCxE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCxEActionPerformed(evt);
            }
        });
        getContentPane().add(botCxE, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 400, 50));

        botEstadoTurnos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botEstadoTurnos.setText("ESTADO DE TURNOS");
        botEstadoTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEstadoTurnosActionPerformed(evt);
            }
        });
        getContentPane().add(botEstadoTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 400, 50));

        botCancelarTurnos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCancelarTurnos.setText("TURNOS CANCELADOS");
        botCancelarTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarTurnosActionPerformed(evt);
            }
        });
        getContentPane().add(botCancelarTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 400, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/A-GUARDAPOLVO-MEDIC.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botRegProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegProfActionPerformed
        
       
    }//GEN-LAST:event_botRegProfActionPerformed

    private void botMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMenuPrincipalActionPerformed
       
    }//GEN-LAST:event_botMenuPrincipalActionPerformed

    private void botEstadoTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEstadoTurnosActionPerformed
       
        
    }//GEN-LAST:event_botEstadoTurnosActionPerformed

    private void botCancelarTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarTurnosActionPerformed
       
        ;
    }//GEN-LAST:event_botCancelarTurnosActionPerformed

    private void botCxEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCxEActionPerformed
        
        
    }//GEN-LAST:event_botCxEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelarTurnos;
    private javax.swing.JButton botCxE;
    private javax.swing.JButton botEstadoTurnos;
    private javax.swing.JButton botMenuPrincipal;
    private javax.swing.JButton botRegProf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private ControladorVolverMenuPrincipal controladorRegresar;
    private ControladorCancelarTurnosProf controladorCancelarTurno;
    private ControladorMisTurnosProf controladorEstadoTurnoPr;
}