package ar.edu.unq.ob2.tp2;

import java.util.Date;
import java.util.List;

public class EmpleadoTemporario extends Empleado{
	
	private Date fechaFinDesignacion;
	private int cantidadHorasExtra;
	
	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, Date fechaDeNacimiento,
			int sueldoBasico, List<ReciboHaberes> recibos, Date fechaFinDesignacion, int cantidadHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico, recibos);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.cantidadHorasExtra = cantidadHorasExtra;
	}

	public Date getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}

	public void setFechaFinDesignacion(Date fechaFinDesignacion) {
		this.fechaFinDesignacion = fechaFinDesignacion;
	}

	public int getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}

	public void setCantidadHorasExtra(int cantidadHorasExtra) {
		this.cantidadHorasExtra = cantidadHorasExtra;
	}

	@Override
	public Double sueldoBruto() {
		
		return this.getSueldoBasico() + this.calculoHorasExtra();
	}

	public Double calculoHorasExtra() {
		return (double) (40 * this.getCantidadHorasExtra());
	}
	
	@Override
	public Double retenciones() {
		return this.costoObraSocial() + this.aporteJubilatorio();
	}

	@Override
	public Double costoObraSocial() {
		return 0.1 * this.sueldoBruto() + this.montoSiSupera50();
	}
	
	public int edad() {
		return 25; //TODO
	}
	
	public Double montoSiSupera50() {
		if (this.edad() > 50) {
			return (double) 25;
		} else {
			return (double) 0;
		}
	}
	
	public Double aporteJubilatorio() {
		return (0.1 * this.sueldoBruto()) + (this.getCantidadHorasExtra() * 5);
	}

	@Override
	public Double sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	
	

}
