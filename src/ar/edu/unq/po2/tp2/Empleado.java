package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;


public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaNac;
	private Float sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, Float sueldoBasico){
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNac = fechaNac;
		this.sueldoBasico = sueldoBasico;
	}
	
	public String getNombre(){
		return this.nombre;
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

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(Float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	protected int edad() {
		
		LocalDate fechaNacimiento = this.getFechaNac();
		LocalDate fechaDeHoy = LocalDate.now();
		Period edad = Period.between(fechaNacimiento, fechaDeHoy);
		
		return edad.getYears(); 
	}
	
	abstract float sueldoBruto();
	abstract float sueldoNeto();
	abstract float retenciones();
	
	
}
	
	