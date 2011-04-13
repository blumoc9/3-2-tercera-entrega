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

import bean.Conexion;
import Modelo.Detalleorden;
import Modelo.Receta;
import Vista.formListadVentas;
import Vista.formRegistCategoria;

public class ControladorVentaProductos implements ActionListener {

	private formListadVentas listadoventas;
	private TableModel tbProductoModel;
	private Vector<Detalleorden> detord;
	private JTable tbProd;

	public ControladorVentaProductos() {
		super();
		Conexion.establecerPropiedadesConexion("bdconfig", "jdbc.driver", "jdbc.url", "jdbc.nombrebd", "jdbc.usuario", "jdbc.password");
		this.listadoventas = new formListadVentas();
		this.listadoventas.setLocationRelativeTo(null);
		this.listadoventas.setVisible(true);	
		this.listadoventas.AgregarEscuchadores(this);
		CargarTabla("Cantidad");
	}
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(actionCommand.equals("Por Cant. Ascendente")){
			String tiraSQL;
			tiraSQL="SELECT * FROM detalleorden where estatus='A'";
			ResultSet resultSet = Conexion.consultar(tiraSQL);
			try {
				if(resultSet.next()){
					CargarListado1();
					listadoventas.getBtOrdAseCant().setEnabled(false);
				}
				else{
					listadoventas.getMensaje().showMessageDialog(listadoventas.getBtOrdAseCant(), "No hay productos vendidos");
				}
			} catch (HeadlessException e1) {
				e1.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		else if(actionCommand.equals("Por Cant. Descendente")){
			CargarTabla("Cantidad");
			String tiraSQL;
			tiraSQL="SELECT * FROM detalleorden where estatus='A'";
			ResultSet resultSet = Conexion.consultar(tiraSQL);
			try {
				if(resultSet.next()){
					CargarListado2();
				}
				else{
					listadoventas.getMensaje().showMessageDialog(listadoventas.getBtOrdAseCant(), "No hay productos vendidos");
				}
			} catch (HeadlessException e1) {
				e1.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}	
		}
		else if(actionCommand.equals("Por Mont. Ascendente")){
			CargarTabla("Monto");
			String tiraSQL;
			tiraSQL="SELECT * FROM detalleorden where estatus='A'";
			ResultSet resultSet = Conexion.consultar(tiraSQL);
			try {
				if(resultSet.next()){
					tiraSQL="SELECT (SELECT nombre from producto where codigo=p.producto) as prod, SUM((SELECT precio from producto where codigo=p.producto)*cantidad) AS total FROM detalleorden p where estatus='A' GROUP BY prod ORDER BY total ASC"; 
					CargarListado(tiraSQL);
				}
				else{
					listadoventas.getMensaje().showMessageDialog(listadoventas.getBtOrdAseCant(), "No hay productos vendidos");
				}
			} catch (HeadlessException e1) {
				e1.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}	
		}
		else if(actionCommand.equals("Por Mont. Descendente")){
			CargarTabla("Monto");
			String tiraSQL;
			tiraSQL="SELECT * FROM detalleorden where estatus='A'";
			ResultSet resultSet = Conexion.consultar(tiraSQL);
			try {
				if(resultSet.next()){
					tiraSQL="SELECT (SELECT nombre from producto where codigo=p.producto) as prod, SUM((SELECT precio from producto where codigo=p.producto)*cantidad) AS total FROM detalleorden p where estatus='A' GROUP BY prod ORDER BY total DESC"; 
					CargarListado(tiraSQL);
				}
				else{
					listadoventas.getMensaje().showMessageDialog(listadoventas.getBtOrdAseCant(), "No hay productos vendidos");
				}
			} catch (HeadlessException e1) {
				e1.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		else if(actionCommand.equals("Salir")){
			listadoventas.dispose();
		}
	}
	public void CargarListado1(){
		String tiraSQL;
		tiraSQL="SELECT producto, SUM(cantidad) as total FROM detalleorden where estatus='A' GROUP BY producto ORDER BY total ASC"; 
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		try {
			if(resultSet.getRow()==0){
				while(resultSet.next()){
					String [] newRow = {(String)resultSet.getString("producto"), resultSet.getString("total")};
					((DefaultTableModel)tbProductoModel).addRow(newRow);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void CargarListado2(){
		String tiraSQL;
		tiraSQL="SELECT producto, SUM(cantidad) as total FROM detalleorden where estatus='A' GROUP BY producto ORDER BY total DESC"; 
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		try {
			if(resultSet.getRow()==0){
				while(resultSet.next()){
					String [] newRow = {(String)resultSet.getString("producto"), resultSet.getString("total")};
					((DefaultTableModel)tbProductoModel).addRow(newRow);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void CargarListado(String tiraSQL){
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		try {
			if(resultSet.getRow()==0){
				while(resultSet.next()){
					String [] newRow = {(String)resultSet.getString("prod"), resultSet.getString("total")};
					((DefaultTableModel)tbProductoModel).addRow(newRow);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void CargarTabla(String columna2){
		String[][] datos={{ "Producto", columna2 }};
		String[] columnas={ "Producto", columna2 };
		tbProductoModel = 	new DefaultTableModel(datos,columnas);
		tbProd = new JTable(tbProductoModel);
		this.listadoventas.getPnDatos().add(tbProd);
		tbProd.setModel(tbProductoModel);
		tbProd.setBounds(13, 64, 420, 204);
		tbProd.setFont(new java.awt.Font("URW Chancery L",2,16));
		tbProd.setEnabled(false);
	}
}