package Modelo;

public class Cliente{
	private String cedula;
	private String nombre;
	private String telefono;
	private String estatus;
	private String direccion;
	
	public Cliente(String cedula, String nombre, String telefono, String estatus, String direccion) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.telefono = telefono;
		this.estatus = estatus;
		this.direccion = direccion;
	}
	public Cliente() {
		super();
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
}
