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
import Vista.formRegistCategoria;
import Vista.formRegistProduc;

public class ControladorRegistrarProducto implements ActionListener{

	private formRegistProduc Producto;
	private Vector<Ingrediente> ingrediente;
	private JTable tbingredientes;
	private TableModel tbIngredientesModel;
	
	public ControladorRegistrarProducto() {
		super();
		Conexion.establecerPropiedadesConexion("bdconfig", "jdbc.driver", "jdbc.url", "jdbc.nombrebd", "jdbc.usuario", "jdbc.password");
		this.Producto = new formRegistProduc();
		this.Producto.setLocationRelativeTo(null);
		this.Producto.setVisible(true);	
		this.Producto.AgregarEscuchadores(this);
		ingrediente = new Vector<Ingrediente>();
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
			Ingrediente ingre = new Ingrediente();
			if (!Producto.getCmbIngrediente().getActionCommand().equals("")||!Producto.getTxtCantidad().getText().equals("")){
				if (Producto.getTxtCantidad().getText().equals("")){
					Producto.getMensaje().showMessageDialog(this.Producto.getBtAgregar(), "Debe agregar la cantidad necesaria");
				}
				else{
				ingre.setCodigo((String)Producto.getCmbIngrediente().getSelectedItem());
				ingre.setCantidad(Integer.parseInt(Producto.getTxtCantidad().getText()));
				ingrediente.add(ingre);
				String [] newRow = {(String)(Producto.getCmbIngrediente().getSelectedItem()), Producto.getTxtCantidad().getText()};
				((DefaultTableModel)tbIngredientesModel).addRow(newRow);
				}
			}
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
		if (!Producto.getTxtCodigo().getText().equals("") || !Producto.getTxtNombre().getText().equals("") || !Producto.getCmbCategoria().getActionCommand().equals("") || !Producto.getCmbIngrediente().getActionCommand().equals("")){
			if (ingrediente.size()==0)
				this.Producto.getMensaje().showMessageDialog(this.Producto.getBtRegistrar(), "El Producto debe contener por lo menos 1 ingredeinte");
			else{
				tiraSQL= "SELECT * FROM producto where codigo= '"+Producto.getTxtCodigo().getText()+"' and estatus= 'A' ";
				ResultSet resultSet = Conexion.consultar(tiraSQL);
				try {
					if (!resultSet.next()){
						Producto produc = new Producto (Producto.getTxtNombre().getText(),Producto.getTxtCodigo().getText(), Double.parseDouble(Producto.getTxtPrecio().getText()));
						tiraSQL ="INSERT INTO producto (codigo,nombre, precio, estatus) VALUES ('"+produc.getCodigo()+"','"+produc.getNombre()+"','"+produc.getPrecio()+"','A')";
						Conexion.ejecutar(tiraSQL);
						for(int i=0; i< this.ingrediente.size(); i++){
							tiraSQL = "INSERT INTO ingrediente (codigo, cantidad, estatus) VALUES ('"+ingrediente.get(i).getCodigo()+"', '"+ingrediente.get(i).getCantidad()+"', 'A')";
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
		Producto.getTxtCodigo().setText("");
		Producto.getTxtNombre().setText("");
		Producto.getTxtPrecio().setText("");
		Producto.getTxtCantidad().setText("");
		CargarTabla();
	}
	private void CargarCombos() {
		String tiraSQL= "SELECT nombre FROM insumos where estatus = 'A'";
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
