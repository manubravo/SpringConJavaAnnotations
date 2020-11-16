package pruebaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("pruebaAnnotations")
public class EmpleadosConfig {
	
//	Definir el BEAN para InformeFinancieroDtoCompras
	@Bean // NOMBRE DEL MÉTODO ACTÚA COMO ID DEL BEAN EN XML
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { 
		return new InformeFinancieroDtoCompras();
	}
	
//	Definir el BEAN para DirectorFinanciero e inyectar dependencias
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
}
