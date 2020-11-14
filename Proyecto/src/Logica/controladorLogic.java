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
		Inasistencia inasistencia = new Inasistencia(cantidadHoras, fecha, tipo, materia, estudiante);
	}

	public static void consultarUsuario(String ci) {
		//base de datos
	}

	public static void consultarMateria(String codigo) {
		//base de datos
	}
	
	 public static void consultarInasistencia(String ci) {
		//base de datos
	 }
	 
	 public static void listarEstudiantes() {
		   
	 }
	 
	 public static void listarMaterias() {
		   
	 }
	 
	 public static void listarInasistencias() {
		   
	 }
	 
	 public static void listarInasistencias2() {
		   
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
	 
	 public static void logout() {
		   
	 }
	 
	 public static void listarClase() {
		   
	 }
	 
	 public static void listarDocentes() {
		   
	 }
	 
	 public static void listarFuncionarios() {
		 
	 }
	 
	 
}
