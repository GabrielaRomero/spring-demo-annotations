package com.gabrielaromero.sringdemo.mains;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gabrielaromero.sringdemo.Entrenador;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// Cargr archivo de congiguracion de Srping
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Obtener el bean desde el contenedor
		Entrenador entrenador = context.getBean("entrenadorDeTennis",Entrenador.class);
		
		Entrenador entrenadorAlfa = context.getBean("entrenadorDeTennis",Entrenador.class);
		
		//Checar si son iguales
		
		boolean result = (entrenador == entrenadorAlfa);
		
		System.out.println("Apuntando  a los mismo objetos "+result);
		System.out.println("Ubicacion de memoria para theCoach "+entrenador);
		System.out.println("Ubicacion de memoria para alphaCoach "+entrenadorAlfa);
		
		//cerrar el contexto
		context.close();
		
		

	}

}
