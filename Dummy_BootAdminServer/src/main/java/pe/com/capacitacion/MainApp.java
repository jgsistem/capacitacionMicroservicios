package pe.com.capacitacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter; 
import de.codecentric.boot.admin.config.*;

/**
 * MainApp
 * @author cguerra
 **/
 @EnableAdminServer     //Para: 'BOOT-ADMIN-SERVER'  
 @Configuration
 @SpringBootApplication
 public class MainApp{
 
	public static void main( String[] argumentos ){
		   SpringApplication.run( MainApp.class, argumentos );
	}

	@Configuration
	public static class SecurityConfig extends WebSecurityConfigurerAdapter{
		
		@Override
		protected void configure( HttpSecurity objHttp ) throws Exception{ 
				
				  objHttp.formLogin().loginPage( "/login.html" ).loginProcessingUrl( "/login" ).permitAll();
				  objHttp.logout().logoutUrl( "/logout" );
				  objHttp.csrf().disable();
	              
				  objHttp.authorizeRequests().antMatchers( "/login.html", "/**/*.css", "/img/**", "/third-party/**" ).permitAll();  
				  objHttp.authorizeRequests().antMatchers( "/**" ).authenticated();
	
				  objHttp.httpBasic();				  
	    }
	}

 }

