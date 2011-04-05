package Modelo;
import java.util.Vector;

public class Categoria extends Datos {

	private  Vector<Producto> vectorproducto;

	public Categoria() {
		super();
	}

	public Categoria(String nombre, String codigo) {
		super(nombre, codigo);
	}

	public Categoria(Vector<Producto> vectorproducto) {
		super();
		this.vectorproducto = vectorproducto;
	}

	public Vector<Producto> getVectorproducto() {
		return vectorproducto;
	}

	public void setVectorproducto(Vector<Producto> vectorproducto) {
		this.vectorproducto = vectorproducto;
	}
	
	public void GuardarProducto(){
		
	}
}