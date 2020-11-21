package Persistencia;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import Logica.Docente;
import Logica.Estado;
import Logica.Estudiante;
import Logica.Funcionario;
import Logica.Generacion;
import Logica.Orientacion;
import Logica.Usuario;

public class controladorBD {
//coneccion 
	Persistencia.Conn connect = new Persistencia.Conn();

	Connection con = connect.conectarMySQL();

	// Listas
	/*
	 * public static ResultSet algo() throws Exception { Connection controlador =
	 * getMySqlConnection(); Statement st; ResultSet res; st =
	 * controlador.createStatement(); res =
	 * st.executeQuery("SELECT * FROM usuario;"); return res; }
	 */
	public static ArrayList<Usuario> listarUsuarios() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM usuario;");
		Usuario userToAdd = null;
		ArrayList<Usuario> usuarios = new ArrayList<>();
		while (res.next()) {
			int ci = res.getInt("ci");
			String nombre = res.getString("nombre");
			String apellido = res.getString("apellido");
			String fechaNac = res.getString("fechaNac");
			String email = res.getString("email");
			String password = res.getString("password");
			// averiguo el tipo del usuario
			// tipo de usuario Estudiante
			ResultSet resE;
			resE = st.executeQuery("SELECT * FROM estudiante;");
			while (resE.next()) {
				int ciE = resE.getInt("ci");
				if (ci == ciE) {
					String generaci�n = resE.getString("generaci�n");
					String orientaci�n = resE.getString("orientaci�n");
					String estado = resE.getString("estado");
					userToAdd = new Estudiante(ci, password, nombre, apellido, email, fechaNac, orientaci�n, estado,
							generaci�n);
					usuarios.add(userToAdd);
				}
			}
			// tipo de usuario Docente
			ResultSet resD;
			resD = st.executeQuery("SELECT * FROM docente;");
			while (resD.next()) {
				int ciD = resD.getInt("ci");
				if (ci == ciD) {
					userToAdd = new Docente(ci, password, nombre, apellido, email, fechaNac);
					usuarios.add(userToAdd);
				}
			}
			// tipo de usuario Funcionario
			ResultSet resF;
			resF = st.executeQuery("SELECT * FROM funcionario;");
			while (resF.next()) {
				int ciF = resF.getInt("ci");
				if (ci == ciF) {
					userToAdd = new Funcionario(ci, password, nombre, apellido, email, fechaNac);
					usuarios.add(userToAdd);
				}
			}
		}
		return usuarios;
	}

	public static ArrayList<Estudiante> listarEstudiantes() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM estudiante");
		Estudiante estudianteToAdd = null;
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		while (res.next()) {
			int ci = res.getInt("ci");
			String generaci�n = res.getString("generaci�n");
			String orientaci�n = res.getString("orientaci�n");
			String estado = res.getString("estado");
			ResultSet resU;
			resU = st.executeQuery("SELECT * FROM usuario;");
			while (resU.next()) {
				int ciU = resU.getInt("ci");
				if (ci == ciU) {
					String nombre = resU.getString("nombre");
					String apellido = resU.getString("apellido");
					String fechaNac = resU.getString("fechaNac");
					String email = resU.getString("email");
					String password = resU.getString("password");
					estudianteToAdd = new Estudiante(ciU, password, nombre, apellido, email, fechaNac, orientaci�n,
							estado, generaci�n);
					estudiantes.add(estudianteToAdd);
				}
			}
		}
		return estudiantes;

	}

	public static ResultSet listarMaterias() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM materia;");
		return res;

	}

	public static ResultSet listarinasistencias() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM inasistencia;)");
		return res;

	}

	public static ResultSet listarDocentes() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM docente;");
		return res;
	}

	public static ResultSet listarFuncionarios() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM funcionario;");
		return res;

	}

	public static ResultSet listarEstudiantesConPendientes() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM ");
		return res;

	}

//Fin listas

//Dar de alta una usuario
	public static ResultSet altaEstudiante(int ci, String nombre, String apellido, LocalDate fechaNac, String email,
			String passwd, String generacion, String orientacion, String estado) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("INSERT INTO usuario(ci, nombre, apellido, fechaNac, email, passwd) VALUES" + "(" + ci
				+ nombre + apellido + fechaNac + email + passwd + ")" + ";");
		res = st.executeQuery(
				"INSERT INTO estudiante(ci, generacion, orientacion, estado) VALUES" + ci + generacion + estado + ";");
		return res;
	}

	public static ResultSet altaDocente(int ci, String nombre, String apellido, LocalDate fechaNac, String email,
			String passwd) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("INSERT INTO usuario(ci, nombre, apellido, fechaNac, email, passwd) VALUES" + "(" + ci
				+ nombre + apellido + fechaNac + email + passwd + ")" + ";");
		res = st.executeQuery("INSERT INTO docente(ci) VALUES" + "(" + ci + ")" + ";");
		return res;
	}

	public static ResultSet altaFuncionario(int ci, String nombre, String apellido, LocalDate fechaNac, String email,
			String passwd) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("INSERT INTO usuario(ci, nombre, apellido, fechaNac, email, passwd) VALUES" + "(" + ci
				+ nombre + apellido + fechaNac + email + passwd + ")" + ";");
		res = st.executeQuery("INSERT INTO funcionario(ci) VALUES" + "(" + ci + ")" + ";");
		return res;
	}

//Dar de alta una Materia

	public static ResultSet altaMateria(String codigoM, String nombre, String orientaci�n, String generaci�n)
			throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("INSERT INTO materia(codigoM, nombre, orientaci�n, generaci�n) VALUES" + "(" + codigoM
				+ nombre + orientaci�n + generaci�n + ")" + ";");
		return res;
	}

//Dar de alta una Inasistencia

	public static ResultSet altaInasistencia(int codigoInasistencia, int ci, String codigoM, String tipo,
			LocalDate fecha) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("INSERT INTO inasistencia(codigoInasistencia, ci, codigoM, tipo, fecha) VALUES" + "("
				+ codigoInasistencia + ci + codigoM + tipo + fecha + ")" + ";");
		return res;
	}

//Dar de alta un Examen

	public static ResultSet altaExamen(int ci, String codigoM, LocalDate fecha, int nota, int idExamen)
			throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("INSERT INTO examen(ci, codigoM, fecha, nota, idExamen) VALUES" + "(" + ci + codigoM
				+ fecha + nota + idExamen + ")" + ";");
		return res;
	}

//Consultar un Usuario

	public static ResultSet buscarUsuario(int ci) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM usuario WHERE usuario." + ci + ";");
		return res;
	}

	// Modificar un Usuario

	public static ResultSet modificarUsuario(int ci, String dato, String newDat) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("UPDATE usuario SET" + dato + "='" + newDat + "' WHERE ci=" + ci + ";");
		return res;
	}

	// Modificar alumno

//Consultar materia

	public static ResultSet consultarMateria(String codigoM) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM materia WHERE materia." + codigoM + ";");
		return res;
	}

	// Modificar Materia
	public static ResultSet modificarMateria(String codigoM, String dato, String newData) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("UPDATE materia SET" + dato + "='" + newData + "' WHERE codigoM=" + codigoM + ";");
		return res;
	}

	// coneccion
	private static Connection getMySqlConnection() {
		return null;
	}

}