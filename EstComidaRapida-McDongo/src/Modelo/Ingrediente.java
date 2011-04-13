package Modelo;

public class Ingrediente {
	private String codigo;
	private String nombre;
	private float stock;
	private String estatus;
	public Ingrediente() {
		super();
	}
	public Ingrediente(String codigo, String nombre, float stock, String estatus) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.stock = stock;
		this.estatus = estatus;
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
	public float getStock() {
		return stock;
	}
	public void setStock(float stock) {
		this.stock = stock;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
}
