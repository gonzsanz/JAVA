package Cafetera;

import static org.junit.Assert.*;

import org.junit.Test;

public class CafeteraJunit {

	@Test
	public void testGetCapacidadMaxima() {

		Cafetera c = new Cafetera(1000);
		c.llenarCafetera();
		assertEquals(1000, c.getCapacidadMaxima());
	}

	@Test
	public void testGetCapacidadActual() {
		Cafetera c = new Cafetera(1000);
		c.llenarCafetera();
		assertTrue(c.getCapacidadActual() == 1000);
	}

	@Test
	public void testLlenarCafetera() {
		Cafetera c = new Cafetera(1000);
		c.llenarCafetera();
		assertEquals(1000, c.getCapacidadActual());
	}

	@Test
	public void testVaciarCafetera() {
		Cafetera c = new Cafetera(500);
		c.vaciarCafetera();
		assertTrue(c.getCapacidadActual() == 0);
	}

	@Test
	public void testServirTaza() {
		Cafetera c = new Cafetera(1000);
		c.llenarCafetera();
		c.servirTaza(200);
		assertTrue(c.getCapacidadActual() > 0);
	}

	@Test
	public void testAgregarCafe() {
		Cafetera c = new Cafetera(1000);
		c.llenarCafetera();
		c.servirTaza(500);
		c.agregarCafe(200);
		assertTrue(c.getCapacidadActual() < c.getCapacidadMaxima());
	}

}
