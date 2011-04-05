package Vista;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
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
	private JTextField txtDireccion2;
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
				{
					pnDatos = new JPanel();
					pnRegisCliente.add(pnDatos);
					pnDatos.setBounds(12, 12, 366, 181);
					pnDatos.setLayout(null);
					pnDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					{
						lblCedula = new JLabel();
						pnDatos.add(lblCedula);
						lblCedula.setText("Cedula:");
						lblCedula.setBounds(19, 21, 47, 14);
					}
					{
						lblNombre = new JLabel();
						pnDatos.add(lblNombre);
						lblNombre.setText("Nombre:");
						lblNombre.setBounds(19, 52, 53, 14);
					}
					{
						lblDireccion = new JLabel();
						pnDatos.add(lblDireccion);
						lblDireccion.setText("Direccion:");
						lblDireccion.setBounds(19, 83, 62, 14);
					}
					{
						lblTelefono = new JLabel();
						pnDatos.add(lblTelefono);
						lblTelefono.setText("Telefono:");
						lblTelefono.setBounds(23, 145, 58, 14);
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
						txtDireccion.setBounds(99, 80, 239, 21);
					}
					{
						txtDireccion2 = new JTextField();
						pnDatos.add(txtDireccion2);
						txtDireccion2.setBounds(99, 107, 239, 21);
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
					btRegistrar.setBounds(93, 212, 71, 21);
				}
				{
					btCancelar = new JButton();
					pnRegisCliente.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setBounds(184, 212, 69, 21);
				}
				{
					btSalir = new JButton();
					pnRegisCliente.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(277, 212, 41, 21);
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
