package Modelo;

public class Producto {
	private String codigo;
	private String nombre;
	private float precio;
	private String Categoria;
	private String estatus;
	public Producto(String codigo, String nombre, float precio,
			String categoria, String estatus) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		Categoria = categoria;
		this.estatus = estatus;
	}
	public Producto() {
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
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
}
