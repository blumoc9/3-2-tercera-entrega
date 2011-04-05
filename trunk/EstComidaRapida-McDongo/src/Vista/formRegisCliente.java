package Vista;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
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
public class formRegisCliente extends javax.swing.JFrame {
	private JPanel pnRegisCliente;
	private JButton btSalir;
	private JPanel pnDatos;
	private JTextField txtNombre;
	private JButton btCancelar;
	private JButton btRegistrar;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtCedula;
	private JLabel lblTelefono;
	private JLabel lblDireccion;
	private JLabel lblNombre;
	private JLabel lblCedula;

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
					pnDatos = new JPanel();
					pnRegisCliente.add(pnDatos);
					pnDatos.setBounds(12, 12, 366, 181);
					pnDatos.setLayout(null);
					pnDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lblCedula = new JLabel();
						pnDatos.add(lblCedula);
						lblCedula.setText("Cedula:");
						lblCedula.setBounds(19, 21, 61, 14);
						lblCedula.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						lblNombre = new JLabel();
						pnDatos.add(lblNombre);
						lblNombre.setText("Nombre:");
						lblNombre.setBounds(19, 52, 72, 14);
						lblNombre.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						lblDireccion = new JLabel();
						pnDatos.add(lblDireccion);
						lblDireccion.setText("Direccion:");
						lblDireccion.setBounds(19, 83, 72, 14);
						lblDireccion.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						lblTelefono = new JLabel();
						pnDatos.add(lblTelefono);
						lblTelefono.setText("Telefono:");
						lblTelefono.setBounds(23, 145, 76, 14);
						lblTelefono.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						txtCedula = new JTextField();
						pnDatos.add(txtCedula);
						txtCedula.setBounds(98, 18, 119, 21);
					}
					{
						txtNombre = new JTextField();
						pnDatos.add(txtNombre);
						txtNombre.setBounds(98, 49, 240, 21);
					}
					{
						txtDireccion = new JTextField();
						pnDatos.add(txtDireccion);
						txtDireccion.setBounds(99, 80, 239, 44);
					}
					{
						txtTelefono = new JTextField();
						pnDatos.add(txtTelefono);
						txtTelefono.setBounds(99, 142, 126, 21);
					}
				}
				{
					btRegistrar = new JButton();
					pnRegisCliente.add(btRegistrar);
					btRegistrar.setText("Registrar");
					btRegistrar.setBounds(28, 212, 127, 21);
					btRegistrar.setFont(new java.awt.Font("Purisa",1,11));
					btRegistrar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/add.png")));
				}
				{
					btCancelar = new JButton();
					pnRegisCliente.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setBounds(160, 212, 115, 21);
					btCancelar.setFont(new java.awt.Font("Purisa",1,11));
					btCancelar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/cancel.png")));
				}
				{
					btSalir = new JButton();
					pnRegisCliente.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(280, 212, 94, 21);
					btSalir.setFont(new java.awt.Font("Purisa",1,11));
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
				}
			}
			pack();
			this.setSize(396, 279);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
