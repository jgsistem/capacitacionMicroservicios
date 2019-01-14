package pe.com.capacitacion.processor;

import java.math.BigDecimal;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

/**
 * RowProcessor
 * @author cguerra
 **/
 public class RowProcessor implements Processor{
	 
		public static final Logger log = Logger.getLogger( RowProcessor.class );
		
	    @SuppressWarnings( "unchecked" )
		public void process( Exchange objExchange ) throws Exception{ 
	    	   log.info( "---------------- [process] - [INICIO] ----------------" );
	    	
	    	   Message objMessage = objExchange.getOut(); 
	    	   
		       Map<String, Object> objColumna = objExchange.getIn().getBody( Map.class ); 
		       log.info( "- EJECUTANDO: [" + objColumna + "]" ); 
		       ServLlamada objServLlamada = new ServLlamada(); 
	 
		       objServLlamada.setId( (BigDecimal)objColumna.get( "SLL_ID" ) ); 
		       objServLlamada.setTelefono( (String)objColumna.get( "SLL_TELEFONO" ) );        
		       objServLlamada.setTecnologia( (String)objColumna.get( "SLL_TECNOLOGIA" ) );        
		       objServLlamada.setCodigo( (String)objColumna.get( "SLL_CODIGO" ) );  
		       objServLlamada.setMensaje( (String)objColumna.get( "SLL_MENSAJE" ) );  
		       objServLlamada.setPaquete( (String)objColumna.get( "SLL_PAQUETE" ) );  
		       objServLlamada.setPlan( (String)objColumna.get( "SLL_PLAN" ) );     
		       objServLlamada.setSaldo( (String)objColumna.get( "SLL_SALDO" ) );  
	 
		       objMessage.setBody( objServLlamada );
	    	   log.info( "---------------- [process] - [FIN] ----------------" );
	    }

 }

 