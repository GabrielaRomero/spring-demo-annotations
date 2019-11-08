package com.gabrielaromero.sringdemo.mains;

public class Poli {
	
	public String esPoli(String cadena) {
		
		String reverse = "";
		char[]  sopa  =cadena.toCharArray();
		
		for (int i = sopa.length-1; i >= 0; i--) {
			System.out.println("sopa en la posisiocn"+sopa[i]);

				reverse = reverse + sopa[i];
		}
		
		System.out.println("---"+sopa.length);
		System.out.println("---"+reverse);
		
		if(cadena.equalsIgnoreCase(reverse)) {
			System.out.println( "Es polindromo");
		}else {
			System.out.println( "no Es polindromo");
		}

		return "";
		
		
	}
	
public void esPoli2(String cadena) {
		
		String reverse = "";
		char[]  sopa  =cadena.toCharArray();
		int j=0;
		int bandera=0;
		for (int i = sopa.length-1; i >= (sopa.length/2);j++, i--) {
			if(sopa[i]!=sopa[j]) {
				bandera=1;
			}
		}
			
		if(bandera==0)
		{
			System.out.println( "Es polindromo");
		}else{
			System.out.println( "No es polindromo");
		}
			
		

		
		
		
	}
	

}
