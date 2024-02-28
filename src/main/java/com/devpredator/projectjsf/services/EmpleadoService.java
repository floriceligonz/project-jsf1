/**
 * 
 */
package com.devpredator.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectjsf.entity.Empleado;

/**
 * 
 */
public class EmpleadoService {
	
	public List<Empleado> consultarEmpleados(){
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("Senior");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luiz");
		empleadoMicrosoft.setPrimerApellido("Paniagua");
		empleadoMicrosoft.setSegundoApellido("Lopez");
		empleadoMicrosoft.setPuesto("Senior");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("jesus");
		empleadoApple.setPrimerApellido("Paniagua");
		empleadoApple.setSegundoApellido("Lopez");
		empleadoApple.setPuesto("Senior");
		empleadoApple.setEstatus(true);
		
		
		empleados.add(empleadoApple);
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		
		return empleados;
	}

}
