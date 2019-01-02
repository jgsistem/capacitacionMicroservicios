package pe.com.capacitacion.processor;

public class Employee{
		
	   private long id;
	   private String nombre;
	   private String departamento;
		
		
	   public String getNombre(){
			  return nombre;
	   }
	   
	   public void setNombre( String nombre ){
			  this.nombre = nombre;
	   }  
	   
	   public double getId() {
			  return id;
	   }
		
	   public void setId( long id ){
			  this.id = id;
	   }
		
	   public String getDepartamento(){
			  return departamento;
	   }
		
	   public void setDepartamento( String departamento ){
			  this.departamento = departamento;
	   }
 
 }
