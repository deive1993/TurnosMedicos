/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.Profesionales;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import visual.ProfesionalMisTurnos;

/**
 *
 * @author USER
 */
public class ControladorMisTurnosProf implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        ProfesionalMisTurnos misTurnosProfecional = new ProfesionalMisTurnos();
        misTurnosProfecional.setVisible(true);
        misTurnosProfecional.setAlwaysOnTop(true);
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
