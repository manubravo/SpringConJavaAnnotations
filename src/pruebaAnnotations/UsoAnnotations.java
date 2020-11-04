package pruebaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {

//		Leer el XML de configuración
//		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Pedir un BEAN al contenedor
//		Empleados antonio = contexto.getBean("ComercialExperimentado",Empleados.class);
//		Empleados antonio = contexto.getBean("comercialExperimentado",Empleados.class);
//		Usar el BEAN
//		System.out.println(antonio.getInforme());
//		System.out.println(antonio.getTareas());
//		Cerrar el CONTEXTO
//		contexto.close();

		try (ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
//			Testeo del cierre de flujo
			Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);
			System.out.println(antonio.getInforme());
			System.out.println(antonio.getTareas());

		} catch (Exception e) {
			e.getMessage();
		}
	}
}