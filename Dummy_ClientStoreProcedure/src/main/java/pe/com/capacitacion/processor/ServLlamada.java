package pe.com.capacitacion.processor;

import java.math.BigDecimal;

/**
 * ServLlamada
 * @author cguerra
 **/
 public class ServLlamada{
	 
	    private BigDecimal id;
	    private String telefono;
	    private String tecnologia;
	    private String codigo;
	    private String mensaje;
	    private String paquete;
	    private String plan;
	    private String saldo;
		   
		public BigDecimal getId() {
			   return id;
		} 
		
		public void setId(BigDecimal id) {
			   this.id = id;
		}
		
		public String getTelefono() {
			   return telefono;
		}
		
		public void setTelefono(String telefono) {
			   this.telefono = telefono;
		}
		
		public String getTecnologia() {
			   return tecnologia;
		}
		
		public void setTecnologia(String tecnologia) {
			   this.tecnologia = tecnologia;
		}
		
		public String getCodigo() {
			   return codigo;
		}
		
		public void setCodigo(String codigo) {
			   this.codigo = codigo;
		}
		
		public String getMensaje() {
			   return mensaje;
		}
		
		public void setMensaje(String mensaje) {
			   this.mensaje = mensaje;
		}
		
		public String getPaquete() {
			   return paquete;
		}
		
		public void setPaquete(String paquete) {
			   this.paquete = paquete;
		}
		
		public String getPlan() {
			   return plan;
		}
		
		public void setPlan(String plan) {
			   this.plan = plan;
		}
		
		public String getSaldo() {
			   return saldo;
		}
		
		public void setSaldo(String saldo) {
			   this.saldo = saldo;
		}
	   
}

