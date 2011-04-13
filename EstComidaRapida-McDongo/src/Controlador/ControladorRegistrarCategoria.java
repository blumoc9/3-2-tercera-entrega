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
		Conexion.establecerPropiedadesConexion("bdconfig", "jdbc.driver", "jdbc.url", "jdbc.nombrebd", "jdbc.usuario", "jdbc.password");
		this.Categoria = new formRegistCategoria();
		this.Categoria.setLocationRelativeTo(null);
		this.Categoria.setVisible(true);	
		this.Categoria.AgregarEscuchadores(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		
		if(actionCommand.equals("Registrar")){
			Registrar();
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
	
	public void Registrar(){
		String SQL;
		if(Categoria.getTxtCodigo().getText().equals("") || Categoria.getTxtNombre().getText().equals("")){
			Categoria.getMensaje().showMessageDialog(Categoria.getBtRegistrar(), "Debe llenar todos los Campos");
		}
		else{
			SQL= "SELECT * FROM categoria where codigo='"+Categoria.getTxtCodigo().getText()+"'and estatus='A' or nombre='"+Categoria.getTxtNombre().getText()+"'";
			ResultSet resultSet = Conexion.consultar(SQL);
		try {
			if(!resultSet.next()){
				SQL= "INSERT INTO categoria (codigo, nombre, estatus) VALUES ('"+Categoria.getTxtCodigo().getText()+"','"+Categoria.getTxtNombre().getText()+"','A')";
				Conexion.ejecutar(SQL);
				Categoria.getMensaje().showMessageDialog(Categoria.getBtRegistrar(), "Categoria Registrada Exitosamente");
			}
			else
				Categoria.getMensaje().showMessageDialog(Categoria.getBtRegistrar(), "Ya Existe esa Categoria");
			LimpiarPantalla();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		}
	}
}
