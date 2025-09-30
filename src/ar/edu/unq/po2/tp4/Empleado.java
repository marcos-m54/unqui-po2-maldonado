package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();

	public void agregarIngreso(Ingreso unIngreso) {
		ingresos.add(unIngreso);
	}
	
	public Double getTotalPercibido() {
		return ingresos.stream()
					   .mapToDouble(ingreso -> ingreso.getMontoPercibido())
					   .sum();	
	}
	
	public Double getMontoImponible() {
		return ingresos.stream()
					   .mapToDouble(ingreso -> ingreso.getMontoImponible())
					   .sum();
	}
	
	public Double getImpuestoAPagar() {
		return this.getMontoImponible()*this.impuesto();
	}
	
	public Double impuesto() {
		return 0.02;
	}
}