package Logica;

import java.time.LocalDate;
import java.util.HashSet;

public class Inasistencia {

	private LocalDate fecha;
	private int cantidadHoras;
	private TipoInasistencia tipo;

	// relaciones
	HashSet<Materia> Materia = new HashSet<Materia>();
	Estudiante estudiante;

	public Inasistencia(int cantidadHoras, LocalDate fecha, TipoInasistencia tipo)// constructor
	{
		this.cantidadHoras = cantidadHoras;
		this.fecha = fecha;
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
