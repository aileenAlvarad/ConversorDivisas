package com.pruebas;

import com.interfaz.Divisas;

public class PrincipalDivisas {

	public static void main(String[] args) {
		System.out.println(Divisas.DOLAR_A_PESOS.name()); 
		System.out.println(Divisas.DOLAR_A_PESOS.getValorDeConversion());  
		
	}

}
