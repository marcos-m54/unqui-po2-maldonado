package ar.edu.unq.ob2.tp2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private Date fechaDeNacimiento;
	private int sueldoBasico;
	private List<ReciboHaberes> recibos = new ArrayList<ReciboHaberes>(); 
	
	public Empleado(String nombre, String direccion, String estadoCivil, Date fechaDeNacimiento, int sueldoBasico,
			List<ReciboHaberes> recibos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
		this.recibos = recibos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(int sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public List<ReciboHaberes> getRecibos() {
		return recibos;
	}

	public void setRecibos(List<ReciboHaberes> recibos) {
		this.recibos = recibos;
	}


	
	public abstract Double sueldoBruto();
	public abstract Double retenciones();
	public abstract Double costoObraSocial();
	public abstract Double sueldoNeto();
	
	
	
	
	
	
}
