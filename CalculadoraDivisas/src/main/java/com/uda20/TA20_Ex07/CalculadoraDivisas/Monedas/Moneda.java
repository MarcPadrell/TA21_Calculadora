package com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas;

public class Moneda {

	protected Dolar dolar;
	protected Euro euro;
	protected Libra libra;
	protected Peso peso;
	protected Rublo rublo;

	private String type;

	public Moneda() {

		this.dolar = new Dolar();
		this.euro = new Euro();
		this.libra = new Libra();
		this.peso = new Peso();
		this.rublo = new Rublo();

	}

	public Dolar getDolar() {
		return dolar;
	}



	public Euro getEuro() {
		return euro;
	}



	public Libra getLibra() {
		return libra;
	}


	public Peso getPeso() {
		return peso;
	}

	
	public Rublo getRublo() {
		return rublo;
	}


	public void escogerMoneda(int numero) {

		switch (numero) {
		case 1:
			type = "euro";
			break;
		case 2:
			type = "dolar";
			break;
		case 3:
			type = "peso";
			break;
		case 4:
			type = "libra";
			break;
		case 5:
			type = "rublo";
			break;
		default:
			break;
		}

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
