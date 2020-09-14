package Logica;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		// alta usuario
		Usuario e1 = new Usuario("53542683", "contrase;a", "nombre", "apellido", "Mail", LocalDate.of(1996, 3, 13));

		// altaMateria
		Materia programacion = new Materia("codigo", "programacion", Orientacion.TIC, null);

		// altaInasistencia
		Inasistencia i1 = new Inasistencia(1, LocalDate.of(2019, 5, 15), null);
	}
}
