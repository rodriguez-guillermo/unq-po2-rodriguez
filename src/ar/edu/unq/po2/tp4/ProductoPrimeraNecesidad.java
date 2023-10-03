package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private Integer descuento;

	public ProductoPrimeraNecesidad(String nombre, 
									double precio, 
									boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, 
									double precio, boolean 
									esPrecioCuidado, 
									Integer descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	public Integer getDescuento() {
		return descuento;
	}
	
	/**
	 * getPrecio() para el monto fijo de 10% de descuento
	 * */
//	@Override
//	public Double getPrecio() {
//		return super.getPrecio() * 0.9;
//	}
	
	@Override
	public Double getPrecio() {
		final double precioConDescuento = super.getPrecio() - ((super.getPrecio() * this.getDescuento() / 100));
		return Math.round(precioConDescuento * 100.0) / 100.0;
	}
}
