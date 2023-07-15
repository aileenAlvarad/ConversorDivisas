package com.pruebas;

import com.interfaz.Divisas;
import com.logica.Conversor;

public class PrincipalConversor {

	public static void main(String[] args) {
		System.out.println(Conversor.convertir(Divisas.DOLAR_A_PESOS, 16));
		System.out.println(Conversor.convertir(Divisas.PESOS_A_EURO, 100));
		
	
	}

}
