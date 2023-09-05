package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	
	//Atributos
	private Integer cantidadDeHijos;
	private Integer antiguedad;
	
	//Constructor
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			Double sueldoBasico, Integer cantidadDeHijos, Integer antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
	}
	
	//Métodos
	public Integer getCantidadDeHijos() {
		return cantidadDeHijos;
	}
	
	public Integer getAntiguedad() {
		return antiguedad;
	}
	
	@Override
	public Double calcularSueldoBruto() {
		
		return this.getSueldoBasico() + this.calcularSalarioFamiliar();
	}

	public Integer calcularSalarioFamiliar() {

		return this.calcularAsignacionPorHijo() + this.calcularAsignacionPorConyuge() + this.calcularSalarioPorAntiguedad();
	}

	@Override
	public Double calcularObraSocial() {

		return (this.calcularSueldoBruto() * 0.1) + this.calcularMontoTotalPorHijos();
	}

	public int calcularMontoTotalPorHijos() {
		
		return this.getCantidadDeHijos() * 20;
	}

	@Override
	public Double calcularAportesJubilatorios() {

		return this.calcularSueldoBruto() * 0.15;
	}
	
	public Integer calcularAsignacionPorHijo() {
		
		return this.getCantidadDeHijos() * 150;
	}
	
	public Integer calcularAsignacionPorConyuge() {
		
		if(this.esCasado()) {
			return 100;
		}else {
			return 0;
		}
	}

	private boolean esCasado() {

		return "CASADO".equalsIgnoreCase(this.getEstadoCivil());
	}
	
	public Integer calcularSalarioPorAntiguedad() {
		
		return this.getAntiguedad() * 50;
	}
}
