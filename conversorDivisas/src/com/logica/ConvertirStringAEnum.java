package com.logica;

import com.interfaz.Divisas;

public class ConvertirStringAEnum {
	 
	public static Divisas convertir(String valorEnum) {
		Divisas divisas = Divisas.valueOf(valorEnum); //convirtiendo de String a Enum
		return divisas; 
		
	}
}
