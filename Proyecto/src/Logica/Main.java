
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
				
			
	}

}
