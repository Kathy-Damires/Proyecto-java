package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class controladorBD {
	// Librera de MySQL
	public String driver = "com.mysql.cj.jdbc.Driver";

	// Nombre de la base de datos
	public String database = "prueba";

	// Host
	public String hostname = "127.0.0.1";

	// Puerto
	public String port = "3306";

	// Ruta de nuestra base de datos (desactivamos el uso de SSL con
	// "?useSSL=false")
	public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	// Nombre de usuario
	public String username = "root";

	// Clave de usuario
	public String password = "";

	public Connection conectarMySQL() {
		Connection conn = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
//Listas
	public static ResultSet listarEstudiantes() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT blablablablabla(lo que sea que muestres)");
		return res;

	}
	public static ResultSet listarMaterias() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT blablablablabla(lo que sea que muestres)");
		return res;

	}
	public static ResultSet listarinasistencias() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT blablablablabla(lo que sea que muestres)");
		return res;

	}
	public static ResultSet listarDocentes() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT blablablablabla(lo que sea que muestres)");
		return res;
	}
	public static ResultSet listarFuncionarios() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT blablablablabla(lo que sea que muestres)");
		return res;

	}
	public static ResultSet listarEstudiantesConPendientes() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT blablablablabla(lo que sea que muestres)");
		return res;

	}
//Fin listas
	
	
	private static Connection getMySqlConnection() {
		return null;
	}

}
