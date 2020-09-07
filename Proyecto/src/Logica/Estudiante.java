package Logica; 

import java.sql.Date;
import java.util.HashSet;

public class Estudiante extends Usuario{
	private Orientacion orientacion;
	private Estado estado;
	private Generacion generacion;

	public Estudiante(String ci, String contraseña, String nombre, String apellido, String mail, Date fecha, Estado estado, Generacion generacion){
		super(ci, contraseña, nombre, apellido, mail, fecha);
	
	}
	
	//relaciones
	HashSet<Cursada>materiasSalvadas = new HashSet<Cursada>();
	HashSet<Cursada>materiasEnCurso = new HashSet<Cursada>();
	HashSet<Cursada>materiasNoSalvadas = new HashSet<Cursada>();
	HashSet<Examen>examenes = new HashSet<Examen>();
	HashSet<Inasistencia>inasistencias = new HashSet<Inasistencia>();
	
}
