package ingenieria_inversa;

import java.util.ArrayList;
import java.util.List;

class Contacto {
	private int id;
	private String nombre;
	private String apellidos;
	private String email;
	private Direccion direccion;
	private List<Telefono> telefonos;

	public Contacto(int id, String nombre, String apellidos, String email, Direccion direccion) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.direccion = direccion;
		this.telefonos = new ArrayList<>();
	}

	public int getId() {
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	// 🔴 ahora crea el teléfono
	public void agregarTelefono(String numero, TipoTelefono tipo) {
		Telefono t = new Telefono(numero, tipo);
		this.telefonos.add(t);
	}

	public List<Telefono> getTelefonos() {
		return new ArrayList<>(this.telefonos);
	}

	public Direccion getDireccion() {
		return this.direccion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("ID: ").append(this.id).append("\n");
		sb.append("Nombre: ").append(this.nombre).append(" ").append(this.apellidos).append("\n");

		if (!this.email.isBlank()) {
			sb.append("Email: ").append(this.email).append("\n");
		}

		sb.append("Dirección: ").append(this.direccion).append("\n");

		sb.append("Teléfonos:\n");
		if (this.telefonos.isEmpty()) {
			sb.append("  (sin teléfonos)\n");
		} else {
			for (Telefono t : this.telefonos) {
				sb.append("  - ").append(t).append("\n");
			}
		}

		return sb.toString();
	}
}
