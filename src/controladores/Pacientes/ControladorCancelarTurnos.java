/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.Pacientes;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import visual.ReprogramarTurnosPacientes;

/**
 *
 * @author USER
 */
public class ControladorCancelarTurnos implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        
         ReprogramarTurnosPacientes estadoTurnos = new ReprogramarTurnosPacientes();
        estadoTurnos.setVisible(true);
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
