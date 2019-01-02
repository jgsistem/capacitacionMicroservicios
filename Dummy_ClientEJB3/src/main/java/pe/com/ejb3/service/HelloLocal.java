package pe.com.ejb3.service;

import javax.ejb.Local;

@Local
public interface HelloLocal{

	   public String saludar( String nombre );
	
}
