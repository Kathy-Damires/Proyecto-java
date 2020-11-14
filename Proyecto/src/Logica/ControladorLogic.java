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

public ResultSet listarMaterias() throws Exception {
	return controladorBD.listarEstudiantes();
}

public ResultSet listarInasistencias() throws Exception {
	return controladorBD.listarEstudiantes();
}

public ResultSet listarDocentes() throws Exception {
	return controladorBD.listarEstudiantes();
}

public ResultSet listarFuncionarios() throws Exception {
	return controladorBD.listarEstudiantes();
}

public ResultSet listarEstudiantesConPendientes() throws Exception {
	return controladorBD.listarEstudiantes();
}
//Fin Listas


}