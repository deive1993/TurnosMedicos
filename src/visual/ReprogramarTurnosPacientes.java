/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controladores.Pacientes.ControladorVolverPacientes;

/**
 *
 * @author Rocio
 */
public class ReprogramarTurnosPacientes extends javax.swing.JFrame {

   
    public ReprogramarTurnosPacientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("REPROGRAMAR MIS TURNOS");
                
        controladorMenuPaciente = new ControladorVolverPacientes();
        botMenuPaciente.addMouseListener(controladorMenuPaciente);
 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRegist = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApelli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        btonBuscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btonLimpiar = new javax.swing.JButton();
        botMenuPaciente = new javax.swing.JButton();
        btonBuscar1 = new javax.swing.JButton();
        btonLimpiar1 = new javax.swing.JButton();
        btonBuscar2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Reprogramar Mis Turnos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 724, -1));

        jLabel6.setText("N° Turno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 150, -1, -1));

        txtRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistActionPerformed(evt);
            }
        });
        getContentPane().add(txtRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 147, 68, -1));

        jLabel1.setText("Nombre/s:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 174, -1, -1));

        txtNombr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombr, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 171, 377, -1));

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 200, -1, -1));

        txtApelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApelliActionPerformed(evt);
            }
        });
        getContentPane().add(txtApelli, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 197, 377, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("DATOS del PACIENTE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 133, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Fechas de Consulta");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 119, -1));

        txtFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaFinActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 90, -1));

        btonBuscar.setText("CANCELAR");
        btonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 110, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 100, 90));

        btonLimpiar.setText("MODIFICAR");
        btonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 110, 30));

        botMenuPaciente.setText("VOLVER");
        botMenuPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMenuPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(botMenuPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 100, 30));

        btonBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/buscar.png"))); // NOI18N
        btonBuscar1.setText("BUSCAR");
        getContentPane().add(btonBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 110, 20));

        btonLimpiar1.setText("LIMPIAR");
        btonLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonLimpiar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btonLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 110, 30));

        btonBuscar2.setText("ELIMINAR");
        btonBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonBuscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btonBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 110, 30));

        jLabel12.setText("Especialidad : ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel13.setText("Profesional:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pediatria", "Psicologia", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 90, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr.Luis", "Dr.Juan", "Dr.Agustin", " ", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 90, -1));

        jLabel14.setText("Fecha:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        jLabel15.setText("Hora  : ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00 mañana", "8:30 mañana", "9:00 mañana", "9:30 mañana", "10:00 mañana", "10:30 mañana", "11:00 mañana", "11:30 mañana", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N° Turno", "Hora", "Fecha", "Especialidad", "Profesional", "Consultorio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 550, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botMenuPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMenuPacienteActionPerformed
       
    }//GEN-LAST:event_botMenuPacienteActionPerformed

    private void btonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonLimpiarActionPerformed
      
      
    }//GEN-LAST:event_btonLimpiarActionPerformed

    private void txtRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistActionPerformed
        txtRegist.transferFocus();
    }//GEN-LAST:event_txtRegistActionPerformed

    private void txtNombrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrActionPerformed
        txtNombr.transferFocus();
    }//GEN-LAST:event_txtNombrActionPerformed

    private void txtApelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApelliActionPerformed
        txtApelli.transferFocus();
    }//GEN-LAST:event_txtApelliActionPerformed

    private void txtFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaFinActionPerformed
        txtFechaFin.transferFocus();
    }//GEN-LAST:event_txtFechaFinActionPerformed

    private void btonLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonLimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btonLimpiar1ActionPerformed

    private void btonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btonBuscarActionPerformed

    private void btonBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btonBuscar2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botMenuPaciente;
    private javax.swing.JButton btonBuscar;
    private javax.swing.JButton btonBuscar1;
    private javax.swing.JButton btonBuscar2;
    private javax.swing.JButton btonLimpiar;
    private javax.swing.JButton btonLimpiar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApelli;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtNombr;
    private javax.swing.JTextField txtRegist;
    // End of variables declaration//GEN-END:variables

    private ControladorVolverPacientes controladorMenuPaciente;
}
