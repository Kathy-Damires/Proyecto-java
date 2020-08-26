package Logica;

import java.sql.Date;

public class Examen {
	private Date fecha;
	private int nota;
	
	public Examen(int nota, Date fecha)// constructor
	{
		this.nota = nota;
		this.fecha = fecha;
	}
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
