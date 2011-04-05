package Modelo;
import java.util.Vector;

public class Producto extends Datos {

	private double precio;
	private Vector<Ingrediente> vectoringrediente;
	
	public Producto() {
		super();
	}
	
	public Producto(String nombre, String codigo) {
		super(nombre, codigo);
	}

	public Producto(double precio, Vector<Ingrediente> vectoringrediente) {
		super();
		this.precio = precio;
		this.vectoringrediente = vectoringrediente;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Vector<Ingrediente> getVectoringrediente() {
		return vectoringrediente;
	}

	public void setVectoringrediente(Vector<Ingrediente> vectoringrediente) {
		this.vectoringrediente = vectoringrediente;
	}
}
