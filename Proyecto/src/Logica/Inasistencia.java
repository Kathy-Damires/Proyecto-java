package Logica;

import java.time.LocalDate;

public class Inasistencia {

	private LocalDate fecha;
	private int cantidadHoras;
	private TipoInasistencia tipo;
	

	public Inasistencia(int cantidadHoras, LocalDate fecha, TipoInasistencia tipo, Materia materia, Estudiante estudiante)// constructor
	{
		this.cantidadHoras = cantidadHoras;
		this.fecha = fecha;
		this.materia = materia;
		this.estudiante = estudiante;
	}

	// relaciones
	private Materia materia;
	private Estudiante estudiante;
	
	public TipoInasistencia getTipo() {
		return tipo;
	}

	public void setTipo(TipoInasistencia tipo) {
		this.tipo = tipo;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
}
