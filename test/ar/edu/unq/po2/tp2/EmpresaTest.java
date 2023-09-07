package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {
	
	Empleado empleadoPermanente1 = new EmpleadoPermanente("EP 1", "Calle EP 1", "Soltero", LocalDate.of(1980, 1, 1), 1500.00, 0, 3);
	Empleado empleadoPermanente2 = new EmpleadoPermanente("EP 2", "Calle EP 2", "Casado", LocalDate.of(1970, 1, 2), 2500.00, 3, 26);
	Empleado empleadoTemporal1 = new EmpleadoTemporario("ET 1", "Calle ET 1", "Soltero", LocalDate.of(2000, 2, 1), 600.00, LocalDate.of(2023, 12, 24), 20);
	Empleado empleadoTemporal2 = new EmpleadoTemporario("ET 2", "Calle ET 2", "Casado", LocalDate.of(2005, 2, 2), 400.00, LocalDate.of(2023, 12, 31), 5);
	
	Empresa empresa1 = new Empresa("Empresa 1", "27-0000001-1", new ArrayList<Empleado>());

	@BeforeEach
	void setUp() {
	
//		empresa1.agregarEmpleadoALaEmpresa(empleadoPermanente1);
//		empresa1.agregarEmpleadoALaEmpresa(empleadoPermanente2);
//		empresa1.agregarEmpleadoALaEmpresa(empleadoTemporal1);
//		empresa1.agregarEmpleadoALaEmpresa(empleadoTemporal2);
	}
	
	@Test
	// Cuando la empresa no tiene empleados, el total de sueldos netos es 0.
	void test_total_netos_0() {
		assertEquals(0, empresa1.calcularTotalSueldosNetos());
	}
	
	@Test
	// Cuando la empresa no tiene empleados, el total de sueldos brutos es 0.
	void test_total_brutos_0() {
		assertEquals(0, empresa1.calcularTotalSueldosBrutos());
	}
	
	@Test
	// Cuando la empresa no tiene empleados, el total de retenciones es 0.
	void test_total_retenciones_0() {
		assertEquals(0, empresa1.calcularTotalRetenciones());
	}
	
	@Test
	//
	void test_empleado_permanente_total_neto() {
		empresa1.agregarEmpleadoALaEmpresa(empleadoPermanente1);
		assertEquals(412.5, empresa1.calcularTotalRetenciones());
	}
}
