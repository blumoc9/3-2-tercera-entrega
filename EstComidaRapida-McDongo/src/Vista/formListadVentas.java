package Vista;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
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
	private JButton btOrdAseCant;
	private JTable tbVentas;

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
			{
				pnLisVenta = new JPanel();
				getContentPane().add(pnLisVenta, BorderLayout.CENTER);
				pnLisVenta.setLayout(null);
				{
					pnDatos = new JPanel();
					pnLisVenta.add(pnDatos);
					pnDatos.setBounds(27, 17, 568, 246);
					pnDatos.setLayout(null);
					pnDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					{
						TableModel tbVentasModel = 
							new DefaultTableModel(
									new String[][] { { "Nombre Producto", "Cantidad", "Monto" } },
									new String[] { "Nombre Producto", "Cantidad", "Monto" });
						tbVentas = new JTable();
						pnDatos.add(tbVentas);
						tbVentas.setModel(tbVentasModel);
						tbVentas.setBounds(19, 38, 426, 127);
					}
					{
						btOrdAseCant = new JButton();
						pnDatos.add(btOrdAseCant);
						btOrdAseCant.setText("Ordenar Ascendentemente por cantidad");
						btOrdAseCant.setBounds(203, 173, 219, 72);
					}
				}
			}
			pack();
			this.setSize(634, 331);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
