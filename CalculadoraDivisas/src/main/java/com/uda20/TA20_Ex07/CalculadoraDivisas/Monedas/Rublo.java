package com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas;

public class Rublo{
	//Definir e inicializar atributos de equivalencia del rublo mediante constantes
	private final double value_dolar = 0.014;
	private final double value_euro = 0.014;
	private final double value_libra = 0.012;
	private final double value_peso = 1.68;
	
	private int id = 5;

	
	public Rublo() {
		
	}

	public double getValue_dolar() {
		return value_dolar;
	}

	public double getValue_euro() {
		return value_euro;
	}

	public double getValue_libra() {
		return value_libra;
	}

	public double getValue_peso() {
		return value_peso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
