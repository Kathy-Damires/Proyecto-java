package Logica;

import java.time.LocalDate;

public class Docente extends Usuario{

	public Docente(String ci, String contraseņa, String nombre, String apellido, String mail, LocalDate fecha) {
		super(ci, contraseņa, nombre, apellido, mail, fecha);
	}
	
}
