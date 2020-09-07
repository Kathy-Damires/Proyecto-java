package Logica; 

import java.sql.Date;
import java.util.HashSet;


public class Materia {
	private String codigo;
	private String nombre;
	private Orientacion orientacion;
	private Generacion generacion;
	Docente docente;//relacion
	
	
	//constructor
	public Materia(String codigo, String nombre, Orientacion orientacion, Generacion generacion)// constructor
	{
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	//geters y seters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
