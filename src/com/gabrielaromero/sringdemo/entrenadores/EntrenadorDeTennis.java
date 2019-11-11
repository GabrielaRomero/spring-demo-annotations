package com.gabrielaromero.sringdemo.entrenadores;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.gabrielaromero.sringdemo.Entrenador;
import com.gabrielaromero.sringdemo.FortunaService;

//@Component("tontoEntrenador")   //Sepued definir el nombre
//Scope("prototype") //Se indicaa que dejara de der un singleton (bens que ocupan el mismo espacio en memoria), ocupara distinto espacio en memoria
@Component  //SE indica que son los beans q escaneara Spring oo bean
public class EntrenadorDeTennis implements Entrenador {
	@Qualifier("randomFortunaService") //Anotacion para especificar que implementaciond e interfaz debe tomar
	@Autowired //Iyecion por field
	private FortunaService fortunaService;
	
	//Agregar contructor predeterminado
	 public EntrenadorDeTennis() {
		System.out.println(">> Entrenador de Tennis dentro del constructor por default");
	}
	 
	 //Definir metodo de inicio
	 @PostConstruct
	 private void  metodoInit() {
		 System.out.println(">> Enrenador de Tennis: adentro de metodoInit() ");
	}
	 
	 //Definir metodo de destruccion
	 @PreDestroy
	 private void  metodoDestroy() {
		 System.out.println(">> Enrenador de Tennis: adentro de metodoDestroy() ");
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
