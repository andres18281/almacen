/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package almacen.Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ubuntu
 */
public class Registra_datos_ {
    private Statement statement;
    DriverManager driver;
    Connection conexion;
    
    public Registra_datos_(Boolean x){
        if(x){
            try{     
                Class.forName("com.mysql.Driver");
                 conexion = DriverManager.getConnection("JDBC:MySql://localhost/dbAlmacen,root,123456");
            }catch(Exception e){
            }
        }
    }
    public void Registrar_camisa(String codigo,String color,String talla,String sexo,int tipo_cam,int item,int tipo_pers,int valor,int nit){
        try{
            statement = conexion.createStatement();
            statement.executeUpdate("Insert Into Camisa Values("+codigo+color+talla+sexo+tipo_cam+item+tipo_pers+valor+nit+")");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Registrar_pantalon(String codigo,String color,String talla,String sexo,int tipo_cam,int item,int tipo_pers,int valor,int nit){
        try{
            statement = conexion.createStatement();
            statement.executeUpdate("Insert Into Pantalon Values("+codigo+color+talla+sexo+tipo_cam+item+tipo_pers+valor+nit+")");
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
    public void Registrar_calzado(String codigo,String color,int talla,String sexo,int tipo_cam,int item,int tipo_pers,int valor,int nit){
        try{
            statement = conexion.createStatement();
            statement.executeUpdate("Insert Into Calzado Values("+codigo+color+talla+sexo+tipo_cam+item+tipo_pers+valor+nit+")");
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
    public void Registrar_Ropa_Interior(String codigo,String color,String talla,String sexo,int tipo_cam,int item,int tipo_pers,int valor,int nit){
        try{
            statement = conexion.createStatement();
            statement.executeUpdate("Insert Into Ropa_interior Values("+codigo+color+talla+sexo+tipo_cam+item+tipo_pers+valor+nit+")");
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
    public void Registrar_Juguetes(String codigo,int valor,String tipo_niño,String marca,int nit){
        try{
            statement = conexion.createStatement();
            statement.executeUpdate("Insert Into Juguetes Values("+codigo+valor+tipo_niño+marca+nit+")");
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
 
    
    
    }


