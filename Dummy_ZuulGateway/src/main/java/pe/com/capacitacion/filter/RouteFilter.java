package pe.com.capacitacion.filter;

import org.apache.log4j.Logger;
import com.netflix.zuul.ZuulFilter;
 
public class RouteFilter extends ZuulFilter{
	   
	   private final static Logger log = Logger.getLogger( PreFilter.class );
	   
		@Override
		public String filterType(){
			return "[ROUTE]";
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
			   log.info( "====================== DENTRO: [RouteFilter] - [run] ======================" ); 
			   log.info( "==> Usando: 'RouteFilter' ..!" );
			   return null;
		}

}