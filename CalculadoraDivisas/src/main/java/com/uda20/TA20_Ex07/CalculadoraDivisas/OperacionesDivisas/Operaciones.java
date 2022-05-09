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

	public double cambioDivisas(Moneda moneda_1, int cantidadMoneda1, Moneda moneda_2) {

		double valor_final = 0.0;

		switch (moneda_1.getType()) {
		case "euro":
			switch (moneda_2.getType()) {
			case "dolar":
				return cantidadMoneda1 * moneda_2.getEuro().getValue_dolar();
			case "peso":
				return cantidadMoneda1 * moneda_2.getEuro().getValue_peso();
			case "libra":
				return cantidadMoneda1 * moneda_2.getEuro().getValue_libra();
			case "rublo":
				return cantidadMoneda1 * moneda_2.getEuro().getValue_rublo();
			default:
				break;
			}
		
		case "dolar":
			switch (moneda_2.getType()) {
			case "euro":
				return cantidadMoneda1 * moneda_2.getDolar().getValue_euro();
			case "peso":
				return cantidadMoneda1 * moneda_2.getDolar().getValue_peso();
			case "libra":
				return cantidadMoneda1 * moneda_2.getDolar().getValue_libra();
			case "rublo":
				return cantidadMoneda1 * moneda_2.getDolar().getValue_rublo();
			default:
				break;
			}
			
		case "libra":
			switch (moneda_2.getType()) {
			case "euro":
				return cantidadMoneda1 * moneda_2.getLibra().getValue_euro();
			case "peso":
				return cantidadMoneda1 * moneda_2.getLibra().getValue_peso();
			case "dolar":
				return cantidadMoneda1 * moneda_2.getLibra().getValue_dolar();
			case "rublo":
				return cantidadMoneda1 * moneda_2.getLibra().getValue_rublo();
			default:
				break;
			}
		
		case "peso":
			switch (moneda_2.getType()) {
			case "euro":
				return cantidadMoneda1 * moneda_2.getPeso().getValue_euro();
			case "libra":
				return cantidadMoneda1 * moneda_2.getPeso().getValue_libra();
			case "dolar":
				return cantidadMoneda1 * moneda_2.getPeso().getValue_dolar();
			case "rublo":
				return cantidadMoneda1 * moneda_2.getPeso().getValue_rublo();
			default:
				break;
			}
			
		case "rublo":
			switch (moneda_2.getType()) {
			case "euro":
				return cantidadMoneda1 * moneda_2.getRublo().getValue_euro();
			case "libra":
				return cantidadMoneda1 * moneda_2.getRublo().getValue_libra();
			case "dolar":
				return cantidadMoneda1 * moneda_2.getRublo().getValue_dolar();
			case "rublo":
				return cantidadMoneda1 * moneda_2.getRublo().getValue_peso();
			default:
				break;
			}
		default:
			return 0.0;
		}

	}
	
	/*public double moneda2 (int cantidadMoneda, Moneda moneda) {
	
		switch (moneda.getType()) {
		case"euro":
			return cantidadMoneda * moneda.getEuro().getValue_libra()
		case "dolar":
			return cantidadMoneda * moneda.getEuro().getValue_dolar();
		case "peso":
			return cantidadMoneda * moneda.getEuro().getValue_peso();
		case "libra":
			return cantidadMoneda * moneda.getEuro().getValue_libra();
		case "rublo":
			return cantidadMoneda * moneda.getEuro().getValue_rublo();
		default:
			break;
		}
		return 0.0;
	}*/

}
