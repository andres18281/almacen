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
public class Consultar_datos {
    private ResultSet rs;
    private Statement statement;
    private DriverManager driver;
    private Connection conexion;
    private almacen.modelo.calzado.calzado calzado;
    private almacen.modelo.camisa.camisa camisa;
    private almacen.modelo.pantalon.pantalon pantalon;
    private almacen.modelo.ropa_interior.ropa_interior ropa_interior;
    private almacen.modelo.juguetes.juguetes juguetes;
    public Consultar_datos(Boolean x){
        if(x){
            try{     
                Class.forName("com.mysql.Driver");
                 conexion = DriverManager.getConnection("JDBC:MySql://localhost/dbAlmacen,root,123456");
            }catch(Exception e){
            }
        }
    }
    public void Consulta_camisa(int i,String codigo,int talla){
        camisa = new almacen.modelo.camisa.camisa();
        if(i == 0){ // Codigo y talla -- confirma la existencia de un producto
            consulta(codigo,talla);
        
        }if(i == 1){ // tipo de camisa para confirmar 
            
        
        }
        //String codigo,String talla,String color,int tipo_cami 
    }
    public void consulta(String codigo,int talla){
        try{
        statement.executeQuery("Select CamCodigo,CamTalla,CamColor "
                    + "From Camisa Where CamCodigo = "+codigo+" and CamTalla ="+talla+")");
        }catch(Exception e){  e.printStackTrace();}
    }
    public void Consulta_pantalon(String codigo,String talla,String color){
       pantalon = new almacen.modelo.pantalon.pantalon();
    
    }
    public void Consulta_zapatos(String codigo,String talla,String color){
       calzado = new almacen.modelo.calzado.calzado();
    }
    public void Consulta_juguete(String codigo,String talla,String color){
       juguetes = new almacen.modelo.juguetes.juguetes(); 
    }
    public void Consulta_Ropa_interior(String codigo,String talla,String color){
       ropa_interior = new almacen.modelo.ropa_interior.ropa_interior(); 
    }
    
    
}
