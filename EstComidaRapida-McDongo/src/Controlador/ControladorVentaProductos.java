package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.formListadVentas;
import Vista.frmHome;

public class ControladorVentaProductos implements ActionListener{

	private formListadVentas ventas;
	
	public ControladorVentaProductos() {
		super();
		this.ventas = new formListadVentas();
		this.ventas.setLocationRelativeTo(null);
		this.ventas.setVisible(true);	
		this.ventas.AgregarEscuchadores(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
