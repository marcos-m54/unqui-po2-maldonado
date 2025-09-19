package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends Ingreso{
	private int cantHorasExtras;

	public IngresoHorasExtras(int mes, String concepto, Double montoPercibido, int IngresoHorasExtras) {
		super(mes, concepto, montoPercibido);
		this.setCantHorasExtras(IngresoHorasExtras);	
	}

	public int getCantHorasExtras() {
		return cantHorasExtras;
	}

	public void setCantHorasExtras(int cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}
	
	@Override
	public Double getMontoImponible() {
		return 0.0;
	}

	
	
}
