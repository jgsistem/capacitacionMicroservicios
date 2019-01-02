package pe.com.capacitacion.filter;

import org.apache.log4j.Logger;
import com.netflix.zuul.ZuulFilter;  
 
public class ErrorFilter extends ZuulFilter{
	    
	   private final static Logger log = Logger.getLogger( ErrorFilter.class );
	
		@Override
		public String filterType(){
			   return "[ERROR]";
		}
	
		@Override
		public int filterOrder(){
			return 0;
		}
	
		@Override
		public boolean shouldFilter(){
			return true;
		}
	
		@Override
		public Object run(){
			   log.info( "====================== DENTRO: [ErrorFilter] - [run] ======================" );
			   log.info( "==> Usando: 'ErrorFilter' ..!" );
			   return null;
		}

}