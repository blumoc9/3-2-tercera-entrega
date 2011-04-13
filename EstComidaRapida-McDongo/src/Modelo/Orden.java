package Modelo;

public class Orden {
	private long numero;
	private Cliente cliente;
	private String estatus;
	public Orden(long numero, Cliente cliente, String estatus) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.estatus = estatus;
	}
	public Orden() {
		super();
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
}
