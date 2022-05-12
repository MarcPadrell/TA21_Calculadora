package com.uda20.TA20_Ex07.CalculadoraDivisas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.uda20.TA20_Ex07.CalculadoraDivisas.Interficie.Frame;
import com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas.Dolar;
import com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas.Euro;
import com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas.Libra;
import com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas.Moneda;
import com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas.Peso;
import com.uda20.TA20_Ex07.CalculadoraDivisas.Monedas.Rublo;
import com.uda20.TA20_Ex07.CalculadoraDivisas.OperacionesDivisas.Operaciones;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testApp() {
		App app = new App();
		app.main(null);
	}

	Frame frame = new Frame();

	@Test
	public void testBorraUltimoChar() {
		String r = frame.borrarUltimoChar("ae");
		String e = "a";
		// System.out.println(e + " e\n" + r + " r\n");
		assertEquals(e, r);
	}

	@Test
	public void testBorraUltimoChar1() {
		String r = frame.borrarUltimoChar("0");
		String e = "0";
		// System.out.println(e + " e\n" + r + " r\n");
		assertEquals(e, r);
	}

	@Test
	public void testborrarTodo() {
		frame.borrarTodo();
	}

	// divisa1focus false

	@Test
	public void testcalcularDivisas() {
		frame.setDivisa1focus(false);
		frame.calcularDivisas();
	}

	@Test
	public void controlarSiEs0() {
		frame.setDivisa1focus(false);
		frame.controlarSiEs0();
	}

	@Test
	public void testanadirComa() {
		frame.setDivisa1focus(false);
		frame.anadirComa("123");
	}

	@Test
	public void testanadirComa1() {
		frame.setDivisa1focus(false);
		frame.anadirComa("12.3");
	}

	@Test
	public void testaccionBotonNumero() {
		frame.setDivisa1focus(false);
		frame.accionBotonNumero(0);
	}

	@Test
	public void testaccionBotonEliminar() {
		frame.setDivisa1focus(false);
		frame.accionBotonEliminar();
	}

	// frame.divisas1focus true
	@Test
	public void testcalcularDivisas1() {
		frame.setDivisa1focus(true);
		frame.calcularDivisas();
	}

	@Test
	public void controlarSiEs01() {
		frame.setDivisa1focus(true);
		frame.controlarSiEs0();
	}

	@Test
	public void testanadirComa2() {
		frame.setDivisa1focus(true);
		frame.anadirComa("123");
	}

	@Test
	public void testanadirComa2_1() {
		frame.setDivisa1focus(true);
		frame.anadirComa("12.3");
	}

	@Test
	public void testaccionBotonNumero1() {
		frame.setDivisa1focus(true);
		frame.accionBotonNumero(0);
	}

	@Test
	public void testaccionBotonEliminar1() {
		frame.setDivisa1focus(true);
		frame.accionBotonEliminar();
	}

	// Moneda
	Moneda moneda = new Moneda();

	@Test
	public void testmonedaGetters() {
		moneda.getDolar();
		moneda.getEuro();
		moneda.getLibra();
		moneda.getPeso();
		moneda.getRublo();
		moneda.getType();
	}

	@Test
	public void testmonedaSetters() {
		moneda.setType("peso");
	}

	@Test
	public void testescogerMoneda() {
		moneda.escogerMoneda(1);
		moneda.escogerMoneda(2);
		moneda.escogerMoneda(3);
		moneda.escogerMoneda(4);
		moneda.escogerMoneda(5);
	}

	Dolar dolar = new Dolar();

	@Test
	public void testDolarGettesr() {
		dolar.getValue_euro();
		dolar.getValue_libra();
		dolar.getValue_peso();
		dolar.getValue_rublo();
	}

	Euro euro = new Euro();

	@Test
	public void testEuroGetters() {
		euro.getValue_dolar();
		euro.getValue_libra();
		euro.getValue_peso();
		euro.getValue_rublo();
	}

	Libra libra = new Libra();

	@Test
	public void testLibraGetters() {
		libra.getValue_dolar();
		libra.getValue_euro();
		libra.getValue_peso();
		libra.getValue_rublo();
	}

	Peso peso = new Peso();

	@Test
	public void testPesoGetters() {
		peso.getValue_dolar();
		peso.getValue_euro();
		peso.getValue_libra();
		peso.getValue_rublo();
	}

	Rublo rublo = new Rublo();

	@Test
	public void testRubloGetters() {
		rublo.getValue_dolar();
		rublo.getValue_euro();
		rublo.getValue_libra();
		rublo.getValue_peso();
	}

	Operaciones operaciones = new Operaciones();
	Moneda moneda1 = new Moneda();
	Moneda moneda2 = new Moneda();

	// Euro
	@Test
	public void testOperacionesED() {
		moneda1.escogerMoneda(1);
		moneda2.escogerMoneda(2);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 0.95;
		double d = 0.5;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesEP() {
		moneda1.escogerMoneda(1);
		moneda2.escogerMoneda(3);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 0.0082;
		double d = 1;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesEL() {
		moneda1.escogerMoneda(1);
		moneda2.escogerMoneda(4);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 1.15;
		double d = 0.5;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesER() {
		moneda1.escogerMoneda(1);
		moneda2.escogerMoneda(5);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 0.014;
		double d = 1.0;
		assertEquals(e, r, d);
	}

	// Dolars
	@Test
	public void testOperacionesDE() {
		moneda1.escogerMoneda(2);
		moneda2.escogerMoneda(1);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 1.05;
		double d = 0.5;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesDP() {
		moneda1.escogerMoneda(2);
		moneda2.escogerMoneda(3);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 0.0086;
		double d = 0.5;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesDL() {
		moneda1.escogerMoneda(2);
		moneda2.escogerMoneda(4);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 1.23;
		double d = 0.5;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesDR() {
		moneda1.escogerMoneda(2);
		moneda2.escogerMoneda(5);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 0.014;
		double d = 100;
		assertEquals(e, r, d);
	}

	// Peso
	@Test
	public void testOperacionesPE() {
		moneda1.escogerMoneda(3);
		moneda2.escogerMoneda(1);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 122.48;
		double d = 100;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesPD() {
		moneda1.escogerMoneda(3);
		moneda2.escogerMoneda(2);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 116.24;
		double d = 100;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesPL() {
		moneda1.escogerMoneda(3);
		moneda2.escogerMoneda(4);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 0.81;
		double d = 100;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesPR() {
		moneda1.escogerMoneda(3);
		moneda2.escogerMoneda(5);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 69.35;
		double d = 100;
		assertEquals(e, r, d);
	}

	// libra
	@Test
	public void testOperacionesLE() {
		moneda1.escogerMoneda(4);
		moneda2.escogerMoneda(1);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 0.85;
		double d = 100;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesLD() {
		moneda1.escogerMoneda(4);
		moneda2.escogerMoneda(2);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 0.81;
		double d = 100;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesLP() {
		moneda1.escogerMoneda(4);
		moneda2.escogerMoneda(3);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 0.007;
		double d = 100;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesLR() {
		moneda1.escogerMoneda(4);
		moneda2.escogerMoneda(5);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 0.012;
		double d = 100;
		assertEquals(e, r, d);
	}

	// Rublo
	@Test
	public void testOperacionesRE() {
		moneda1.escogerMoneda(5);
		moneda2.escogerMoneda(1);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 73.08;
		double d = 100;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesRD() {
		moneda1.escogerMoneda(5);
		moneda2.escogerMoneda(2);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 69.35;
		double d = 100;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesRP() {
		moneda1.escogerMoneda(5);
		moneda2.escogerMoneda(3);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 0.6;
		double d = 100;
		assertEquals(e, r, d);
	}

	@Test
	public void testOperacionesRL() {
		moneda1.escogerMoneda(5);
		moneda2.escogerMoneda(4);
		double r = operaciones.cambioDivisas(moneda1, 1, moneda2);
		double e = 85.54;
		double d = 100;
		assertEquals(e, r, d);
	}
}
