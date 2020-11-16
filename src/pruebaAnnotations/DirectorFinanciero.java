package pruebaAnnotations;

public class DirectorFinanciero implements Empleados {

	private CreacionInformeFinanciero informeFinanciero;
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		return "Gesti�n y direcci�n de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		return this.informeFinanciero.getInformeFinanciero();
	}
}
