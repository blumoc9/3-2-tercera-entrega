package Vista;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
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
public class formRegisCliente extends javax.swing.JFrame {
	private JPanel pnRegisCliente;
	private JTextFieldValidator txtTelefono;
	private JPanel pnDatos;
	private JTextFieldValidator txtNombre;
	private JTextFieldValidator txtDireccion;
	private JTextFieldValidator txtCedula;
	private JLabel lblTelefono;
	private JLabel lblDireccion;
	private JLabel lblNombre;
	private JLabel lblCedula;
	private JButton btSalir;
	private JButton btCancelar;
	private JButton btRegistrar;
	private JOptionPane mensaje;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				formRegisCliente inst = new formRegisCliente();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public formRegisCliente() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("MC'Dongo/Registrat Cliente");
			{
				pnRegisCliente = new JPanel();
				getContentPane().add(pnRegisCliente, BorderLayout.CENTER);
				pnRegisCliente.setLayout(null);
				pnRegisCliente.setBackground(new java.awt.Color(14,89,14));
				{
					btRegistrar = new JButton();
					pnRegisCliente.add(btRegistrar);
					btRegistrar.setText("Registrar");
					btRegistrar.setBounds(28, 212, 127, 21);
					btRegistrar.setFont(new java.awt.Font("Purisa",1,11));
					btRegistrar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/add.png")));
					btRegistrar.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btCancelar = new JButton();
					pnRegisCliente.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setBounds(160, 212, 115, 21);
					btCancelar.setFont(new java.awt.Font("Purisa",1,11));
					btCancelar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/cancel.png")));
					btCancelar.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btSalir = new JButton();
					pnRegisCliente.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(280, 212, 94, 21);
					btSalir.setFont(new java.awt.Font("Purisa",1,11));
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.setBackground(new java.awt.Color(255,255,255));
				}
				{
					pnDatos = new JPanel();
					pnRegisCliente.add(pnDatos);
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					pnDatos.setBorder(BorderFactory.createMatteBorder(1,1,1,1,new java.awt.Color(0,0,0)));
					pnDatos.setLayout(null);
					pnDatos.setBounds(12, 12, 366, 181);
					{
						lblCedula = new JLabel();
						pnDatos.add(lblCedula);
						lblCedula.setText("Cedula:");
						lblCedula.setFont(new java.awt.Font("Purisa",1,11));
						lblCedula.setBounds(19, 21, 61, 14);
					}
					{
						lblNombre = new JLabel();
						pnDatos.add(lblNombre);
						lblNombre.setText("Nombre:");
						lblNombre.setFont(new java.awt.Font("Purisa",1,11));
						lblNombre.setBounds(19, 52, 72, 14);
					}
					{
						lblDireccion = new JLabel();
						pnDatos.add(lblDireccion);
						lblDireccion.setText("Direccion:");
						lblDireccion.setFont(new java.awt.Font("Purisa",1,11));
						lblDireccion.setBounds(19, 83, 72, 14);
					}
					{
						lblTelefono = new JLabel();
						pnDatos.add(lblTelefono);
						lblTelefono.setText("Telefono:");
						lblTelefono.setFont(new java.awt.Font("Purisa",1,11));
						lblTelefono.setBounds(23, 145, 76, 14);
					}
					{
						txtCedula = new JTextFieldValidator();
						pnDatos.add(txtCedula);
						txtCedula.setBounds(98, 18, 119, 21);
						txtCedula.setMaximaLongitud(9);
						txtCedula.setTipoCaracteresPermitidos(JTextFieldValidator.SOLO_NUMEROS);
					}
					{
						txtNombre = new JTextFieldValidator();
						pnDatos.add(txtNombre);
						txtNombre.setMaximaLongitud(40);
						txtNombre.setTipoCaracteresPermitidos(JTextFieldValidator.LETRAS_Y_ESPACIOS);
						txtNombre.setBounds(98, 49, 240, 21);
					}
					{
						txtDireccion = new JTextFieldValidator();
						pnDatos.add(txtDireccion);
						txtDireccion.setMaximaLongitud(75);
						txtDireccion.setTipoCaracteresPermitidos(JTextFieldValidator.LETRAS_Y_ESPACIOS);
						txtDireccion.setBounds(99, 80, 239, 44);
					}
					{
						txtTelefono = new JTextFieldValidator();
						pnDatos.add(txtTelefono);
						txtTelefono.setMaximaLongitud(11);
						txtTelefono.setTipoCaracteresPermitidos(JTextFieldValidator.SOLO_NUMEROS);
						txtTelefono.setBounds(99, 142, 126, 21);
					}
				}
			}
			pack();
			this.setSize(396, 279);
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

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public JTextField getTxtCedula() {
		return txtCedula;
	}


	public JOptionPane getMensaje() {
		return mensaje;
	}

	public JButton getBtCancelar() {
		return btCancelar;
	}

	public JButton getBtRegistrar() {
		return btRegistrar;
	}
	
	
}
