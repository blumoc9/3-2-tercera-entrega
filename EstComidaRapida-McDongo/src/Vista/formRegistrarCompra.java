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
public class formRegistrarCompra extends javax.swing.JFrame {
	private JPanel pnRegisCompra;
	private JButton btRegistrat;
	private JButton btSalir;
	private JButton btCancelar;
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
				{
					pnDatos = new JPanel();
					pnRegisCompra.add(pnDatos);
					pnDatos.setBounds(24, 19, 303, 111);
					pnDatos.setLayout(null);
					pnDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					{
						lblIngredente = new JLabel();
						pnDatos.add(lblIngredente);
						lblIngredente.setText("Ingrediente:");
						lblIngredente.setBounds(20, 24, 76, 18);
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
					}
					{
						txtCantidad = new JTextField();
						pnDatos.add(txtCantidad);
						txtCantidad.setBounds(114, 65, 70, 21);
					}
				}
				{
					btRegistrat = new JButton();
					pnRegisCompra.add(btRegistrat);
					btRegistrat.setText("Registrar");
					btRegistrat.setBounds(71, 155, 71, 21);
				}
				{
					btCancelar = new JButton();
					pnRegisCompra.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setBounds(159, 155, 69, 21);
				}
				{
					btSalir = new JButton();
					pnRegisCompra.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setBounds(247, 155, 56, 21);
				}
			}
			pack();
			this.setSize(365, 237);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
