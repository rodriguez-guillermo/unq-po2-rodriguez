package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Double getPrecio() {
		return this.precio;
	}

	public boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}

	public void aumentarPrecio(double monto) {
		this.precio += monto;
	}

}
