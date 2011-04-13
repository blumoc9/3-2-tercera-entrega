package Controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Modelo.Detalleorden;
import Vista.formListaUsados;
import Vista.formRegistCategoria;
import bean.Conexion;

	public class ControladorIngredientesUsados implements ActionListener{
		private formListaUsados listausados;
		private TableModel tbingredienteModel;
		private JTable tbingre;
		
		public ControladorIngredientesUsados() {
			super();
			Conexion.establecerPropiedadesConexion("bdconfig", "jdbc.driver", "jdbc.url", "jdbc.nombrebd", "jdbc.usuario", "jdbc.password");
			this.listausados = new formListaUsados();
			this.listausados.setLocationRelativeTo(null);
			this.listausados.setVisible(true);	
			this.listausados.AgregarEscuchadores(this);
			CargarTabla();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String actionCommand = e.getActionCommand();
			if(actionCommand.equals("Lis. Ascendente")){
				String tiraSQL;
				tiraSQL="SELECT * FROM ingrediente where estatus='A'";
				ResultSet resultSet = Conexion.consultar(tiraSQL);
				try {
					if(resultSet.next()){
					}
					else{
						listausados.getMensaje().showMessageDialog(listausados.getBtascendente(), "No hay Ingredientes ");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			else if(actionCommand.equals("Lis. Descendente")){
				String tiraSQL;
				tiraSQL="SELECT * FROM ingrediente where estatus='A'";
				ResultSet resultSet = Conexion.consultar(tiraSQL);
				try {
					if(resultSet.next()){
					}
					else{
						listausados.getMensaje().showMessageDialog(listausados.getBtdescendente(), "No hay Ingredientes ");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			else if(actionCommand.equals("Salir")){
				listausados.dispose();
			}
		}
	
		public void CargarTabla(){
			String[][] datos={{ "Ingrediente", "Veces Usadas", "Producto"}};
			String[] columnas={ "Producto","Veces Usadas", "Producto"};
			tbingredienteModel = 	new DefaultTableModel(datos,columnas);
			tbingre = new JTable(tbingredienteModel);
			this.listausados.getPnusados().add(tbingre);
			tbingre.setModel(tbingredienteModel);
			tbingre.setBounds(13, 64, 420, 204);
			tbingre.setFont(new java.awt.Font("URW Chancery L",2,16));
			tbingre.setEnabled(false);
		}
}
