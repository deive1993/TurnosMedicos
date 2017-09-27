/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import visual.MenuPrincipal;

public class ControladorAceptar implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
                botAceptar.transferFocus();
        
        if (String.valueOf(txtUsu.getText()).compareTo("dei")==0 && String.valueOf(passContra.getPassword()).compareTo("123")==0){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "usuario o contraseña incorrecta");
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
