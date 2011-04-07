package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.formRegistCategoria;

public class ControladorRegistrarCategoria implements ActionListener{

	private formRegistCategoria Categoria;
	
	public ControladorRegistrarCategoria() {
		super();
		this.Categoria = new formRegistCategoria();
		this.Categoria.setLocationRelativeTo(null);
		this.Categoria.setVisible(true);	
		this.Categoria.AgregarEscuchadores(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
