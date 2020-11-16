package pruebaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {

//		try (ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			try (AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class)) {

//			Testeo del cierre de flujo
			Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);
			Empleados lucia = contexto.getBean("comercialExperimentado", Empleados.class);
			if (antonio == lucia) {
				System.out.println("Apuntan al mismo lugar de memoria");
				System.out.println(antonio + "\n" + lucia);
			} else {
				System.out.println("NO apuntan al mismo lugar de memoria");
				System.out.println(antonio + "\n" + lucia);
			}
			
			Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
			empleado.getTareas();
			empleado.getInforme();
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
}