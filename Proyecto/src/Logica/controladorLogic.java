package Logica;

import java.time.LocalDate;

public class controladorLogic {
	
	/*
	  public static void nombre() {
		   
	}
	 */
	
	
	
	
	
	public static void crearUsuario(String ci, String contraseña, String nombre, String apellido, String mail,
			LocalDate fecha) {
		Usuario usuario = new Usuario(ci, contraseña, nombre, apellido, mail, LocalDate.of(1996, 3, 13));
	}

	public static void crearMateria(String codigo, String nombre, Orientacion orientacion, Generacion generacion) {
		Materia materia = new Materia(codigo, nombre, orientacion, generacion);
	}

	public static void altaInasistencia(int cantidadHoras, LocalDate fecha, TipoInasistencia tipo, Materia materia,
			Estudiante estudiante) {
		Inasistencia inasistenci = new Inasistencia(cantidadHoras, fecha, tipo);
	}
	
	  public static void consultarUsuario() {
			
	}
}
