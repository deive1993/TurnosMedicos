/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.Secretaria;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import visual.RegistroEspecialidad;

/**
 *
 * @author USER
 */
public class ControladorRegistroEspecialidadSecre implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {

        RegistroEspecialidad registro = new RegistroEspecialidad();
        registro.setVisible(true);
        registro.setAlwaysOnTop(true);
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
