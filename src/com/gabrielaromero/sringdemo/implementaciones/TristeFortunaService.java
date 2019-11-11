package com.gabrielaromero.sringdemo.implementaciones;

import com.gabrielaromero.sringdemo.FortunaService;

public class TristeFortunaService implements FortunaService {

	@Override
	public String getFortuna() {
		return "el día de hoy es un día triste";
	}

}
