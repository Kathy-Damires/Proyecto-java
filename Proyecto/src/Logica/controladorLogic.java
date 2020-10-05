package Logica;

import java.time.LocalDate;

public class controladorLogic {

	/*
	 * public static void nombre() {
	 * 
	 * }
	 */

	public static void altaUsuario(String ci, String contraseña, String nombre, String apellido, String mail,
			LocalDate fecha) {
		Usuario usuario = new Usuario(ci, contraseña, nombre, apellido, mail, LocalDate.of(1996, 3, 13));
	}

	public static void altaMateria(String codigo, String nombre, Orientacion orientacion, Generacion generacion) {
		Materia materia = new Materia(codigo, nombre, orientacion, generacion);
	}

	public static void altaInasistencia(int cantidadHoras, LocalDate fecha, TipoInasistencia tipo, Materia materia,
			Estudiante estudiante) {
		Inasistencia inasistenci = new Inasistencia(cantidadHoras, fecha, tipo);
	}

	public static void consultarUsuario(String ci) {
		//base de datos
	}

	public static void consultarMateria(String codigo) {

	}
	
	 public static void consultarInasistencia(String ci) {
		   
	 }
	 
	 public static void listarEstudiantes() {
		   
	 }
	 
	 public static void listarMaterias() {
		   
	 }
	 
	 public static void listarInasistensias() {
		   
	 }
	 
	 public static void modificarUsuarios() {
		   
	 }
	 
	 public static void modificarMateria() {
		   
	 }
	 
	 public static void bajaInasistencia() {
		   
	 }
	 
	 public static void listarEstudiantesConPendientes() {
		   
	 }
	 
	 public static void listarHistoricolDeExamenes() {
		   
	 }
	 
	 public static void listarHistoricolDeExamenes2() {
		   
	 }
	 
	 public static void listarPendientes() {
		   
	 }
	 
	 public static void login() {
		   
	 }
	 
	 public static void logaut() {
		   
	 }
	 
	 public static void listarClase() {
		   
	 }
	 
	 public static void listarDocente() {
		   
	 }
	 
	 
}
