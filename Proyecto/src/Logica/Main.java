package Logica;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		// alta usuario
		// alta usuario1
		Usuario u1 = new Usuario("53542683", "contrase;a", "nombre", "apellido", "Mail", LocalDate.of(1996, 3, 13));
		// alta estudiante
		Usuario e1 = new Estudiante("ci", "contraseņa", "nombre", "apellido", "mail", LocalDate.of(2020, 3, 1),
				Orientacion.TIC, Estado.ACTIVO, Generacion.PRIMERO);
	
		// alta docente
		Usuario d1 = new Docente("ci", "contraseņa", "nombre", "apellido", "mail", LocalDate.of(2020, 3, 1));

		// altaMateria
		Materia programacion = new Materia("codigo", "programacion", Orientacion.TIC, Generacion.PRIMERO);

		// altaInasistencia
		Inasistencia i1 = new Inasistencia(1, LocalDate.of(2019, 5, 15), TipoInasistencia.INJUSTIFICADA);

		// Relaciones
		((Estudiante)e1).addMateriasEnCurso(programacion);
	}
}
