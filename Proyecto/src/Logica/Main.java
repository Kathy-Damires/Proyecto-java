package Logica;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import Persistencia.controladorBD;
import Logica.ControladorLogic;

public class Main {
	public static void main(String[] args) throws Exception {

		controladorBD connect = new controladorBD();
        Connection controladorBD = connect.conectarMySQL();

        Statement s;

        try {
            s = controladorBD.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM usuario;");
            while (rs.next()) {
                System.out.println(rs.getInt("ci"));
            }

        }catch(SQLException ex) {

        }
	}
}