package Logica;

import java.time.LocalDate;
import java.util.HashSet;

public class Estudiante extends Usuario {
	private String orientacion;
	private String estado;
	private String generacion;

	// relaciones
	private HashSet<Cursada> materiasSalvadas = new HashSet<Cursada>();
	private HashSet<Cursada> materiasEnCurso = new HashSet<Cursada>();
	private HashSet<Cursada> materiasNoSalvadas = new HashSet<Cursada>();
	private HashSet<Examen> examenes = new HashSet<Examen>();
	private HashSet<Inasistencia> inasistencias = new HashSet<Inasistencia>();

	public Estudiante(int ci, String contraseña, String nombre, String apellido, String mail,String fecha,
			String orientacion, String estado, String generacion) {
		super(ci, contraseña, nombre, apellido, mail, fecha);
		this.orientacion = orientacion;
		this.estado = estado;
		this.generacion = generacion;
	}

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
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

	public void addMateriasEnCurso(Cursada cursada) {
		this.materiasEnCurso.add(cursada);
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
