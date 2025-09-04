package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado {

	public EmpleadoTemporal(String nombre, String direccion, String estadoCivil, LocalDate fechaNac,
			Float sueldoBasico) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		// TODO Auto-generated constructor stub
	}

	@Override
	float sueldoBruto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	float sueldoNeto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	float retenciones() {
		// TODO Auto-generated method stub
		return 0;
	}

}
