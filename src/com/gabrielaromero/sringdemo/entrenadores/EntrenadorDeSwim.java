package com.gabrielaromero.sringdemo.entrenadores;

import org.springframework.beans.factory.annotation.Value;

import com.gabrielaromero.sringdemo.Entrenador;
import com.gabrielaromero.sringdemo.FortunaService;

public class EntrenadorDeSwim implements Entrenador {
	
	private FortunaService fortunaService;
	
	@Value("${foo.email}") //Toma los valores del archivo poperties que se agrego en la clase configracion
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	//Contrutor con param
	public EntrenadorDeSwim(FortunaService fortunaService) {
		this.fortunaService = fortunaService;
	}

	@Override
	public String getEjercicioDiario() {
		return "nada 100 metros como calentamiento";
	}

	@Override
	public String getFortunadiaria() {
		return fortunaService.getFortuna();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	
	
	
	

}
