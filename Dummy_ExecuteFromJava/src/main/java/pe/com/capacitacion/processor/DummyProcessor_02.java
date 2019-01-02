package pe.com.capacitacion.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;

/**
 * DummyProcessor_02
 * @author cguerra
 **/
 public class DummyProcessor_02 implements org.apache.camel.Processor{
		
		public void process( Exchange exchange ) throws Exception{
			   
			   Message  objMsg   = exchange.getIn();
			
			   String   objInput = objMsg.getBody( String.class ); 
			   String[] arreglo  = objInput.split( "-" );	 
			   String   vCadena  = (arreglo[0].trim() + "|" + arreglo[1].trim()  + "|" + arreglo[2].trim() );
			   
			   objMsg.setBody( vCadena, String.class ); 
		}
		
}
