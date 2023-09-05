package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.List;

public class ReciboDeHaberes {
	
	//Atributos
	private String nombreDelEmpleado;
	private String direccion;
	private LocalDate fechaDeEmision;
	private Double sueldoNeto;
	private Double sueldoBruto;
	private List<String> desgloceDeConceptos;
	
	//Constructor
	public ReciboDeHaberes(String nombreDelEmpleado, String direccion, LocalDate fechaDeEmision, Double sueldoNeto,
			Double sueldoBruto, List<String> desgloceDeConceptos) {
		super();
		this.nombreDelEmpleado = nombreDelEmpleado;
		this.direccion = direccion;
		this.fechaDeEmision = fechaDeEmision;
		this.sueldoNeto = sueldoNeto;
		this.sueldoBruto = sueldoBruto;
		this.desgloceDeConceptos = desgloceDeConceptos;
	}
}
