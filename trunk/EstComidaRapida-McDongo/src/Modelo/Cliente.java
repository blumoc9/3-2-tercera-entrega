package Modelo;

public class Cliente extends Persona {

	private String cedula;

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String direccion, String telefono, String tipo) {
		super(nombre, direccion, telefono, tipo);
	}
	
	public Cliente(String cedula) {
		super();
		this.cedula = cedula;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
}
