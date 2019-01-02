package pe.com.ejb3.service;
 
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
 
@Stateless
@LocalBean
public class HelloBean implements HelloRemote, HelloLocal{
 
    public HelloBean(){        
    }

    public String saludar( String nombre ){          
           return "BIENVENIDO: " + nombre + ", FECHA DE INGRESO: [" + new java.util.Date() + "]";
     }
    
}
