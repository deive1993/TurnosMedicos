/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controladores.ControladorMenuPaciente;
import controladores.ControladorMenuProfesionales;
import controladores.ControladorMenuSecretaria;

/**
 *
 * @author Silvia
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuprincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("MENU PRINCIPAL");
        
        controladorMenuPacientes = new ControladorMenuPaciente();
        botPacientes.addMouseListener(controladorMenuPacientes);
        
         controladorMenuProfesional = new ControladorMenuProfesionales();
         botProfesionales.addMouseListener(controladorMenuProfesional);
         
         
        controladorMenuAdministradora = new ControladorMenuSecretaria();
        botSecretaria.addMouseListener(controladorMenuAdministradora);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        botPacientes = new javax.swing.JButton();
        botProfesionales = new javax.swing.JButton();
        botSecretaria = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botMenuInicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("para Consultorio Médico");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 350, 30));

        botPacientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botPacientes.setText("PACIENTES");
        botPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(botPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 330, 40));

        botProfesionales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botProfesionales.setText("PROFESIONALES");
        botProfesionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botProfesionalesActionPerformed(evt);
            }
        });
        getContentPane().add(botProfesionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 330, 40));

        botSecretaria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botSecretaria.setText("SECRETARIA");
        botSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSecretariaActionPerformed(evt);
            }
        });
        getContentPane().add(botSecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 330, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        botMenuInicio.setText("VOLVER A INICIO");
        botMenuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMenuInicioActionPerformed(evt);
            }
        });
        getContentPane().add(botMenuInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 140, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Turnos ");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 290, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/menu_principal.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPacientesActionPerformed
       
        

    }//GEN-LAST:event_botPacientesActionPerformed

    private void botMenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMenuInicioActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_botMenuInicioActionPerformed

    private void botProfesionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botProfesionalesActionPerformed
     

    }//GEN-LAST:event_botProfesionalesActionPerformed

    private void botSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSecretariaActionPerformed
    
    }//GEN-LAST:event_botSecretariaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botMenuInicio;
    private javax.swing.JButton botPacientes;
    private javax.swing.JButton botProfesionales;
    private javax.swing.JButton botSecretaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

     private ControladorMenuPaciente controladorMenuPacientes ;
     private ControladorMenuProfesionales controladorMenuProfesional ;
     private ControladorMenuSecretaria controladorMenuAdministradora ;

}
