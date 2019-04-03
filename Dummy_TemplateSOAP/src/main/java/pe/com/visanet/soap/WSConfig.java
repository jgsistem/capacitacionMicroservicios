package pe.com.visanet.soap;
 
import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.com.visanet.soap.ventas.generatesolicitude.interceptor.RequestInterceptor;
import pe.com.visanet.soap.ventas.generatesolicitude.interceptor.ResponseInterceptor;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.impl.GeneratesolicitudePortTypeSOAP11Impl;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.impl.GeneratesolicitudePortTypeSOAP12Impl;
 
@Configuration
public class WSConfig{
	
		@Bean
		public ServletRegistrationBean dispatcherServlet(){
	           return new ServletRegistrationBean( new CXFServlet(), "/ws/*" );
	    }
		
	    @Bean( name=Bus.DEFAULT_BUS_ID )
	    public SpringBus springBus() {    
	    	SpringBus springBus = new SpringBus();
	       	springBus.getInInterceptors().add(  new RequestInterceptor()  );
	    	springBus.getOutInterceptors().add( new ResponseInterceptor() );
	    	return springBus;
	    }	
	    
	    @Bean
	    public Endpoint endpoint11(){
	        EndpointImpl endpoint = new EndpointImpl( springBus(), new GeneratesolicitudePortTypeSOAP11Impl() );
	        endpoint.getFeatures().add( new LoggingFeature() );
	        endpoint.publish( "/Dummy_TemplateSOAP11" );
	        return endpoint;
	    }
	    
	    @Bean
	    public Endpoint endpoint12() {
	        EndpointImpl endpoint = new EndpointImpl( springBus(), new GeneratesolicitudePortTypeSOAP12Impl() );
	        endpoint.getFeatures().add( new LoggingFeature() );
	        endpoint.publish( "/Dummy_TemplateSOAP12" );
	        return endpoint;
	    }
	  
}

