package ar.edu.unq.ob2.tp2;

public class Empresa {
	
	private String nombre;
	private String cuit;
	
	public Empresa(String nombre, String cuit) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	public Double totalSueldoNeto() {
		return 0.0;
	}
	
	public Double totalSueldoBruto() {
		return 0.0;
	}
	
	public Double totalRetenciones() {
		return 0.0;
	}
	
	public void liquidacionDeSueldos() {
		
	}
	
	

}
