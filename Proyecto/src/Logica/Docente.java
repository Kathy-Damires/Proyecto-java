package Logica;

import java.sql.Date;

public class Docente extends Usuario{

	public Docente(String ci, String contraseña, String nombre, String apellido, String mail, Date fecha) {
		super(ci, contraseña, nombre, apellido, mail, fecha);
	}
	
}
