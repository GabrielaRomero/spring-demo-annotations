package com.gabrielaromero.sringdemo.mains;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gabrielaromero.sringdemo.DeporteConfiguracion;
import com.gabrielaromero.sringdemo.Entrenador;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//leer clase de configuración Spring
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DeporteConfiguracion.class);
		
		//obtener el bean del contendor de spring  --lo toma de @compoent
		Entrenador elEntrenador = context.getBean("entrenadorDeTennis", Entrenador.class);
		
		//llamar el metodo del bean
		System.out.println(elEntrenador.getEjercicioDiario());
		System.out.println(elEntrenador.getFortunadiaria());
		
		//cerrar el contexto
		context.close();


	}

}
