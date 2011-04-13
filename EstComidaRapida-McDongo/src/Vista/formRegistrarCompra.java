package Vista;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
public class formRegistrarCompra extends javax.swing.JFrame {
	private JPanel pnRegisCompra;
	private JTextFieldValidator txtNombre;
	private JTable jTable1;
	private JLabel lblnombre;
	private JButton btRegistrar;
	private JButton btCancelar;
	private JButton btSalir;
	private JTextFieldValidator txtCantidad;
	private JLabel lblCantidad;
	private JTextFieldValidator txtIngrediente;
	private JLabel lblIngredente;
	private JPanel pnDatos;
	private JOptionPane mensaje;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				formRegistrarCompra inst = new formRegistrarCompra();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public formRegistrarCompra() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("MC'Dongo/Registrar Compra de Ingredientes");
			{
				pnRegisCompra = new JPanel();
				getContentPane().add(pnRegisCompra, BorderLayout.CENTER);
				pnRegisCompra.setLayout(null);
				pnRegisCompra.setBackground(new java.awt.Color(14,89,14));
				pnRegisCompra.setPreferredSize(new java.awt.Dimension(479, 307));
				{
					pnDatos = new JPanel();
					pnRegisCompra.add(pnDatos);
					pnDatos.setBounds(12, 12, 448, 253);
					pnDatos.setLayout(null);
					pnDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lblIngredente = new JLabel();
						pnDatos.add(lblIngredente);
						lblIngredente.setText("Codigo:");
						lblIngredente.setBounds(15, 23, 87, 18);
						lblIngredente.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						txtIngrediente = new JTextFieldValidator();
						pnDatos.add(txtIngrediente);
						txtIngrediente.setBounds(112, 20, 104, 21);
						txtIngrediente.setMaximaLongitud(15);
						txtIngrediente.setTipoCaracteresPermitidos(JTextFieldValidator.LETRAS_Y_NUMEROS);
					}
					{
						lblCantidad = new JLabel();
						pnDatos.add(lblCantidad);
						lblCantidad.setText("Cantidad:");
						lblCantidad.setBounds(13, 64, 60, 14);
						lblCantidad.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						txtCantidad = new JTextFieldValidator();
						pnDatos.add(txtCantidad);
						txtCantidad.setBounds(112, 59, 70, 21);
						txtCantidad.setMaximaLongitud(4);
						txtCantidad.setTipoCaracteresPermitidos(JTextFieldValidator.SOLO_NUMEROS);
					}
					{
						lblnombre = new JLabel();
						pnDatos.add(lblnombre);
						lblnombre.setText("Nombre:");
						lblnombre.setBounds(234, 25, 74, 15);
						lblnombre.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						txtNombre = new JTextFieldValidator();
						pnDatos.add(txtNombre);
						txtNombre.setBounds(306, 20, 106, 22);
						txtNombre.setMaximaLongitud(10);
						txtNombre.setTipoCaracteresPermitidos(JTextFieldValidator.LETRAS_Y_ESPACIOS);
					}
				}
				{
					btSalir = new JButton();
					pnRegisCompra.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.setFont(new java.awt.Font("Purisa",1,11));
					btSalir.setBounds(371, 286, 89, 21);
					btSalir.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btCancelar = new JButton();
					pnRegisCompra.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/cancel.png")));
					btCancelar.setFont(new java.awt.Font("Purisa",1,11));
					btCancelar.setBounds(243, 286, 111, 21);
					btCancelar.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btRegistrar = new JButton();
					pnRegisCompra.add(btRegistrar);
					btRegistrar.setText("Registrar");
					btRegistrar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/add.png")));
					btRegistrar.setFont(new java.awt.Font("Purisa",1,11));
					btRegistrar.setBounds(117, 286, 115, 21);
					btRegistrar.setBackground(new java.awt.Color(255,255,255));
				}
			}
			pack();
			this.setSize(485, 358);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public void AgregarEscuchadores(ActionListener actionlistener){
		this.btCancelar.addActionListener(actionlistener);
		this.btRegistrar.addActionListener(actionlistener);
		this.btSalir.addActionListener(actionlistener);
	}

	public JButton getBtRegistrar() {
		return btRegistrar;
	}

	public JButton getBtCancelar() {
		return btCancelar;
	}

	public JButton getBtSalir() {
		return btSalir;
	}

	public JTextFieldValidator getTxtCantidad() {
		return txtCantidad;
	}

	public JTextFieldValidator getTxtIngrediente() {
		return txtIngrediente;
	}

	public JOptionPane getMensaje() {
		return mensaje;
	}

	public JTextFieldValidator getTxtNombre() {
		return txtNombre;
	}

	public JPanel getPnDatos() {
		return pnDatos;
	}

}
