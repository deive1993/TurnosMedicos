/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.Acceso;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import visual.RegistrarUsuario;


/**
 *
 * @author USER
 */
public class ControladorRegistrarUsuario implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        RegistrarUsuario registrar = new RegistrarUsuario();
        registrar.setVisible(true);
        registrar.setAlwaysOnTop(true);
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
