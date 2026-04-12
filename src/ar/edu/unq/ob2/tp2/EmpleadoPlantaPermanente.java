package ar.edu.unq.ob2.tp2;

import java.util.Date;
import java.util.List;

public class EmpleadoPlantaPermanente extends Empleado{
	
	private int cantidadDeHijos;
	private int antiguedad;
	
	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, Date fechaDeNacimiento,
			int sueldoBasico, List<ReciboHaberes> recibos, int cantidadDeHijos, int antiguedad) {
			super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico, recibos);
			this.setCantidadDeHijos(cantidadDeHijos);
			this.setAntiguedad(antiguedad);
	}
	
	
	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}


	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

	
	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public Double sueldoBruto() {
		return this.salarioFamiliar() + this.getSueldoBasico() ;
	}
	@Override
	public Double retenciones() {
		return this.costoObraSocial() + this.aporteJubilatorio();
	}
	@Override
	public Double costoObraSocial() {
		return (0.1 * this.sueldoBruto()) + (20 * this.getCantidadDeHijos());
	}
	@Override
	public Double sueldoNeto() {
		return this.getSueldoBasico() - this.retenciones();
	}
	
	public Double salarioFamiliar() {
		return this.asignacionPorHijo() + this.beneficioConyuge() + this.antiguedad();
	}
	
	public Double asignacionPorHijo() {
		return (double) (150 * this.getCantidadDeHijos());
	}
	
	public Double beneficioConyuge() {
		if (this.getEstadoCivil() == "Casado") {
			return (double) 100;
		} else {
			return (double) 0;
		}
	}
	
	public Double antiguedad() {
		return (double) (this.getAntiguedad() * 50);
	}
	
	public Double aporteJubilatorio() {
		return 0.15 * this.sueldoBruto();
	}

}
