/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controladores.ControladorVolverMenuPrincipal;
import controladores.Secretaria.ControladorCancelarTurnosSecre;
import controladores.Secretaria.ControladorConsultaTurnosxPaciente;
import controladores.Secretaria.ControladorRegistroEspecialidadSecre;
import controladores.Secretaria.ControladorRegistroProfesional;
import controladores.Secretaria.ControladorReprogramarTurnosSecre;
import controladores.Secretaria.ControladorConsultaTurnosxProfesional;


/**
 *
 * @author Rocio
 */
public class MenuSecretaria extends javax.swing.JFrame {

   
    public MenuSecretaria() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SECRETARIA");
        
        
        controladorRegistroEspecialidad = new ControladorRegistroEspecialidadSecre ();
        botRegistroEspecialidad.addMouseListener(controladorRegistroEspecialidad);
        
        
        controladorReprogramarTurno =new ControladorReprogramarTurnosSecre();
        botReprogramarTurno.addMouseListener(controladorReprogramarTurno);
        
        controladorRegistrarProfesional = new ControladorRegistroProfesional();
        botRegisProfesional.addMouseListener(controladorRegistrarProfesional);
        
        controladorConsultaTurnoxProfesional = new ControladorConsultaTurnosxProfesional();
        botConsdeTurnosxProf.addMouseListener(controladorConsultaTurnoxProfesional);
        

        
        controladorConsultaTurnosxPacientes = new ControladorConsultaTurnosxPaciente();
        botConsdeTurnosxPaciente.addMouseListener(controladorConsultaTurnosxPacientes);
   
        controladorRegresar = new ControladorVolverMenuPrincipal();
        botMenuPrincipal.addMouseListener(controladorRegresar);     
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        botConsdeTurnosxPaciente = new javax.swing.JButton();
        botMenuPrincipal = new javax.swing.JButton();
        botReprogramarTurno = new javax.swing.JButton();
        botRegistroEspecialidad = new javax.swing.JButton();
        botRegisProfesional = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botConsdeTurnosxProf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SECRETARIA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 798, -1));

        botConsdeTurnosxPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botConsdeTurnosxPaciente.setText("CONSULTA DE TURNOS POR PACIENTE");
        getContentPane().add(botConsdeTurnosxPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 430, 40));

        botMenuPrincipal.setText("VOLVER A MENU PRINCIPAL");
        botMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(botMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, -1, -1));

        botReprogramarTurno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botReprogramarTurno.setText("REPROGRAMAR TURNOS");
        botReprogramarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botReprogramarTurnoActionPerformed(evt);
            }
        });
        getContentPane().add(botReprogramarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 430, 40));

        botRegistroEspecialidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botRegistroEspecialidad.setText("REGISTRO DE ESPECIALIDAD");
        botRegistroEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegistroEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(botRegistroEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 430, 40));

        botRegisProfesional.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botRegisProfesional.setText("REGISTRO DE PROFESIONAL");
        botRegisProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegisProfesionalActionPerformed(evt);
            }
        });
        getContentPane().add(botRegisProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 430, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 110, 90));

        botConsdeTurnosxProf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botConsdeTurnosxProf.setText("CONSULTA DE TURNOS POR PROFESIONAL");
        getContentPane().add(botConsdeTurnosxProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 430, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegEspecialidadesActionPerformed
        
    }//GEN-LAST:event_RegEspecialidadesActionPerformed

    private void ConFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConFechaActionPerformed
        
    }//GEN-LAST:event_ConFechaActionPerformed

    private void ConPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConPacienteActionPerformed
        
    }//GEN-LAST:event_ConPacienteActionPerformed

    private void ConProfesionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConProfesionalesActionPerformed
        
    }//GEN-LAST:event_ConProfesionalesActionPerformed

    private void VolverMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverMenuPrincipalActionPerformed

    }//GEN-LAST:event_VolverMenuPrincipalActionPerformed

   

    private void botRegistroEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegistroEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botRegistroEspecialidadActionPerformed

    private void botMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMenuPrincipalActionPerformed
     
       MenuPrincipal menu = new MenuPrincipal();
       menu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botMenuPrincipalActionPerformed

    private void botReprogramarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botReprogramarTurnoActionPerformed

    }//GEN-LAST:event_botReprogramarTurnoActionPerformed

    private void botRegisProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegisProfesionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botRegisProfesionalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botConsdeTurnosxPaciente;
    private javax.swing.JButton botConsdeTurnosxProf;
    private javax.swing.JButton botMenuPrincipal;
    private javax.swing.JButton botRegisProfesional;
    private javax.swing.JButton botRegistroEspecialidad;
    private javax.swing.JButton botReprogramarTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables


    private ControladorRegistroEspecialidadSecre controladorRegistroEspecialidad;
    private ControladorReprogramarTurnosSecre  controladorReprogramarTurno;
    private ControladorRegistroProfesional  controladorRegistrarProfesional;
    private ControladorConsultaTurnosxProfesional controladorConsultaTurnoxProfesional;
    private ControladorVolverMenuPrincipal controladorRegresar;
    private ControladorConsultaTurnosxPaciente controladorConsultaTurnosxPacientes;
    
}
