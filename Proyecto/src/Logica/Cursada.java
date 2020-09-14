package Logica;

import java.util.HashSet;

public class Cursada {
	private int nota;

	// relaciones
	private Materia materia;




	public Cursada(int nota, Materia materia) {
		super();
		this.nota = nota;
		this.materia = materia;
	}



	public Materia getMateria() {
		return materia;
	}



	public void setMateria(Materia materia) {
		this.materia = materia;
	}



	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
