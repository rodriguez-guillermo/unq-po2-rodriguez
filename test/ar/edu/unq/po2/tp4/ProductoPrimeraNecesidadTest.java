package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {
	
	private ProductoPrimeraNecesidad lecheCon10Descuento;
	private ProductoPrimeraNecesidad lecheCon8Descuento;
	private ProductoPrimeraNecesidad arrozCon11Descuento;
	
	@BeforeEach
	public void setUp() {
		lecheCon10Descuento = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
		lecheCon8Descuento = new ProductoPrimeraNecesidad("Leche", 8d, false, 8);
		arrozCon11Descuento = new ProductoPrimeraNecesidad("Arroz", 18.9d, true, 11);
	}
		
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, lecheCon10Descuento.getPrecio());
	}
	
	@Test
	public void testCalcularLecheConDescuento() {
		assertEquals(7.36, lecheCon8Descuento.getPrecio());
	}
	
	@Test
	public void testCalcularArrozConDescuento() {
		assertEquals(16.82, arrozCon11Descuento.getPrecio());
	}
}
