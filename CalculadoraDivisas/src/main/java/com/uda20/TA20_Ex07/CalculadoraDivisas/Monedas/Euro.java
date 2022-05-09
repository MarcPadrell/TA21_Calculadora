package com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas;

public class Euro {
	
	private final double value_dolar = 1.05;
	private final double value_libra = 0.85;
	private final double value_peso = 122.48;
	private final double value_rublo = 73.08;
	
	private int id = 1;
	
	public Euro() {
	}

	public double getValue_dolar() {
		return value_dolar;
	}

	public double getValue_libra() {
		return value_libra;
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
