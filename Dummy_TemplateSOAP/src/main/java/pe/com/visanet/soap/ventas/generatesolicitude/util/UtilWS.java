package pe.com.visanet.soap.ventas.generatesolicitude.util;

import java.io.StringWriter;
import java.util.HashMap;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlObject;
 
/**
 * UtilWS
 * @author cguerra
 **/
 //@Slf4j 
 public class UtilWS{
	
		@SuppressWarnings( "rawtypes" )
		private static HashMap<Class, JAXBContext> objMapaContexto	= new HashMap<Class, JAXBContext>();	 
	  
		//-----------------------------------------------------------------------------------------------------------------------//
		  
	   /**
		* getJAXBContextFromClass
	    * @param  objClase
		* @return JAXBContext
		*/  
		@SuppressWarnings( "rawtypes" )
		private JAXBContext obtenerContextoJaxBFromClass( String mensajeTransaccion, Class objClase ){  
		 
		       JAXBContext objContexto = null;  
		       objContexto = objMapaContexto.get( objClase );

		       if( objContexto == null ){
		           try{ 
		               objContexto = JAXBContext.newInstance( objClase ); 
		               objMapaContexto.put( objClase, objContexto );
		           }
		           catch( Exception e ){
		        	      //log.error( mensajeTransaccion + "ERROR creando 'JAXBContext': ", e );
		           }
		       }
		       
		       return objContexto;
		}
			
	   /**
	    * transformarXmlTextFromJaxB
	    * @param  mensajeTransaccion
	    * @param  objJaxB
	    * @return String
	    */
		public String transformarXmlTextFromJaxB( String mensajeTransaccion, Object objJaxB ){
			
			String      commandoRequestEnXml = null;
			JAXBContext objContexto = null;  
			XmlObject   objXML      = null;
			
			try{
				objContexto = this.obtenerContextoJaxBFromClass( mensajeTransaccion, objJaxB.getClass() );  
																			 
				Marshaller   objMarshaller    = objContexto.createMarshaller();
				StringWriter objStringWritter = new StringWriter();
				
				objMarshaller.marshal( objJaxB, objStringWritter );
				
				objXML= XmlObject.Factory.parse( objStringWritter.toString() );
				commandoRequestEnXml = objXML.toString();
			}
			catch( Exception e ){
			       //log.error( mensajeTransaccion + "ERROR parseando object to 'XML': ", e );
			}
			
			return commandoRequestEnXml;
		}
		
	   /**
	    * transfromarAnyObjectToXmlText
	    * @param  objJaxB
	    * @return String
	    */
		@SuppressWarnings( { "rawtypes", "unchecked" } )
		public String transfromarAnyObjectToXmlText( String mensajeTransaccion, Object objJaxB ){
			
			String      commandoRequestEnXml = null;
			JAXBContext objContexto = null;  
			XmlObject   objXML      = null; 
			
			try{
				objContexto = this.obtenerContextoJaxBFromClass( mensajeTransaccion, objJaxB.getClass() ); 
																			
				Marshaller   objMarshaller    = objContexto.createMarshaller();
				StringWriter objStringWritter = new StringWriter();
				
				objMarshaller.marshal( new JAXBElement( new QName( "", objJaxB.getClass().getName() ), objJaxB.getClass(), objJaxB ), objStringWritter );
				objXML = XmlObject.Factory.parse( objStringWritter.toString() );
				
				commandoRequestEnXml = objXML.toString();
			}
			catch( Exception e ){
				   //log.error( mensajeTransaccion + "ERROR parseando object to 'XML': ", e );
			}
			
			return commandoRequestEnXml;
		}		
	
 }

 