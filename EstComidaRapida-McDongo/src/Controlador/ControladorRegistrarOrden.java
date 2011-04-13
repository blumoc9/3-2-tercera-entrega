package Controlador;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import bean.Conexion;

import Modelo.Detalleorden;
import Vista.formRegisOrden;

public class ControladorRegistrarOrden implements ActionListener{

	private formRegisOrden orden;
	private Vector<Detalleorden> detalles;
	DefaultTableModel tbDetalleModel;
	JTable tbDetalle;

	public ControladorRegistrarOrden() {
		super();
		Conexion.establecerPropiedadesConexion("bdconfig", "jdbc.driver", "jdbc.url", "jdbc.nombrebd", "jdbc.usuario", "jdbc.password");
		this.orden = new formRegisOrden();
		this.orden.setLocationRelativeTo(null);
		this.orden.setVisible(true);	
		this.orden.AgregarEscuchadores(this);
		this.detalles = new Vector<Detalleorden>();
	    String tiraSQL = "SELECT MAX(numero) AS n From orden where estatus='A'";
	    ResultSet resulset1 =Conexion.consultar(tiraSQL);
	    try {
			if (resulset1.next()){
				orden.getlblNumero().setText(Integer.toString((resulset1.getInt("n")+1)));
			}
			else
				orden.getlblNumero().setText("1");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		CargarTabla();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(actionCommand.equals("Buscar")){
			Buscar();
		}
		else if (actionCommand.equals("Cancelar")){
			LimpiarPantalla();
		}
		else if(actionCommand.equals("Salir")){
			orden.dispose();
		}
		else if (actionCommand.equals("comboBoxChanged")){
			CambiodeCategoria();
		}
		else if (actionCommand.equals("Agregar")){
			if (ValidarAgregar()){
				Agregar();
			}else
				orden.getMensaje().showMessageDialog(orden.getBtAgregar(), "No hay suficientes Ingredientes para Vender el Producto");
		}
		else if (actionCommand.equals("Remover")){
			this.tbDetalleModel = (DefaultTableModel)this.tbDetalle.getModel();
			this.tbDetalleModel.removeRow(tbDetalle.getSelectedRow());
		}
		else if(actionCommand.equals("Registrar")){
			Registrar();
		}
	}
	public void LimpiarPantalla(){
		orden.getTxtNombre().setText("");
		orden.getTxtCantidad().setText("");
	}
	public void CargarCombos(){
		
		String tiraSQL;
		tiraSQL = "SELECT * FROM categoria where estatus='A'";
		ResultSet resultSet = Conexion.consultar(tiraSQL);
		try {
			while(resultSet.next()){
				orden.getCmbCategoria().addItem(resultSet.getString("nombre"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void Buscar(){
		String tiraSQL;ResultSet resultSet;
		if(orden.getTxtNombre().getText().equals("")){
			orden.getMensaje().showMessageDialog(orden.getBtBuscar(), "Debe llenar el Campo Nombre");
		}
		else{
			tiraSQL="SELECT * FROM cliente where cedula='"+orden.getTxtNombre().getText()+"' and estatus='A'";
			resultSet = Conexion.consultar(tiraSQL);
			CargarCombos();
			try {
				if(!resultSet.next()){
					orden.getMensaje().showMessageDialog(orden.getBtBuscar(), "Debe Registrar el Cliente");
					new ControladorRegistrarCliente(this.orden.getTxtNombre().getText());
					CargarCombos();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}	
		}
	}
	public void CambiodeCategoria(){
		String tiraSQL;
		ResultSet resultSet;
		orden.getCmbProducto().removeAllItems();
		tiraSQL = "SELECT * FROM producto where categoria='"+orden.getCmbCategoria().getSelectedItem().toString()+"' and estatus='A'";
		resultSet=Conexion.consultar(tiraSQL);
		try {
			while(resultSet.next()){
				orden.getCmbProducto().addItem(resultSet.getString("nombre"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public void Agregar(){
		if (orden.getCmbCategoria().getSelectedItem().equals("") || orden.getCmbProducto().getSelectedItem().equals("") || orden.getTxtCantidad().getText().equals("")){
			orden.getMensaje().showMessageDialog(orden.getBtAgregar(), "Debe llenar y seleccionar todo los campos");
		}
		else{
			String tiraSQL;
			tiraSQL = "SELECT codigo from producto where nombre='"+orden.getCmbProducto().getSelectedItem()+"' and estatus='A'";
			ResultSet resultSet= Conexion.consultar(tiraSQL);
			Detalleorden det = new Detalleorden();
			det.setCantidad(Integer.parseInt(orden.getTxtCantidad().getText()));
			det.setEstatus("A");
			det.setOrden(1);
			try {
				if(resultSet.next()){
					det.setProducto(resultSet.getString("codigo"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			detalles.add(det);
			String [] newRow = {(String)(orden.getCmbProducto().getSelectedItem()), orden.getTxtCantidad().getText()};
			((DefaultTableModel)tbDetalleModel).addRow(newRow);
		}
	}
	public void CargarTabla(){
		String[][] datos={{ "Producto", "Cantidad" }};
		String[] columnas={ "Producto", "Cantidad" };
		tbDetalleModel = 	new DefaultTableModel(datos,columnas);
		tbDetalle = new JTable(tbDetalleModel);
		orden.getPnPedido().add(tbDetalle);
		tbDetalle.setModel(tbDetalleModel);
		tbDetalle.setBounds(13, 75, 406, 136);
		tbDetalle.setFont(new java.awt.Font("URW Chancery L",2,16));
		tbDetalle.setVisible(true);
	}
	
	@SuppressWarnings("static-access")
	public void Registrar(){
		String tiraSQL;
		for(int i=0; i< this.detalles.size(); i++){
			tiraSQL = "INSERT INTO detalleorden (orden,producto, estatus,cantidad) VALUES ('"+this.orden.getlblNumero().getText()+"',(SELECT codigo from producto where nombre='"+orden.getCmbProducto().getSelectedItem()+"'),'A','"+orden.getTxtCantidad().getText()+"')";
			Conexion.ejecutar(tiraSQL);
		}
		orden.getMensaje().showMessageDialog(orden.getBtRegistrar(), "Orden Registrada Exitosamente");
		LimpiarPantalla();
		tiraSQL="INSERT INTO orden (numero, cliente, estatus) VALUES('"+this.orden.getlblNumero().getText()+"','"+this.orden.getTxtNombre().getText()+"','A')";
		Conexion.ejecutar(tiraSQL);
		}
	public boolean ValidarAgregar(){
		String tiraSQL;boolean validar=true;
		tiraSQL="SELECT cantidad*'"+Float.parseFloat(orden.getTxtCantidad().getText())+"' as cant FROM receta where producto = (SELECT codigo FROM producto where nombre = '"+orden.getCmbProducto().getSelectedItem()+"')";
		ResultSet r1 = Conexion.consultar(tiraSQL);
		tiraSQL="SELECT stock FROM ingrediente where codigo IN (SELECT ingrediente FROM receta where producto IN (SELECT codigo FROM producto where nombre = '"+orden.getCmbProducto().getSelectedItem()+"'))";
		ResultSet r2 = Conexion.consultar(tiraSQL);
		try {
			while(r1.next()&&r2.next()){
				if(r1.getFloat("cant")>r2.getFloat("stock")){
					validar=validar&&false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return validar;
	}
		
	}

