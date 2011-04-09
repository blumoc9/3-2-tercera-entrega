package Vista;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
public class formRegistProduc extends javax.swing.JFrame {
	private JPanel pnRegisProduc;
	private JPanel pnDatos;
	private JLabel lblCategoria;
	private JTextFieldValidator txtPrecio;
	private JLabel lblPrecio;
	private JButton jButton1;
	private JButton btSalir;
	private JButton btCancelar;
	private JButton btRegistrar;
	private JButton btAgregar;
	private JTextFieldValidator txtCantidad;
	private JTextFieldValidator txtNombre;
	private JLabel lblCantidad;
	private JComboBox cmbIngrediente;
	private JLabel lblIngre;
	private JLabel lblIngredientes;
	private JPanel pnIngredientes;
	private JComboBox cmbCategoria;
	private JTextFieldValidator txtCodigo;
	private JLabel lblNombre;
	private JLabel lblCodigo;
	private JOptionPane mensaje;

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
						lblCodigo.setBounds(14, 54, 65, 18);
						lblCodigo.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						lblNombre = new JLabel();
						pnDatos.add(lblNombre);
						lblNombre.setText("Nombre:");
						lblNombre.setBounds(14, 90, 65, 14);
						lblNombre.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						lblCategoria = new JLabel();
						pnDatos.add(lblCategoria);
						lblCategoria.setText("Categoria:");
						lblCategoria.setBounds(13, 153, 78, 18);
						lblCategoria.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						txtCodigo = new JTextFieldValidator();
						pnDatos.add(txtCodigo);
						txtCodigo.setBounds(86, 53, 87, 21);
						txtCodigo.setTipoCaracteresPermitidos(JTextFieldValidator.LETRAS_Y_NUMEROS);
						txtCodigo.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						txtNombre = new JTextFieldValidator();
						pnDatos.add(txtNombre);
						txtNombre.setBounds(85, 87, 140, 21);
						txtNombre.setTipoCaracteresPermitidos(JTextFieldValidator.LETRAS_Y_ESPACIOS);
						txtNombre.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						ComboBoxModel cmbCategoriaModel = 
							new DefaultComboBoxModel(
									new String[] {});
						cmbCategoria = new JComboBox();
						pnDatos.add(cmbCategoria);
						cmbCategoria.setModel(cmbCategoriaModel);
						cmbCategoria.setBounds(85, 152, 140, 21);
						cmbCategoria.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						pnIngredientes = new JPanel();
						pnDatos.add(pnIngredientes);
						pnIngredientes.setBounds(231, 13, 272, 251);
						pnIngredientes.setLayout(null);
						pnIngredientes.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
						pnIngredientes.setBackground(new java.awt.Color(202,255,181));
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
										new String[] {});
							cmbIngrediente = new JComboBox();
							pnIngredientes.add(cmbIngrediente);
							cmbIngrediente.setModel(cmbIngredienteModel);
							cmbIngrediente.setBounds(95, 41, 119, 21);
							cmbIngrediente.setFont(new java.awt.Font("Purisa",1,11));
						}
						{
							lblCantidad = new JLabel();
							pnIngredientes.add(lblCantidad);
							lblCantidad.setText("Cantidad:");
							lblCantidad.setBounds(13, 72, 69, 14);
							lblCantidad.setFont(new java.awt.Font("Purisa",1,11));
						}
						{
							txtCantidad = new JTextFieldValidator();
							pnIngredientes.add(txtCantidad);
							txtCantidad.setBounds(94, 69, 60, 21);
							txtCantidad.setTipoCaracteresPermitidos(JTextFieldValidator.SOLO_NUMEROS);
							txtCantidad.setFont(new java.awt.Font("Purisa",1,11));
						}
						{
							btAgregar = new JButton();
							pnIngredientes.add(btAgregar);
							btAgregar.setBounds(160, 69, 105, 21);
							btAgregar.setFont(new java.awt.Font("Purisa",1,11));
							btAgregar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/accept.png")));
							btAgregar.setBackground(new java.awt.Color(255,255,255));
							btAgregar.setText("Agregar");
						}
					}
					{
						lblPrecio = new JLabel();
						pnDatos.add(lblPrecio);
						lblPrecio.setText("Precio:");
						lblPrecio.setBounds(13, 121, 43, 15);
						lblPrecio.setFont(new java.awt.Font("Purisa",0,11));
					}
					{
						txtPrecio = new JTextFieldValidator();
						pnDatos.add(txtPrecio);
						txtPrecio.setBounds(85, 118, 88, 22);
						txtPrecio.setTipoCaracteresPermitidos(JTextFieldValidator.SOLO_NUMEROS);
						txtPrecio.setFont(new java.awt.Font("Purisa",0,11));
					}
				}
				{
					btRegistrar = new JButton();
					pnRegisProduc.add(btRegistrar);
					btRegistrar.setText("Registrar");
					btRegistrar.setBounds(178, 301, 117, 21);
					btRegistrar.setFont(new java.awt.Font("Purisa",1,11));
					btRegistrar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/add.png")));
					btRegistrar.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btCancelar = new JButton();
					pnRegisProduc.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setBounds(306, 301, 111, 21);
					btCancelar.setFont(new java.awt.Font("Purisa",1,11));
					btCancelar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/cancel.png")));
					btCancelar.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btSalir = new JButton();
					pnRegisProduc.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(428, 301, 93, 21);
					btSalir.setFont(new java.awt.Font("Purisa",1,11));
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
				}
				{
					jButton1 = new JButton();
					pnRegisProduc.add(jButton1);
					jButton1.setText("Salir");
					jButton1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					jButton1.setFont(new java.awt.Font("Purisa",1,11));
					jButton1.setBounds(428, 301, 93, 21);
					jButton1.setBackground(new java.awt.Color(255,255,255));
				}
			}
			pack();
			this.setSize(542, 376);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	public void AgregarEscuchadores(ActionListener actionlistener) {
		this.btAgregar.addActionListener(actionlistener);
		this.btCancelar.addActionListener(actionlistener);
		this.btRegistrar.addActionListener(actionlistener);
		this.btSalir.addActionListener(actionlistener);
	}
	
	
	public JButton getBtCancelar() {
		return btCancelar;
	}

	public JButton getBtRegistrar() {
		return btRegistrar;
	}

	public JButton getBtAgregar() {
		return btAgregar;
	}

	public JTextFieldValidator getTxtCantidad() {
		return txtCantidad;
	}

	public JTextFieldValidator getTxtNombre() {
		return txtNombre;
	}

	public JTextFieldValidator getTxtCodigo() {
		return txtCodigo;
	}
	
	public JOptionPane getMensaje() {
		return mensaje;
	}

	public JComboBox getCmbIngrediente() {
		return cmbIngrediente;
	}

	public JComboBox getCmbCategoria() {
		return cmbCategoria;
	}

	public JPanel getPnIngredientes() {
		return pnIngredientes;
	}

	public JTextField getTxtPrecio() {
		return txtPrecio;
	}
}

