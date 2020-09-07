package Logica; 

import java.sql.Date;

public class Funcionario extends Usuario{

	public Funcionario(String ci, String contraseña, String nombre, String apellido, String mail, Date fecha) {
		super(ci, contraseña, nombre, apellido, mail, fecha);
		
	}

}
