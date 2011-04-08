package Vista;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.SwingUtilities;

import bean.JTextFieldValidator;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class formRegisOrden extends javax.swing.JFrame {
	private JPanel pnRegisOrden;
	private JButton btRegistrar;
	private JButton btCancelar;
	private JButton btSalir;
	private JFrame jFrame1;
	private JComboBox cmbCliente;
	private JButton btBuscar;
	private JLabel lblCategoria;
	private JButton btRetirar;
	private JButton btAgregar;
	private JTable tbPedido;
	private JTextFieldValidator txtCantidad;
	private JLabel lblCantidad;
	private JComboBox cmbProducto;
	private JLabel lblProducto;
	private JComboBox cmbCategoria;
	private JLabel lblPedido;
	private JPanel pnPedido;
	private JLabel lblNumero;
	private JLabel lblCliente;
	private JPanel pnDatos;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				formRegisOrden inst = new formRegisOrden();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public formRegisOrden() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("MC'Dongo/Registrar Orden");
			{
				pnRegisOrden = new JPanel();
				getContentPane().add(pnRegisOrden, BorderLayout.CENTER);
				pnRegisOrden.setLayout(null);
				pnRegisOrden.setBackground(new java.awt.Color(14,89,14));
				{
					btSalir = new JButton();
					pnRegisOrden.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.setFont(new java.awt.Font("Purisa",1,11));
					btSalir.setBounds(523, 337, 103, 28);
					btSalir.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btCancelar = new JButton();
					pnRegisOrden.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/cancel.png")));
					btCancelar.setFont(new java.awt.Font("Purisa",1,11));
					btCancelar.setBounds(395, 337, 108, 28);
					btCancelar.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btRegistrar = new JButton();
					pnRegisOrden.add(btRegistrar);
					btRegistrar.setText("Registrar");
					btRegistrar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/add.png")));
					btRegistrar.setFont(new java.awt.Font("Purisa",1,11));
					btRegistrar.setBounds(253, 337, 122, 28);
					btRegistrar.setBackground(new java.awt.Color(255,255,255));
				}
				{
					pnDatos = new JPanel();
					pnRegisOrden.add(pnDatos);
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					pnDatos.setLayout(null);
					pnDatos.setBounds(27, 22, 630, 303);
					{
						ComboBoxModel cmbClienteModel = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
						cmbCliente = new JComboBox();
						pnDatos.add(cmbCliente);
						cmbCliente.setModel(cmbClienteModel);
						cmbCliente.setFont(new java.awt.Font("Purisa",1,11));
						cmbCliente.setBounds(97, 15, 167, 22);
					}
					{
						lblCliente = new JLabel();
						pnDatos.add(lblCliente);
						lblCliente.setText("Cliente:");
						lblCliente.setFont(new java.awt.Font("Purisa",1,11));
						lblCliente.setBounds(38, 19, 59, 15);
					}
					{
						btBuscar = new JButton();
						pnDatos.add(btBuscar);
						btBuscar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/zoom.png")));
						btBuscar.setBackground(new java.awt.Color(255,255,255));
						btBuscar.setBounds(276, 15, 25, 21);
						btBuscar.addActionListener(null);
					}
					{
						lblNumero = new JLabel();
						pnDatos.add(lblNumero);
						lblNumero.setText("N° 00001");
						lblNumero.setFont(new java.awt.Font("Purisa",1,11));
						lblNumero.setBounds(552, 13, 65, 15);
					}
					{
						pnPedido = new JPanel();
						pnDatos.add(pnPedido);
						pnPedido.setBackground(new java.awt.Color(202,255,181));
						pnPedido.setBorder(BorderFactory.createMatteBorder(1,1,1,1,new java.awt.Color(0,0,0)));
						pnPedido.setLayout(null);
						pnPedido.setBounds(26, 55, 568, 231);
						{
							lblPedido = new JLabel();
							pnPedido.add(lblPedido);
							lblPedido.setText("Pedido");
							lblPedido.setFont(new java.awt.Font("Purisa",1,11));
							lblPedido.setBounds(13, 5, 43, 15);
						}
						{
							lblCategoria = new JLabel();
							pnPedido.add(lblCategoria);
							lblCategoria.setText("Categoria:");
							lblCategoria.setFont(new java.awt.Font("Purisa",1,11));
							lblCategoria.setBounds(13, 32, 80, 15);
						}
						{
							ComboBoxModel cmbCategoriaModel = 
								new DefaultComboBoxModel(
										new String[] { "Item One", "Item Two" });
							cmbCategoria = new JComboBox();
							pnPedido.add(cmbCategoria);
							cmbCategoria.setModel(cmbCategoriaModel);
							cmbCategoria.setFont(new java.awt.Font("Purisa",1,11));
							cmbCategoria.setBounds(88, 32, 129, 22);
						}
						{
							lblProducto = new JLabel();
							pnPedido.add(lblProducto);
							lblProducto.setText("Producto:");
							lblProducto.setFont(new java.awt.Font("Purisa",1,11));
							lblProducto.setBounds(223, 36, 74, 15);
						}
						{
							ComboBoxModel cmbProductoModel = 
								new DefaultComboBoxModel(
										new String[] { "Item One", "Item Two" });
							cmbProducto = new JComboBox();
							pnPedido.add(cmbProducto);
							cmbProducto.setModel(cmbProductoModel);
							cmbProducto.setFont(new java.awt.Font("Purisa",1,11));
							cmbProducto.setBounds(296, 32, 133, 22);
						}
						{
							lblCantidad = new JLabel();
							pnPedido.add(lblCantidad);
							lblCantidad.setText("Cantidad:");
							lblCantidad.setFont(new java.awt.Font("Purisa",1,11));
							lblCantidad.setBounds(441, 36, 60, 15);
						}
						{
							txtCantidad = new JTextFieldValidator();
							pnPedido.add(txtCantidad);
							txtCantidad.setBounds(513, 33, 35, 22);
						}
						{
							TableModel tbPedidoModel = 
								new DefaultTableModel(
										new String[][] { { "One", "Two" }, { "Three", "Four" } },
										new String[] { "Column 1", "Column 2" });
							tbPedido = new JTable();
							pnPedido.add(tbPedido);
							tbPedido.setModel(tbPedidoModel);
							tbPedido.setFont(new java.awt.Font("Purisa",1,11));
							tbPedido.setBounds(19, 88, 482, 113);
						}
						{
							btAgregar = new JButton();
							pnPedido.add(btAgregar);
							btAgregar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/accept.png")));
							btAgregar.setBackground(new java.awt.Color(255,255,255));
							btAgregar.setBounds(518, 88, 30, 25);
						}
						{
							btRetirar = new JButton();
							pnPedido.add(btRetirar);
							btRetirar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/delete.png")));
							btRetirar.setBackground(new java.awt.Color(255,255,255));
							btRetirar.setBounds(518, 118, 30, 27);
						}
					}
				}
			}
			pack();
			this.setSize(694, 416);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	public void AgregarEscuchadores(ActionListener actionlistener){
		this.btAgregar.addActionListener(actionlistener);
		this.btBuscar.addActionListener(actionlistener);
		this.btCancelar.addActionListener(actionlistener);
		this.btRegistrar.addActionListener(actionlistener);
		this.btSalir.addActionListener(actionlistener);
	}
}
