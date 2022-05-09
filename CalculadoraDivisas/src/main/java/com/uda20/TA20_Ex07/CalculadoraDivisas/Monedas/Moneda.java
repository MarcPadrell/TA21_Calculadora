package com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas;

public class Moneda {

	private Dolar dolar;
	private Euro euro;
	private Libra libra;
	private Peso peso;
	private Rublo rublo;

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

	public void setDolar(Dolar dolar) {
		this.dolar = dolar;
	}

	public Euro getEuro() {
		return euro;
	}

	public void setEuro(Euro euro) {
		this.euro = euro;
	}

	public Libra getLibra() {
		return libra;
	}

	public void setLibra(Libra libra) {
		this.libra = libra;
	}

	public Peso getPeso() {
		return peso;
	}

	public void setPeso(Peso peso) {
		this.peso = peso;
	}

	public Rublo getRublo() {
		return rublo;
	}

	public void setRublo(Rublo rublo) {
		this.rublo = rublo;
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
			type = "libra";
			break;
		case 4:
			type = "peso";
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
