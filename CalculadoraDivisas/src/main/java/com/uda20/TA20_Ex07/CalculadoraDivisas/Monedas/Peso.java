package com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas;

public class Peso {
	//Definir e inicializar atributos de equivalencia del peso mediante constantes
	private final double value_dolar = 0.0086;
	private final double value_euro = 0.0082;
	private final double value_libra = 0.007;
	private final double value_rublo = 0.6;
	
	private int id = 4;

	
	public Peso() {
		
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
