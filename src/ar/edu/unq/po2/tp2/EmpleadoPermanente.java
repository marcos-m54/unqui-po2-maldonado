package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	
	private Integer cantHijos;
	private Integer antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNac,
			Float sueldoBasico,Integer cantHijos, Integer antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}
	
	
	
	public int getCantHijos() {
		return cantHijos;
	}



	public void setCantHijos(Integer cantHijos) {
		this.cantHijos = cantHijos;
	}



	public int getAntiguedad() {
		return antiguedad;
	}



	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}



	@Override
	protected float sueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar();
	}

	@Override
	protected float sueldoNeto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected float retenciones() {
		return this.montoPorObraSocial() + 0;
	}
	
	protected float salarioFamiliar() {
		return this.montoAsignacionesPorHijo() + this.montoAsignacionPorConyuge() + this.montoAntiguedad()
	}
	
	
	
	
}
