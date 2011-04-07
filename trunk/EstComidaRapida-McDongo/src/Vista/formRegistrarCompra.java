package Vista;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

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
public class formRegistrarCompra extends javax.swing.JFrame {
	private JPanel pnRegisCompra;
	private JButton btRegistrar;
	private JButton btCancelar;
	private JButton btSalir;
	private JTextField txtCantidad;
	private JLabel lblCantidad;
	private JTextField txtIngrediente;
	private JLabel lblIngredente;
	private JPanel pnDatos;

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
				{
					pnDatos = new JPanel();
					pnRegisCompra.add(pnDatos);
					pnDatos.setBounds(24, 19, 303, 111);
					pnDatos.setLayout(null);
					pnDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lblIngredente = new JLabel();
						pnDatos.add(lblIngredente);
						lblIngredente.setText("Ingrediente:");
						lblIngredente.setBounds(20, 24, 76, 18);
						lblIngredente.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						txtIngrediente = new JTextField();
						pnDatos.add(txtIngrediente);
						txtIngrediente.setBounds(114, 23, 104, 21);
					}
					{
						lblCantidad = new JLabel();
						pnDatos.add(lblCantidad);
						lblCantidad.setText("Cantidad:");
						lblCantidad.setBounds(20, 68, 60, 14);
						lblCantidad.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						txtCantidad = new JTextField();
						pnDatos.add(txtCantidad);
						txtCantidad.setBounds(114, 65, 70, 21);
					}
				}
				{
					btSalir = new JButton();
					pnRegisCompra.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.setFont(new java.awt.Font("Purisa",1,11));
					btSalir.setBounds(230, 166, 93, 21);
					btSalir.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btCancelar = new JButton();
					pnRegisCompra.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/cancel.png")));
					btCancelar.setFont(new java.awt.Font("Purisa",1,11));
					btCancelar.setBounds(129, 166, 96, 21);
					btCancelar.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btRegistrar = new JButton();
					pnRegisCompra.add(btRegistrar);
					btRegistrar.setText("Registrar");
					btRegistrar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/add.png")));
					btRegistrar.setFont(new java.awt.Font("Purisa",1,11));
					btRegistrar.setBounds(26, 166, 98, 21);
					btRegistrar.setBackground(new java.awt.Color(255,255,255));
				}
			}
			pack();
			this.setSize(365, 237);
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

}
