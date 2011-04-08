package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bean.Conexion;

import Vista.formRegisOrden;

public class ControladorRegistrarOrden implements ActionListener{

	private formRegisOrden orden;

	public ControladorRegistrarOrden() {
		super();
		Conexion.establecerPropiedadesConexion("bdconfig", "jdbc.driver", "jdbc.url", "jdbc.nombreBd", "jdbc.usuario", "jdbc.password");
		this.orden = new formRegisOrden();
		this.orden.setLocationRelativeTo(null);
		this.orden.setVisible(true);	
		this.orden.AgregarEscuchadores(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		String tiraSQL;
		if(actionCommand.equals("Registrar")){
		}
	}
	
}
