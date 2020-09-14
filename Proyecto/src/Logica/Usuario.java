package Logica;

import java.time.LocalDate;

public class Usuario {

	private String ci;
	private String contrase�a;
	private String nombre;
	private String apellido;
	private String mail;
	private LocalDate fecha;

	public Usuario(String ci, String contrase�a, String nombre, String apellido, String mail, LocalDate fecha) {// constructor
		this.ci = ci;
		this.contrase�a = contrase�a;
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

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getContrase�a() {
		return contrase�a;
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
