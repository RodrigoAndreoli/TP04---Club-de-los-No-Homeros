package ar.edu.unlam.pb2.tp04;

import java.util.Comparator;
import java.util.TreeSet;

public class Bar {

	private TreeSet<Cliente> clientes;
	private Boolean estado;

	public Bar(Comparator<Cliente> comparador) {
		this.clientes = new TreeSet<Cliente>(comparador);
		this.estado = false;
	}

	public TreeSet<Cliente> getClientes() {
		return this.clientes;
	}

	public void ingresarCliente(Cliente cliente) {
		if (cliente != null) {
			this.clientes.add(cliente);
		}
	}

	public void setClientes(TreeSet<Cliente> clientesNuevos) {
		this.clientes = clientesNuevos;
	}

	public void abrirBar() {
		this.estado = true;
	}

	public void cerrarBar() {
		this.estado = false;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	
}