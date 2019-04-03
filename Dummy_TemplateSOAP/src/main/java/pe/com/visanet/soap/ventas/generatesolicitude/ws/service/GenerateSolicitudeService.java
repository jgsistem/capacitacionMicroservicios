package pe.com.visanet.soap.ventas.generatesolicitude.ws.service;

import org.apache.log4j.Logger;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder; 
import org.springframework.stereotype.Service; 
import pe.com.visanet.soap.generic.visanetaudit.ws.types.AuditResponseType;
import pe.com.visanet.soap.generic.visanetfault.ws.types.VisanetFaultType; 
import pe.com.visanet.soap.ventas.generatesolicitude.ws.BaseMessageFault;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.impl.BDConexion;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.types.BaseBodyRequest;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.types.BaseBodyResponse;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.types.BaseHeaderRequest;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.types.BaseHeaderResponse;

/**
 * GenerateSolicitudeService
 * @author cguerra
 **/ 
 @Service 
 public class GenerateSolicitudeService{
 
	    private final Logger logger = Logger.getLogger( this.getClass().getName() );
 
		//@Autowired
		private BDConexion bDConexion; 
	 
	   /**
	    * procesarServicio
	    * @param objHeaderRequest
	    * @param objBodyRequest
	    * @param objHeaderResponse
	    * @param objBodyResponse
	    * @throws BaseMessageFault
	    **/
		public void procesarServicio( BaseHeaderRequest objHeaderRequest,
				                      BaseBodyRequest   objBodyRequest, 
				                      
				                      Holder<BaseHeaderResponse> objHeaderResponse,
				                      Holder<BaseBodyResponse>   objBodyResponse ) throws BaseMessageFault{ 
			
			   this.logger.info( "------------------- INICIO - [procesarServicio] ------------------- " );
               
			   String vTxId    = objHeaderRequest.getAuditoriaRequest().getIdTransaction(); 
			   String vIpApp   = objHeaderRequest.getAuditoriaRequest().getIpApplication();
			   String vUserApp = objHeaderRequest.getAuditoriaRequest().getUserAplicacion(); 
			   String vNameApp = objHeaderRequest.getAuditoriaRequest().getNameAplicacion();
			   
			   System.out.println( "vTxId ====>: "    + vTxId  );
			   System.out.println( "vIpApp ====>: "   + vIpApp );
			   System.out.println( "vUserApp ====>: " + vUserApp );
			   System.out.println( "vNameApp ====>: " + vNameApp );
			   
			   BaseHeaderResponse objHeaderResponseTEMP = new BaseHeaderResponse();
			   BaseBodyResponse   objBodyResponseTEMP   = new BaseBodyResponse(); 
			   
			   VisanetFaultType   objVisanetFault       = null;
			   AuditResponseType  objAuditoriaResponse  = null;
			   
			   System.out.println( "objHeaderResponse: " + objHeaderResponse );
			   System.out.println( "objBodyResponse: "   + objBodyResponse   );
			   
			   try{ 
				   objAuditoriaResponse = new AuditResponseType();
				   objAuditoriaResponse.setIdTransaction( vTxId );
				   objAuditoriaResponse.setCodeResponse( "0" );
				   objAuditoriaResponse.setMessageResponse( "PROCESO EXISTOSO (JENKINs/OPENSHIFT)" );
				   
				   //HEADER:  		 
				   objHeaderResponseTEMP.setAuditoriaResponse( objAuditoriaResponse );
				   
				   //BODY:  
				   objBodyResponseTEMP.setDate( "11/11/2018"  );
				   objBodyResponseTEMP.setState( "REGISTRADO" );
				   				    
				   //ASIGNANDO: 
				   objHeaderResponse.value = objHeaderResponseTEMP; 
				   objBodyResponse.value   = objBodyResponseTEMP; 
				   
				   /*
				   System.out.println( "- MYSQL_HOST: ["     + System.getenv( "MYSQL_HOST" ) + "]" );
				   System.out.println( "- MYSQL_DB: ["       + System.getenv( "MYSQL_DB"   ) + "]" );
				   System.out.println( "- MYSQL_USER: ["     + System.getenv( "MYSQL_USER" ) + "]" );
				   System.out.println( "- MYSQL_PASSWORD: [" + System.getenv( "MYSQL_PASSWORD" ) + "]" );  
				   
				   this.bDConexion.coneccionBD();
				   */
			   }
			   catch( Exception e ){ 
				      e.printStackTrace();    
				   
				      try{	
						  objAuditoriaResponse = new AuditResponseType();
						  objAuditoriaResponse.setIdTransaction(  vTxId );
						  objAuditoriaResponse.setCodeResponse( "-1" );
						  objAuditoriaResponse.setMessageResponse( "ERROR EN EL PROCESO OK" ); 
						   
						  GregorianCalendar objFecha = new GregorianCalendar();
						  objFecha.setTime( new Date() );
						  XMLGregorianCalendar objFechaGreg = DatatypeFactory.newInstance().newXMLGregorianCalendar( objFecha );
						  
					      objVisanetFault = new VisanetFaultType();
					      objVisanetFault.setAuditResponse( objAuditoriaResponse );
					      objVisanetFault.setDate( objFechaGreg );
					      
					      throw new BaseMessageFault( "ERROR EN EL PROCESO", objVisanetFault );
					   } 
				       catch( Exception x ){ 
						      x.printStackTrace();
					   } 
			   } 
			   finally{ 
				       this.logger.info( "------------------- FIN - [procesarServicio] ------------------- " );
			   } 			   
		} 
 }

 
