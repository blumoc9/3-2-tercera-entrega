package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.frmHome;


public class ControladorHome implements ActionListener {

	private frmHome home;

	public ControladorHome() {
		super();
		this.home = new frmHome();
		this.home.setLocationRelativeTo(null);
		this.home.setVisible(true);	
		this.home.AgregarEscuchadores(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
			if (actionCommand.equals("Registrar Categoria")) {
				new ControladorRegistrarCategoria();
			}		
			else if (actionCommand.equals("Registrar Producto")) {
				new ControladorRegistrarProducto();
			}
			else if (actionCommand.equals("Registrar Compra de Ingredientes")) {
				new ControladorRegistrarCompra();
			}
			else if(actionCommand.equals("Registrar Orden")){
				new ControladorRegistrarOrden();
			}
			else if(actionCommand.equals("Registrar Cliente")){
				new ControladorRegistrarCliente();
			}
			else if(actionCommand.equals("Venta de Productos")){
				new ControladorVentaProductos();
			}
			else if(actionCommand.equals("Ingredientes Disponibles")){
				new ControladorIngredientesDisponibles();
			}
			else if(actionCommand.equals("Ingredientes mas usados")){
				new ControladorIngredientesUsados();
			}
			else if(actionCommand.equals("Salir")){
				System.exit(0);
			}
	}
}
