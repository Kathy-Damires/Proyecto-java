package Logica;

import java.sql.*;

public class Main {

	public static void main(String[] args) {





				// TODO Auto-generated method stub
			Persistencia.Conn connect = new Persistencia.Conn();

				Connection con = connect.conectarMySQL();

				Statement s;
				ResultSet rs;

				String tabla = "usuario";

				String query = "SELECT * FROM " + tabla;

				try {
					s = con.createStatement();
					rs = s.executeQuery(query);

					while (rs.next()) {
						System.out.println(rs.getInt("ci") + " " + rs.getString("nombre") + " " + rs.getString("apellido"));
					}

				}catch(SQLException ex) {

				}
 


		// TODO Auto-generated method stub
		Persistencia.Conn connect1 = new Persistencia.Conn();

		Connection con1 = connect1.conectarMySQL();

		Statement s1;
		ResultSet rs1;

		String tabla1 = "usuario";

		String query1 = "SELECT * FROM " + tabla1;

		try {
			s1 = con1.createStatement();
			rs1 = s1.executeQuery(query1);

			while (rs1.next()) {
				System.out.println(rs1.getInt("ci") + " " + rs1.getString("nombre") + " " + rs1.getString("apellido"));
			}

		} catch (SQLException ex) {

		}

	}

}