package pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {

		return "Presentaci�n de informe favorable del trimestre 3";
	}
}