package com.interfaz;

public enum Divisas { 
	
	PESOS_A_DOLAR(0.059),
	DOLAR_A_PESOS(16.87), 
	PESOS_A_LIBRAS(0.046), 
	LIBRAS_A_PESOS(21.89), 
	PESOS_A_YEN(8.20),
	YEN_A_PESOS(0.12),
	PESOS_A_WON(75.61), 
	WON_A_PESOS(0.013), 
	PESOS_A_EURO(0.053), 
	EURO_A_PESOS(18.78)
	;
	
	private double valorDeConversion;
	
	private Divisas(double valorDeConversion) {
		this.valorDeConversion = valorDeConversion;  
	}

	public double getValorDeConversion() {
		return valorDeConversion;
	}

	public void setValorDeConversion(double valorDeConversion) {
		this.valorDeConversion = valorDeConversion;
	}

	
	
}
