package Logica;

import java.sql.Date;
import java.util.HashSet;

public class Examen {
	private Date fecha;
	private int nota;
	
	
	public Examen(int nota, Date fecha)// constructor
	{
		this.nota = nota;
		this.fecha = fecha;
	}
	
	//relaciones
	Estudiante estudiante;
	Materia materia;
	
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}

}
