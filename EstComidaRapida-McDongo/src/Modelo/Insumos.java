package Modelo;

public class Insumos extends Datos {

	private int stock;

	public Insumos() {
		super();
	}

	public Insumos(String nombre, String codigo) {
		super(nombre, codigo);
	}

	public Insumos(int stock) {
		super();
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
