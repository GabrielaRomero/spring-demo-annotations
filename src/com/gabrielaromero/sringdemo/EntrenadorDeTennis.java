package com.gabrielaromero.sringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("tontoEntrenador")  
@Component
public class EntrenadorDeTennis implements Entrenador {
	@Qualifier("randomFortunaService") //Anotacion para especificar que implementaciond e interfaz debe tomar
	@Autowired //Iyecion por field
	private FortunaService fortunaService;
	
	//Agregar contructor predeterminado
	 public EntrenadorDeTennis() {
		System.out.println(">> Entrenador de Tennis dentro del constructor por default");
	}
	
//	 //Definir metodo setter
//	 @Autowired //Inyeccion por setter
//	 public void setFortunaService(FortunaService laFortunaService) {
//		 System.out.println(">> Entrenador de Tennis dentro del metodo cualquiera");
//		 this.fortunaService= laFortunaService;
//	 }
//	 
//	 
//	 @Autowired //Inyeccion por setter
//	 public void hacerCualquierCosa(FortunaService laFortunaService) {
//		 System.out.println(">> Entrenador de Tennis dentro del metodo setter");
//		 this.fortunaService= laFortunaService;
//	 }

	
//	@Autowired //Inyeccion por contructor
//	public EntrenadorDeTennis(FortunaService theFortunaService) {
//		this.fortunaService=theFortunaService;
//	}

	@Override
	public String getEjercicioDiario() {
		return "Pactica tu volea al revez";
	}

	@Override
	public String getFortunadiaria() {
		return fortunaService.getFortuna();
	}

}
