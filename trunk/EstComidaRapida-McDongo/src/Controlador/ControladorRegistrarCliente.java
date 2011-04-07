package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bean.Conexion;

import Vista.formRegisCliente;
import Modelo.Cliente;

public class ControladorRegistrarCliente implements ActionListener{

	private formRegisCliente cliente;
	
	public ControladorRegistrarCliente() {
		super();
		Conexion.establecerPropiedadesConexion("bdconfig", "jdbc.driver", "jdbc.url", "jdbc.nombrebd", "jdbc.usuario", "jdbc.password");
		this.cliente = new formRegisCliente();
		this.cliente.setLocationRelativeTo(null);
		this.cliente.setVisible(true);	
		this.cliente.AgregarEscuchadores(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("Registrar")){
			if (cliente.getTxtCedula().equals("") || cliente.getTxtDireccion().equals("") || cliente.getTxtNombre().equals("") || cliente.getTxtTelefono().equals(""))
				//Debe LLenar todos los campos;
				;
			else{
				Cliente cli = new Cliente(cliente.getTxtCedula().getText(),cliente.getTxtNombre().getText(),cliente.getTxtDireccion().getText(),cliente.getTxtTelefono().getText(),"natural");
				String tiraSQL ="INSERT INTO cliente (cedula,nombre,direccion,telefono,estatus) VALUES ('"+cli.getCedula()+"','"+cli.getNombre()+"','"+cli.getDireccion()+"','"+cli.getTelefono()+"','A')";
				Conexion.ejecutar(tiraSQL);
			}
		}else if (actionCommand.equals("Cancelar")){
			this.LimpiarPantalla();
		}else if (actionCommand.equals("Salir")){
			System.exit(0);
		}
	}
	
	public void LimpiarPantalla(){
		cliente.getTxtCedula().setText("");
		cliente.getTxtDireccion().setText("");
		cliente.getTxtNombre().setText("");
		cliente.getTxtTelefono().setText("");
	}
}
