package Vista;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
public class frmHome extends javax.swing.JFrame {
	private JMenuBar mnuPantalla;
	private JMenu mnuArchivo;
	private JMenu mnuListados;
	private JMenuItem mnuiRegisProd;
	private JMenuItem mnuiSalir;
	private JMenuItem mnuIngreUsado;
	private JMenuItem mnuCantidadIngre;
	private JMenuItem mnuVentas;
	private JMenuItem mnuiRegisCte;
	private JMenuItem mnuiRegisOrd;
	private JMenuItem mnuiRegisCompIngre;
	private JMenuItem mnuiRegistrarCatego;
	private JMenu mnuSalir;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frmHome inst = new frmHome();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public frmHome() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("MC' Dongo");
			getContentPane().setBackground(new java.awt.Color(14,89,14));
			{
				mnuPantalla = new JMenuBar();
				setJMenuBar(mnuPantalla);
				mnuPantalla.setBackground(new java.awt.Color(255,255,255));
				{
					mnuArchivo = new JMenu();
					mnuPantalla.add(mnuArchivo);
					mnuArchivo.setText("Archivo");
					{
						mnuiRegistrarCatego = new JMenuItem();
						mnuArchivo.add(mnuiRegistrarCatego);
						mnuiRegistrarCatego.setText("Registrar Categoria");
						mnuiRegistrarCatego.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						mnuiRegisProd = new JMenuItem();
						mnuArchivo.add(mnuiRegisProd);
						mnuiRegisProd.setText("Registrar Producto");
						mnuiRegisProd.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						mnuiRegisCompIngre = new JMenuItem();
						mnuArchivo.add(mnuiRegisCompIngre);
						mnuiRegisCompIngre.setText("Registrar Compra de Ingredientes");
						mnuiRegisCompIngre.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						mnuiRegisOrd = new JMenuItem();
						mnuArchivo.add(mnuiRegisOrd);
						mnuiRegisOrd.setText("Registrar Orden");
						mnuiRegisOrd.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						mnuiRegisCte = new JMenuItem();
						mnuArchivo.add(mnuiRegisCte);
						mnuiRegisCte.setText("Registrar Cliente");
						mnuiRegisCte.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/user_add.png")));
						mnuiRegisCte.setFont(new java.awt.Font("Purisa",1,11));
					}
				}
				{
					mnuListados = new JMenu();
					mnuPantalla.add(mnuListados);
					mnuListados.setText("Listados");
					{
						mnuVentas = new JMenuItem();
						mnuListados.add(mnuVentas);
						mnuVentas.setText("Venta de Productos");
						mnuVentas.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_view_list.png")));
						mnuVentas.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						mnuCantidadIngre = new JMenuItem();
						mnuListados.add(mnuCantidadIngre);
						mnuCantidadIngre.setText("Ingredientes Disponibles ");
						mnuCantidadIngre.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_side_list.png")));
						mnuCantidadIngre.setFont(new java.awt.Font("Purisa",1,11));
					}
					{
						mnuIngreUsado = new JMenuItem();
						mnuListados.add(mnuIngreUsado);
						mnuIngreUsado.setText("Ingredientes mas usados");
						mnuIngreUsado.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/application_tile_horizontal.png")));
						mnuIngreUsado.setFont(new java.awt.Font("Purisa",1,12));
					}
				}
				{
					mnuSalir = new JMenu();
					mnuPantalla.add(mnuSalir);
					mnuSalir.setText("Salir");
					{
						mnuiSalir = new JMenuItem();
						mnuSalir.add(mnuiSalir);
						mnuiSalir.setText("Salir");
						mnuiSalir.setIcon(new ImageIcon(getClass().getClassLoader().getResource("iconos/door_out.png")));
						mnuiSalir.setFont(new java.awt.Font("Purisa",1,11));
					}
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	public void AgregarEscuchadores(ActionListener actionListener) {
		mnuiRegistrarCatego.addActionListener(actionListener);
		mnuiRegisProd.addActionListener(actionListener);
		mnuiRegisCompIngre.addActionListener(actionListener);
		mnuiRegisOrd.addActionListener(actionListener);
		mnuiRegisCte.addActionListener(actionListener);
		mnuVentas.addActionListener(actionListener);
		mnuCantidadIngre.addActionListener(actionListener);
		mnuIngreUsado.addActionListener(actionListener);
		mnuiSalir.addActionListener(actionListener);
	}
}