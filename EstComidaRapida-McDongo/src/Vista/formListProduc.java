package Vista;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
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
	private JButton btSalir;
	private JButton btCancelar;
	private JLabel lblfecha;
	private JTable tbCantiProduc;
	private JPanel pnLisProduc;

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
					pnLisProduc.setBounds(23, 26, 340, 201);
					pnLisProduc.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					pnLisProduc.setBackground(new java.awt.Color(255,255,255));
					{
						TableModel tbCantiProducModel = 
							new DefaultTableModel(
									new String[][] { { "Ingrediente", "Cantidad" } },
									new String[] { "Ingrediente", "Cantidad" });
						tbCantiProduc = new JTable();
						pnLisProduc.add(tbCantiProduc);
						tbCantiProduc.setModel(tbCantiProducModel);
						tbCantiProduc.setBounds(25, 55, 281, 119);
						tbCantiProduc.setFont(new java.awt.Font("Purisa",1,11));
					}
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
					btCancelar = new JButton();
					pnLisProd.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/cancel.png")));
					btCancelar.setFont(new java.awt.Font("Purisa",1,11));
					btCancelar.setBounds(123, 233, 107, 29);
					btCancelar.setBackground(new java.awt.Color(255,255,255));
				}
				{
					btSalir = new JButton();
					pnLisProd.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.setFont(new java.awt.Font("Purisa",1,11));
					btSalir.setBounds(250, 233, 107, 29);
					btSalir.setBackground(new java.awt.Color(255,255,255));
				}
			}
			pack();
			this.setSize(410, 314);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
