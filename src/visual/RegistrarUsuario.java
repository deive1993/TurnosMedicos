/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controladores.Acceso.ControladorBotonRegistrar;
import controladores.Acceso.ControladorRegistrarUsuario;
import controladores.Acceso.ControladorVolverAcceso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class RegistrarUsuario extends javax.swing.JFrame {
   Connection conect;
   PreparedStatement s;
   String user = "root";
   String password = "";
   String url = "jdbc:mysql://localhost:3306/turnosmedicos";
   String driver= "com.mysql.jdbc.Driver";  
  
    public RegistrarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("REGISTRARSE");
        
           
        controladorVolver = new ControladorVolverAcceso();
        botCancelar.addMouseListener(controladorVolver);
       /*
        controladorBotonRegistrar = new ControladorBotonRegistrar();
        botRegistrar.addMouseListener(controladorBotonRegistrar);
        
        */
      }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botCancelar = new javax.swing.JButton();
        botRegistrar = new javax.swing.JButton();
        txtGenero = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO de USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 320, -1));

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 320, -1));

        lblApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblApellido.setText("Apellido:");
        getContentPane().add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 110, -1));

        lblGenero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblGenero.setText("Genero:");
        getContentPane().add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 90, 14));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 221, 320, -1));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario.setText("Usuario:");
        lblUsuario.setOpaque(true);
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 90, -1));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 261, 320, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 100, 90));

        botCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/cancelar.png"))); // NOI18N
        botCancelar.setText("Cancelar");
        botCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 120, 30));

        botRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/usuarioregistrado.jpg"))); // NOI18N
        botRegistrar.setText("Registrar");
        botRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 120, -1));

        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 181, 320, -1));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 320, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 320, -1));

        lblDni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDni.setText("DNI:");
        getContentPane().add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombre.setText("Nombre :");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 110, -1));

        lblContraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblContraseña.setText("Contraseña:");
        lblContraseña.setOpaque(true);
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegistrarActionPerformed
         
        
        try {
                Class.forName(driver);
            conect=DriverManager.getConnection(url,user,password);
            s=conect.prepareStatement("insert into persona (nombre,apellido,dni,persona_genero_id,usuario,contraseña) values (?,?,?,?,?,?)");
            s.setString(1, txtNombre.getText());
            s.setString(2, txtApellido.getText());
            s.setString(3, txtDni.getText());
            s.setString(4, txtGenero.getText());
            s.setString(5, txtUsuario.getText());
            s.setString(6, txtContraseña.getText());
            s.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "datos guardadas exitosamente");
        } 
        catch (ClassNotFoundException e) {
              JOptionPane.showMessageDialog(null, e);}
       
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
         
        
    }//GEN-LAST:event_botRegistrarActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        
    }//GEN-LAST:event_txtDniActionPerformed

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed

    }//GEN-LAST:event_botCancelarActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

private ControladorVolverAcceso controladorVolver;
//private ControladorBotonRegistrar controladorBotonRegistrar;
    
}
