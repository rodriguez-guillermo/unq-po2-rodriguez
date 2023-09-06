package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Empleado {
	
	//Atributos
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;
	private Double sueldoBasico;
	
	//Constructor
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			Double sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	//Getter sueldoBasico
	public Double getSueldoBasico() {
		return sueldoBasico;
	}

	//Getter fechaDeNacimiento
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	//Getter estadoCivil
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	//Métodos
	public Long calcularEdad() {
		
		LocalDate hoy = LocalDate.now();
		return ChronoUnit.YEARS.between(this.getFechaDeNacimiento(), hoy);
	}
	
	public abstract Double calcularSueldoBruto();
	
	public Double calcularRetenciones() {
		
		return this.calcularObraSocial() + this.calcularAportesJubilatorios();
	};
	
	public abstract Double calcularObraSocial();
	
	public abstract Double calcularAportesJubilatorios();
	
	public Double calcularSueldoNeto() {
		
		return this.calcularSueldoBruto() - this.calcularRetenciones();
	}

	
}
