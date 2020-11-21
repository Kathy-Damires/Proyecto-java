package Logica;

import java.time.LocalDate;
import java.util.HashSet;

public class Docente extends Usuario {

	// relaciones
	private HashSet<Materia> Materias = new HashSet<Materia>();

	public Docente(int ci, String contraseña, String nombre, String apellido, String mail, String fecha) {
		super(ci, contraseña, nombre, apellido, mail, fecha);
	}

	public HashSet<Materia> getMaterias() {
		return Materias;
	}

	public void setMaterias(HashSet<Materia> materias) {
		Materias = materias;
	}
}
