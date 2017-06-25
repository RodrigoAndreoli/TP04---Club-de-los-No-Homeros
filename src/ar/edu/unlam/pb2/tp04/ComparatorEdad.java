package ar.edu.unlam.pb2.tp04;

import java.util.Comparator;

public class ComparatorEdad implements Comparator<Cliente> {

	@Override
	public int compare(Cliente unCliente, Cliente otroCliente) {
		if (unCliente.getEdad() > otroCliente.getEdad()) {
			return 1;
		} else {
			if (unCliente.getEdad() < otroCliente.getEdad()) {
				return -1;
			}
		}
		return 0;
	}

}
