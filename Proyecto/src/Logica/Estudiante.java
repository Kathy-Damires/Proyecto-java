package Logica;

import java.time.LocalDate;
import java.util.HashSet;

public class Estudiante extends Usuario {
	private Orientacion orientacion;
	private Estado estado;
	private Generacion generacion;

	// relaciones
	private HashSet<Cursada> materiasSalvadas = new HashSet<Cursada>();
	private HashSet<Cursada> materiasEnCurso = new HashSet<Cursada>();
	private HashSet<Cursada> materiasNoSalvadas = new HashSet<Cursada>();
	private HashSet<Examen> examenes = new HashSet<Examen>();
	private HashSet<Inasistencia> inasistencias = new HashSet<Inasistencia>();

	public Estudiante(String ci, String contraseña, String nombre, String apellido, String mail, LocalDate fecha,
			Orientacion orientacion, Estado estado, Generacion generacion) {
		super(ci, contraseña, nombre, apellido, mail, fecha);
		this.orientacion = orientacion;
		this.estado = estado;
		this.generacion = generacion;
	}

	public Orientacion getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(Orientacion orientacion) {
		this.orientacion = orientacion;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Generacion getGeneracion() {
		return generacion;
	}

	public void setGeneracion(Generacion generacion) {
		this.generacion = generacion;
	}

	public HashSet<Cursada> getMateriasSalvadas() {
		return materiasSalvadas;
	}

	public void setMateriasSalvadas(HashSet<Cursada> materiasSalvadas) {
		this.materiasSalvadas = materiasSalvadas;
	}

	public HashSet<Cursada> getMateriasEnCurso() {
		return materiasEnCurso;
	}

	public void addMateriasEnCurso(Materia mat) {
		this.materiasEnCurso.add(mat);
	}

	public HashSet<Cursada> getMateriasNoSalvadas() {
		return materiasNoSalvadas;
	}

	public void setMateriasNoSalvadas(HashSet<Cursada> materiasNoSalvadas) {
		this.materiasNoSalvadas = materiasNoSalvadas;
	}

	public HashSet<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(HashSet<Examen> examenes) {
		this.examenes = examenes;
	}

	public HashSet<Inasistencia> getInasistencias() {
		return inasistencias;
	}

	public void setInasistencias(HashSet<Inasistencia> inasistencias) {
		this.inasistencias = inasistencias;
	}

}
