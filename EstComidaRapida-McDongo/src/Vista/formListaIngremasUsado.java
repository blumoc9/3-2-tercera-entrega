package Vista;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
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
public class formListaIngremasUsado extends javax.swing.JFrame {
	private JPanel pnListIngredmasUsado;
	private JLabel lblCategoria;
	private JButton btOrdAscendente;
	private JButton btOrdDescendente;
	private JButton btCancelar;
	private JButton btSalir;
	private JTable tbListIngremasUsado;
	private JComboBox cmbProducto;
	private JComboBox cmbCategoria;
	private JLabel lblProducto;
	private JPanel pnDatos;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public formListaIngremasUsado() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				pnListIngredmasUsado = new JPanel();
				getContentPane().add(pnListIngredmasUsado, BorderLayout.CENTER);
				pnListIngredmasUsado.setLayout(null);
				pnListIngredmasUsado.setBackground(new java.awt.Color(14,89,14));
				{
					pnDatos = new JPanel();
					pnListIngredmasUsado.add(pnDatos);
					pnDatos.setBounds(25, 20, 648, 316);
					pnDatos.setLayout(null);
					pnDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
					pnDatos.setBackground(new java.awt.Color(255,255,255));
					{
						lblCategoria = new JLabel();
						pnDatos.add(lblCategoria);
						lblCategoria.setText("Categoria:");
						lblCategoria.setBounds(20, 36, 65, 15);
						lblCategoria.setFont(new java.awt.Font("Purisa",0,11));
					}
					{
						lblProducto = new JLabel();
						pnDatos.add(lblProducto);
						lblProducto.setText("Producto:");
						lblProducto.setBounds(308, 36, 61, 15);
						lblProducto.setFont(new java.awt.Font("Purisa",0,11));
					}
					{
						ComboBoxModel cmbCategoriaModel = 
							new DefaultComboBoxModel(
									new String[] {});
						cmbCategoria = new JComboBox();
						pnDatos.add(cmbCategoria);
						cmbCategoria.setModel(cmbCategoriaModel);
						cmbCategoria.setBounds(97, 32, 141, 22);
						cmbCategoria.setFont(new java.awt.Font("Purisa",0,11));
					}
					{
						ComboBoxModel cmbProductoModel = 
							new DefaultComboBoxModel(
									new String[] {});
						cmbProducto = new JComboBox();
						pnDatos.add(cmbProducto);
						cmbProducto.setModel(cmbProductoModel);
						cmbProducto.setBounds(398, 32, 138, 22);
						cmbProducto.setFont(new java.awt.Font("Purisa",0,11));
					}
					{
						TableModel tbListIngremasUsadoModel = 
							new DefaultTableModel(
									new String[][] { { "Ingrediente", "Cantidad" } },
									new String[] { "Ingrediente", "Cantidad" });
						tbListIngremasUsado = new JTable();
						pnDatos.add(tbListIngremasUsado);
						tbListIngremasUsado.setModel(tbListIngremasUsadoModel);
						tbListIngremasUsado.setBounds(32, 90, 504, 185);
						tbListIngremasUsado.setFont(new java.awt.Font("Purisa",0,11));
					}
					{
						btOrdDescendente = new JButton();
						pnDatos.add(btOrdDescendente);
						btOrdDescendente.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_side_list.png")));
						btOrdDescendente.setBackground(new java.awt.Color(255,255,255));
						btOrdDescendente.setBounds(580, 152, 43, 35);
					}
					{
						btOrdAscendente = new JButton();
						pnDatos.add(btOrdAscendente);
						btOrdAscendente.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_side_list.png")));
						btOrdAscendente.setBackground(new java.awt.Color(255,255,255));
						btOrdAscendente.setBounds(580, 90, 43, 35);
					}
				}
				{
					btSalir = new JButton();
					pnListIngredmasUsado.add(btSalir);
					btSalir.setText("Salir");
					btSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
					btSalir.setFont(new java.awt.Font("Purisa",1,11));
					btSalir.setBackground(new java.awt.Color(255,255,255));
					btSalir.setBounds(562, 355, 111, 29);
				}
				{
					btCancelar = new JButton();
					pnListIngredmasUsado.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/cancel.png")));
					btCancelar.setFont(new java.awt.Font("Purisa",1,11));
					btCancelar.setBackground(new java.awt.Color(255,255,255));
					btCancelar.setBounds(435, 355, 111, 29);
				}
			}
			pack();
			this.setSize(707, 436);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	public void AgregarEscuchadores(ActionListener actionlistener){
		this.btCancelar.addActionListener(actionlistener);
		this.btOrdAscendente.addActionListener(actionlistener);
		this.btOrdDescendente.addActionListener(actionlistener);
		this.btSalir.addActionListener(actionlistener);
	}
}
