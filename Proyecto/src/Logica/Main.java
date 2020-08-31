package Logica;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	Estudiante estudiante1 = new Estudiante("53542683", "1234", "Jonathan", "Cembranos", "jona@gmail.com", Date(02, 05, 2020));

	public static void main(String[] args) {
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		estudiantes.add(new Estudiante("53542683", "1234", "Jonathan", "Cembranos", "jona@gmail.com", LocalDate.of(2003, 10, 9)));
		
		for(int i=0; i<estudiantes.size(); i++) {
			System.out.println("Ci: " + estudiantes.get(i).getCi() + " Contrase;a: " + estudiantes.get(i).getContraseña() 
					+ "Nombre: " + estudiantes.get(i).getNombre() + " Apellido " + estudiantes.get(i).getApellido() 
					+ " Mail " + estudiantes.get(i).getMail() + " Fecha " + estudiantes.get(i).getFecha());
		}
		
	}

}
