package pe.com.visanet.soap.ventas.generatesolicitude.interceptor;

import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

@InInterceptors
public class RequestInterceptor extends LoggingInInterceptor{
	 
       private final Logger logger = Logger.getLogger( this.getClass().getName() );
    
	   @Override
	   public void handleMessage( Message objMessage ) throws Fault{ 
		      processPayLoad( objMessage );
		      super.handleMessage( objMessage );
	   }

	   private void processPayLoad( Message message ){
		       this.logger.info( "----------- IMPRIMIENTO 'PAYLOAD' [REQUEST] -----------" );
	   }
	
}


