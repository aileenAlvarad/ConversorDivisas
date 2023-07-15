package com.logica;

public class Validaciones {
	public static void main(String[] args) {
		String valorTextArea = "23";

		boolean valido = validarString(valorTextArea);
		System.out.println(valido);  
		
		boolean datoEsNumerico = Validaciones.validarString("43"); //validar si es entero o no
		System.out.println(datoEsNumerico);
	}

	public static boolean validarString(String stringAValidarSiEsEntero) {
		try {
			int number = Integer.parseInt(stringAValidarSiEsEntero);
			return true;
		} catch (NumberFormatException ex) {

		}
		return false;
	}
}
