package pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {

		return "Presentaci�n del infomr financiero de FIN DE A�O";
	}

}
