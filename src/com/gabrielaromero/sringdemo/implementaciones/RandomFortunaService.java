package com.gabrielaromero.sringdemo.implementaciones;

import java.util.Random;

import javax.xml.crypto.Data;

import org.springframework.stereotype.Component;

import com.gabrielaromero.sringdemo.FortunaService;

@Component
public class RandomFortunaService implements FortunaService {
	
	//Creacion de un arreglo de strings
	private String[] datos= {"Buna Suerte", "Tu puedes hacerlo", "Solo hazlo", "Tu puedes" };
	
	private Random ran = new Random();

	@Override
	public String getFortuna() {
		//ejecucion del random
		int index =  ran.nextInt(datos.length);
		
		//Resultado del random
		String fortuna = datos[index];
	
		return fortuna;
	}

}
