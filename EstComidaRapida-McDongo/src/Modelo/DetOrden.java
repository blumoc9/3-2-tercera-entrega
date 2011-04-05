package Modelo;

public class DetOrden {

	private int numeroorden;
	private String codigoorden;
	
	public DetOrden() {
		super();
	}

	public DetOrden(int numeroorden, String codigoorden) {
		super();
		this.numeroorden = numeroorden;
		this.codigoorden = codigoorden;
	}

	public int getNumeroorden() {
		return numeroorden;
	}

	public void setNumeroorden(int numeroorden) {
		this.numeroorden = numeroorden;
	}

	public String getCodigoorden() {
		return codigoorden;
	}

	public void setCodigoorden(String codigoorden) {
		this.codigoorden = codigoorden;
	}
}
