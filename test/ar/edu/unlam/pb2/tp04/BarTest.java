package ar.edu.unlam.pb2.tp04;

import org.junit.Assert;
import org.junit.Test;

public class BarTest {

	@Test
	public void testBarAbierto() {
		Bar miBar = new Bar(new ComparatorNombre());
		miBar.abrirBar();
		Assert.assertTrue(miBar.getEstado());
	}
	
	@Test
	public void testClientesConNombresIguales() throws EdadException, NombreException {
		Bar miBar = new Bar(new ComparatorNombre());
		Cliente cliente1 = new Cliente("Elena", 30);
		Cliente cliente2 = new Cliente("Sully", 54);
		Cliente cliente3 = new Cliente("Nathan", 28);
		Cliente cliente4 = new Cliente("Nathan", 41);
		Cliente cliente5 = new Cliente("Elena", 64);
		miBar.ingresarCliente(cliente1);
		miBar.ingresarCliente(cliente2);
		miBar.ingresarCliente(cliente3);
		miBar.ingresarCliente(cliente4);
		miBar.ingresarCliente(cliente5);
		Integer intEsperado = 3;
		Integer intObtenido = miBar.getClientes().size();
		Assert.assertEquals(intEsperado, intObtenido);
	}
	
	@Test
	public void testClientesOrdenadosPorNombre() throws EdadException, NombreException {
		Bar miBar = new Bar(new ComparatorNombre());
		Cliente cliente1 = new Cliente("Elena", 30);
		Cliente cliente2 = new Cliente("Sully", 54);
		Cliente cliente3 = new Cliente("Nathan", 28);
		miBar.ingresarCliente(cliente1);
		miBar.ingresarCliente(cliente2);
		miBar.ingresarCliente(cliente3);
		String primerEsperado = "Elena";
		String ultimoEsperado = "Sully";
		String primerObtenido = miBar.getClientes().first().getNombre();
		String ultimoObtenido = miBar.getClientes().last().getNombre();
		Assert.assertEquals(primerEsperado, primerObtenido);
		Assert.assertEquals(ultimoEsperado, ultimoObtenido);
	}
	
	@Test
	public void testClientesOrdenadosPorEdad() throws EdadException, NombreException {
		Bar miBar = new Bar(new ComparatorEdad());
		Cliente cliente1 = new Cliente("Elena", 30);
		Cliente cliente2 = new Cliente("Sully", 54);
		Cliente cliente3 = new Cliente("Nathan", 28);
		miBar.ingresarCliente(cliente1);
		miBar.ingresarCliente(cliente2);
		miBar.ingresarCliente(cliente3);
		Integer primerEsperado = 28;
		Integer ultimoEsperado = 54;
		Integer primerObtenido = miBar.getClientes().first().getEdad();
		Integer ultimoObtenido = miBar.getClientes().last().getEdad();
		Assert.assertEquals(primerEsperado, primerObtenido);
		Assert.assertEquals(ultimoEsperado, ultimoObtenido);
	}
}
