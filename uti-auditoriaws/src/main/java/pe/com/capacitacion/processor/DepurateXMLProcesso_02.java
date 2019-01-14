package pe.com.capacitacion.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.log4j.Logger;

/**
 * DepurateXMLProcesso_02
 * @author cguerra
 **/
 public class DepurateXMLProcesso_02 implements org.apache.camel.Processor{
 
	    public static final Logger log = Logger.getLogger( DepurateXMLProcesso_02.class );
	 
		public void process( Exchange exchange ) throws Exception{
			   
			   log.info( "---------------- DENTRO: [DepurateXMLProcesso_02] ----------------" );
			
			   Message  objMsg   = exchange.getIn();			
			   String   objInput = objMsg.getBody( String.class ); 
  
			   objInput = objInput.replaceAll( "typ:", "").trim();
			   
			   objMsg.setBody( objInput, String.class ); 
		} 
}
