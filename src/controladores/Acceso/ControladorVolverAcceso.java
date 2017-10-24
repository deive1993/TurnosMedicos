/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.Acceso;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import visual.Acceso;

/**
 *
 * @author USER
 */
public class ControladorVolverAcceso implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        Acceso inicio = new Acceso();
        inicio.setVisible(true);
        inicio.setAlwaysOnTop(true);
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
