package Logica;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		// alta usuarios
		// alta usuario1
		Usuario u1 = new Usuario("53542683", "contrase;a", "nombre", "apellido", "Mail", LocalDate.of(1996, 3, 13));
		// alta estudiante
		Usuario e1 = new Estudiante("ci", "contraseña", "nombre", "apellido", "mail", LocalDate.of(2020, 3, 1),
				Orientacion.TIC, Estado.ACTIVO, Generacion.PRIMERO);

		// alta docente
		Usuario d1 = new Docente("ci", "contraseña", "nombre", "apellido", "mail", LocalDate.of(2020, 3, 1));

		// altaMateria
		Materia programacion = new Materia("codigo", "programacion", Orientacion.TIC, Generacion.PRIMERO);

		// altaInasistencia
		Inasistencia i1 = new Inasistencia(1, LocalDate.of(2019, 5, 15), TipoInasistencia.INJUSTIFICADA);

		// Relaciones
		Cursada c1 = new Cursada(8, programacion);
		((Estudiante) e1).addMateriasEnCurso(c1);
	}

	// funciones
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
}
