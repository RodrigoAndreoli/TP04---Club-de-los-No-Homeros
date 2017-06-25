package ar.edu.unlam.pb2.tp04;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

	@Test
	public void testMenorDeEdad() throws EdadException, NombreException {
		Cliente cliente1 = new Cliente("Martin", 15);
		Assert.assertTrue(cliente1.getEdad() < 19);
	}
	
	@Test
	public void testNombreNulo() throws EdadException, NombreException {
		Cliente cliente1 = new Cliente("", 20);
		Assert.assertTrue(cliente1.getNombre().isEmpty());
	}
	
	@Test
	public void testCompararNombres() throws EdadException, NombreException {
		Cliente cliente1 = new Cliente("Elena", 30);
		Cliente cliente2 = new Cliente("Sully", 54);
		Integer resultadoObtenido = cliente1.compareNombre(cliente2);
		Assert.assertTrue("Se espera que sea menor", resultadoObtenido < 0);
	}

}
