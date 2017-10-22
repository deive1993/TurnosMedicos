/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.Acceso;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import models.Persona;
import visual.Acceso;
import visual.MenuPacientes;
import visual.MenuPrincipal;

/**
 *
 * @author USER
 */
public class ControladorAccesoAceptar implements MouseListener{
    
    private JTextField txtUsu;
    private JPasswordField passContra;
    private JRadioButton opcMedico;
    private JRadioButton opcPaciente;
    private JRadioButton opcSecretaria;
/*
    public ControladorAccesoAceptar(JTextField txtUsu, JRadioButton opcMedico, JRadioButton opcPaciente, JRadioButton opcSecretaria) {
        this.txtUsu = txtUsu;
        this.opcMedico = opcMedico;
        this.opcPaciente = opcPaciente;
        this.opcSecretaria = opcSecretaria;

    }
*/
  

    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        menu.setAlwaysOnTop(true);
        
          
        
        
        
        
        
        /*
        if(opcPaciente.isSelected()){
             
            MenuPacientes menu = new MenuPacientes();
            menu.setVisible(true);
        }
        
         if(opcMedico.isSelected()){
             
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
        }
            
            */
          
            
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
