/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.Profesionales;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import visual.MenuProfesionales;

/**
 *
 * @author USER
 */
public class ControladorVolverMenuProfesional implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        MenuProfesionales menuProfesional = new MenuProfesionales();
        menuProfesional.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
