package Logica;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.List;

import Persistencia.controladorBD;

public class ControladorLogic {

//Listas
public static ResultSet listarEstudiantes() throws Exception {
	return controladorBD.listarEstudiantes();
}

public static ResultSet listarMaterias() throws Exception {
	return controladorBD.listarEstudiantes();
}

public static ResultSet listarInasistencias() throws Exception {
	return controladorBD.listarEstudiantes();
}

public static ResultSet listarDocentes() throws Exception {
	return controladorBD.listarEstudiantes();
}

public static ResultSet listarFuncionarios() throws Exception {
	return controladorBD.listarEstudiantes();
}

public static ResultSet listarEstudiantesConPendientes() throws Exception {
	return controladorBD.listarEstudiantes();
}
//Fin Listas

public static ResultSet buscarUsuario(int ci) throws Exception {
	return controladorBD.buscarUsuario(ci);
}

}