package com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas;

public class Libra {
	//Definir e inicializar atributos de equivalencia la libra mediante constantes
	private final double value_dolar = 1.23;
	private final double value_euro = 1.17;
	private final double value_peso = 143.52;
	private final double value_rublo = 85.54;
	
	private int id = 3;
	
	public Libra() {
		
	}

	public double getValue_dolar() {
		return value_dolar;
	}

	public double getValue_euro() {
		return value_euro;
	}

	public double getValue_peso() {
		return value_peso;
	}

	public double getValue_rublo() {
		return value_rublo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
	
}
