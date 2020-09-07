package Logica; 

import java.sql.Date;
import java.util.HashSet;
import java.util.Scanner;

public class Inasistencia {

	private Date fecha;
	private int cantidadHoras;
	private TipoInasistencia tipo;
	

	public Inasistencia(int cantidadHoras, Date fecha, TipoInasistencia tipo)// constructor
	{
		this.cantidadHoras = cantidadHoras;
		this.fecha = fecha;
	}
	//relaciones
	HashSet<Materia>Materia = new HashSet<Materia>();
	Estudiante estudiante;

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
