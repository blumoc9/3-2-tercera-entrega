package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Conexion;

import Vista.formRegistCategoria;

public class ControladorRegistrarCategoria implements ActionListener{

	private formRegistCategoria Categoria;
	
	public ControladorRegistrarCategoria() {
		super();
		this.Categoria = new formRegistCategoria();
		this.Categoria.setLocationRelativeTo(null);
		this.Categoria.setVisible(true);	
		this.Categoria.AgregarEscuchadores(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		String tiraSQL;
		if(actionCommand.equals("Registrar")){
			if(Categoria.getTxtCodigo().equals("")||Categoria.getTxtNombre().equals("")){
				Categoria.getMensaje().showConfirmDialog(Categoria.getBtRegistrar(), "Debe llenar todos los Campos");
			}
			else{
				tiraSQL= "SELECT * FROM categoria where codigo='"+Categoria.getTxtCodigo().getText()+"'and estatus='A' ";
				ResultSet resultSet = Conexion.consultar(tiraSQL);
			try {
				if(!resultSet.next()){
					tiraSQL= "INSERT INTO categoria (codigo, nombre, estatus) VALUES ('"+Categoria.getTxtCodigo().getText()+"','"+Categoria.getTxtNombre().getText()+"','A'";
					Conexion.ejecutar(tiraSQL);
					Categoria.getMensaje().showConfirmDialog(Categoria.getBtRegistrar(), "Categoria Registrada Exitosamente");
				}
				else
					Categoria.getMensaje().showConfirmDialog(Categoria.getBtRegistrar(), "Categoria Registrada Exitosamente");
				LimpiarPantalla();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			}
		}
		else if(actionCommand.equals("Cancelar")){
			LimpiarPantalla();
		}
		else if(actionCommand.equals("Salir")){
			Categoria.dispose();
		}
	}
	
	public void LimpiarPantalla(){
		this.Categoria.getTxtCodigo().setText("");
		this.Categoria.getTxtNombre().setText("");
	}
}
