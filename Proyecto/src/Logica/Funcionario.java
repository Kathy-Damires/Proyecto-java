package Logica;

import java.time.LocalDate;

public class Funcionario extends Usuario {

	public Funcionario(String ci, String contraseņa, String nombre, String apellido, String mail, LocalDate fecha) {
		super(ci, contraseņa, nombre, apellido, mail, fecha);
	}

}
