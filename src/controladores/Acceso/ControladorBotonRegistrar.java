/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.Acceso;

import DAO.Consulta;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class ControladorBotonRegistrar implements MouseListener{
        
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDni;
    private JTextField txtGenero;
    private JTextField txtUsuario;
    private JTextField txtContraseña;


    public ControladorBotonRegistrar() {
    }

    

    @Override
    public void mouseClicked(MouseEvent evt) {
              
        Consulta consulta = new Consulta();
         System.out.println("datos registrados");
           
           try {
            consulta.guardarUsuario(txtNombre.getText());
            consulta.guardarUsuario(txtApellido.getText());
            consulta.guardarUsuario(txtDni.getText());
            consulta.guardarUsuario(txtGenero.getText());
            consulta.guardarUsuario(txtUsuario.getText());
            consulta.guardarUsuario(txtContraseña.getText());
           
           JOptionPane.showMessageDialog(null, "datos registrados");
       } 
       
       catch (SQLException ex) {
           Logger.getLogger(ControladorBotonRegistrar.class.getName()).log(Level.SEVERE, null, ex);
       }
      
        
    }    
    
    
    @Override
    public void mousePressed(MouseEvent e) {
       
     
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
