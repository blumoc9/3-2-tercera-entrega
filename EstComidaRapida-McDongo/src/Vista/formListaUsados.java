package Vista;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
public class formListaUsados extends javax.swing.JFrame {
	private JPanel pndatos;
	private JButton btascendente;
	private JButton btdescendente;
	private JButton btsalir;
	private JPanel pnusados;
	private JOptionPane mensaje;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				formListaUsados inst = new formListaUsados();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public formListaUsados() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setBackground(new java.awt.Color(14,89,14));
			this.setTitle("Mc'Dongo/Listados/Ingredientes mas Usados");
			{
				pndatos = new JPanel();
				getContentPane().add(pndatos, BorderLayout.CENTER);
				pndatos.setLayout(null);
				pndatos.setBackground(new java.awt.Color(14,89,14));
				{
					pnusados = new JPanel();
					pndatos.add(pnusados);
					pnusados.setBounds(27, 26, 646, 285);
					pnusados.setBackground(new java.awt.Color(255,255,255));
					pnusados.setLayout(null);
					{
						btascendente = new JButton();
						pnusados.add(btascendente);
						btascendente.setText("Lis. Ascendente");
						btascendente.setBounds(470, 76, 165, 31);
						btascendente.setBackground(new java.awt.Color(255,255,255));
						btascendente.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_view_list.png")));
						btascendente.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						btdescendente = new JButton();
						pnusados.add(btdescendente);
						btdescendente.setText("Lis. Descendente");
						btdescendente.setBounds(470, 135, 165, 31);
						btdescendente.setBackground(new java.awt.Color(255,255,255));
						btdescendente.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_view_list.png")));
						btdescendente.setFont(new java.awt.Font("Purisa",1,11));
					}
				}
				{
					btsalir = new JButton();
					pndatos.add(btsalir);
					btsalir.setText("Salir");
					btsalir.setBounds(569, 317, 104, 27);
					btsalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btsalir.setBackground(new java.awt.Color(255,255,255));
					btsalir.setFont(new java.awt.Font("Purisa",1,11));
				}
			}
			pack();
			this.setSize(707, 381);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void AgregarEscuchadores(ActionListener actionlistener){
		btsalir.addActionListener(actionlistener);
		this.btascendente.addActionListener(actionlistener);
		this.btdescendente.addActionListener(actionlistener);
	}

	public JButton getBtascendente() {
		return btascendente;
	}

	public JButton getBtdescendente() {
		return btdescendente;
	}

	public JButton getBtsalir() {
		return btsalir;
	}

	public JPanel getPndatos() {
		return pndatos;
	}

	public JPanel getPnusados() {
		return pnusados;
	}

	public JOptionPane getMensaje() {
		return mensaje;
	}
	
}
