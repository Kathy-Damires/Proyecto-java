package Logica;  

import java.sql.Date;
import java.util.HashSet;


public class Docente extends Usuario{

	public Docente(String ci, String contrase�a, String nombre, String apellido, String mail, Date fecha) {
		super(ci, contrase�a, nombre, apellido, mail, fecha);
	}

	//relaciones
	HashSet<Materia>Materias = new HashSet<Materia>();
	
	
}
