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
public class formListadVentas extends javax.swing.JFrame {
	private JPanel pnLisVenta;
	private JPanel pnDatos;
	private JTable jTable1;
	private JButton btSalir;
	private JButton btOrdDescMonto;
	private JButton btOrdAscMonto;
	private JButton btOrdDescCant;
	private JLabel lblfecha;
	private JButton btOrdAseCant;
	private JOptionPane mensaje;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public formListadVentas() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("MC'Dongo/Listados/Ventas");
			{
				pnLisVenta = new JPanel();
				getContentPane().add(pnLisVenta, BorderLayout.CENTER);
				pnLisVenta.setLayout(null);
				pnLisVenta.setBackground(new java.awt.Color(14,89,14));
				pnLisVenta.setPreferredSize(new java.awt.Dimension(661, 296));
				{
					pnDatos = new JPanel();
					pnLisVenta.add(pnDatos);
					pnDatos.setBounds(12, 23, 658, 281);
					pnDatos.setLayout(null);
					pnDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						btOrdAseCant = new JButton();
						pnDatos.add(btOrdAseCant);
						btOrdAseCant.setBounds(445, 76, 206, 29);
						btOrdAseCant.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_side_list.png")));
						btOrdAseCant.setBackground(new java.awt.Color(255,255,255));
						btOrdAseCant.setText("Por Cant. Ascendente");
						btOrdAseCant.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						lblfecha = new JLabel();
						pnDatos.add(lblfecha);
						lblfecha.setText("Fecha: 06/04/2011");
						lblfecha.setBounds(13, 25, 117, 14);
						lblfecha.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						btOrdDescCant = new JButton();
						pnDatos.add(btOrdDescCant);
						btOrdDescCant.setBounds(445, 121, 206, 27);
						btOrdDescCant.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_side_list.png")));
						btOrdDescCant.setBackground(new java.awt.Color(255,255,255));
						btOrdDescCant.setText("Por Cant. Descendente");
						btOrdDescCant.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						btOrdAscMonto = new JButton();
						pnDatos.add(btOrdAscMonto);
						btOrdAscMonto.setBounds(445, 159, 201, 26);
						btOrdAscMonto.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_side_list.png")));
						btOrdAscMonto.setBackground(new java.awt.Color(255,255,255));
						btOrdAscMonto.setText("Por Mont. Ascendente");
						btOrdAscMonto.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						btOrdDescMonto = new JButton();
						pnDatos.add(btOrdDescMonto);
						btOrdDescMonto.setBounds(445, 196, 201, 29);
						btOrdDescMonto.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_side_list.png")));
						btOrdDescMonto.setBackground(new java.awt.Color(255,255,255));
						btOrdDescMonto.setText("Por Mont. Descendente");
						btOrdDescMonto.setFont(new java.awt.Font("Purisa",1,11));
					}
				}
				{
					btSalir = new JButton();
					pnLisVenta.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.setFont(new java.awt.Font("Purisa",1,11));
					btSalir.setBounds(527, 310, 135, 29);
					btSalir.setBackground(new java.awt.Color(255,255,255));
				}
			}
			pack();
			this.setSize(692, 380);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void AgregarEscuchadores(ActionListener actionlistener){
		this.btOrdAscMonto.addActionListener(actionlistener);
		this.btOrdAseCant.addActionListener(actionlistener);
		this.btOrdDescCant.addActionListener(actionlistener);
		this.btOrdDescMonto.addActionListener(actionlistener);
		this.btSalir.addActionListener(actionlistener);
	}

	public JButton getBtSalir() {
		return btSalir;
	}

	public JButton getBtOrdDescMonto() {
		return btOrdDescMonto;
	}

	public JButton getBtOrdAscMonto() {
		return btOrdAscMonto;
	}

	public JButton getBtOrdDescCant() {
		return btOrdDescCant;
	}

	public JButton getBtOrdAseCant() {
		return btOrdAseCant;
	}
	public JOptionPane getMensaje() {
		return mensaje;
	}

	public JPanel getPnLisVenta() {
		return pnLisVenta;
	}

	public JPanel getPnDatos() {
		return pnDatos;
	}
	
}
