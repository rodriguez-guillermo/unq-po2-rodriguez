package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	
	//Atributos
	private LocalDate fechaDeFinDeDesignacion;
	private Integer cantidadHorasExtras;
	
	//Constructor
	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			Double sueldoBasico, LocalDate fechaDeFinDeDesignacion, Integer cantidadHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaDeFinDeDesignacion = fechaDeFinDeDesignacion;
		this.cantidadHorasExtras = cantidadHorasExtras;
	}
	
	//Getter cantidadHorasExtras
	public Integer getCantidadHorasExtras() {
		return cantidadHorasExtras;
	}
	
	public Integer calcularMontoPorHorasExtras() {
		
		return this.getCantidadHorasExtras() * 40;
	}

	@Override
	public Double calcularSueldoBruto() {
		
		return this.getSueldoBasico() + this.calcularMontoPorHorasExtras();
	}

	@Override
	public Double calcularObraSocial() {

		return this.calcularSueldoBruto() + this.montoSiSuperaEdad();
	}

	public Integer montoSiSuperaEdad() {

		if(this.superaEdad()) {
			return 25;
		}else {
			return 0;
		}
	}

	public boolean superaEdad() {

		return this.calcularEdad() > 50;
	}

	@Override
	public Double calcularAportesJubilatorios() {

		return (this.calcularSueldoBruto() * 0.1) + this.getCantidadHorasExtras() * 5; 
	}
	
}
