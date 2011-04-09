package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import bean.Conexion;

import Vista.formRegistrarCompra;
import Vista.frmHome;

public class ControladorRegistrarCompra implements ActionListener {

	private formRegistrarCompra Registrarcompra;
	private JTable tbIngredientes;

	public ControladorRegistrarCompra() {
		super();
		Conexion.establecerPropiedadesConexion("bdconfig", "jdbc.driver", "jdbc.url", "jdbc.nombrebd", "jdbc.usuario", "jdbc.password");
		this.Registrarcompra = new formRegistrarCompra();
		this.Registrarcompra.setLocationRelativeTo(null);
		this.Registrarcompra.setVisible(true);	
		this.Registrarcompra.AgregarEscuchadores(this);
		CargarIngrediente();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		String tiraSQL;
		if(actionCommand.equals("Registrar")){
			if(Registrarcompra.getTxtIngrediente().getText().equals("") || Registrarcompra.getTxtCantidad().getText().equals("")||Registrarcompra.getTxtNombre().getText().equals("")){
				Registrarcompra.getMensaje().showMessageDialog(Registrarcompra.getBtRegistrar(), "Debe llenar todo los Campos");
			}
			else{
				try {	
					tiraSQL="SELECT * FROM insumos where codigo='"+Registrarcompra.getTxtIngrediente().getText()+"' and estatus='A'";
					ResultSet resultSet1 = Conexion.consultar(tiraSQL);
					if(!resultSet1.next()){
						tiraSQL="INSERT INTO insumos (codigo,nombre,stock,estatus) VALUES ('"+Registrarcompra.getTxtIngrediente().getText()+"','"+Registrarcompra.getTxtNombre().getText()+"','"+Registrarcompra.getTxtCantidad().getText()+"','A')";
						Conexion.ejecutar(tiraSQL);
						Registrarcompra.getMensaje().showMessageDialog(Registrarcompra.getBtRegistrar(), "Ingrediente Registrado");
					}
					else{
						tiraSQL="UPDATE insumos set stock='"+(Float.parseFloat(Registrarcompra.getTxtCantidad().getText())+Float.parseFloat(resultSet1.getString("stock")))+"' where codigo='"+Registrarcompra.getTxtIngrediente().getText()+"' and estatus='A'";
						Conexion.ejecutar(tiraSQL);
					}
					LimpiarPantalla();
					CargarIngrediente();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		else if(actionCommand.equals("Cancelar")){
			LimpiarPantalla();
		}
		else if(actionCommand.equals("Salir")){
			LimpiarPantalla();
			Registrarcompra.dispose();
		}
	}
	public void LimpiarPantalla(){
		Registrarcompra.getTxtIngrediente().setText("");
		Registrarcompra.getTxtCantidad().setText("");
		Registrarcompra.getTxtNombre().setText("");
	}
	public void CargarIngrediente(){
		String[][] datos={{ "Codigo", "Nombre", "stock" }};
		String[] columnas={ "Codigo", "Nombre", "stock" };
		TableModel tbInggredientesModel = 	new DefaultTableModel(datos,columnas);
		tbIngredientes = new JTable(tbInggredientesModel);
		Registrarcompra.getPnDatos().add(tbIngredientes);
		tbIngredientes.setModel(tbInggredientesModel);
		tbIngredientes.setBounds(13, 105, 411, 125);
		tbIngredientes.setFont(new java.awt.Font("URW Chancery L",2,16));
		String sql = "SELECT * FROM insumos where estatus='A'";
		ResultSet resulset = Conexion.consultar(sql);
		try {
			while(resulset.next()){
				String [] newRow = { resulset.getString("codigo"),resulset.getString("nombre"),resulset.getString("stock")};
				((DefaultTableModel)tbInggredientesModel).addRow(newRow);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
