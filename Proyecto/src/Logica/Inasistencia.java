package Logica;

import java.sql.Date;
import java.util.HashSet;

public class Inasistencia {

	private Date fecha;
	private int cantidadHoras;
	private TipoInasistencia tipo;

	// relaciones
	HashSet<Materia> Materia = new HashSet<Materia>();
	Estudiante estudiante;

	public Inasistencia(int cantidadHoras, Date fecha, TipoInasistencia tipo)// constructor
	{
		this.cantidadHoras = cantidadHoras;
		this.fecha = fecha;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
}
