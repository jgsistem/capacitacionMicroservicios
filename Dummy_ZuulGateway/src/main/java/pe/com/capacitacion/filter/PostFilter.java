package pe.com.capacitacion.filter;

import org.apache.log4j.Logger;
import com.netflix.zuul.ZuulFilter; 
 
public class PostFilter extends ZuulFilter{
	   
	   private final static Logger log = Logger.getLogger( PostFilter.class );
	
		@Override
		public String filterType(){
			   return "[POST]";
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
			   log.info( "====================== DENTRO: [PostFilter] - [run] ======================" ); 
			   log.info( "==> Usando: 'PostFilter' ..!" );
			   return null;
		}

}