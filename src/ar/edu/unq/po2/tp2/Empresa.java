package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Empresa {
	
	//Atributos
	private String nombre;
	private String cuit;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private ArrayList<ReciboDeHaberes> recibos = new ArrayList<ReciboDeHaberes>();
	
	//Constructor
	public Empresa(String nombre, String cuit, ArrayList<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}
	
	//getter empleados
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	
	//setter empleados
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public ArrayList<ReciboDeHaberes> getRecibos() {
		return recibos;
	}

	public void setRecibos(ArrayList<ReciboDeHaberes> recibos) {
		this.recibos = recibos;
	}
	
	//Métodos
	public void agregarEmpleadoALaEmpresa(Empleado empleadoAAgregar) {
		
		this.getEmpleados().add(empleadoAAgregar);
	}
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
		
		for(Empleado empleado : this.getEmpleados()) {
			this.generarReciboDel(empleado);
		}
	}

	public void generarReciboDel(Empleado empleado) {

		ReciboDeHaberes recibo = new ReciboDeHaberes(empleado.getNombre(), empleado.getDireccion(), LocalDate.now(), empleado.calcularSueldoNeto(), empleado.calcularSueldoBruto()); 
		this.getRecibos().add(recibo);
	}
}