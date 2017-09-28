/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import DAO.Coneccion;
import java.sql.SQLException;
import visual.Acceso;
import visual.Bienvenido;




/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
      
      
        Acceso usuario = new Acceso();
        usuario.setVisible(true);
        usuario.setAlwaysOnTop(true);


    }
    
}
