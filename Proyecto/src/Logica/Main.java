package Logica;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante("53542683", "1234", "Jonathan", "Cembranos", "jona@gmail.com", LocalDate.of(2003, 10, 9));
		
		System.out.println(estudiante1);

	}

}
