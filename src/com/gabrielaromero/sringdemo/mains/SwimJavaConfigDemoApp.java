package com.gabrielaromero.sringdemo.mains;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gabrielaromero.sringdemo.DeporteConfiguracion;
import com.gabrielaromero.sringdemo.Entrenador;
import com.gabrielaromero.sringdemo.entrenadores.EntrenadorDeSwim;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//leer clase de configuración Spring
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DeporteConfiguracion.class);
		
		//obtener el bean del contendor de spring  --lo toma dl nombre del metodo que se define en  seporte cofig.
		//Entrenador elEntrenador = context.getBean("entrenadorSwim", Entrenador.class);
		
		EntrenadorDeSwim elEntrenador = context.getBean("entrenadorSwim",EntrenadorDeSwim.class);
		
		//llamar el metodo del bean
		System.out.println(elEntrenador.getEjercicioDiario());
		System.out.println(elEntrenador.getFortunadiaria());
		
		//llamar los nuevos metohodos tiene los valores inyectados.
		System.out.println(elEntrenador.getEmail());
		System.out.println(elEntrenador.getTeam());
		
		//cerrar el contexto
		context.close();


	}

}
