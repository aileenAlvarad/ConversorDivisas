package com.pruebas;

import com.interfaz.Divisas;
import com.logica.ConvertirStringAEnum;

public class PrincipalConvertirStringAEnum {

	public static void main(String[] args) { 
		String valor = "DOLAR_A_PESOS";
		Divisas conversion = ConvertirStringAEnum.convertir(valor); 
		System.out.println(conversion);


	}

}
