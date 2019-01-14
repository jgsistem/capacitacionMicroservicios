package pe.com.capacitacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
 
@SpringBootApplication
@ImportResource( { "classpath:spring/spring-camel-context.xml" } )
public class MainApp{

	   public static void main( String[] argumentos ) throws Exception{
		      SpringApplication.run( MainApp.class, argumentos );		       
	   } 
}
