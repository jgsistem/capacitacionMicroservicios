package pe.com.capacitacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean; 
import pe.com.capacitacion.filter.*; 
import org.apache.log4j.Logger;
 
@EnableDiscoveryClient   //AUREKA. 
@EnableZuulProxy         //ZUUL
@SpringBootApplication
public class MainApp{
	    
		private final static Logger log = Logger.getLogger( MainApp.class );
		
		public static void main( String[] argumentos ){
			   SpringApplication.run( MainApp.class, argumentos );
		}
	
		@Bean
		public PreFilter preFilter(){
			   log.info( "---------------- [preFilter] ----------------" );
			   return new PreFilter();
		}
	
		@Bean
		public PostFilter postFilter(){
			   log.info( "---------------- [postFilter] ----------------" );
			   return new PostFilter();
		}
	
		@Bean
		public ErrorFilter errorFilter(){
			   log.info( "---------------- [errorFilter] ----------------" );
			   return new ErrorFilter();
		}
	
		@Bean
		public RouteFilter routeFilter(){
			   log.info( "---------------- [routeFilter] ----------------" ); 
			   return new RouteFilter();
		}

 }

