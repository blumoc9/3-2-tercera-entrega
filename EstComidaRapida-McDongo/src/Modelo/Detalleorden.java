package Modelo;

public class Detalleorden {
	private long orden;
	private String producto;
	private String estatus;
	private int cantidad;
	public Detalleorden(long orden, String producto, String estatus, int cantidad) {
		super();
		this.orden = orden;
		this.producto = producto;
		this.estatus = estatus;
		this.cantidad= cantidad;
	}
	public Detalleorden() {
		super();
	}
	public long getOrden() {
		return orden;
	}
	public void setOrden(long orden) {
		this.orden = orden;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
