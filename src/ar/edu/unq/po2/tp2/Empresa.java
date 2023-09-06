package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.Iterator;
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
	
	//getter empleados
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	
	//setter empleados
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	//Métodos
	public Double calcularTotalSueldosNetos() {
		
		double montoSueldosNetos = 0;
		for(Empleado empleadoAObtenerNeto : this.getEmpleados()) {
			montoSueldosNetos += empleadoAObtenerNeto.calcularSueldoNeto();
		}
		return montoSueldosNetos;
	}
	
	public Double calcularTotalSueldosBrutos() {
	
		double montoSueldosBrutos = 0;
		for(Empleado empleadoAObtenerBruto : this.getEmpleados()) {
			montoSueldosBrutos += empleadoAObtenerBruto.calcularSueldoBruto();
		}
		return montoSueldosBrutos;
	}
	
	public Double calcularTotalRetenciones() {
		
		double montoRetenciones = 0;
		for(Empleado empleadoAObtenerRetencion : this.getEmpleados()) {
			montoRetenciones += empleadoAObtenerRetencion.calcularRetenciones();
		}
		return montoRetenciones;
	}
	
	public void liquidarSueldos() {
		//TODO
	}
	
	public void agregarEmpleadoALaEmpresa(Empleado empleadoAAgregar) {
		
		this.getEmpleados().add(empleadoAAgregar);
	}
	
}
