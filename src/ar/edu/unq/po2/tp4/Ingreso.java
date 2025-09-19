package ar.edu.unq.po2.tp4;

public class Ingreso {
	private int mes;
	private String concepto;
	private Double montoPercibido;
	
	public Ingreso(int mes, String concepto, Double montoPercibido) {
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public Double getMontoPercibido() {
		return montoPercibido;
	}
	public void setMontoPercibido(Double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}
	public Double getMontoImponible() {
		return montoPercibido;
	}
	
	
	
}
