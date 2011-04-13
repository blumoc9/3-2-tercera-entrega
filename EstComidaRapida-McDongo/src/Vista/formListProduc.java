package Vista;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
public class formListProduc extends javax.swing.JFrame {
	private JPanel pnLisProd;
	private JTable jTable1;
	private JButton btverlistado;
	private JButton btSalir;
	private JLabel lblfecha;
	private JPanel pnLisProduc;
	private JOptionPane mensaje;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public formListProduc() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("MC'Dongo/Listado/Cantidad de Productos");
			getContentPane().setBackground(new java.awt.Color(30,244,157));
			{
				pnLisProd = new JPanel();
				getContentPane().add(pnLisProd, BorderLayout.CENTER);
				{
					pnLisProduc = new JPanel();
					pnLisProduc.setLayout(null);
					pnLisProd.add(pnLisProduc);
					pnLisProduc.setBounds(23, 26, 487, 212);
					pnLisProduc.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					pnLisProduc.setBackground(new java.awt.Color(255,255,255));
					{
						lblfecha = new JLabel();
						pnLisProduc.add(lblfecha);
						lblfecha.setText("Fecha: 06/04/2011");
						lblfecha.setBounds(13, 9, 146, 34);
						lblfecha.setFont(new java.awt.Font("Purisa",1,11));
					}
					pnLisProd.setLayout(null);
					pnLisProd.setBackground(new java.awt.Color(14,89,14));
					pnLisProd.setPreferredSize(new java.awt.Dimension(402, 281));

				}
				{
					btSalir = new JButton();
					pnLisProd.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.setFont(new java.awt.Font("Purisa",1,11));
					btSalir.setBounds(398, 244, 107, 29);
					btSalir.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btverlistado = new JButton();
					pnLisProd.add(btverlistado);
					btverlistado.setText("Ver Listado");
					btverlistado.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_view_list.png")));
					btverlistado.setBounds(258, 244, 135, 28);
					btverlistado.setBackground(new java.awt.Color(255,255,255));
					btverlistado.setFont(new java.awt.Font("Purisa",1,11));
				}
			}
			pack();
			this.setSize(540, 314);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void AgregarEscuchadores(ActionListener actionlistener){
		this.btSalir.addActionListener(actionlistener);
		this.btverlistado.addActionListener(actionlistener);
	}

	public JButton getBtSalir() {
		return btSalir;
	}
	public JOptionPane getMensaje() {
		return mensaje;
	}

	public JButton getBtverlistado() {
		return btverlistado;
	}

	public JPanel getPnLisProd() {
		return pnLisProd;
	}

	public JPanel getPnLisProduc() {
		return pnLisProduc;
	}
}
