package pe.com.capacitacion.filter;

import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
 
public class PreFilter extends ZuulFilter{
	   
	   private final static Logger log = Logger.getLogger( PreFilter.class );
		   
		@Override
		public String filterType(){
			   return "[PRE]";
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
			   log.info( "====================== DENTRO: [PreFilter] - [run] ======================" ); 
			   RequestContext     ctx     = RequestContext.getCurrentContext();
			   HttpServletRequest request = ctx.getRequest();
			   log.info( "==> Usando: 'PreFilter' ..!" );
			   log.info( "- Request Method: [" + request.getMethod() + "], Request URL: [" + request.getRequestURL() + "]" ); 
			   return null;
		}

 }
