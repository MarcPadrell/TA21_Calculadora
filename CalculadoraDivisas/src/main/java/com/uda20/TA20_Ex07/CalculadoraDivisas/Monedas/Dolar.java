package com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas;

public class Dolar {
	
	private final double value_euro = 0.95;
	private final double value_libra = 0.81;
	private final double value_peso = 116.24;
	private final double value_rublo = 69.35;
	
	private int id = 2;
	
	public Dolar() {
		
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
