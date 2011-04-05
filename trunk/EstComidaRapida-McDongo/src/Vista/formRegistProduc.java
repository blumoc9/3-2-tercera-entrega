package Vista;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.SwingUtilities;


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
public class formRegistProduc extends javax.swing.JFrame {
	private JPanel pnRegisProduc;
	private JPanel pnDatos;
	private JLabel lblCategoria;
	private JButton btSalir;
	private JButton btCancelar;
	private JButton btRegistrar;
	private JButton btAgregar;
	private JTable tbIngredientes;
	private JTextField txtCantidad;
	private JTextField txtNombre;
	private JLabel lblCantidad;
	private JComboBox cmbIngrediente;
	private JLabel lblIngre;
	private JLabel lblIngredientes;
	private JPanel pnIngredientes;
	private JComboBox cmbCategoria;
	private JTextField txtCodigo;
	private JLabel lblNombre;
	private JLabel lblCodigo;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				formRegistProduc inst = new formRegistProduc();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public formRegistProduc() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("MC'Dongo/Registrar Producto");
			{
				pnRegisProduc = new JPanel();
				getContentPane().add(pnRegisProduc, BorderLayout.CENTER);
				pnRegisProduc.setLayout(null);
				pnRegisProduc.setPreferredSize(new java.awt.Dimension(555, 304));
				pnRegisProduc.setBackground(new java.awt.Color(14,89,14));
				{
					pnDatos = new JPanel();
					pnRegisProduc.add(pnDatos);
					pnDatos.setBounds(12, 12, 516, 277);
					pnDatos.setLayout(null);
					pnDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lblCodigo = new JLabel();
						pnDatos.add(lblCodigo);
						lblCodigo.setText("Codigo:");
						lblCodigo.setBounds(26, 55, 54, 18);
						lblCodigo.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						lblNombre = new JLabel();
						pnDatos.add(lblNombre);
						lblNombre.setText("Nombre:");
						lblNombre.setBounds(26, 91, 53, 14);
						lblNombre.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						lblCategoria = new JLabel();
						pnDatos.add(lblCategoria);
						lblCategoria.setText("Categoria:");
						lblCategoria.setBounds(13, 122, 78, 18);
						lblCategoria.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						txtCodigo = new JTextField();
						pnDatos.add(txtCodigo);
						txtCodigo.setBounds(98, 54, 87, 21);
					}
					{
						txtNombre = new JTextField();
						pnDatos.add(txtNombre);
						txtNombre.setBounds(97, 88, 123, 21);
					}
					{
						ComboBoxModel cmbCategoriaModel = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
						cmbCategoria = new JComboBox();
						pnDatos.add(cmbCategoria);
						cmbCategoria.setModel(cmbCategoriaModel);
						cmbCategoria.setBounds(97, 121, 123, 21);
					}
					{
						pnIngredientes = new JPanel();
						pnDatos.add(pnIngredientes);
						pnIngredientes.setBounds(237, 13, 266, 251);
						pnIngredientes.setLayout(null);
						pnIngredientes.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
						{
							lblIngredientes = new JLabel();
							pnIngredientes.add(lblIngredientes);
							lblIngredientes.setText("Ingredientes del Producto");
							lblIngredientes.setBounds(46, 8, 175, 16);
							lblIngredientes.setFont(new java.awt.Font("Purisa",1,11));
						}
						{
							lblIngre = new JLabel();
							pnIngredientes.add(lblIngre);
							lblIngre.setText("Ingrediente:");
							lblIngre.setBounds(13, 43, 82, 17);
							lblIngre.setFont(new java.awt.Font("Purisa",1,11));
						}
						{
							ComboBoxModel cmbIngredienteModel = 
								new DefaultComboBoxModel(
										new String[] { "Item One", "Item Two" });
							cmbIngrediente = new JComboBox();
							pnIngredientes.add(cmbIngrediente);
							cmbIngrediente.setModel(cmbIngredienteModel);
							cmbIngrediente.setBounds(95, 41, 119, 21);
						}
						{
							lblCantidad = new JLabel();
							pnIngredientes.add(lblCantidad);
							lblCantidad.setText("Cantidad:");
							lblCantidad.setBounds(13, 72, 69, 14);
							lblCantidad.setFont(new java.awt.Font("Purisa",1,11));
						}
						{
							txtCantidad = new JTextField();
							pnIngredientes.add(txtCantidad);
							txtCantidad.setBounds(94, 69, 60, 21);
						}
						{
							TableModel tbIngredientesModel = 
								new DefaultTableModel(
										new String[][] { { "Ingrediente", "Cantidad" } },
										new String[] { "Ingredinte", "Cantidad" });
							tbIngredientes = new JTable();
							pnIngredientes.add(tbIngredientes);
							tbIngredientes.setModel(tbIngredientesModel);
							tbIngredientes.setBounds(20, 101, 233, 130);
							tbIngredientes.setFont(new java.awt.Font("Purisa",1,11));
						}
						{
							btAgregar = new JButton();
							pnIngredientes.add(btAgregar);
							btAgregar.setBounds(160, 69, 36, 21);
							btAgregar.setFont(new java.awt.Font("Purisa",1,11));
							btAgregar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/accept.png")));
						}
					}
				}
				{
					btRegistrar = new JButton();
					pnRegisProduc.add(btRegistrar);
					btRegistrar.setText("Registrar");
					btRegistrar.setBounds(178, 301, 117, 21);
					btRegistrar.setFont(new java.awt.Font("Purisa",1,11));
					btRegistrar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/add.png")));
				}
				{
					btCancelar = new JButton();
					pnRegisProduc.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setBounds(306, 301, 111, 21);
					btCancelar.setFont(new java.awt.Font("Purisa",1,11));
					btCancelar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/cancel.png")));
				}
				{
					btSalir = new JButton();
					pnRegisProduc.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(428, 301, 93, 21);
					btSalir.setFont(new java.awt.Font("Purisa",1,11));
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
				}
			}
			pack();
			this.setSize(542, 376);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
