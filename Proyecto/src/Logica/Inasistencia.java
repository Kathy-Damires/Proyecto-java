package Logica;

import java.sql.Date;
import java.util.Scanner;

public class Inasistencia {
	Scanner leer = new Scanner(System.in);

	private Date fecha;
	private int cantidadHoras;

	public Inasistencia(int cantidadHoras, Date fecha)// constructor
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
