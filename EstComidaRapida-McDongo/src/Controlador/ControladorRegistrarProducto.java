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

import Modelo.Cliente;
import Modelo.Ingrediente;
import Modelo.Producto;
import Modelo.Receta;
import Vista.formRegistCategoria;
import Vista.formRegistProduc;

public class ControladorRegistrarProducto implements ActionListener{

	private formRegistProduc Producto;
	private Vector<Receta> ingrediente;
	private JTable tbingredientes;
	private TableModel tbIngredientesModel;
	
	public ControladorRegistrarProducto() {
		super();
		Conexion.establecerPropiedadesConexion("bdconfig", "jdbc.driver", "jdbc.url", "jdbc.nombrebd", "jdbc.usuario", "jdbc.password");
		this.Producto = new formRegistProduc();
		this.Producto.setLocationRelativeTo(null);
		this.Producto.setVisible(true);	
		this.Producto.AgregarEscuchadores(this);
		ingrediente = new Vector<Receta>();
		CargarCombos();
		CargarTabla();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("Registrar")){
			RegistrarProducto(); 
		}
		else if (actionCommand.equals("Agregar")){
			Agregar();
		}
		else if(actionCommand.equals("Cancelar")){
			LimpiarPantalla();
		}
		else if(actionCommand.equals("Salir")){
			Producto.dispose();
		}
	}
	private void RegistrarProducto() {
		String tiraSQL;
		if (!Producto.getTxtCodigo().getText().equals("") && !Producto.getTxtNombre().getText().equals("") && !Producto.getCmbCategoria().getActionCommand().equals("") && !Producto.getCmbIngrediente().getActionCommand().equals("")){
			if (this.ingrediente.size()<3)
				this.Producto.getMensaje().showMessageDialog(this.Producto.getBtRegistrar(), "El Producto debe contener por lo menos 3 ingrediente "+this.ingrediente.size());
			else{
				tiraSQL= "SELECT * FROM producto where codigo= '"+Producto.getTxtCodigo().getText()+"' and estatus= 'A' ";
				ResultSet resultSet = Conexion.consultar(tiraSQL);
				try {
					if (!resultSet.next()){
						tiraSQL ="INSERT INTO producto (codigo,nombre, precio, estatus,categoria) VALUES ('"+Producto.getTxtCodigo().getText()+"','"+Producto.getTxtNombre().getText()+"','"+Producto.getTxtPrecio().getText()+"','A','"+Producto.getCmbCategoria().getSelectedItem()+"')";
						Conexion.ejecutar(tiraSQL);
						for(int i=0; i< this.ingrediente.size(); i++){
							tiraSQL = "INSERT INTO receta (estatus, producto, ingrediente,cantidad) VALUES ('A','"+ingrediente.get(i).getProducto()+"','"+ingrediente.get(i).getIngrediente()+"','"+ingrediente.get(i).getCantidad()+"')";
							Conexion.ejecutar(tiraSQL);
						}
						Producto.getMensaje().showMessageDialog(Producto.getBtRegistrar(), "Producto Registrado Exitosamente");
						LimpiarPantalla();
					}else{
						Producto.getMensaje().showMessageDialog(Producto.getBtRegistrar(), "Producto ya Registrado");
						LimpiarPantalla();
					}
				} catch (HeadlessException e1) {
						e1.printStackTrace();
				} catch (SQLException e1) {
						e1.printStackTrace();
				}
			}
		}	
	}
	public void Agregar(){
		Receta receta = new Receta();
		if (Producto.getTxtCantidad().getText().equals("") || Producto.getCmbIngrediente().getSelectedItem().equals("")){
			Producto.getMensaje().showMessageDialog(this.Producto.getBtAgregar(), "Debe agregar la cantidad necesaria o seleccionar un ingrediente");
		}
		else{
			String tiraSQL = "SELECT codigo from ingrediente where nombre = '"+Producto.getCmbIngrediente().getSelectedItem()+"' and estatus='A'";
			receta.setProducto(Producto.getTxtCodigo().getText());
			ResultSet resultSet = Conexion.consultar(tiraSQL);
			try {
				resultSet.next();
				receta.setIngrediente(resultSet.getString("codigo"));
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			receta.setCantidad(Float.parseFloat(Producto.getTxtCantidad().getText()));
			ingrediente.add(receta);
			String [] newRow = {(String)(Producto.getCmbIngrediente().getSelectedItem()), Producto.getTxtCantidad().getText()};
			((DefaultTableModel)tbIngredientesModel).addRow(newRow);
			Producto.getCmbIngrediente().removeItemAt(this.Producto.getCmbIngrediente().getSelectedIndex());
		}
		Producto.getTxtCantidad().setText("");
	}
	
	public void CargarTabla(){
		String[][] datos={{ "Ingrediente", "Cantidad" }};
		String[] columnas={ "Ingrediente", "Cantidad" };
		tbIngredientesModel = 	new DefaultTableModel(datos,columnas);
		tbingredientes = new JTable(tbIngredientesModel);
		Producto.getPnIngredientes().add(tbingredientes);
		tbingredientes.setModel(tbIngredientesModel);
		tbingredientes.setBounds(13, 101, 246, 131);
		tbingredientes.setFont(new java.awt.Font("URW Chancery L",2,16));
	}
	
	public void LimpiarPantalla(){
		this.Producto.getTxtCantidad().setText("");
		this.Producto.getTxtCodigo().setText("");
		this.Producto.getTxtNombre().setText("");
		this.Producto.getTxtPrecio().setText("");
		this.ingrediente.removeAllElements();
		this.Producto.getCmbIngrediente().removeAllItems();
		this.Producto.getCmbCategoria().removeAllItems();
		CargarTabla();
		CargarCombos();
	}
	private void CargarCombos() {
		String tiraSQL= "SELECT nombre FROM ingrediente where estatus = 'A'";
		ResultSet resulset = Conexion.consultar(tiraSQL);
		try {
			while(resulset.next()){
				this.Producto.getCmbIngrediente().addItem(resulset.getString("nombre"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		tiraSQL= "SELECT nombre FROM categoria where estatus='A'";
		resulset = Conexion.consultar(tiraSQL);
		try {
			while(resulset.next()){
				Producto.getCmbCategoria().addItem(resulset.getString("nombre"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
