package com.gabrielaromero.sringdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
	
		
		//leer archivo de configuración
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//obtener el bean del contendor de spring  --lo toma de @compoent
		Entrenador elEntrenador = context.getBean("entrenadorDeTennis", Entrenador.class);
		
		//llamar el metodo del bean
		System.out.println(elEntrenador.getEjercicioDiario());
		System.out.println(elEntrenador.getFortunadiaria());
		
		//cerrar el contexto
		context.close();

	}

}
