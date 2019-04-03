package pe.com.visanet.soap.ventas.generatesolicitude.ws.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.springframework.stereotype.Service;

@Service
public class BDConexion{
 
    public void coneccionBD() throws Exception{
        System.out.println( "------------------ 'INICIO' - coneccionBD ------------------") ;
 
        try{
            Connection connection = this.connectDatabase();
            Statement  stmt       = connection.createStatement();
            ResultSet  resultSet  = stmt.executeQuery( "SELECT * FROM Personas" ); 
            
            while( resultSet.next() ){
            	   System.out.println( "PersonaID: " + resultSet.getInt(    "PersonaID" ) );
            	   System.out.println( "Nombre: "    + resultSet.getString( "Nombre"    ) ); 
            	   System.out.println( "Apellido1: " + resultSet.getString( "Apellido1" ) );
            	   System.out.println( "Apellido2: " + resultSet.getString( "Apellido2" ) );
            	   System.out.println( "Direccion: " + resultSet.getString( "Direccion" ) );
            	   System.out.println( "Poblacion: " + resultSet.getString( "Poblacion" ) );
            	   System.out.println( "-------------------------------------------------" );
            }
            
            stmt.close();
            connection.close();
        }
        catch( Exception e){
        	   throw e;
        } 
    }
 
    private Connection connectDatabase() throws Exception{ 
    	
    	 Connection conn = null;
    	
    	 try{
    		 System.out.println( "------------------ 'INICIO' - connectDatabase ------------------") ;
    		 
    		 Class.forName( "com.mysql.jdbc.Driver" );
    		 String host        = System.getenv( "MYSQL_HOST" );      //172.30.103.171
    		 String baseDatos   = System.getenv( "MYSQL_DB" );        //sampledb
    		 String usuario     = System.getenv( "MYSQL_USER" );      //ser7T8
    		 String contrasenia = System.getenv( "MYSQL_PASSWORD" );  //F2VoohcW4pRQxGWG
    		 //String cadenaConexion = "jdbc:mysql://" + host + ":3306/" + baseDatos, usuario, contrasenia;
    		 
    		 String cadenaConexion = "jdbc:mysql://" + host + ":3306/" + baseDatos + "";
    		 System.out.println( "- cadenaConexion: [" + cadenaConexion + "]" ) ;
    		 
    		 conn = DriverManager.getConnection( cadenaConexion, usuario, contrasenia );    		 
         }
         catch( Exception e){
         	    throw e;
         }   
    	        
         return conn; 
    }

}

