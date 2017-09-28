/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import models.Persona;
import visual.Acceso;
import visual.MenuPrincipal;

public class ControladorAceptar implements MouseListener{
    private JTextField txtUsu;
    private JPasswordField passContra;
    private Persona unaPersona;

    public ControladorAceptar(JTextField txtUsu, JPasswordField passContra) {
        this.txtUsu = txtUsu;
        this.passContra = passContra;
    }




    @Override
    public void mouseClicked(MouseEvent e) {
        
        if (String.valueOf(txtUsu.getText()).compareTo("dei")==0 && String.valueOf(passContra.getPassword()).compareTo("123")==0){
           
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            menu.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(passContra, "DATOS INCORRECTOS");
        }
    }                                          

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }

