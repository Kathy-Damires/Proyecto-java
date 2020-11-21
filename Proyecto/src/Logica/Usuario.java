package Logica;

import java.time.LocalDate;

public class Usuario {

	private int ci;
	private String contraseña;
	private String nombre;
	private String apellido;
	private String mail;
	private String fecha;

	public Usuario(int ci, String contraseña, String nombre, String apellido, String mail, String fecha) {// constructor
		this.ci = ci;
		this.contraseña = contraseña;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.fecha = fecha;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getCi() {
		return ci;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido() {
		return apellido;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMail() {
		return mail;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

}
