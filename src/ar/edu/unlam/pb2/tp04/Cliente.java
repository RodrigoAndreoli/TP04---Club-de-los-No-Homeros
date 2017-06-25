package ar.edu.unlam.pb2.tp04;

public class Cliente {
	private String nombre;
	private Integer edad;
	
	public Cliente(String nombre, Integer edad) throws EdadException, NombreException {
		if (nombre.isEmpty()) {
			throw new NombreException("Este cliente no tiene nombre.");
		} else {
			this.nombre = nombre;
		}
		if (edad <= 18) {
			throw new EdadException("Este cliente no es mayor de edad.");
		} else {
			this.edad = edad;
		}
	}

	protected String getNombre() {
		return nombre;
	}

	protected Integer getEdad() {
		return edad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public int compareNombre(Cliente otroCliente) {
		return this.getNombre().toUpperCase().compareTo(otroCliente.getNombre().toUpperCase());
	}

	public int compareEdad(Cliente otroCliente) {
		if (this.getEdad() > otroCliente.getEdad()) {
			return 1;
		} else {
			if (this.getEdad() < otroCliente.getEdad()) {
				return -1;
			}
		}
		return 0;
	}

}