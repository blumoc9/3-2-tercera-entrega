package Vista;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
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
public class formRegistCategoria extends javax.swing.JFrame {
	private JPanel pnRegistrarCateg;
	private JPanel pnDatos;
	private JTextFieldValidator txtCodigo;
	private JTextFieldValidator txtNombre;
	private JButton btSalir;
	private JButton btCancelar;
	private JButton btRegistrar;
	private JLabel lblNombre;
	private JLabel lblCodigo;
	private JOptionPane mensaje;

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
				pnRegistrarCateg.setPreferredSize(new java.awt.Dimension(363, 201));
				pnRegistrarCateg.setBackground(new java.awt.Color(14,89,14));
				{
					pnDatos = new JPanel();
					pnRegistrarCateg.add(pnDatos);
					pnDatos.setBounds(12, 12, 325, 95);
					pnDatos.setLayout(null);
					pnDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lblCodigo = new JLabel();
						pnDatos.add(lblCodigo);
						lblCodigo.setText("Codigo:");
						lblCodigo.setBounds(17, 22, 54, 20);
						lblCodigo.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						lblNombre = new JLabel();
						pnDatos.add(lblNombre);
						lblNombre.setText("Nombre:");
						lblNombre.setBounds(17, 54, 53, 14);
						lblNombre.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						txtCodigo = new JTextFieldValidator();
						pnDatos.add(txtCodigo);
						txtCodigo.setBounds(89, 22, 133, 21);
						txtCodigo.setMaximaLongitud(15);
						txtCodigo.setTipoCaracteresPermitidos(JTextFieldValidator.LETRAS_Y_NUMEROS);
					}
					{
						txtNombre = new JTextFieldValidator();
						pnDatos.add(txtNombre);
						txtNombre.setBounds(89, 55, 216, 21);
						txtNombre.setMaximaLongitud(20);
						txtNombre.setTipoCaracteresPermitidos(JTextFieldValidator.LETRAS_Y_ESPACIOS);
					}
				}
				{
					btRegistrar = new JButton();
					pnRegistrarCateg.add(btRegistrar);
					btRegistrar.setText("Registrar");
					btRegistrar.setBounds(12, 119, 116, 21);
					btRegistrar.setFont(new java.awt.Font("Purisa",1,11));
					btRegistrar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/add.png")));
					btRegistrar.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btCancelar = new JButton();
					pnRegistrarCateg.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setBounds(133, 119, 108, 21);
					btCancelar.setFont(new java.awt.Font("Purisa",1,11));
					btCancelar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/cancel.png")));
					btCancelar.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btSalir = new JButton();
					pnRegistrarCateg.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(252, 119, 85, 21);
					btSalir.setFont(new java.awt.Font("Purisa",1,11));
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.setBackground(new java.awt.Color(255,255,255));
				}
			}
			pack();
			this.setSize(363, 186);
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

	public JTextField getTxtCodigo() {
		return txtCodigo;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JOptionPane getMensaje() {
		return mensaje;
	}

	public JButton getBtSalir() {
		return btSalir;
	}

	public JButton getBtCancelar() {
		return btCancelar;
	}

	public JButton getBtRegistrar() {
		return btRegistrar;
	}
	
}
