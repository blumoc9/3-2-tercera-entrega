package Modelo;

public class Receta {
	private String producto;
	private String ingrediente;
	private float cantidad;
	private String estatus;
	public Receta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Receta(String producto, String ingrediente, float cantidad,
			String estatus) {
		super();
		this.producto = producto;
		this.ingrediente = ingrediente;
		this.cantidad = cantidad;
		this.estatus = estatus;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
}
