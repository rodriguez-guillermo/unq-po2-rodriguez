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
	//private List<String> desgloceDeConceptos;
	//private List<ReciboDeHaberes> recibos;
	
	//Constructor
	public ReciboDeHaberes(String nombreDelEmpleado, String direccion, LocalDate fechaDeEmision, Double sueldoNeto,
			Double sueldoBruto) { //List<String> desgloceDeConceptos) {
		super();
		this.nombreDelEmpleado = nombreDelEmpleado;
		this.direccion = direccion;
		this.fechaDeEmision = fechaDeEmision;
		this.sueldoNeto = sueldoNeto;
		this.sueldoBruto = sueldoBruto;
		//this.desgloceDeConceptos = desgloceDeConceptos;
	}

	public String getNombreDelEmpleado() {
		return nombreDelEmpleado;
	}

	public void setNombreDelEmpleado(String nombreDelEmpleado) {
		this.nombreDelEmpleado = nombreDelEmpleado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaDeEmision() {
		return fechaDeEmision;
	}

	public void setFechaDeEmision(LocalDate fechaDeEmision) {
		this.fechaDeEmision = fechaDeEmision;
	}

	public Double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(Double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}

	public Double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(Double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	
	
	
//	public void setDesgloceDeConceptos(List<String> desgloceDeConceptos) {
//		this.desgloceDeConceptos = desgloceDeConceptos;
//	}
//	
//	public List<String> getDesgloceDeConceptos() {
//		return desgloceDeConceptos;
//	}
	
}