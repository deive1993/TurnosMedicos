/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Persona;
import models.PersonaEmail;
import models.PersonaTelefono;
import models.TipoEmail;
import models.TipoTel;
import models.PersonaGenero;

public class Consulta {
   Connection conect;
   PreparedStatement s;
   String user = "root";
   String password = "";
   String url = "jdbc:mysql://localhost:3306/turnosmedicos";
   String driver= "com.mysql.jdbc.Driver";  
   
   public void guardarUsuario( String nombre,String apellido, Integer dni, Integer persona_genero_id, String usuario, String contraseña) throws SQLException{
       try {
            Class.forName(driver);
            conect=DriverManager.getConnection(url,user,password);
            s=conect.prepareStatement("insert into persona (nombre,apellido,dni,persona_genero_id,usuario,contraseña) values (?,?,?,?,?,?)");
            s.setString(1, nombre);
            s.setString(2, apellido);
            s.setInt(3, dni);
            s.setInt(4,persona_genero_id);
            s.setString(5, usuario);
            s.setString(6, contraseña);
            s.executeUpdate();

              
           } 
        catch (ClassNotFoundException e) {
              JOptionPane.showMessageDialog(null, e);}
       
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
       conect.close();
   }
    // persona 
    
   public Persona recuperarPersonaUsuClave(Connection conexion, String pUsu, String pClave) throws SQLException {
      Persona unaPersona = null;
      PersonaGenero personaGenero;
      try{

         PreparedStatement consulta = conexion.prepareStatement("select id, nombre, apellido, persona_genero_id, dni from persona where usuario = ? and  contraseña = md5(?)");

       //  PreparedStatement consulta = conexion.prepareStatement("select id, nombre, apellido, genero_genero_id, dni from persona where usuario = ? and  contrasena = md5(?)");
         consulta.setString(1, pUsu);
         consulta.setString(2, pClave);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){

             personaGenero = this.recuperarGeneroID(conexion,resultado.getInt("persona_genero_id"));
             unaPersona = new Persona(resultado.getInt("id"), personaGenero, resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("dni"));
             
             unaPersona = new Persona(resultado.getInt("id"), null, resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("dni"));
            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return unaPersona;
   }
   
   //persona genero 
   
   public PersonaGenero recuperarGeneroID(Connection conexion, Integer idGenero)throws SQLException{
    
       PersonaGenero personaGenero = null;
       try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre,from persona_genero where id = ?");
         consulta.setInt(1, idGenero);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             personaGenero = new PersonaGenero(resultado.getInt("id"), resultado.getString("nombre"));
            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return personaGenero;
      
   }
   
   //lista de personas (arraylist)
   
   public ArrayList<Persona> ListadoPersonas(Connection conexion) throws SQLException {
          PersonaGenero personaGenero = null;  
       ArrayList<Persona> listaPersonas = new ArrayList();
        try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre, apellido, persona_genero_id, dni from persona");
       
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             personaGenero = this.recuperarGeneroID(conexion, resultado.getInt("persona_genero_id"));
             listaPersonas.add(new Persona(resultado.getInt("id"), personaGenero, resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("dni")));
            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return listaPersonas;
      
     
   }
   
   // lista de persona genero (arraylist)
   
   public ArrayList<PersonaGenero> listadoPersonaGenero(Connection conexion)throws SQLException{
       ArrayList<PersonaGenero> listaGenero = new ArrayList();
       try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre from persona_genero");
       
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             listaGenero.add(new PersonaGenero(resultado.getInt("id"), resultado.getString("nombre")));
            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return listaGenero;
   }
   
   //persona telefono 
   
   public PersonaTelefono recuperarTelefonoID(Connection conexion, Integer tipoTelId) throws SQLException {
      PersonaTelefono unTelefono = null;
      TipoTel tipoTel;
      try{
         PreparedStatement consulta = conexion.prepareStatement("select id, tipo_tel_id, tel from PersonaTelefono where tipo_tel = ? and  id = ?");
        
         consulta.setInt(1, tipoTelId);
         
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             tipoTel= this.recuperarTelefonoID(conexion,resultado.getInt("tipo_tel_id"));
             unTelefono = = new PersonaTelefono(resultado.getInt("id"), tiposTelefonos, resultado.getString("nombre"));
            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return unTelefono;
   }
   
   //tipo telefono 
   
   public TipoTel tipoTelefonos (Connection conexion , Integer idTipoTel) throws SQLException{
       TipoTel tipoTel = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre from tipo_tel where id = ?");
         consulta.setInt(1, idTipoTel);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             tipoTel = new TipoTel(resultado.getInt("id"), resultado.getString("nombre"));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return tipoTel;
   }
   
   //persona email
   
     public PersonaEmail recuperarEmailID(Connection conexion, Integer tipoEmailId) throws SQLException {
      PersonaEmail unEmail = null;
      TipoEmail tipoEmail;
      try{
         PreparedStatement consulta = conexion.prepareStatement("select id, tipo_email_id, tel from Persona_Email where tipo_tel = ? and  id = ?");
        
         consulta.setInt(1, tipoEmailId);
         
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             tipoEmail= this.recuperarEmailID(conexion,resultado.getInt("tipo_email_id"));
             unTelefono = = new PersonaEmail(resultado.getInt("id"), tipoEmail, resultado.getString("nombre"));

 /*
   public PersonaGenero recuperarGeneroId(Connection conexion,  Integer idGenero) throws SQLException{
       PersonaGenero personaGenero=null;
       
       try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre, apellido, genero_genero_id, dni from persona where usuario = ? and  contrasena = md5(?)");
         consulta.setInt(1, idGenero);
         consulta.setInt(2, consulta.executeQuery();
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             
             unaPersona = new Persona(resultado.getInt("id"), personaGenero, resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("dni"));

            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }

      return unEmail;
   }
   
   // tipo email 
   public TipoEmail tipoEmail (Connection conexion , Integer idTipoEmail) throws SQLException{
       TipoEmail tipoEmail = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre from tipo_email where id = ?");
         consulta.setInt(1, idTipoEmail);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             tipoEmail = new TipoEmail(resultado.getInt("id"), resultado.getString("nombre"));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return tipoEmail;
   }
   
=======
      return personaGenero;       
   }*/

 
}

