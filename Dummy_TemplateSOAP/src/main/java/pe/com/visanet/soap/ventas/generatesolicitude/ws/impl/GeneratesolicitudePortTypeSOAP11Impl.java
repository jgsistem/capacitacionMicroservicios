package pe.com.visanet.soap.ventas.generatesolicitude.ws.impl;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger; 
import pe.com.visanet.soap.ventas.generatesolicitude.ws.BaseMessageFault;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.GeneratesolicitudePortTypeSOAP11;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.service.GenerateSolicitudeService;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.types.BaseBodyRequest;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.types.BaseBodyResponse;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.types.BaseHeaderRequest;
import pe.com.visanet.soap.ventas.generatesolicitude.ws.types.BaseHeaderResponse;
 
/**
 * GeneratesolicitudePortTypeSOAPImpl
 * @author cguerra
 **/ 
 @WebService
 @BindingType( SOAPBinding.SOAP11HTTP_BINDING )
 public class GeneratesolicitudePortTypeSOAP11Impl implements GeneratesolicitudePortTypeSOAP11{
 
	    private final Logger logger = Logger.getLogger( this.getClass().getName() );
	 
		private static final String CONFIG_PATH = "./applicationContext-camel.xml";
	 
	    @Autowired
	    private GenerateSolicitudeService generateSolicitudeService;
 
	    private ApplicationContext         objContextoSpring;
	    private AutowireCapableBeanFactory objAutowireBeanFactory;
	    
        //Constructor ...
        public GeneratesolicitudePortTypeSOAP11Impl(){        	
            this.objContextoSpring      = new ClassPathXmlApplicationContext( CONFIG_PATH );          
            this.objAutowireBeanFactory = this.objContextoSpring.getAutowireCapableBeanFactory();
 
            this.generateSolicitudeService = (GenerateSolicitudeService)this.objAutowireBeanFactory.createBean( GenerateSolicitudeService.class, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, true );   
        }
        
 	   /**
 	    * createSolicitude
 	    * @param objHeaderRequest
 	    * @param objBodyRequest
 	    * @param objHeaderResponse
 	    * @param objBodyResponse
 	    * @throws BaseMessageFault
 	    **/
		@Override
		public void createSolicitude( BaseHeaderRequest objHeaderRequest,
				                      BaseBodyRequest   objBodyRequest, 
				                      
				                      Holder<BaseHeaderResponse> objHeaderResponse,
				                      Holder<BaseBodyResponse>   objBodyResponse ) throws BaseMessageFault{
 
			   this.logger.info( "---------- INICIO - [createSolicitude] ----------" );
			
			   //Ejecutar: 
			   this.generateSolicitudeService.procesarServicio( objHeaderRequest, 
					                                            objBodyRequest, 
					                                            objHeaderResponse, 
					                                            objBodyResponse );
			   this.logger.info( "---------- FIN - [createSolicitude] ----------" );
		}        
 
 }
 
