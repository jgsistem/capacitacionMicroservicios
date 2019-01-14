package pe.com.capacitacion;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource( { "classpath:spring/spring-camel-context.xml" } )
public class MainApp{

	   public static void main( String[] argumentos ){
		      SpringApplication.run( MainApp.class, argumentos );
	   }
	   
	   //IMPORTANTE. 
	   @Bean
	   public ServletRegistrationBean dispatcherServlet(){
	          return new ServletRegistrationBean( new CXFServlet(), "/*" );
	   }
	   
}
