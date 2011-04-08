package Controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

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
		String tiraSQL;
		if (actionCommand.equals("Registrar")){
			if ((cliente.getTxtCedula().equals("") || cliente.getTxtDireccion().equals("") || cliente.getTxtNombre().equals("") || cliente.getTxtTelefono().equals("")))
				cliente.getMensaje().showMessageDialog(cliente.getBtRegistrar(), "Debe llenar todos los Campos");
			else{
				tiraSQL= "SELECT * FROM cliente where cedula='"+cliente.getTxtCedula().getText()+"' and estatus='A'";
				ResultSet resultSet = Conexion.consultar(tiraSQL);
				try {
					if (!resultSet.next()){
						Cliente cli = new Cliente(cliente.getTxtCedula().getText(),cliente.getTxtNombre().getText(),cliente.getTxtDireccion().getText(),cliente.getTxtTelefono().getText(),"natural");
						tiraSQL ="INSERT INTO cliente (cedula,nombre,direccion,telefono,estatus) VALUES ('"+cli.getCedula()+"','"+cli.getNombre()+"','"+cli.getDireccion()+"','"+cli.getTelefono()+"','A')";
						Conexion.ejecutar(tiraSQL);
						cliente.getMensaje().showMessageDialog(cliente.getBtRegistrar(), "Cliente Registrado Exitosamente");
						LimpiarPantalla();
					}else{
						cliente.getMensaje().showMessageDialog(cliente.getBtRegistrar(), "Cliente ya Registrado");
						LimpiarPantalla();
					}
				} catch (HeadlessException e1) {
						e1.printStackTrace();
				} catch (SQLException e1) {
						e1.printStackTrace();
				}
			}
		}else if (actionCommand.equals("Cancelar")){
			this.LimpiarPantalla();
		}else if (actionCommand.equals("Salir")){
			cliente.dispose();
		}
	}
	
	public void LimpiarPantalla(){
		cliente.getTxtCedula().setText("");
		cliente.getTxtDireccion().setText("");
		cliente.getTxtNombre().setText("");
		cliente.getTxtTelefono().setText("");
	}
}
