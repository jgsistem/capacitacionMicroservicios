package pe.com.capacitacion.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;

/**
 * DummyProcessor_01
 * @author cguerra
 **/
 public class DummyProcessor_01 implements org.apache.camel.Processor{
		
		public void process( Exchange exchange ) throws Exception{
			   
			   Message  objMsg   = exchange.getIn();
			
			   String   objInput = objMsg.getBody( String.class ); 
			   String[] arreglo  = objInput.split( "," );
				
			   Employee objEmpleado = new Employee(); 
			   objEmpleado.setNombre( arreglo[0] );		
			   objEmpleado.setId( Integer.parseInt( arreglo[1] ) );
			   objEmpleado.setDepartamento( arreglo[2] ); 
				
			   objMsg.setBody( objEmpleado, Employee.class ); 
		}
		
}
