package Logica;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Persistencia.controladorBD;

public class ControladorLogic {

//Listas
public static ArrayList<Usuario> listarUsuarios() throws Exception {
	return controladorBD.listarUsuarios();
}
	
public static ResultSet listarEstudiantes() throws Exception {
	return controladorBD.listarEstudiantes();
}

public static ResultSet listarMaterias() throws Exception {
	return controladorBD.listarMaterias();
}

public static ResultSet listarInasistencias() throws Exception {
	return controladorBD.listarinasistencias();
}

public static ResultSet listarDocentes() throws Exception {
	return controladorBD.listarDocentes();
}

public static ResultSet listarFuncionarios() throws Exception {
	return controladorBD.listarFuncionarios();
}
//revisar
public static ResultSet listarEstudiantesConPendientes() throws Exception {
	return controladorBD.listarEstudiantes();
}
//Fin Listas

//altas
public static void altaEstudiante(int ci, String nombre, String apellido, LocalDate fechaNac, String email, String passwd, String generacion, String orientacion, String estado) throws Exception {
	controladorBD.altaEstudiante(ci, nombre, apellido, fechaNac, email, passwd, generacion, orientacion, estado);
}

public static void alstaDocente(int ci, String nombre, String apellido, LocalDate fechaNac, String email, String passwd) throws Exception {
	controladorBD.altaDocente(ci, nombre, apellido, fechaNac, email, passwd);
}

public static void alstaFuncionario(int ci, String nombre, String apellido, LocalDate fechaNac, String email, String passwd) throws Exception {
	controladorBD.altaFuncionario(ci, nombre, apellido, fechaNac, email, passwd);
}

public static void alstaMateria(String codigoM, String nombre, String orientación, String generación) throws Exception {
	controladorBD.altaMateria(codigoM, nombre, orientación, generación);
}

public static void altaInasistencia(int codigoInasistencia,int ci, String codigoM,String tipo,LocalDate fecha) throws Exception {
	controladorBD.altaInasistencia(codigoInasistencia, ci, codigoM, tipo, fecha);
}

public static void altaExamen(int ci,String codigoM, LocalDate fecha,int nota,int idExamen) throws Exception {
	controladorBD.altaExamen(ci, codigoM, fecha, nota, idExamen);
}
//fin altas

public static ResultSet consultarUsuario(int ci) throws Exception {
	return controladorBD.buscarUsuario(ci);
}

public static ResultSet consultarMateria(String codigoM) throws Exception {
	return controladorBD.consultarMateria(codigoM);
}

public static void modificarMateria(String codigoM, String dato, String newData) throws Exception {
	controladorBD.modificarMateria(codigoM, dato, newData);
}

}