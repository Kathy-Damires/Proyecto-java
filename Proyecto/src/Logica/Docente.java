package Logica;  


import java.time.LocalDate;
import java.util.HashSet;


public class Docente extends Usuario{

	public Docente(String ci, String contrase�a, String nombre, String apellido, String mail, LocalDate fecha) {
		super(ci, contrase�a, nombre, apellido, mail, fecha);
	}

	//relaciones
	HashSet<Materia>Materias = new HashSet<Materia>();
	
	
}
