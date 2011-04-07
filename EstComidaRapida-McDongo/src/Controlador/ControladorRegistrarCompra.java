package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.formRegistrarCompra;
import Vista.frmHome;

public class ControladorRegistrarCompra implements ActionListener {

	private formRegistrarCompra Registrarcommpra;

	public ControladorRegistrarCompra() {
		super();
		this.Registrarcommpra = new formRegistrarCompra();
		this.Registrarcommpra.setLocationRelativeTo(null);
		this.Registrarcommpra.setVisible(true);	
		this.Registrarcommpra.AgregarEscuchadores(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	
}
