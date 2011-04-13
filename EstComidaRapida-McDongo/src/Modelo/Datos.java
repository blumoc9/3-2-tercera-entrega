package Modelo;

public class Datos {
	private String codigo;
	private String nombre;
	private String estatus;
	public Datos(String codigo, String nombre, String estatus) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.estatus = estatus;
	}
	public Datos() {
		super();
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	
}
