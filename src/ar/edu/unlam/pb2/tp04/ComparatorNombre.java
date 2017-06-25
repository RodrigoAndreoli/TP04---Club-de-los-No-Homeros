package ar.edu.unlam.pb2.tp04;

import java.util.Comparator;

public class ComparatorNombre implements Comparator<Cliente> {

	@Override
	public int compare(Cliente unCliente, Cliente otroCliente) {
		return unCliente.getNombre().toUpperCase().compareTo(otroCliente.getNombre().toUpperCase());
	}

}
