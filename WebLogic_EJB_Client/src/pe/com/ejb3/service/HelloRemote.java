package pe.com.ejb3.service;

import javax.ejb.Remote;

@Remote
public interface HelloRemote{

	   public String saludar( String nombre );
	
}
