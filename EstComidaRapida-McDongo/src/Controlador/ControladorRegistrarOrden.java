package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Conexion;

import Vista.formRegisOrden;

public class ControladorRegistrarOrden implements ActionListener{

	private formRegisOrden orden;

	public ControladorRegistrarOrden() {
		super();
		Conexion.establecerPropiedadesConexion("bdconfig", "jdbc.driver", "jdbc.url", "jdbc.nombrebd", "jdbc.usuario", "jdbc.password");
		this.orden = new formRegisOrden();
		this.orden.setLocationRelativeTo(null);
		this.orden.setVisible(true);	
		this.orden.AgregarEscuchadores(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		String tiraSQL;
		if(actionCommand.equals("Buscar")){
			if(orden.getTxtNombre().getText().equals("")){
				orden.getMensaje().showMessageDialog(orden.getBtBuscar(), "Debe llenar el Campo Nombre");
			}
			else{
				tiraSQL="SELECT * FROM cliente where cedula='"+orden.getTxtNombre().getText()+"' and estatus='A'";
				ResultSet resultSet = Conexion.consultar(tiraSQL);
				try {
					if(!resultSet.next()){
						orden.getMensaje().showMessageDialog(orden.getBtBuscar(), "Debe Registrar el Cliente");
						new ControladorRegistrarCliente(this.orden.getTxtNombre().getText());
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			
				
			}
		}
		else if (actionCommand.equals("Cancelar")){
			LimpiarPantalla();
		}
		else if(actionCommand.equals("Salir")){
			LimpiarPantalla();
			orden.dispose();
		}
	}
	public void LimpiarPantalla(){
		orden.getTxtNombre().setText("");
		orden.getTxtCantidad().setText("");
	}
}
