package com.logica;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.interfaz.Divisas;

public class Conversor {
	public static double convertir(Divisas divisas, int totalMonedaOrigen) {
		double sinDecimales = totalMonedaOrigen* divisas.getValorDeConversion(); 
		   BigDecimal bd = new BigDecimal(sinDecimales).setScale(2, RoundingMode.HALF_UP);
		return bd.floatValue();

		
		
		
	} 
}
