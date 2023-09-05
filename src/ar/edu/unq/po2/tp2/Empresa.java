package ar.edu.unq.po2.tp2;

import java.util.List;

public class Empresa {
	
	//Atributos
	private String nombre;
	private String cuit;
	private List<Empleado> empleados;
	
	//Constructor
	public Empresa(String nombre, String cuit, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}
	
	public void calcularTotalSueldosNetos() {
		//TODO
	}
	
	public void calcularTotalSueldosBrutos() {
		//TODO
	}
	
	public void calcularTotalRetenciones() {
		//TODO
	}
	
	public void liquidarSueldos() {
		//TODO
	}
}
