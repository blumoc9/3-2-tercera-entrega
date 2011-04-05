package Vista;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
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
public class formRegistCategoria extends javax.swing.JFrame {
	private JPanel pnRegistrarCateg;
	private JPanel pnDatos;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JButton btSalir;
	private JButton btCancelar;
	private JButton btRegistrar;
	private JLabel lblNombre;
	private JLabel lblCodigo;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				formRegistCategoria inst = new formRegistCategoria();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public formRegistCategoria() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("MC' Dongo/Registrar Categoria");
			{
				pnRegistrarCateg = new JPanel();
				getContentPane().add(pnRegistrarCateg, BorderLayout.CENTER);
				pnRegistrarCateg.setLayout(null);
				pnRegistrarCateg.setPreferredSize(new java.awt.Dimension(390, 230));
				{
					pnDatos = new JPanel();
					pnRegistrarCateg.add(pnDatos);
					pnDatos.setBounds(17, 34, 334, 105);
					pnDatos.setLayout(null);
					pnDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					{
						lblCodigo = new JLabel();
						pnDatos.add(lblCodigo);
						lblCodigo.setText("Codigo:");
						lblCodigo.setBounds(17, 22, 54, 20);
					}
					{
						lblNombre = new JLabel();
						pnDatos.add(lblNombre);
						lblNombre.setText("Nombre:");
						lblNombre.setBounds(17, 54, 53, 14);
					}
					{
						txtCodigo = new JTextField();
						pnDatos.add(txtCodigo);
						txtCodigo.setBounds(89, 22, 92, 21);
					}
					{
						txtNombre = new JTextField();
						pnDatos.add(txtNombre);
						txtNombre.setBounds(89, 55, 142, 21);
					}
				}
				{
					btRegistrar = new JButton();
					pnRegistrarCateg.add(btRegistrar);
					btRegistrar.setText("Registrar");
					btRegistrar.setBounds(47, 168, 71, 21);
				}
				{
					btCancelar = new JButton();
					pnRegistrarCateg.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setBounds(129, 168, 69, 21);
				}
				{
					btSalir = new JButton();
					pnRegistrarCateg.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(209, 168, 67, 21);
				}
			}
			pack();
			this.setSize(384, 255);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
