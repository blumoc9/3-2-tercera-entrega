package Controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import bean.Conexion;

import Vista.formListProduc;
import Vista.formRegistProduc;

public class ControladorIngredientesDisponibles implements ActionListener{
	
	private formListProduc cantdisponibles;
	private TableModel tbIngredientesModel;
	private JTable btingredientes;
	
	
	public ControladorIngredientesDisponibles() {
		super();
		Conexion.establecerPropiedadesConexion("bdconfig", "jdbc.driver", "jdbc.url", "jdbc.nombrebd", "jdbc.usuario", "jdbc.password");
		this.cantdisponibles = new formListProduc();
		this.cantdisponibles.setLocationRelativeTo(null);
		this.cantdisponibles.setVisible(true);	
		this.cantdisponibles.AgregarEscuchadores(this);
		CargarTabla();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("Ver Listado")){
			String tiraSQL;
			tiraSQL="SELECT * FROM ingrediente where estatus='A'";
			ResultSet resultSet = Conexion.consultar(tiraSQL);
			try {
				if(resultSet.getRow()==0){
					while(resultSet.next()){
						String [] newRow = {(String)resultSet.getString("nombre"), resultSet.getString("stock")};
						((DefaultTableModel)tbIngredientesModel).addRow(newRow);
					}
				}
				else{
					cantdisponibles.getMensaje().showMessageDialog(cantdisponibles.getBtverlistado(), "No hay Ingredientes");
				}
			} catch (HeadlessException e1) {
				e1.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		cantdisponibles.getBtverlistado().setEnabled(false);
		}
		else if(actionCommand.equals("Salir")){
			cantdisponibles.dispose();
		}
		
	}
	public void CargarTabla(){
		String[][] datos={{ "Ingrediente", "Cantidad" }};
		String[] columnas={ "Ingrediente", "Cantidad" };
		tbIngredientesModel = 	new DefaultTableModel(datos,columnas);
		btingredientes = new JTable(tbIngredientesModel);
		cantdisponibles.getPnLisProduc().add(btingredientes);
		btingredientes.setModel(tbIngredientesModel);
		btingredientes.setBounds(13, 55, 461, 137);
		btingredientes.setFont(new java.awt.Font("URW Chancery L",2,16));
	}
}
