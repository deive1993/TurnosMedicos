package visual;

import controladores.ControladorVolverMenuPrincipal;
import controladores.Pacientes.ControladorReprogranarTurnos;
import controladores.Pacientes.ControladorReservaTurnos;
import controladores.Pacientes.ControladorTurnosPaciente;

public class MenuPacientes extends javax.swing.JFrame {

      public MenuPacientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("PACIENTES");
        
        controladorTurnos = new ControladorTurnosPaciente();
        botMisTurnos.addMouseListener(controladorTurnos);
        
        controladorReserva = new ControladorReservaTurnos();
        botReserva.addMouseListener(controladorReserva);
        
        controladorCancelarTurnos = new ControladorReprogranarTurnos();
        botCancelarTurnos.addMouseListener(controladorCancelarTurnos);
           
        controladorRegresar = new ControladorVolverMenuPrincipal();
        botMenuPrincipal.addMouseListener(controladorRegresar);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botMenuPrincipal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botMisTurnos = new javax.swing.JButton();
        botReserva = new javax.swing.JButton();
        botCancelarTurnos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 0, -1, 90));

        botMenuPrincipal.setText("VOLVER A MENU PRINCIPAL");
        botMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(botMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PACIENTES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 400, 50));

        botMisTurnos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botMisTurnos.setText("MIS TURNOS");
        botMisTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMisTurnosActionPerformed(evt);
            }
        });
        getContentPane().add(botMisTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 320, 40));

        botReserva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botReserva.setText("RESERVA DE TURNO");
        botReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botReservaActionPerformed(evt);
            }
        });
        getContentPane().add(botReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 320, 40));

        botCancelarTurnos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCancelarTurnos.setText("REPROGRAMAR TURNO");
        botCancelarTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarTurnosActionPerformed(evt);
            }
        });
        getContentPane().add(botCancelarTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 320, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/turnos (2).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botMisTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMisTurnosActionPerformed
       
    }//GEN-LAST:event_botMisTurnosActionPerformed

    private void botMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMenuPrincipalActionPerformed

         
       
    }//GEN-LAST:event_botMenuPrincipalActionPerformed

    private void botReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botReservaActionPerformed
       
    }//GEN-LAST:event_botReservaActionPerformed

    private void botCancelarTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarTurnosActionPerformed
       
        
       
    }//GEN-LAST:event_botCancelarTurnosActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelarTurnos;
    private javax.swing.JButton botMenuPrincipal;
    private javax.swing.JButton botMisTurnos;
    private javax.swing.JButton botReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private ControladorVolverMenuPrincipal controladorRegresar;
    private ControladorTurnosPaciente controladorTurnos;
    private ControladorReservaTurnos controladorReserva;
    private ControladorReprogranarTurnos controladorCancelarTurnos;
}
