/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.Pacientes;

import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;
import visual.ReservaTurnosPaciente;

/**
 *
 * @author USER
 */
public class ControladorReservaTurnos implements MouseInputListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        ReservaTurnosPaciente reservaTurnos = new ReservaTurnosPaciente();
        reservaTurnos.setVisible(true);
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

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    
}
