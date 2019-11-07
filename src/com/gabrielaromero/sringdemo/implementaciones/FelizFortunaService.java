package com.gabrielaromero.sringdemo.implementaciones;

import org.springframework.stereotype.Component;

import com.gabrielaromero.sringdemo.FortunaService;

@Component
public class FelizFortunaService implements FortunaService {

	@Override
	public String getFortuna() {
		return "Suerte tu dia de hoy";
	}

}
