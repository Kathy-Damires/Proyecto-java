package Logica; 

import java.util.HashSet;

public class Cursada {
	private int nota;
	
	
	
	public Cursada(int nota)// constructor
	{
		this.nota = nota;
	}
	
	//relaciones
	HashSet<Materia>cursadas = new HashSet<Materia>();
	
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
}
