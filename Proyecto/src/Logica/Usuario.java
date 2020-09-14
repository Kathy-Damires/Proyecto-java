package Logica;

import java.time.LocalDate;

public class Usuario {

	private String ci;
	private String contraseña;
	private String nombre;
	private String apellido;
	private String mail;
	private LocalDate fecha;

	public Usuario(String ci, String contraseña, String nombre, String apellido, String mail, LocalDate fecha) {// constructor
		this.ci = ci;
		this.contraseña = contraseña;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.fecha = fecha;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getCi() {
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

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDate getFecha() {
		return fecha;
	}

}
