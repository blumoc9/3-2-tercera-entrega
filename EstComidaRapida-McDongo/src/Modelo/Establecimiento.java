package Modelo;
import java.util.Vector;

public class Establecimiento extends Persona {

	private Vector<Categoria> vectorcategoria;
	private Vector<Cliente> vectorcliente;
	private Vector<Insumos> vectorinsumos;
	private Vector<Orden> vectorordenes;
	private String rif;
	
	public Establecimiento() {
		super();
	}
	
	public Establecimiento(String nombre, String direccion, String telefono,
			String tipo) {
		super(nombre, direccion, telefono, tipo);
	}
	
	public Establecimiento(Vector<Categoria> vectorcategoria,
			Vector<Cliente> vectorcliente, Vector<Insumos> vectorinsumos,
			Vector<Orden> vectorordenes, String rif) {
		super();
		this.vectorcategoria = vectorcategoria;
		this.vectorcliente = vectorcliente;
		this.vectorinsumos = vectorinsumos;
		this.vectorordenes = vectorordenes;
		this.rif = rif;
	}

	public Vector<Categoria> getVectorcategoria() {
		return vectorcategoria;
	}

	public void setVectorcategoria(Vector<Categoria> vectorcategoria) {
		this.vectorcategoria = vectorcategoria;
	}

	public Vector<Cliente> getVectorcliente() {
		return vectorcliente;
	}

	public void setVectorcliente(Vector<Cliente> vectorcliente) {
		this.vectorcliente = vectorcliente;
	}

	public Vector<Insumos> getVectorinsumos() {
		return vectorinsumos;
	}

	public void setVectorinsumos(Vector<Insumos> vectorinsumos) {
		this.vectorinsumos = vectorinsumos;
	}

	public Vector<Orden> getVectorordenes() {
		return vectorordenes;
	}

	public void setVectorordenes(Vector<Orden> vectorordenes) {
		this.vectorordenes = vectorordenes;
	}

	public String getRif() {
		return rif;
	}

	public void setRif(String rif) {
		this.rif = rif;
	}
	
	public void RegistrarCliente(){
		
	}
	
	public void RegistrarCategoria(){
		
	}
	
	public void RegistrarInsumos(){
		
	}
	
	public void RegistrarProductos(){
		
	}
	
	public void RegistrarOrden(){
		
	}
	
	public void ListadoOrdAsendCantidad(){
		
	}
	
	public void ListadoOrdAsendMonto(){
		
	}
	
	public void ListadoOrdDesenCantidad(){
		
	}
	
	public void ListadoOrdDesenMonto(){
		
	}
	
	public void ListadoIngredCantidad() {
		
	}
	
	public void ListadoAsendIngredUsados(){
		
	}
	
	public void ListadoDesendIngredUsados(){
		
	}
}
