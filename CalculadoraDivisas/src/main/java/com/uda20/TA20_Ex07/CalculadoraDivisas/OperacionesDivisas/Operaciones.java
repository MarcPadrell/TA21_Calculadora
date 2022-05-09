package com.uda20.TA20_Ex07.CalculadoraDivisas.OperacionesDivisas;

import com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas.Dolar;
import com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas.Euro;
import com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas.Libra;
import com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas.Moneda;
import com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas.Peso;
import com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas.Rublo;

public class Operaciones {

	// private Moneda divisa_1 = new Moneda();
	// private Moneda divisa_2 = new Moneda();

	public Operaciones() {

	}

	public double cambioDivisas(Moneda moneda_1, Moneda moneda_2) {
		
		double valor_final = 0.0;
		
		switch (moneda_1.getType()) {
		case "euro":
			
			
			
			return valor_final;
		case "dolar":
			
			return valor_final;
		case "libra":
			
			
			return valor_final;
		case "peso":
			
			
			return valor_final;
		case "rublo":
	
			return valor_final;
		default:
			return 0.0;
		}
		
	}

}
