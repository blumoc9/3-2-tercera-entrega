package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.formRegistCategoria;
import Vista.formRegistProduc;

public class ControladorRegistrarProducto implements ActionListener{

	private formRegistProduc Producto;
	
	public ControladorRegistrarProducto() {
		super();
		this.Producto = new formRegistProduc();
		this.Producto.setLocationRelativeTo(null);
		this.Producto.setVisible(true);	
		this.Producto.AgregarEscuchadores(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
