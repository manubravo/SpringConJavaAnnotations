package pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {

		return "Presentación de informe catastrófico del trimestre 2";

	}
}