import static org.junit.Assert.*;

import org.junit.Test;

public class ContabilidadTest {

	@Test
	public void testIngresar() {
		Contabilidad contabilidad = new Contabilidad();
		contabilidad.ingresar(30.0);
		assertTrue(contabilidad.saldo == 30.0);
		assertFalse(contabilidad.saldo == 34.0);
	}
	
	@Test
	public void testExtraer() {
		Contabilidad contabilidad = new Contabilidad();
		contabilidad.ingresar(20.0);
		contabilidad.extraer(50.0);
		assertTrue(contabilidad.saldo >= 0);
	}

}
