package com.gabrielaromero.sringdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.gabrielaromero.sringdemo.entrenadores.EntrenadorDeSwim;
import com.gabrielaromero.sringdemo.implementaciones.TristeFortunaService;

@Configuration //anotacion para conigurar el contexto de Spring desde java
//@ComponentScan("com.gabrielaromero.sringdemo")   //anotacion para realizar el escaneo de componentesx
@PropertySource("classpath:deporte.properties") //llamamos al archivo porperties 
public class DeporteConfiguracion {
	//DEfinir el bean para la triste fortuna service
	@Bean
	public FortunaService tisteFortunaService() {
		return new TristeFortunaService();
	}
	
	//Definir el bean para el entrenador de swim y inyectar la dependencia
	@Bean
	public Entrenador entrenadorSwim() {
		return new  EntrenadorDeSwim(tisteFortunaService());
	}
	

}
