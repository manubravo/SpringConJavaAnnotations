package pruebaAnnotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("ComercialExperimentado")
//@Scope("prototype") // con esto creamos varias instancias
@Component
public class ComercialExperimentado implements Empleados, InitializingBean, DisposableBean{
	
	@Autowired
	@Qualifier("informeFinancieroTrim2")
	private CreacionInformeFinanciero nuevoInforme;
	
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	@Override
	public String getTareas() {
		return "Vender, vender y m�s!!!";
	}

	@Override
	public String getInforme() {
		return this.nuevoInforme.getInformeFinanciero();
	}
	
//	@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
//	Ejecuci�n de c�digo despu�s de la creaci�n del BEAN
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras la creaci�n del BEAN");
	}
	
//	Ejecuci�n de c�digo desp�es de apagado contenedor SPRING
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes de la destrucci�n");
	}

	@Override
	public void destroy() throws Exception {
		ejecutaAntesDestruccion();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		ejecutaDespuesCreacion();
	}
}
