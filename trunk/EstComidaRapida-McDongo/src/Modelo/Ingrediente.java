package Modelo;

public class Ingrediente {
	
	private int cantidad;
	private String codigo;

	public Ingrediente() {
		super();
	}

	public Ingrediente(int cantidad, String codigo) {
		super();
		this.cantidad = cantidad;
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
