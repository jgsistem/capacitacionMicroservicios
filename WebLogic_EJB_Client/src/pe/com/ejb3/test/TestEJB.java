package pe.com.ejb3.test;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;

import pe.com.ejb3.service.HelloRemote; 

/**
 * @author cguerra.
 * @clase: TestEJB.java  
 * @descripcion descripcion de la clase.
 * @fecha_de_creacion: dd-mm-yyyy.
 * @fecha_de_ultima_actualizacion: dd-mm-yyyy.
 * @version 1.0
 */
 public class TestEJB{

        private final Logger logger = LoggerFactory.getLogger( this.getClass().getName() );
     
       /**
        * main
        * @param argumentos
        */
        public static void main( String[] argumentos ){
            
            TestEJB objTest           = new TestEJB();            
            String           cadenaTransaccion = (new java.util.Date().getTime() + "");
            
            objTest.logger.info( "{} ###################### 'TestPlantillaEJB' [INICIO] ######################", cadenaTransaccion );
            
            Properties objPropiedades = new Properties(); 
            objPropiedades.put( Context.PROVIDER_URL,            "t3://localhost:7001" );  
            objPropiedades.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
            objPropiedades.put( Context.SECURITY_PRINCIPAL,      "weblogic" );  
            objPropiedades.put( Context.SECURITY_CREDENTIALS,    "12345678" );  
            
            objTest.logger.info( "{} ---- Propiedades 'Weblogic' Creadas ----", cadenaTransaccion ); 
            
            //---------- Obtener: JNDI ----------//
            //1.- Se debe armar un JNDI con el formato:  NOMBRE 'mappedName' + # + NOMBRE PAQUETE + NOMBRE 'CLASE REMOTA'. 
            //2.- Se debe buscar en:                     Entorno/Servidores/AdminServer/Ver Árbol de JNDI, y buscar el ejbXXXXX que corresponda al servicio. 
           
            String JNDI = "java:global.WebLogic_EJB_Demo.HelloBean!pe.com.ejb3.service.HelloRemote";    
            
            try{
                InitialContext objContexto = new InitialContext( objPropiedades ); 
                Object         objJNI      = objContexto.lookup( JNDI );
                objTest.logger.info( "{} objJNI: [{}]", cadenaTransaccion, objJNI );
                
                HelloRemote objEjcutarPlantillaEJB = (HelloRemote)PortableRemoteObject.narrow( objJNI, HelloRemote.class );
                objTest.logger.info( "{} HelloRemote: [{}]", cadenaTransaccion, objEjcutarPlantillaEJB );
                
                String vRespuesta =  objEjcutarPlantillaEJB.saludar( "CESAR GUERRA" ); 
                
                objTest.logger.info( "{} vRespuesta: [{}]", cadenaTransaccion, vRespuesta );
                 
            }
            catch( Exception e ){
                   e.printStackTrace();
                   objTest.logger.error( "{} ERROR (Exception): [{}]", cadenaTransaccion, e );
            }
            finally{
                    objTest.logger.info( "{} ####################### 'TestPlantillaEJB' [FIN] #######################", cadenaTransaccion );
            }
        }
    
 }
 
