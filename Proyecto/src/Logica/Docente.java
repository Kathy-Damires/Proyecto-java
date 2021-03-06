package Logica;

import java.time.LocalDate;
import java.util.HashSet;

public class Docente extends Usuario {

	// relaciones
	private HashSet<Materia> Materias = new HashSet<Materia>();

	public Docente(String ci, String contraseņa, String nombre, String apellido, String mail, LocalDate fecha) {
		super(ci, contraseņa, nombre, apellido, mail, fecha);
	}

	public HashSet<Materia> getMaterias() {
		return Materias;
	}

	public void setMaterias(HashSet<Materia> materias) {
		Materias = materias;
	}
}
