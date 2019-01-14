package pe.com.capacitacion.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.log4j.Logger;

/**
 * DepurateXMLProcesso_01
 * @author cguerra
 **/
 public class DepurateXMLProcesso_01 implements org.apache.camel.Processor{
 
	    public static final Logger log = Logger.getLogger( DepurateXMLProcesso_01.class );
	 
		public void process( Exchange exchange ) throws Exception{
			   
			   log.info( "---------------- DENTRO: [DepurateXMLProcesso_01] ----------------" );
			
			   Message  objMsg   = exchange.getIn();			
			   String   objInput = objMsg.getBody( String.class ); 
		 
			   objInput = objInput.replaceAll( "<listAudit/>", "" ).trim(); 
			   
			   objMsg.setBody( objInput, String.class ); 
		} 
}
