package Logica;

import java.time.LocalDate;

public class Docente extends Usuario{

	public Docente(String ci, String contraseña, String nombre, String apellido, String mail, LocalDate fecha) {
		super(ci, contraseña, nombre, apellido, mail, fecha);
	}
	
}
