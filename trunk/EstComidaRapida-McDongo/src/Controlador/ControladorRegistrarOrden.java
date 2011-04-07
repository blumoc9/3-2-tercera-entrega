package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.formRegisOrden;

public class ControladorRegistrarOrden implements ActionListener{

	private formRegisOrden orden;

	public ControladorRegistrarOrden() {
		super();
		this.orden = new formRegisOrden();
		this.orden.setLocationRelativeTo(null);
		this.orden.setVisible(true);	
		this.orden.AgregarEscuchadores(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
}
