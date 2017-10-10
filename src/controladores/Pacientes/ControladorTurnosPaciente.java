/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.Pacientes;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import visual.EstadoTurnosPacientes;
import visual.PacienteMisTurnos;

/**
 *
 * @author USER
 */
public class ControladorTurnosPaciente implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
      
        PacienteMisTurnos misTurnos = new PacienteMisTurnos();
        misTurnos.setVisible(true);
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
