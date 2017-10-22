/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores.Secretaria;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import visual.ConsultaDatosPersonales;

/**
 *
 * @author USER
 */
public class ControladorConsultaDatosPersonales implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ConsultaDatosPersonales datosPersonales = new ConsultaDatosPersonales();
        datosPersonales.setVisible(true);
        datosPersonales.setAlwaysOnTop(true);
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
